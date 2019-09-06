package com.stock.domain;

import javax.persistence.*;

@Table(name = "inventory_scheduling")
public class InventoryScheduling {
    /**
     * 调度id
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
     * 调度数量
     */
    @Column(name = "num")
    private Integer num;

    /**
     * 调出仓库id
     */
    @Column(name = "out_warehouse_id")
    private Integer outWarehouseId;

    /**
     * 调入仓库id
     */
    @Column(name = "in_warehouse_id")
    private Integer inWarehouseId;

    /**
     * 状态值0：调度中，1：调度成功，-1：调度失败
     */
    @Column(name = "`statement`")
    private String statement;

    /**
     * 获取调度id
     *
     * @return id - 调度id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置调度id
     *
     * @param id 调度id
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
     * 获取调度数量
     *
     * @return num - 调度数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置调度数量
     *
     * @param num 调度数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取调出仓库id
     *
     * @return out_warehouse_id - 调出仓库id
     */
    public Integer getOutWarehouseId() {
        return outWarehouseId;
    }

    /**
     * 设置调出仓库id
     *
     * @param outWarehouseId 调出仓库id
     */
    public void setOutWarehouseId(Integer outWarehouseId) {
        this.outWarehouseId = outWarehouseId;
    }

    /**
     * 获取调入仓库id
     *
     * @return in_warehouse_id - 调入仓库id
     */
    public Integer getInWarehouseId() {
        return inWarehouseId;
    }

    /**
     * 设置调入仓库id
     *
     * @param inWarehouseId 调入仓库id
     */
    public void setInWarehouseId(Integer inWarehouseId) {
        this.inWarehouseId = inWarehouseId;
    }

    /**
     * 获取状态值0：调度中，1：调度成功，-1：调度失败
     *
     * @return statement - 状态值0：调度中，1：调度成功，-1：调度失败
     */
    public String getStatement() {
        return statement;
    }

    /**
     * 设置状态值0：调度中，1：调度成功，-1：调度失败
     *
     * @param statement 状态值0：调度中，1：调度成功，-1：调度失败
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }
}