package com.stock.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "warehouse")
public class Warehouse {
    /**
     * 仓库层表id
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
     * 仓库id
     */
    @Column(name = "warehouse_id")
    private Integer warehouseId;

    /**
     * 仓库库存
     */
    @Column(name = "unissue_num")
    private Integer unissueNum;

    /**
     * 不可用数量
     */
    @Column(name = "unable_num")
    private Integer unableNum;

    /**
     * 锁定数量
     */
    @Column(name = "lock_num")
    private Integer lockNum;

    /**
     * 商家id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 出库数量
     */
    @Column(name = "went_num")
    private Integer wentNum;

    /**
     * 建议零售价
     */
    @Column(name = "suggest_price")
    private BigDecimal suggestPrice;

    /**
     * 获取仓库层表id
     *
     * @return id - 仓库层表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置仓库层表id
     *
     * @param id 仓库层表id
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
     * 获取仓库id
     *
     * @return warehouse_id - 仓库id
     */
    public Integer getWarehouseId() {
        return warehouseId;
    }

    /**
     * 设置仓库id
     *
     * @param warehouseId 仓库id
     */
    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * 获取仓库库存
     *
     * @return unissue_num - 仓库库存
     */
    public Integer getUnissueNum() {
        return unissueNum;
    }

    /**
     * 设置仓库库存
     *
     * @param unissueNum 仓库库存
     */
    public void setUnissueNum(Integer unissueNum) {
        this.unissueNum = unissueNum;
    }

    /**
     * 获取不可用数量
     *
     * @return unable_num - 不可用数量
     */
    public Integer getUnableNum() {
        return unableNum;
    }

    /**
     * 设置不可用数量
     *
     * @param unableNum 不可用数量
     */
    public void setUnableNum(Integer unableNum) {
        this.unableNum = unableNum;
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
     * 获取出库数量
     *
     * @return went_num - 出库数量
     */
    public Integer getWentNum() {
        return wentNum;
    }

    /**
     * 设置出库数量
     *
     * @param wentNum 出库数量
     */
    public void setWentNum(Integer wentNum) {
        this.wentNum = wentNum;
    }

    /**
     * 获取建议零售价
     *
     * @return suggest_price - 建议零售价
     */
    public BigDecimal getSuggestPrice() {
        return suggestPrice;
    }

    /**
     * 设置建议零售价
     *
     * @param suggestPrice 建议零售价
     */
    public void setSuggestPrice(BigDecimal suggestPrice) {
        this.suggestPrice = suggestPrice;
    }
}