package com.stock.mapper;

import com.stock.domain.Saletable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface SaletableMapper extends tk.mybatis.mapper.common.Mapper<Saletable> {


    int payment(List<Map<String,Object>> payorder);


    int cancelOrder(List<Map<String,Object>> cancel);
}
