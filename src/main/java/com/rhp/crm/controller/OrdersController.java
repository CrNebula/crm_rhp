package com.rhp.crm.controller;

import com.rhp.crm.entity.Orders;
import com.rhp.crm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/list")
    public List<Orders> selectAll(){
        return ordersService.selectAll();
    }

}
