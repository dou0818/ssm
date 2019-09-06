package com.stock.controller;

import com.stock.commons.MyResponseRestful;
import com.stock.service.SaletableService;
import com.stock.util.ArrayToListUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class SaletableController {
    @Resource(name = "saletableServiceImpl")
    SaletableService saletableService;

    /**
     * 付款后锁定库存-，已销售库存+
     * @return
     */
    @RequestMapping("/payment")
    public MyResponseRestful payment(int[] commodityids, int[] merchantids, int[] nums){
        List<Map<String,Object>> list= ArrayToListUtils.saleList(commodityids, merchantids, nums);
        saletableService.payment(list);
        return new MyResponseRestful("操作成功", HttpStatus.OK);
    }

    @RequestMapping("/cancelorder")
    public MyResponseRestful cancelOrder(int[] commodityids, int[] merchantids, int[] nums){
        List<Map<String,Object>> list=ArrayToListUtils.saleList(commodityids,merchantids,nums);
        int a=saletableService.cancelOrder(list);
        return new MyResponseRestful("操作成功", HttpStatus.OK);
    }
}
