package com.stock.mapper;

import com.stock.domain.Saletable;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
import java.util.Map;

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
    int cancelOrder(List<Map<String,Object>> cancel);}