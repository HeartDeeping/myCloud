package com.hd.order.service;

import com.hd.model.order.entity.OrderVO;

public interface OrderService {
    OrderVO creatOrder(String userId, String productId);
}
