package com.stock.controller;

import com.stock.service.WarehouseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class WarehouseController {
    @Resource(name = "warehouseServiceImpl")
    WarehouseService warehouseService;

    @RequestMapping(value = "selectallwarehouse")
    @ResponseBody
    public void selectAllWareHouse(){
        List<Map<String,Object>> wareHoustList=warehouseService.selectWareHouseAll(1);

    }

    @RequestMapping(value = "purchasing")
    public void purchasing(int[] skuids){

    }

}
