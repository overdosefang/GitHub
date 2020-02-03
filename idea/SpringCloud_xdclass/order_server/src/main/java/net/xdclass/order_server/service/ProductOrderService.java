package net.xdclass.order_server.service;

import net.xdclass.order_server.domain.ProductOrder;

public interface ProductOrderService {
    //保存订单
    ProductOrder save(int userId,int productId);
}
