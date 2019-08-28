package com.stock.service;

import com.stock.domain.Saletable;

import java.util.List;
import java.util.Map;

public interface SaletableService{
   int cancelOrder(List<Map<String,Object>> orderid);

}
