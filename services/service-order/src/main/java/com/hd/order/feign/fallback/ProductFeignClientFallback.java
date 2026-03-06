package com.hd.order.feign.fallback;

import com.hd.model.product.entity.ProductVO;
import com.hd.order.feign.ProductFeignClient;
import org.springframework.stereotype.Component;

@Component
public class ProductFeignClientFallback implements ProductFeignClient {
    @Override
    public ProductVO getProductById(String id) {
        System.out.println("兜底回调");
        return new ProductVO();
    }
}
