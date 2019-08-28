package com.stock.service;

import java.util.List;
import java.util.Map;

public interface InwarehouseService{
    /**
     * 进货入库明细
     */
    int insertInWareHouse(List<Map<String, Object>> list,String date);

}
