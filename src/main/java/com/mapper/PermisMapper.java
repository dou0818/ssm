package com.mapper;

import com.domain.Permis;
import com.domain.Role;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PermisMapper extends Mapper<Permis> {

    List<Integer> selectPermisByRoleidId(Role role);
}