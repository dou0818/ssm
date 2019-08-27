package com.stock.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.WarehouseMapper;
import com.stock.service.WarehouseService;
@Service
public class WarehouseServiceImpl implements WarehouseService{

    @Resource
    private WarehouseMapper warehouseMapper;

}
