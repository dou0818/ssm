package com.stock.controller;

import com.github.pagehelper.PageHelper;
import com.stock.commons.MyResponseRestful;
import com.stock.commons.Page;
import com.stock.domain.Saletable;
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
    @Resource
    Page page;
    @Resource(name = "saletableServiceImpl")
    SaletableService saletableService;
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


}
