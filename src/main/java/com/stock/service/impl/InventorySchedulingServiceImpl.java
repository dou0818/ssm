package com.stock.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.InventorySchedulingMapper;
import com.stock.service.InventorySchedulingService;
@Service
public class InventorySchedulingServiceImpl implements InventorySchedulingService{

    @Resource
    private InventorySchedulingMapper inventorySchedulingMapper;

}
