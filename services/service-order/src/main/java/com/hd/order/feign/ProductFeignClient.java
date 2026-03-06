package com.hd.order.feign;

import com.hd.model.product.entity.ProductVO;
import com.hd.order.feign.fallback.ProductFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-product",fallback = ProductFeignClientFallback.class)//商品服务feign客户端
public interface ProductFeignClient {
    @GetMapping("/product/{id}")
    ProductVO getProductById(@PathVariable("id") String id);
}
