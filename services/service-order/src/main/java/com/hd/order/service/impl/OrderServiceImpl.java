package com.hd.order.service.impl;

import com.hd.model.order.entity.OrderVO;
import com.hd.model.product.entity.ProductVO;
import com.hd.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public OrderVO creatOrder(String userId, String productId) {
        OrderVO orderVO = new OrderVO();
        orderVO.setId(UUID.randomUUID().toString());
        orderVO.setUserId(userId);
        return orderVO;
    }

}
