package com.hd.product.service;

import com.hd.model.product.entity.ProductVO;
import com.hd.product.service.impl.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductVO queryProductById(String id) {
        ProductVO productVO = new ProductVO();
        productVO.setId(id);
        productVO.setName("iphone" + id);
        productVO.setPrice(id + "0");
        return productVO;
    }
}
