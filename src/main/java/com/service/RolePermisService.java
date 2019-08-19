package com.service;

import com.domain.Role;
import com.domain.RolePermis;

import java.util.List;

public interface RolePermisService{


    List<RolePermis> selectRolePermisByRoleId(RolePermis rolePermis);
    int deleteByroleid(RolePermis rolePermis);
    int insertRolePermis(List<RolePermis> rolePermisList);

}
