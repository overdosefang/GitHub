package net.xdclass.product_server.service.impl;

import net.xdclass.product_server.domain.Product;
import net.xdclass.product_server.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> daoMap=new HashMap<>();

    static {
        daoMap.put(1,new Product(1,"iphonex",999,10));
        daoMap.put(2,new Product(2,"冰箱",5754,200));
        daoMap.put(3,new Product(3,"洗衣机",1999,12));
        daoMap.put(4,new Product(4,"空调",9199,815));
        daoMap.put(5,new Product(5,"电脑",22222,645));
        daoMap.put(6,new Product(6,"汽车",99988,154));
        daoMap.put(7,new Product(7,"电竞椅",2229,1851));
        daoMap.put(8,new Product(8,"沙发",23666,215));
        daoMap.put(9,new Product(9,"java编程思想",2,14854));
    }

    @Override
    public List<Product> listProduct() {
        Collection<Product> productCollection = daoMap.values();
        ArrayList<Product> productList = new ArrayList<>(productCollection);
        return productList;
    }

    @Override
    public Product findById(int id) {
        return daoMap.get(id);
    }
}
