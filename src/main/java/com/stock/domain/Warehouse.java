package com.stock.domain;

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
    @Column(name = "commodityid")
    private Integer commodityid;

    /**
     * 仓库id
     */
    @Column(name = "warehouseid")
    private Integer warehouseid;

    /**
     * 未发布库存数量
     */
    @Column(name = "unissue_inventorynum")
    private Integer unissueInventorynum;

    /**
     * 发布库存数量
     */
    @Column(name = "issue_inventorynum")
    private Integer issueInventorynum;

    /**
     * 不可用库存数量
     */
    @Column(name = "unable_inventorynum")
    private Integer unableInventorynum;

    /**
     * 锁定库存数量
     */
    @Column(name = "lock_inventorynum")
    private Integer lockInventorynum;

    /**
     * 已出库库存数量
     */
    @Column(name = "went_inventorynum")
    private Integer wentInventorynum;

    /**
     * 商家id
     */
    @Column(name = "merchantid")
    private Integer merchantid;

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
     * 获取仓库id
     *
     * @return warehouseid - 仓库id
     */
    public Integer getWarehouseid() {
        return warehouseid;
    }

    /**
     * 设置仓库id
     *
     * @param warehouseid 仓库id
     */
    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    /**
     * 获取未发布库存数量
     *
     * @return unissue_inventorynum - 未发布库存数量
     */
    public Integer getUnissueInventorynum() {
        return unissueInventorynum;
    }

    /**
     * 设置未发布库存数量
     *
     * @param unissueInventorynum 未发布库存数量
     */
    public void setUnissueInventorynum(Integer unissueInventorynum) {
        this.unissueInventorynum = unissueInventorynum;
    }

    /**
     * 获取发布库存数量
     *
     * @return issue_inventorynum - 发布库存数量
     */
    public Integer getIssueInventorynum() {
        return issueInventorynum;
    }

    /**
     * 设置发布库存数量
     *
     * @param issueInventorynum 发布库存数量
     */
    public void setIssueInventorynum(Integer issueInventorynum) {
        this.issueInventorynum = issueInventorynum;
    }

    /**
     * 获取不可用库存数量
     *
     * @return unable_inventorynum - 不可用库存数量
     */
    public Integer getUnableInventorynum() {
        return unableInventorynum;
    }

    /**
     * 设置不可用库存数量
     *
     * @param unableInventorynum 不可用库存数量
     */
    public void setUnableInventorynum(Integer unableInventorynum) {
        this.unableInventorynum = unableInventorynum;
    }

    /**
     * 获取锁定库存数量
     *
     * @return lock_inventorynum - 锁定库存数量
     */
    public Integer getLockInventorynum() {
        return lockInventorynum;
    }

    /**
     * 设置锁定库存数量
     *
     * @param lockInventorynum 锁定库存数量
     */
    public void setLockInventorynum(Integer lockInventorynum) {
        this.lockInventorynum = lockInventorynum;
    }

    /**
     * 获取已出库库存数量
     *
     * @return went_inventorynum - 已出库库存数量
     */
    public Integer getWentInventorynum() {
        return wentInventorynum;
    }

    /**
     * 设置已出库库存数量
     *
     * @param wentInventorynum 已出库库存数量
     */
    public void setWentInventorynum(Integer wentInventorynum) {
        this.wentInventorynum = wentInventorynum;
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