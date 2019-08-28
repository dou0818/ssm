package com.stock.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.stock.mapper.WarehouseMapper;
import com.stock.service.WarehouseService;

import java.util.List;
import java.util.Map;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Resource(name = "warehouseMapper")
    private WarehouseMapper warehouseMapper;

    @Override
    public int updateWareHouse(List<Map<String, Object>> list) {
        return warehouseMapper.updateWareHouse(list);
    }
}
