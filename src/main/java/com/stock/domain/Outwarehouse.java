package com.stock.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "outwarehouse")
public class Outwarehouse {
    /**
     * 出库表id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 仓库id
     */
    @Column(name = "warehouseid")
    private Integer warehouseid;

    /**
     * 商品id
     */
    @Column(name = "commodityid")
    private Integer commodityid;

    /**
     * 商家id
     */
    @Column(name = "merchantid")
    private Integer merchantid;

    /**
     * 出库数量
     */
    @Column(name = "num")
    private Integer num;

    /**
     * 出库时间
     */
    @Column(name = "`time`")
    private Date time;

    /**
     * 获取出库表id
     *
     * @return id - 出库表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置出库表id
     *
     * @param id 出库表id
     */
    public void setId(Integer id) {
        this.id = id;
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

    /**
     * 获取出库数量
     *
     * @return num - 出库数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置出库数量
     *
     * @param num 出库数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取出库时间
     *
     * @return time - 出库时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置出库时间
     *
     * @param time 出库时间
     */
    public void setTime(Date time) {
        this.time = time;
    }
}