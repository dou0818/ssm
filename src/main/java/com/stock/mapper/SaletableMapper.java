package com.stock.mapper;

import com.stock.domain.Saletable;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;
import java.util.Map;

 /**
     * ������������-�������ۿ��+
     * @param payorder
     * @return
     */
    int payment(List<Map<String,Object>> payorder);

    /**
     * ȡ������ �����ۿ��-�������ۿ��+
     * @param cancel
     * @return
     */
    int cancelOrder(List<Map<String,Object>> cancel);}