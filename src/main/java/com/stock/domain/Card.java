package com.stock.domain;

import javax.persistence.*;

@Table(name = "card")
public class Card {
    /**
     * 优惠卷表id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 优惠卷id
     */
    @Column(name = "cardid")
    private Integer cardid;

    /**
     * 优惠卷数量
     */
    @Column(name = "cardnum")
    private Integer cardnum;

    /**
     * 获取优惠卷表id
     *
     * @return id - 优惠卷表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置优惠卷表id
     *
     * @param id 优惠卷表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取优惠卷id
     *
     * @return cardid - 优惠卷id
     */
    public Integer getCardid() {
        return cardid;
    }

    /**
     * 设置优惠卷id
     *
     * @param cardid 优惠卷id
     */
    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    /**
     * 获取优惠卷数量
     *
     * @return cardnum - 优惠卷数量
     */
    public Integer getCardnum() {
        return cardnum;
    }

    /**
     * 设置优惠卷数量
     *
     * @param cardnum 优惠卷数量
     */
    public void setCardnum(Integer cardnum) {
        this.cardnum = cardnum;
    }
}