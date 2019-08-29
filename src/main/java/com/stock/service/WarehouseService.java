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
	
	/**
     * 用户退货后进行的操作
     * @param salesList
     * @return boolean
     */
    boolean salesReturn(List<Map<String,Object>> salesList);

    /**
     * 获得全部库存
     * @return
     */
    List<Map<String,Object>> showAll();
}
