package com.stock.controller;

import com.stock.domain.Saletable;
import com.stock.service.SaletableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class SaletableController {

    @Resource(name = "saletableServiceImpl")
    SaletableService saletableService;
    /***
     *
     * 添加活动库存数量
     * @param mapList
     * @return
     */
    @RequestMapping("promotion")
    public Boolean promotion(List<Map<String,Object>> mapList){
        List<Saletable> saletableList= saletableService.selAllSaleNum();//查询库存信息
        for (Saletable saletable:saletableList) {
            for (Map<String,Object> map:mapList) {
                if (map.get("commodityid").equals(saletable.getCommodityid()) //判断销售库存数量是否够用来做活动
                        &&map.get("merchantid").equals(saletable.getMerchantid())
                        &&saletable.getSalenum()>Integer.parseInt(map.get("num").toString())){
                    saletableService.addActivityNum(saletable.getMerchantid(),
                            saletable.getCommodityid(),Integer.parseInt(map.get("num").toString())); //修改活动库存和销售库存数量
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 付款成功后，修改可销售库存-，锁定库存-，已销售库存+
     * @param
     * @return
     */
    @RequestMapping(value = "/payment")
    public String payment() {
        List<Map<String, Object>> paymentid = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("commodityid", "1");
        map.put("merchantid", "1");
        map.put("num", "2");
        paymentid.add(map);

        Map<String,Object> map1=new HashMap<>();
        map1.put("commodityid", "2");
        map1.put("merchantid", "1");
        map1.put("num", "2");
        paymentid.add(map1);

        int a = saletableService.payment(paymentid);

        return "";
    }


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

    /**
     * 预售功能
     * 批量修改预售数量
     * @return
     */
    @RequestMapping(value = "/addSaleNum" )
    public String addSaleNum(){
        Map<String,Object> map=new HashMap<>();
        map.put("presellnum",90);
        map.put("commodityid",1);
        map.put("merchantid",1);
        Map<String,Object> map2=new HashMap<>();
        map2.put("presellnum",88);
        map2.put("commodityid",2);
        map2.put("merchantid",1);
        List<Map<String,Object>> list=new ArrayList<>();
        list.add(map);
        list.add(map2);
        saletableService.addSaleNum(list); //修改预售数量方法
        return  "hhh";
    }
