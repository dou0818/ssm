package com.stock.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.InwarehouseMapper;
import com.stock.service.InwarehouseService;

import java.util.List;
import java.util.Map;

@Service
public class InwarehouseServiceImpl implements InwarehouseService{

    @Resource(name = "inwarehouseMapper")
    private InwarehouseMapper inwarehouseMapper;

    @Override
    public int insertInWareHouse(List<Map<String, Object>> list, String date) {
        return inwarehouseMapper.insertInWareHouse(list,date);
    }
}
