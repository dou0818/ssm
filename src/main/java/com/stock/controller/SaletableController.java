package com.stock.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stock.commons.Page;
import com.stock.domain.Saletable;
import com.stock.service.SaletableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.stock.commons.MyResponseRestful;
import com.stock.service.SaletableService;
import com.stock.util.ArrayToListUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class SaletableController {
    @Resource(name = "saletableServiceImpl")
    SaletableService saletableService;
    @Resource
    Page page;
    @RequestMapping("selSale")
    @ResponseBody
    public PageInfo selSale(int pageNum){
        int merchantId = 1;
        PageHelper.startPage(pageNum, page.getPagesize());
        List<Saletable> saletableList=saletableService.selSaleByMerchantId(merchantId);
        for (Saletable saletable:saletableList) {
            saletable.getSkuId();
        }
        PageInfo<Saletable> userPageInfo = new PageInfo<>(saletableList);
        return userPageInfo;
    }
    @RequestMapping("addSale")
    public boolean addSale(Saletable saletable){
        int i=saletableService.addSale(saletable);
        if (i>0){
            return true;
        }
        return false;
    }

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