package com.stock.controller;

import com.stock.commons.MyResponseRestful;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class WarehouseController {
    public MyResponseRestful salesReturn(List<Map<String,Object>> salesList){
        MyResponseRestful restful = new MyResponseRestful();

        return restful;
    }
    @RequestMapping("/s")
    public String a(int[] aid, int[] bid){
        System.out.println("aid +\"\\t\"+bid = " + aid +"\t"+bid);
        for (int i : aid) {
            System.out.println("i = " + i);
        }
        return "a";
    }
}
