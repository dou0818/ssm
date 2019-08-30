package com.stock.service;

import com.stock.domain.Saletable;
import com.stock.mapper.SaletableMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SaletableServiceImpl implements SaletableService{

    @Resource(name = "saletableMapper")
    private SaletableMapper saletableMapper;
    /**
     * 根据用户id和商品id添加活动库存
     * @param merchanid
     * @param commodityid
     * @param num
     * @return
     */
    @Override
    public int addActivityNum(int merchanid, int commodityid, int num) {
       return saletableMapper.addActivityNum(merchanid,commodityid,num);
    }
    /**
     * 查询所有库存信息
     * @return
     */
    @Override
    public List<Saletable>selAllSaleNum() {
        return saletableMapper.selectAll();
    }

    /**
     * 付款成功后，修改可销售库存-，锁定库存-，已销售库存+
     *
     * @param paymentid
     * @return
     */
    @Override
    public int payment(List<Map<String, Object>> paymentid) {
        return saletableMapper.payment(paymentid);
    }

    /**
     * 修改预售数量
     * @param list
     * @return
     */
    @Override
    public int addSaleNum(List<Map<String, Object>> list) {
        return saletableMapper.addSaleNum(list);
    }

    /**
     * 取消订单
     * @param orderid
     * @return
     */
    @Override
    public int cancelOrder(List<Map<String, Object>> orderid) {
        return saletableMapper.cancelOrder(orderid);
    }

    @Override
    public List<Map<String, Object>> selSaleTableByMerchantId(int merchantid) {
        return saletableMapper.selSaleTableByMerchantId(merchantid);
    }

    /**
     * 根据商品id和商家id修改可销售数量
     * @param list
     * @return
     */
    @Override
    public int updatesalenumBySaletable(List<Map<String, Object>> list) {
        return saletableMapper.updatesalenumBySaletable(list);
    }


}
