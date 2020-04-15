package com.rhp.crm.service;

import com.rhp.crm.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> selectAll();

    int add(Customer customer);

    int update(Customer customer);

    int del(Integer isDel);

}
