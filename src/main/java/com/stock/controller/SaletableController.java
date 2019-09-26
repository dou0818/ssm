package com.stock.controller;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stock.commons.MyHttpClient;
import com.stock.commons.Page;
import com.stock.commons.Url;
import com.stock.domain.Saletable;
<<<<<<< HEAD
import com.stock.service.SaletableService;import org.springframework.stereotype.Controller;
=======
import com.stock.service.SaletableService;
import com.stock.service.SoldoutRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
>>>>>>> 784da5adaf0c0cff4b97d5894c1033e458e72aae
import com.stock.commons.MyResponseRestful;
import com.stock.service.SaletableService;
import com.stock.util.ArrayToListUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
=======
>>>>>>> 784da5adaf0c0cff4b97d5894c1033e458e72aae

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

@Controller
public class SaletableController {
@Resource(name = "saletableServiceImpl")
    SaletableService saletableService;

 	@Resource(name="soldoutRecordServiceImpl")
    SoldoutRecordService soldoutRecordService;
 	@Resource
    Url url;

    @RequestMapping("selSale")
    @ResponseBody
 public PageInfo selSale(int pageNum) throws Exception {
        int merchantId = 1;
        PageHelper.startPage(pageNum, page.getPagesize());
        List<Saletable> saletableList=saletableService.selSaleByMerchantId(merchantId);
        String skuids="skuIds=";
        for (Saletable saletable:saletableList) {
             skuids+=saletable.getSkuId()+",";
        }
        Map<String,Object> mapList= MyHttpClient.getShop(url.getShopUrl()+skuids.substring(0,skuids.length()-1));
        PageInfo<Saletable> userPageInfo = new PageInfo<>(saletableList);
        return userPageInfo;
        }
<<<<<<< HEAD
        return false;
    }

	 @RequestMapping("/payment")
    public MyResponseRestful payment(int[] commodityids, int[] merchantids, int[] nums){
        List<Map<String,Object>> list= ArrayToListUtils.saleList(commodityids, merchantids, nums);
        saletableService.payment(list);
        return new MyResponseRestful("�����ɹ�", HttpStatus.OK);
    }
=======
>>>>>>> 784da5adaf0c0cff4b97d5894c1033e458e72aae

    /**
     * 商品下架
     * @param skuIds
     * @return
     */
    @RequestMapping("/soldOut")
    public MyResponseRestful soldOut(@RequestParam(value = "skuId") int skuIds[]){
        saletableService.updatesoldOutById(skuIds);
        soldoutRecordService.insertSaletableServices(skuIds);
        return new MyResponseRestful("下架成功",HttpStatus.OK);






    }
<<<<<<< HEAD
}
=======

>>>>>>> 784da5adaf0c0cff4b97d5894c1033e458e72aae
