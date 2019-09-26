package com.stock.service;

import java.util.List;

public interface SoldoutRecordService{
    /**
     * 增加下架记录表数据,删除发布表数据
     * @param skuIds
     * @return
     */
    public void insertSaletableServices(int skuIds[]);


}
