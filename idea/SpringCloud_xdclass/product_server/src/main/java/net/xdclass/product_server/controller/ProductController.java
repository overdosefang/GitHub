package net.xdclass.product_server.controller;

import net.xdclass.product_server.domain.Product;
import net.xdclass.product_server.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Value("${server.port}")
    private String port;

    /**
     * 查询所有商品
     * @return
     */
    @RequestMapping("list")
    public List<Product> list(){
        return productService.listProduct();
    }

    /**
     * 通过id查询指定商品
     * @param id
     * @return
     */
    @RequestMapping("find")
    public Product findProductById(int id){
        Product product = productService.findById(id);
        Product result = new Product();
        BeanUtils.copyProperties(product,result);
        result.setName(result.getName()+"  data from "+port);
        return result;
    }

}
