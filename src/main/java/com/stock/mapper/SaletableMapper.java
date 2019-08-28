package com.stock.mapper;

import com.stock.domain.Saletable;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface SaletableMapper extends Mapper<Saletable> {
    int cancelOrder(List<Map<String,Object>> orderid);

}