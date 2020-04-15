package com.rhp.crm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rhp.crm.entity.Customer;
import com.rhp.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    public List<Customer> selectAll(){
        return customerService.selectAll();
    }

    @RequestMapping("/listPage")
    public PageInfo selectAll(Integer pageNum){
        PageHelper.startPage(pageNum,5);
        List<Customer> list = customerService.selectAll();
        PageInfo<Customer> pageInfo = new PageInfo<Customer>(list);
        return pageInfo;
    }

    @RequestMapping("/add")
    public int add(Customer customer){
        return customerService.add(customer);
    }

    @RequestMapping("/update")
    public int update(Customer customer){
        customer.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd HH:dd:ss").format(new Date()));
        return customerService.update(customer);
    }

    @RequestMapping("/del")
    public int del(Integer isDel){
        return customerService.del(isDel);
    }

}
