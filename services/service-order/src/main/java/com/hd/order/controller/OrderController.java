package com.hd.order.controller;

import com.hd.model.order.entity.OrderVO;
import com.hd.order.config.nacos.OrderConfig;
import com.hd.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
//@RefreshScope
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderConfig orderConfig;
//    @Value("${timeout.time}")
//    private String time;

    @GetMapping(("/creatOrder"))
    public OrderVO creatOrder(@RequestParam("userId") String userId, @RequestParam("productId") String productId) {
        return orderService.creatOrder(userId, productId);
    }

    @GetMapping(("/config"))
    public String config() {
        return "timeout:"+orderConfig.getTimeout();
    }

}
