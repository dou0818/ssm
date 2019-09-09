package com.stock.mapper;

import com.stock.domain.SoldoutRecord;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;


public interface SoldoutRecordMapper extends Mapper<SoldoutRecord> {
    /**
     * 增加下架记录表
     * @param list
     * @return
     */
    public int insertSaletableServices(List<SoldoutRecord> list);
}