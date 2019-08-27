package com.stock.domain;

import javax.persistence.*;

@Table(name = "saletable")
public class Saletable {
    /**
     * 可销售库存表id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 商品id
     */
    @Column(name = "commodityid")
    private Integer commodityid;

    /**
     * 可销售数量
     */
    @Column(name = "salenum")
    private Integer salenum;

    /**
     * 锁定数量
     */
    @Column(name = "locknum")
    private Integer locknum;

    /**
     * 已销售数量
     */
    @Column(name = "saleednum")
    private Integer saleednum;

    /**
     * 活动数量
     */
    @Column(name = "activitynum")
    private Integer activitynum;

    /**
     * 预售数量
     */
    @Column(name = "presellnum")
    private Integer presellnum;

    /**
     * 商家id
     */
    @Column(name = "merchantid")
    private Integer merchantid;

    /**
     * 获取可销售库存表id
     *
     * @return id - 可销售库存表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置可销售库存表id
     *
     * @param id 可销售库存表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品id
     *
     * @return commodityid - 商品id
     */
    public Integer getCommodityid() {
        return commodityid;
    }

    /**
     * 设置商品id
     *
     * @param commodityid 商品id
     */
    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    /**
     * 获取可销售数量
     *
     * @return salenum - 可销售数量
     */
    public Integer getSalenum() {
        return salenum;
    }

    /**
     * 设置可销售数量
     *
     * @param salenum 可销售数量
     */
    public void setSalenum(Integer salenum) {
        this.salenum = salenum;
    }

    /**
     * 获取锁定数量
     *
     * @return locknum - 锁定数量
     */
    public Integer getLocknum() {
        return locknum;
    }

    /**
     * 设置锁定数量
     *
     * @param locknum 锁定数量
     */
    public void setLocknum(Integer locknum) {
        this.locknum = locknum;
    }

    /**
     * 获取已销售数量
     *
     * @return saleednum - 已销售数量
     */
    public Integer getSaleednum() {
        return saleednum;
    }

    /**
     * 设置已销售数量
     *
     * @param saleednum 已销售数量
     */
    public void setSaleednum(Integer saleednum) {
        this.saleednum = saleednum;
    }

    /**
     * 获取活动数量
     *
     * @return activitynum - 活动数量
     */
    public Integer getActivitynum() {
        return activitynum;
    }

    /**
     * 设置活动数量
     *
     * @param activitynum 活动数量
     */
    public void setActivitynum(Integer activitynum) {
        this.activitynum = activitynum;
    }

    /**
     * 获取预售数量
     *
     * @return presellnum - 预售数量
     */
    public Integer getPresellnum() {
        return presellnum;
    }

    /**
     * 设置预售数量
     *
     * @param presellnum 预售数量
     */
    public void setPresellnum(Integer presellnum) {
        this.presellnum = presellnum;
    }

    /**
     * 获取商家id
     *
     * @return merchantid - 商家id
     */
    public Integer getMerchantid() {
        return merchantid;
    }

    /**
     * 设置商家id
     *
     * @param merchantid 商家id
     */
    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }
}