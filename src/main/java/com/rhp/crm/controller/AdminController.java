package com.rhp.crm.controller;

import com.rhp.crm.entity.Admin;
import com.rhp.crm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    public String login(String adminName, String password, Admin admin){
        admin.setAdminName(adminName);
        admin.setPassword(password);
        if (adminService.login(admin) != null){
            return "登录成功";
        }
        return "账号或者密码错误/账号不存在";
    }

}
