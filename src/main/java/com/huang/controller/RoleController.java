package com.huang.controller;

import com.huang.service.RoleService;

@Controller
public class RoleController {
    private RoleService roleService;

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

}
