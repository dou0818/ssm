package com.stock.service.impl;

import com.stock.mapper.SaletableMapper;
import com.stock.service.SaletableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SaletableServiceImpl implements SaletableService{

    @Resource
    private SaletableMapper saletableMapper;

    /**
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
    }
}
