package com.stock.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "saletable")
public class Saletable {
    /**
     * 发布库存表id
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
     * 可销售数量
     */
    @Column(name = "sale_num")
    private Integer saleNum;

    /**
     * 锁定数量
     */
    @Column(name = "lock_num")
    private Integer lockNum;

    /**
     * 已销售数量
     */
    @Column(name = "saleed_num")
    private Integer saleedNum;

    /**
     * 商家id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 0为准备下架 1为已上架商品
     */
    @Column(name = "sold_out")
    private Integer soldOut;

    /**
     * 上架价格
     */
    @Column(name = "put_price")
    private BigDecimal putPrice;

    /**
     * 获取发布库存表id
     *
     * @return id - 发布库存表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置发布库存表id
     *
     * @param id 发布库存表id
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
     * 获取可销售数量
     *
     * @return sale_num - 可销售数量
     */
    public Integer getSaleNum() {
        return saleNum;
    }

    /**
     * 设置可销售数量
     *
     * @param saleNum 可销售数量
     */
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    /**
     * 获取锁定数量
     *
     * @return lock_num - 锁定数量
     */
    public Integer getLockNum() {
        return lockNum;
    }

    /**
     * 设置锁定数量
     *
     * @param lockNum 锁定数量
     */
    public void setLockNum(Integer lockNum) {
        this.lockNum = lockNum;
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
     * 获取0为准备下架 1为已上架商品
     *
     * @return sold_out - 0为准备下架 1为已上架商品
     */
    public Integer getSoldOut() {
        return soldOut;
    }

    /**
     * 设置0为准备下架 1为已上架商品
     *
     * @param soldOut 0为准备下架 1为已上架商品
     */
    public void setSoldOut(Integer soldOut) {
        this.soldOut = soldOut;
    }

    /**
     * 获取上架价格
     *
     * @return put_price - 上架价格
     */
    public BigDecimal getPutPrice() {
        return putPrice;
    }

    /**
     * 设置上架价格
     *
     * @param putPrice 上架价格
     */
    public void setPutPrice(BigDecimal putPrice) {
        this.putPrice = putPrice;
    }
}