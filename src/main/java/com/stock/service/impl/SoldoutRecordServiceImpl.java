package com.stock.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.SoldoutRecordMapper;
import com.stock.service.SoldoutRecordService;
@Service
public class SoldoutRecordServiceImpl implements SoldoutRecordService{

    @Resource
    private SoldoutRecordMapper soldoutRecordMapper;

}
