package com.huang.mapper;

import com.huang.pojo.Role;

import java.util.List;

public interface RoleMapper {

    /**
     * 获取角色列表
     *
     * @return
     */
    List<Role> findByRoleAll();
}