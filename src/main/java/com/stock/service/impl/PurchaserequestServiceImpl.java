package com.stock.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.PurchaserequestMapper;
import com.stock.service.PurchaserequestService;
@Service
public class PurchaserequestServiceImpl implements PurchaserequestService{

    @Resource
    private PurchaserequestMapper purchaserequestMapper;

}
