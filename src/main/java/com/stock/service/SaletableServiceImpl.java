package com.stock.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.SaletableMapper;
import com.stock.service.SaletableService;
@Service
public class SaletableServiceImpl implements SaletableService{

    @Resource
    private SaletableMapper saletableMapper;

}
