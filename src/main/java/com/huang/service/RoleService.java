package com.huang.service;

import com.huang.pojo.Role;

import java.util.List;

public interface RoleService {
    /**
     * 获取角色列表
     *
     * @return
     */
    List<Role> findByRoleAll();
}