package com.stock.domain;

import javax.persistence.*;

@Table(name = "purchaserequestdetails")
public class Purchaserequestdetails {
    /**
     * 采购申请详情id
     */
    @Id
    @Column(name = "prd_id")
    @GeneratedValue(generator = "JDBC")
    private Integer prdId;

    /**
     * 采购申请单id
     */
    @Column(name = "pr_id")
    private Integer prId;

    /**
     * 商品id
     */
    @Column(name = "sku_id")
    private Integer skuId;

    /**
     * 采购数量
     */
    @Column(name = "purchase_num")
    private Integer purchaseNum;

    /**
     * 商家id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 获取采购申请详情id
     *
     * @return prd_id - 采购申请详情id
     */
    public Integer getPrdId() {
        return prdId;
    }

    /**
     * 设置采购申请详情id
     *
     * @param prdId 采购申请详情id
     */
    public void setPrdId(Integer prdId) {
        this.prdId = prdId;
    }

    /**
     * 获取采购申请单id
     *
     * @return pr_id - 采购申请单id
     */
    public Integer getPrId() {
        return prId;
    }

    /**
     * 设置采购申请单id
     *
     * @param prId 采购申请单id
     */
    public void setPrId(Integer prId) {
        this.prId = prId;
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
     * 获取采购数量
     *
     * @return purchase_num - 采购数量
     */
    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    /**
     * 设置采购数量
     *
     * @param purchaseNum 采购数量
     */
    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
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
}