package com.stock.mapper;

import com.stock.domain.Warehouse;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface WarehouseMapper extends Mapper<Warehouse> {
    /**
     * 查询商家仓库的商品
     * @param merchantid
     * @return
     */
    List<Map<String, Object>> selectWareHouseAll(@Param("merchantid") int merchantid);
}