package net.xdclass.product_server.service;

import net.xdclass.product_server.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();

    Product findById(int id);
}
