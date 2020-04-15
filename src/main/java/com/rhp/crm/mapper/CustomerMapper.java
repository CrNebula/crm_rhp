package com.rhp.crm.mapper;

import com.rhp.crm.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {

    List<Customer> selectAll();

    int add(Customer customer);

    int update(Customer customer);

    int del(Integer isDel);

}
