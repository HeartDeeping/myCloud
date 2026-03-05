package com.hd.order.feign;

import com.hd.model.product.entity.ProductVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-product")//商品服务feign客户端
public interface ProductFeignClient {
    @GetMapping("/product/{id}")
    ProductVO getProductById(@PathVariable("id") String id);
}
