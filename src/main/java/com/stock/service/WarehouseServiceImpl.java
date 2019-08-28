package com.stock.service;

import com.stock.mapper.WarehouseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
public class WarehouseServiceImpl implements WarehouseService{

    @Resource
    private WarehouseMapper warehouseMapper;


    /**
     * 用户退货后进行的操作
     *
     * @param salesList
     * @return boolean
     */
    @Override
    public boolean salesReturn(List<Map<String, Object>> salesList) {
        for (Map<String, Object> salesMap : salesList) {

        }
        return false;
    }
}
