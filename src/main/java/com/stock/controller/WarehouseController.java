package com.stock.controller;

import com.stock.commons.MyResponseRestful;
import com.stock.domain.Outwarehouse;
import com.stock.domain.Warehouse;
import com.stock.service.OutwarehouseService;
import com.stock.service.WarehouseService;
import com.stock.util.ArrayToListUtils;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;import javax.servlet.http.HttpServletRequest;import java.util.List;
import java.util.Map;


@RestController
public class WarehouseController {
	
    @Resource(name = "warehouseServiceImpl")
    WarehouseService warehouseService;
	@Resource(name="outwarehouseServiceImpl")
    OutwarehouseService outwarehouseService;

 /**
     * 商品退货进行的操作接口
     * @param commodityids
     * @param merchantids
     * @param nums
     * @param warehouseids
     * @return
     */
    @RequestMapping(value = "salesReturn")
    public MyResponseRestful salesReturn(int[] commodityids, int[] merchantids, int[] nums, int[] warehouseids) {
        List<Map<String, Object>> wareList = ArrayToListUtils.wareList(commodityids, merchantids, nums, warehouseids);
        boolean flag = warehouseService.salesReturn(wareList);
        MyResponseRestful restful = new MyResponseRestful(HttpStatus.OK, "退货入库成功");
        return restful;
    }

    /**
     *进货入库，未发布库存增加
     * @param commodityids
     * @param merchantids
     * @param nums
     * @param warehouseids
     * @return
     */
    @GetMapping(value = "bePutInStorage")
    public MyResponseRestful bePutInStorage(int[] commodityids, int[] merchantids, int[] nums, int[] warehouseids) {

        List<Map<String, Object>> list = ArrayToListUtils.wareList(commodityids, merchantids, nums, warehouseids);
        int a = warehouseService.updateWareHouse(list);
        return new MyResponseRestful("操作成功", HttpStatus.OK);
    }
/**
     * 将仓库层的未发布库存部分库存添加到发布库存,在发布库存表里添加下相应的数据
     * @return
     */
    @Transactional()// 设置事务
    @RequestMapping("/putsInStorage")
    public MyResponseRestful putsInStorage(int[] commodityids, int[] merchantids, int[] nums, int[] warehouseids) {
        List<Map<String,Object>> list=ArrayToListUtils.wareList(commodityids,merchantids,nums,warehouseids);
        warehouseService.updateInventorynumByWarehouse(list);

        List<Outwarehouse> outwarehousesList =new ArrayList<>();

        for (Map<String,Object> w : list) {
            Outwarehouse outwarehouse=new Outwarehouse();
            outwarehouse.setCommodityid((int)w.get("commodityid"));
            outwarehouse.setMerchantid((int)w.get("merchantid"));
            outwarehouse.setWarehouseid((int)w.get("warehouseid"));
            outwarehouse.setNum((int) w.get("num"));
            outwarehouse.setTime(new Date());
            outwarehousesList.add(outwarehouse);
        }
        outwarehouseService.insertOutwarehouseByList(outwarehousesList);
        return new MyResponseRestful("操作成功", HttpStatus.OK);
    }

    @RequestMapping(value = "stockSearch")
    public MyResponseRestful stockSearch(){
        List<Map<String,Object>> list=warehouseService.stockSearch();
        String string="map取值说明（commodityid商品id）（merchantid商家id）（unissue_inventorynum剩余库存）";
        return new MyResponseRestful(HttpStatus.OK,"查询成功", list,string);
    }
}
