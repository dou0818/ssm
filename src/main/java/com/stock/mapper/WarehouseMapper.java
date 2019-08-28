package com.stock.mapper;

import com.stock.domain.Warehouse;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface WarehouseMapper extends Mapper<Warehouse> {
    /**
     * 用户退货后进行的操作,锁定+2，出库-2
     * @param salesList
     * @return boolean
     */
    boolean salesReturn(List<Map<String,Object>> salesList);
}