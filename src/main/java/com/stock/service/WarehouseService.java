package com.stock.service;

import java.util.List;
import java.util.Map;

public interface WarehouseService{

    /**
     * 用户退货后进行的操作
     * @param salesList
     * @return boolean
     */
    boolean salesReturn(List<Map<String,Object>> salesList);
}
