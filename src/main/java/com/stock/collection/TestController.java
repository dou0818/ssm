package com.stock.collection;

import com.stock.domain.Saletable;
import com.stock.service.SaletableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Resource(name = "saletableServiceImpl")
    SaletableService saletableService;

    /***
     *
     * 添加活动库存属量
     * @param mapList
     * @return
     */
    @RequestMapping("promotion")
    public Boolean promotion(List<Map<String,Object>>mapList){
        List<Saletable> saletableList= saletableService.selAllSaleNum();//查询销售库存数量
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
}
