package com.mapper;

import com.domain.RolePermis;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RolePermisMapper extends Mapper<RolePermis> {
    int insertRolePermis(List<RolePermis> rolePermisList);
}