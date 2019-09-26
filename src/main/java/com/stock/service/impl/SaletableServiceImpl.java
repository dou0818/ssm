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

    @Override
    public List<Saletable> selSaleByMerchantId(int merchantId) {
        Saletable saletable=new Saletable();
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
    }}
