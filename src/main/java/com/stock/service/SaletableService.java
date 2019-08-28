package com.stock.service;

import com.stock.domain.Saletable;

import java.util.List;
import java.util.Map;

public interface SaletableService{

    int addActivityNum(int merchanid, int commodityid, int num);

    List<Saletable> selAllSaleNum();

    /**
     * 付款成功后，修改可销售库存-，锁定库存-，已销售库存+
     * @param paymentid
     * @return
     */
    int payment(List<Map<String,Object>> paymentid);
}
