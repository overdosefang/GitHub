package net.xdclass.order_server.service.impl;

import net.xdclass.order_server.domain.ProductOrder;
import net.xdclass.order_server.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {
    //方式一
    //@Autowired
    //RestTemplate restTemplate;

    //方式二
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Override
    public ProductOrder save(int userId, int productId) {
        //方式一
        //Map<String,Object> productMap = restTemplate.getForObject("http://product-server/api/v1/product/find?id=" + productId, Map.class);

        //方式二
        ServiceInstance instance = loadBalancerClient.choose("product-server");
        String url=String.format("http://%s:%s/api/v1/product/find?id=" + productId, instance.getHost(), instance.getPort());
        RestTemplate restTemplate = new RestTemplate();
        Map<String,Object> productMap= restTemplate.getForObject(url, Map.class);

        ProductOrder productOrder = new ProductOrder();
        productOrder.setUserId(userId);
        productOrder.setTradeNo(UUID.randomUUID().toString());
        productOrder.setCreateTime(new Date());
        productOrder.setProductName(productMap.get("name").toString());
        productOrder.setPrice(Integer.parseInt(productMap.get("price").toString()));
        return productOrder;
    }
}
