package com.stock.mapper;

import com.stock.domain.SoldoutRecord;
import com.stock.service.SaletableService;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface SoldoutRecordMapper extends Mapper<SoldoutRecord> {
    /**
     * 增加下架记录表
     * @param list
     * @return
     */
    public int insertSaletableServices(List<SoldoutRecord> list);
}