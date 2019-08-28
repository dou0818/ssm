package com.stock.service;

import com.stock.domain.Saletable;

import java.util.List;

public interface SaletableService{

    int addActivityNum(int merchanid, int commodityid, int num);

    List<Saletable> selAllSaleNum();
}
