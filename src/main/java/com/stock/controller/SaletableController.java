package com.stock.controller;

import com.stock.commons.MyResponseRestful;
import com.stock.service.SaletableService;
import com.stock.service.SoldoutRecordService;
import com.stock.util.ArrayToListUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stock.commons.Page;
import com.stock.domain.Saletable;
import com.stock.service.SaletableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class SaletableController {
    @Resource(name = "saletableServiceImpl")
    SaletableService saletableService;

    @Resource(name="soldoutRecordServiceImpl")
    SoldoutRecordService soldoutRecordService;

    @ResponseBody
    @RequestMapping("/soldOut")
    public MyResponseRestful soldOut(@RequestParam(value = "skuId") int skuIds[]){
        saletableService.updatesoldOutById(skuIds);
        soldoutRecordService.insertSaletableServices(skuIds);
        return new MyResponseRestful("下架成功",HttpStatus.OK);
    }

}

