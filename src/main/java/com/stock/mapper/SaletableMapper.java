package com.stock.mapper;

import com.stock.domain.Saletable;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface SaletableMapper extends Mapper<Saletable> {

    int addActivityNum(int merchanid, int commodityid, int num);


    /**
     * 付款成功后，修改可销售库存-，锁定库存-，已销售库存+
     * @param paymentid
     * @return
     */
    int payment(List<Map<String,Object>> paymentid);

    /**
     * 修改预售数量
     * @param list
     * @return
     */
    public int addSaleNum(List<Map<String,Object>> list);

     int cancelOrder(List<Map<String,Object>> orderid);
}}