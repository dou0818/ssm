package com.stock.service.impl;

import com.stock.domain.Saletable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.SaletableMapper;
import com.stock.service.SaletableService;

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
    }
}
