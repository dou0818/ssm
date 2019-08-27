package com.stock.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.OutwarehouseMapper;
import com.stock.service.OutwarehouseService;
@Service
public class OutwarehouseServiceImpl implements OutwarehouseService{

    @Resource
    private OutwarehouseMapper outwarehouseMapper;

}
