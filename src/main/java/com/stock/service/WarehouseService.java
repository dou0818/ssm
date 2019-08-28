package com.stock.service;

import java.util.List;
import java.util.Map;

public interface WarehouseService{
    /**
     * 进货入库，未发布库存增加
     * @param list
     * @return
     */
    int updateWareHouse(List<Map<String,Object>> list);

}
