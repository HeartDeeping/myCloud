package com.hd.order.controller;

import com.hd.model.order.entity.OrderVO;
import com.hd.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @GetMapping(("/creatOrder"))
    public OrderVO creatOrder(@RequestParam("userId") String userId, @RequestParam("productId") String productId) {
        return orderService.creatOrder(userId, productId);
    }
}
