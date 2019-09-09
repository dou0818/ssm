package com.stock.service.impl;

import com.stock.domain.Saletable;
import com.stock.domain.SoldoutRecord;
import com.stock.mapper.SaletableMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.SoldoutRecordMapper;
import com.stock.service.SoldoutRecordService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SoldoutRecordServiceImpl implements SoldoutRecordService{

    @Resource
    private SoldoutRecordMapper soldoutRecordMapper;
    @Resource
    private SaletableMapper saletableMapper;

    /**
     * 增加下架记录表数据,删除发布表数据
     * @param skuIds
     * @return
     */
    @Override
    public void insertSaletableServices(int skuIds[]) {
       List<Saletable> saletables= saletableMapper.selectByskuIds(skuIds);
       List<SoldoutRecord> soldoutRecords=new ArrayList<>();
       for (Saletable saletable : saletables) {
            SoldoutRecord soldoutRecord=new SoldoutRecord();
            soldoutRecord.setMerchantId(saletable.getMerchantId());
            soldoutRecord.setSaleedNum(saletable.getSaleedNum());
            soldoutRecord.setSkuId(saletable.getSkuId());
            soldoutRecord.setSoldoutTime(new Date());
            soldoutRecords.add(soldoutRecord);
       }
        try {
            Thread.sleep(30);
            System.out.println(new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        saletableMapper.deleteByskuId(skuIds);
       soldoutRecordMapper.insertSaletableServices(soldoutRecords);
    }
}
