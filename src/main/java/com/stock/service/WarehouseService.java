package com.stock.service;

import com.stock.domain.Warehouse;

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
     * 根据商品id和商家id修改发布与未发布库存数量
     * @param list
     * @return
     */
    public int updateInventorynumByWarehouse(List<Map<String,Object>> list);

    /**
     * 查询所有商家所有商品库存
     * @return
     */
    List<Map<String,Object>> stockSearch();

}
