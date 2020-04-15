package com.rhp.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    private Integer ordersId;
    private String ordersTime;
    private Customer customer;
    private Double price;
    private String createTime;
    private String updateTime;
    private Integer isDel;

}
