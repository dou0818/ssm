package com.stock.controller;

import com.stock.commons.MyHttpClient;
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
        String string="";
        for (Map<String, Object> map : wareHoustList) {
            string+=(map.get("sku_id")+",");
        }
        String skuids=string.substring(0,string.length()-1);
        try {
            Map<String,Object> map=MyHttpClient.getShop("http://192.168.1.41:8080/selectSkuBySkuIdArray?skuIds="+skuids);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
