package com.rhp.crm.service.impl;

import com.rhp.crm.entity.Customer;
import com.rhp.crm.mapper.CustomerMapper;
import com.rhp.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> selectAll() {
        return customerMapper.selectAll();
    }

    @Override
    public int add(Customer customer) {
        return customerMapper.add(customer);
    }

    @Override
    public int update(Customer customer) {
        return customerMapper.update(customer);
    }

    @Override
    public int del(Integer isDel) {
        return customerMapper.del(isDel);
    }
}
