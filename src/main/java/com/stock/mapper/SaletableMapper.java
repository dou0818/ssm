package com.stock.mapper;

import com.stock.domain.Saletable;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface SaletableMapper extends Mapper<Saletable> {

    /**
     * 获得全部库存
     *
     * @return
     */
    List<Map<String, Object>> showAll();

    /**
     * 根据用户id和商品id添加活动库存
     *
     * @param merchanid
     * @param commodityid
     * @param num
     * @return
     */
    int addActivityNum(int merchanid, int commodityid, int num);


    /**
     * 付款成功后，修改可销售库存-，锁定库存-，已销售库存+
     *
     * @param paymentid
     * @return
     */
    int payment(List<Map<String, Object>> paymentid);

    /**
     * 修改预售数量
     *
     * @param list
     * @return
     */
    public int addSaleNum(List<Map<String, Object>> list);

    /**
     * 取消订单
     *
     * @param orderid
     * @return
     */
    int cancelOrder(List<Map<String, Object>> orderid);

    /**
     * 获取商家的商品
     *
     * @param merchantid
     * @return
     */
    List<Map<String, Object>> selSaleTableByMerchantId(int merchantid);
/**
     * 根据商品id商家id返回可销售库存数据
     *
     * @param map
     * @return
     */
    Map<String, Object> getById(@Param("map") Map<String, Object> map);

    /**
     * 下单成功，修改数量
     *
     * @param list
     * @return
     */
    int placeOrder(@Param("list") List<Map<String, Object>> list);

	/**
     * 根据商品id和商家id修改可销售数量
     * @param list
     * @return
     */
    public int updatesalenumBySaletable(List<Map<String,Object>> list);}