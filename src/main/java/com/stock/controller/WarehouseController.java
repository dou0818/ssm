package com.stock.controller;

import com.stock.commons.MyResponseRestful;
import com.stock.service.WarehouseService;
import com.stock.util.ArrayToListUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class WarehouseController {
    @Resource(name = "warehouseServiceImpl")
    WarehouseService warehouseService;

    @RequestMapping(value = "/salesReturn")
    public MyResponseRestful salesReturn(int[] commodityids, int[] merchantids, int[] nums, int[] warehouseids) {
        List<Map<String, Object>> wareList = ArrayToListUtils.wareList(commodityids, merchantids, nums, warehouseids);
        boolean flag = warehouseService.salesReturn(wareList);
        MyResponseRestful restful = new MyResponseRestful(HttpStatus.OK,"退货入库成功");
        return restful;
    }

}
