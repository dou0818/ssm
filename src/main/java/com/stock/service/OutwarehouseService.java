package com.stock.service;

import com.stock.domain.Outwarehouse;

import java.util.List;

public interface OutwarehouseService{
    /**
     * 批量增加发布库存表  Outwarehouse表
     * @param list
     * @return
     */
    public int insertOutwarehouseByList(List<Outwarehouse> list);

}
