package com.stock.service;

import com.stock.mapper.WarehouseMapper;
import com.stock.util.GetDate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Resource(name = "warehouseMapper")
    private WarehouseMapper warehouseMapper;

    @Resource(name = "inwarehouseServiceImpl")
    InwarehouseService inwarehouseService;
/**
     * 用户退货后进行的操作
     *
     * @param salesList
     * @return boolean
     */
    @Override
    public boolean salesReturn(List<Map<String, Object>> salesList) {
        return warehouseMapper.salesReturn(salesList);
    }

    /**
     * 获得全部库存
     *
     * @return
     */
    @Override
    public List<Map<String, Object>> showAll() {
        return warehouseMapper.showAll();
    }

    @Override
    @Transactional
    public int updateWareHouse(List<Map<String, Object>> list) {
        inwarehouseService.insertInWareHouse(list, GetDate.getDate());
        return warehouseMapper.updateWareHouse(list);
    }
}
