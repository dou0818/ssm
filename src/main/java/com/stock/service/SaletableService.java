package com.stock.service;

import com.stock.domain.Saletable;

import java.util.List;
import java.util.Map;

public interface SaletableService{
    /**
     * 根据用户id和商品id添加活动库存
     * @param merchanid
     * @param commodityid
     * @param num
     * @return
     */
    int addActivityNum(int merchanid, int commodityid, int num);

    /**
     * 查询所有库存信息
     * @return
     */
    List<Saletable> selAllSaleNum();

    /**
     * 付款成功后，修改可销售库存-，锁定库存-，已销售库存+
     * @param paymentid
     * @return
     */
    int payment(List<Map<String,Object>> paymentid);
}
