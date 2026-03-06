package com.hd.order.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hd.model.order.entity.OrderVO;
import com.hd.model.product.entity.ProductVO;
import com.hd.order.feign.ProductFeignClient;
import com.hd.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductFeignClient productFeignClient;

    @Override
    @SentinelResource(value = "creatOrder",blockHandler = "creatOrderFallback")
    public OrderVO creatOrder(String userId, String productId) {
        OrderVO orderVO = new OrderVO();
        orderVO.setId(UUID.randomUUID().toString());
        orderVO.setUserId(userId);
        ProductVO product = productFeignClient.getProductById(productId);
        List<ProductVO> productVOList = new ArrayList<>();
        productVOList.add(product);
        orderVO.setProductVOList(productVOList);
        return orderVO;
    }

    public OrderVO creatOrderFallback(String userId, String productId, BlockException ex) {
        return new OrderVO();
    }
}
