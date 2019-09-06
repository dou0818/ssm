package com.stock.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "soldout_record")
public class SoldoutRecord {
    /**
     * 下架记录表主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 商品id
     */
    @Column(name = "sku_id")
    private Integer skuId;

    /**
     * 商家id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 已销售数量
     */
    @Column(name = "saleed_num")
    private Integer saleedNum;

    /**
     * 下架时间
     */
    @Column(name = "soldout_time")
    private Date soldoutTime;

    /**
     * 获取下架记录表主键
     *
     * @return id - 下架记录表主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置下架记录表主键
     *
     * @param id 下架记录表主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品id
     *
     * @return sku_id - 商品id
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * 设置商品id
     *
     * @param skuId 商品id
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * 获取商家id
     *
     * @return merchant_id - 商家id
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商家id
     *
     * @param merchantId 商家id
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 获取已销售数量
     *
     * @return saleed_num - 已销售数量
     */
    public Integer getSaleedNum() {
        return saleedNum;
    }

    /**
     * 设置已销售数量
     *
     * @param saleedNum 已销售数量
     */
    public void setSaleedNum(Integer saleedNum) {
        this.saleedNum = saleedNum;
    }

    /**
     * 获取下架时间
     *
     * @return soldout_time - 下架时间
     */
    public Date getSoldoutTime() {
        return soldoutTime;
    }

    /**
     * 设置下架时间
     *
     * @param soldoutTime 下架时间
     */
    public void setSoldoutTime(Date soldoutTime) {
        this.soldoutTime = soldoutTime;
    }
}