package com.rhp.crm.service.impl;

import com.rhp.crm.entity.Admin;
import com.rhp.crm.mapper.AdminMapper;
import com.rhp.crm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(Admin admin) {
        return adminMapper.login(admin);
    }
}
