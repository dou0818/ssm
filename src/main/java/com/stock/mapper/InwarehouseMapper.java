package com.stock.mapper;

import com.stock.domain.Inwarehouse;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface InwarehouseMapper extends Mapper<Inwarehouse> {

    /**
     * 进货入库明细
     */
    int insertInWareHouse(@Param("list") List<Map<String, Object>> list, @Param("date") String date);
}