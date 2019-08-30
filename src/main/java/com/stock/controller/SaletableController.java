package com.stock.controller;

import com.github.pagehelper.PageHelper;
import com.stock.commons.MyResponseRestful;
import com.stock.commons.Page;
import com.stock.domain.Saletable;
import com.stock.service.SaletableService;
import com.stock.util.ArrayToListUtils;

import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    @Resource
    Page page;
    @Resource(name = "saletableServiceImpl")
    SaletableService saletableService;


    /**
     * 获得全部库存
     * @return
     */
    @RequestMapping(value = "showall")
    @CrossOrigin(origins = "*")
    public MyResponseRestful showAll(){
        List<Map<String,Object>> list=saletableService.showAll();
        String string="map取值说明（commodityid商品id）（merchantid商家id）（salenum可销售数量）" +
                "（saleednum已销售数量）（activitynum活动数量）（presellnum预售数量）";
        return new MyResponseRestful(HttpStatus.OK,"查询成功",list,string);
    }


    @RequestMapping("selSaleTable")
    public List<Map<String,Object>> selSaleTableByMerchantId(int merchantid,int pageNum){
        PageHelper.startPage(pageNum,page.getPagesize());
        List<Map<String,Object>> saletables= saletableService.selSaleTableByMerchantId(merchantid);
        return saletables;
    }

    /***
     *
     * 添加活动库存数量
     * @param commodityids,merchantids,nums
     * @return
     */

    @RequestMapping("promotion")
    public Boolean promotion(int[] commodityids, int[] merchantids, int[] nums) {
        List<Map<String, Object>>mapList= ArrayToListUtils.saleList(commodityids,merchantids,nums);
        List<Saletable> saletableList = saletableService.selAllSaleNum();//查询库存信息
        for (Saletable saletable : saletableList) {
            for (Map<String, Object> map : mapList) {
                if (map.get("commodityid").equals(saletable.getCommodityid()) //判断销售库存数量是否够用来做活动
                        && map.get("merchantid").equals(saletable.getMerchantid())
                        && saletable.getSalenum() > Integer.parseInt(map.get("num").toString())) {
                    saletableService.addActivityNum(saletable.getMerchantid(),
                            saletable.getCommodityid(), Integer.parseInt(map.get("num").toString())); //修改活动库存和销售库存数量
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 付款成功后，锁定库存-，已销售库存+
     * @param commodityids
     * @param merchantids
     * @param nums
     * @return
     */
    @RequestMapping(value = "/payment")
    public MyResponseRestful payment(int[] commodityids, int[] merchantids, int[] nums) {
        List<Map<String, Object>> list = ArrayToListUtils.saleList(commodityids,merchantids,nums);
        int a = saletableService.payment(list);
        return new MyResponseRestful(HttpStatus.OK,"付款成功",a);
    }

    /**
     * 取消订单
     * @param commodityids
     * @param merchantids
     * @param nums
     * @return
     */
    @RequestMapping(value = "/cancelOrder")
    public MyResponseRestful cancelOrder(int[] commodityids, int[] merchantids, int[] nums) {
        List<Map<String, Object>> list = ArrayToListUtils.saleList(commodityids,merchantids,nums);
        int a=saletableService.cancelOrder(list);
        return new MyResponseRestful(HttpStatus.OK,"取消订单",a);
    }



    /**
     * 预售功能
     * @param commodityids
     * @param merchantids
     * @param nums
     * @return
     */
    @RequestMapping(value = "/addSaleNum")
    public MyResponseRestful addSaleNum(int[] commodityids, int[] merchantids, int[] nums) {
        List<Map<String, Object>> list = ArrayToListUtils.saleList(commodityids,merchantids,nums);
        int a=saletableService.addSaleNum(list); //修改预售数量方法
        return new MyResponseRestful(HttpStatus.OK,"设置预售成功",a);
    }

    @Transactional
    @RequestMapping(value = "/placeOrder")
    public MyResponseRestful placeOrder(int[] commodityids, int[] merchantids, int[] nums){
        List<Map<String,Object>> list =ArrayToListUtils.saleList(commodityids,merchantids,nums);
        //定义商品数量不够的数组
        List<Map<String,Object>> saleList=new ArrayList();
        for (Map<String, Object> map : list) {
            Map<String,Object> saleMap = saletableService.getById(map);
            saleMap.put("num",map.get("num"));
            //判断活动商品的数量是否大于0
            if ((int)(saleMap.get("activitynum"))>0){
                //判断库存是否够需求
                if ((int)(saleMap.get("activitynum"))<(int) saleMap.get("num")){
                    saleList.add(saleMap);
                }
            }else {
                //判断库存是否够需求
                if ((int)(saleMap.get("salenum"))<(int) saleMap.get("num")){
                    saleList.add(saleMap);
                }
            }
        }
        if (saleList.size()==0){
            int a=saletableService.placeOrder(saleList);
            return new MyResponseRestful(HttpStatus.OK,"下单成功",a);
        } else {
            for (Map<String, Object> map : saleList) {
                if ((int)map.get("activitynum") == 0){
                    map.remove("activitynum");
                }else {
                    map.remove("salenum");
                }
            }
            return new MyResponseRestful(HttpStatus.OK,"库存不足",saleList);
        }
    }


}
