package com.stock.controller;

import com.stock.commons.MyResponseRestful;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {

    @PostMapping(value = "bePutInStorage")
    public MyResponseRestful bePutInStorage(int[] commodityids, int[] merchantids, int[] nums,int[] warehouseids){
        return null;
    }
}
