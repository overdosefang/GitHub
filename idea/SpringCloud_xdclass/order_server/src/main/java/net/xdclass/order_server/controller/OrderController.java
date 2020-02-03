package net.xdclass.order_server.controller;

import net.xdclass.order_server.domain.ProductOrder;
import net.xdclass.order_server.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    ProductOrderService productOrderService;

    @RequestMapping("save")
    public ProductOrder save(int userId,int productId){
        return productOrderService.save(userId,productId);
    }

}
