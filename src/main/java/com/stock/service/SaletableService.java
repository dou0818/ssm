package com.stock.service;

import java.util.List;
import java.util.Map;

public interface SaletableService{
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
}
