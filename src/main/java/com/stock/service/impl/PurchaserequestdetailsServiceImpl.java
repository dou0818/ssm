package com.stock.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.PurchaserequestdetailsMapper;
import com.stock.service.PurchaserequestdetailsService;
@Service
public class PurchaserequestdetailsServiceImpl implements PurchaserequestdetailsService{

    @Resource
    private PurchaserequestdetailsMapper purchaserequestdetailsMapper;

}
