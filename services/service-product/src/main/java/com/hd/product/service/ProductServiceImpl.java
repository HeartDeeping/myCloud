package com.hd.product.service;

import com.hd.model.product.entity.ProductVO;
import com.hd.product.service.impl.ProductService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductVO queryProductById(String id) {
        System.out.println("hello");
        ProductVO productVO = new ProductVO();
        productVO.setId(id);
        productVO.setName("iphone" + id);
        productVO.setPrice(id + "0");
        return productVO;
    }
}
