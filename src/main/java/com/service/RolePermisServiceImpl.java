package com.service;

import com.domain.Role;
import com.domain.RolePermis;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.RolePermisMapper;
import com.service.RolePermisService;

import java.util.List;

@Service
public class RolePermisServiceImpl implements RolePermisService{

    @Resource(name = "rolePermisMapper")
    private RolePermisMapper rolePermisMapper;

    @Override
    public List<RolePermis> selectRolePermisByRoleId(RolePermis rolePermis) {
        return rolePermisMapper.select(rolePermis);
    }

    @Override
    public int deleteByroleid(RolePermis rolePermis) {
        return rolePermisMapper.delete(rolePermis);
    }

    @Override
    public int insertRolePermis(List<RolePermis> rolePermisList) {
        return rolePermisMapper.insertRolePermis(rolePermisList);
    }
}
