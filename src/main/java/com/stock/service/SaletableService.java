package com.stock.service;

import com.stock.domain.Saletable;

import java.util.List;

public interface SaletableService{

    List<Saletable> selSaleByMerchantId(int merchantId);

    int addSale(Saletable saletable);
}
