package com.stock.service.impl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


import java.util.List;

@Service
public class SaletableServiceImpl implements SaletableService{

    @Resource
    private SaletableMapper saletableMapper;

 @Override
    public List<Saletable> selSaleByMerchantId(int merchantId) {
        Saletable saletable=new Saletable();
        saletable.setMerchantId(merchantId);
        return saletableMapper.select(saletable);
    }

    @Override
    public int addSale(Saletable saletable) {
        return saletableMapper.insert(saletable);
    } /**
     * 付款后锁定库存-，已销售库存+
     *
     * @param payorder
     * @return
     */
    @Override
    public int payment(List<Map<String, Object>> payorder) {
        return saletableMapper.payment(payorder);
    }

    /**
     * 取消订单 已销售库存-，可销售库存+
     *
     * @param cancel
     * @return
     */
    @Override
    public int cancelOrder(List<Map<String, Object>> cancel) {
        return saletableMapper.cancelOrder(cancel);
    }}
