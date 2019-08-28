package com.stock.mapper;

import com.stock.domain.Saletable;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SaletableMapper extends Mapper<Saletable> {
    int addActivityNum(int merchanid, int commodityid, int num);
}