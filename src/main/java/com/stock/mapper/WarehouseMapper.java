package com.stock.mapper;

import com.stock.domain.Warehouse;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface WarehouseMapper extends Mapper<Warehouse> {

    /**
     * 进货入库，未发布库存增加
     * @param list
     * @return
     */
    int updateWareHouse(List<Map<String,Object>> list);
}