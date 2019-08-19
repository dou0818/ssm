package com.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.mapper.User2Mapper;
import com.domain.User2;
import com.service.User2Service;
@Service
public class User2ServiceImpl implements User2Service{

    @Resource
    private User2Mapper user2Mapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return user2Mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User2 record) {
        return user2Mapper.insert(record);
    }

    @Override
    public int insertSelective(User2 record) {
        return user2Mapper.insertSelective(record);
    }

    @Override
    public User2 selectByPrimaryKey(Integer id) {
        return user2Mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User2 record) {
        return user2Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User2 record) {
        return user2Mapper.updateByPrimaryKey(record);
    }

}
