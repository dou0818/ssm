package com.stock.service;

import com.stock.domain.Saletable;
import java.util.Map;
import java.util.List;
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

 List<Saletable> selSaleByMerchantId(int merchantId);







    /**
     * 付款后锁定库存-，已销售库存+
     * @param payorder
     * @return
     */
    int payment(List<Map<String,Object>> payorder);

/**
     * 取消订单 已销售库存-，可销售库存+
     * @param cancel
     * @return
     */
    int cancelOrder(List<Map<String,Object>> cancel);

    int addSale(Saletable saletable);

}
