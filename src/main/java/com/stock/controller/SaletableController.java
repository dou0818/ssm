package com.stock.controller;

import com.stock.service.SaletableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SaletableController {

    @Resource(name ="saletableServiceImpl" )
    SaletableService saletableService;

    @RequestMapping(value = "/cancelOrder")
    public  String cancelOrder(HttpServletRequest request){
        Map<String,Object> map1=new HashMap<>();
        map1.put("num",1);
        map1.put("commodityid",1);
        map1.put("merchantid",1);

        Map<String,Object> map2=new HashMap<>();
        map2.put("num",2);
        map2.put("commodityid",2);
        map2.put("merchantid",1);

        List<Map<String,Object>> list=new ArrayList<>();
        list.add(map1);
        list.add(map2);


        saletableService.cancelOrder(list);

        System.out.println("取消订单成功");
        return "";
    }

}
