package com.stock.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.WarehouseMapper;
import com.stock.service.WarehouseService;

import java.util.List;
import java.util.Map;

@Service
public class WarehouseServiceImpl implements WarehouseService{

    @Resource
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Map<String, Object>> selectWareHouseAll(int merchantid) {
        return warehouseMapper.selectWareHouseAll(merchantid);
    }
}
