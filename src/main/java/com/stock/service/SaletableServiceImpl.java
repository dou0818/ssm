package com.stock.service;

import com.stock.domain.Saletable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.SaletableMapper;

import java.util.List;

@Service
public class SaletableServiceImpl implements SaletableService{

    @Resource
    private SaletableMapper saletableMapper;

    @Override
    public int addActivityNum(int merchanid, int commodityid, int num) {
       return saletableMapper.addActivityNum(merchanid,commodityid,num);
    }

    @Override
    public List<Saletable>selAllSaleNum() {
        return saletableMapper.selectAll();
    }

}
