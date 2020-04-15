package com.rhp.crm.service.impl;

import com.rhp.crm.entity.Orders;
import com.rhp.crm.mapper.OrdersMapper;
import com.rhp.crm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> selectAll() {
        return ordersMapper.selectAll();
    }
}
