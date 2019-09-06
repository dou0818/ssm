package com.stock.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.ActiveSaletableMapper;
import com.stock.service.ActiveSaletableService;
@Service
public class ActiveSaletableServiceImpl implements ActiveSaletableService{

    @Resource
    private ActiveSaletableMapper activeSaletableMapper;

}
