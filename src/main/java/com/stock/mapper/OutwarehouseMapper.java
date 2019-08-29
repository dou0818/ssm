package com.stock.mapper;

import com.stock.domain.Outwarehouse;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OutwarehouseMapper extends Mapper<Outwarehouse> {
    /**
     * 批量增加发布库存表  Outwarehouse表
     * @param list
     * @return
     */
    public int insertOutwarehouseByList(List<Outwarehouse> list);
}