package com.stock.service.impl;

import com.stock.domain.Saletable;
import com.stock.mapper.SaletableMapper;
import com.stock.service.SaletableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
public class SaletableServiceImpl implements SaletableService {

    @Resource
    SaletableMapper saletableMapper;

    /**
     * 商家下架修改商品上下架属性为下架
     *
     * @param skuIds 上下架属性数组
     * @return
     */
    @Override
    public int updatesoldOutById(int[] skuIds) {
        return saletableMapper.updatesoldOutById(skuIds);
    }

    /**
     * 查询所有上架商品属性为1的数据显示到页面,信息包括商品名称
     *
     * @param skuIds
     * @return
     */
    @Override
    public List<Map<String, Object>> selectBysoldOut1(int skuIds[]) {
        List<Map<String, Object>> list = saletableMapper.selectBysoldOut1(skuIds);
        for (Map<String, Object> map : list) {

        }
        return list;
    }

    @Override
    public List<Saletable> selSaleByMerchantId(int merchantId) {
        Saletable saletable = new Saletable();
        saletable.setMerchantId(merchantId);
        return saletableMapper.select(saletable);
    }

    @Override
    public int addSale(Saletable saletable) {
        return saletableMapper.insert(saletable);
    }

    @Override
    public int payment(List<Map<String, Object>> payorder) {
        return saletableMapper.payment(payorder);
    }

    @Override
    public int cancelOrder(List<Map<String, Object>> cancel) {
        return saletableMapper.cancelOrder(cancel);
    }

}