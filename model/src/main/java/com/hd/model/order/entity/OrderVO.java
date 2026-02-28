package com.hd.model.order.entity;

import com.hd.model.product.entity.ProductVO;
import lombok.Data;

import java.util.List;

@Data
public class OrderVO {
    private String id;
    private String userId;
    private String priceCount;
    private List<ProductVO> productVOList;
}
