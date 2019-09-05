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

import javax.annotation.Resource;
import java.util.List;

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
}
