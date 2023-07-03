package com.eshoppingcart.profileservice.service;

import com.eshoppingcart.profileservice.dao.RoleDao;
import com.eshoppingcart.profileservice.entity.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
