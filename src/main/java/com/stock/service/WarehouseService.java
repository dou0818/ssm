package com.stock.service;

import java.util.List;
import java.util.Map;

public interface WarehouseService{
    /**
     * 查询商家仓库的商品
     * @param merchantid
     * @return
     */
    List<Map<String, Object>> selectWareHouseAll(int merchantid);

}
