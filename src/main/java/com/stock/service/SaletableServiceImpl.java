package com.stock.service;

import com.stock.domain.Saletable;
import com.stock.mapper.SaletableMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

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

    /**
     * 付款成功后，修改可销售库存-，锁定库存-，已销售库存+
     *
     * @param paymentid
     * @return
     */
    @Override
    public int payment(List<Map<String, Object>> paymentid) {
        return saletableMapper.payment(paymentid);
    }

}
