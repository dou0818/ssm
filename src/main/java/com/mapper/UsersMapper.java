package com.mapper;

import com.domain.Permis;
import com.domain.Users;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Set;

public interface UsersMapper extends Mapper<Users> {

    /**
     * 根据用户id获取用户对象，里面包含用户对应的部门id、公司id
     *
     * @param users
     */
    Users selectByIds(Users users);

    /**
     * 根据用户id、部门id、公司id获取用户的角色集合
     *
     * @param users
     * @return
     */
    public Set<String> selectRoleByUsersId(Users users);

    /**
     * 根据一个用户对应的id、部门id、公司id获取多个角色对应的权限集合
     *
     * @param users
     * @return
     */
    public List<Permis> selectPermisByUserIds(@Param("users") Users users, @Param("permistype") Integer permistype);
}