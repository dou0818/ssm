package com.stock.service;

import com.stock.domain.Outwarehouse;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.OutwarehouseMapper;
import com.stock.service.OutwarehouseService;

import java.util.List;

@Service
public class OutwarehouseServiceImpl implements OutwarehouseService{

    @Resource(name = "outwarehouseMapper")
    private OutwarehouseMapper outwarehouseMapper;

    /**
     * 批量增加发布库存表  Outwarehouse表
     * @param list
     * @return
     */
    @Override
    public int insertOutwarehouseByList(List<Outwarehouse> list) {
        return outwarehouseMapper.insertOutwarehouseByList(list);
    }

}
