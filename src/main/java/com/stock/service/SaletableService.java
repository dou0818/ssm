package com.stock.service;

import com.stock.domain.Saletable;
import java.util.Map;
import java.util.List;public interface SaletableService{
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
    int cancelOrder(List<Map<String,Object>> cancel);    int addSale(Saletable saletable);
}
