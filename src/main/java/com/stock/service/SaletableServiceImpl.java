package com.stock.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.SaletableMapper;
import com.stock.service.SaletableService;

import java.util.List;
import java.util.Map;

@Service
public class SaletableServiceImpl implements SaletableService{

    @Resource
    private SaletableMapper saletableMapper;


    @Override
    public int cancelOrder(List<Map<String, Object>> orderid) {
        return saletableMapper.cancelOrder(orderid);
    }
}
