package com.rhp.crm.mapper;

import com.rhp.crm.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {

    List<Orders> selectAll();

}
