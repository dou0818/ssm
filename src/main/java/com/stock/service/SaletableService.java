package com.stock.service;


import java.util.List;
import java.util.Map;

public interface SaletableService{

    /**
     * 商家下架修改商品上下架属性为下架
     * @param skuIds 上下架属性数组
     * @return
     */
    public int updatesoldOutById(int skuIds[]);

    /**
     * 查询所有上架商品属性为1的数据显示到页面,信息包括商品名称
     * @param skuIds
     * @return
     */
    public List<Map<String,Object>> selectBysoldOut1(int skuIds[]);


}
