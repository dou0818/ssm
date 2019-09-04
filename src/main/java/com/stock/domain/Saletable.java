package com.stock.domain;

import java.util.Date;
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
     * 活动id
     */
    @Column(name = "active_id")
    private String activeId;

    /**
     * 活动开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 活动结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

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
     * 获取活动id
     *
     * @return active_id - 活动id
     */
    public String getActiveId() {
        return activeId;
    }

    /**
     * 设置活动id
     *
     * @param activeId 活动id
     */
    public void setActiveId(String activeId) {
        this.activeId = activeId;
    }

    /**
     * 获取活动开始时间
     *
     * @return start_time - 活动开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置活动开始时间
     *
     * @param startTime 活动开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取活动结束时间
     *
     * @return end_time - 活动结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置活动结束时间
     *
     * @param endTime 活动结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}