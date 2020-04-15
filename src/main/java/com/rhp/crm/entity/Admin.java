package com.rhp.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    private Integer adminId;
    private String adminName;
    private String password;
    private String phone;
    private String createTime;
    private String lastLoginTime;
    private Integer isDel;

}
