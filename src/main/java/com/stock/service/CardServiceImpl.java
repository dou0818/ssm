package com.stock.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.CardMapper;
import com.stock.service.CardService;
@Service
public class CardServiceImpl implements CardService{

    @Resource
    private CardMapper cardMapper;

}
