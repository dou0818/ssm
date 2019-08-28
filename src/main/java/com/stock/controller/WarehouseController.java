package com.stock.controller;

import com.stock.commons.MyResponseRestful;
import com.stock.service.WarehouseService;
import com.stock.util.ArrayToListUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@RestController
public class WarehouseController {

    @Resource(name = "warehouseServiceImpl")
    WarehouseService warehouseService;

    @RequestMapping("/s")
    public String a(int[] aid, int[] bid){
        System.out.println("aid +\"\\t\"+bid = " + aid +"\t"+bid);
        for (int i : aid) {
            System.out.println("i = " + i);
        }
        return "a";
    }

	@GetMapping(value = "bePutInStorage")
    public MyResponseRestful bePutInStorage(){
        int[] commodityids= {95001,95002};
        int[] merchantids= {95001,95002};
        int[] nums= {200,200};
        int[] warehouseids= {95001,95002};
        List<Map<String,Object>> list=ArrayToListUtils.wareList(commodityids,merchantids,nums,warehouseids);
        int a=warehouseService.updateWareHouse(list);
        return null;
    }
}
