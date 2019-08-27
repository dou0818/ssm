package com.stock.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.InwarehouseMapper;
import com.stock.service.InwarehouseService;
@Service
public class InwarehouseServiceImpl implements InwarehouseService{

    @Resource
    private InwarehouseMapper inwarehouseMapper;

}
