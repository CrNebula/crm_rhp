package com.rhp.crm.mapper;

import com.rhp.crm.entity.Admin;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminMapper {

    Admin login(Admin admin);

}
