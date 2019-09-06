package com.stock.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "active_saletable")
public class ActiveSaletable {
    /**
     * 活动_发布中间表id
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 活动id
     */
    @Column(name = "active_id")
    private Integer activeId;

    /**
     * 发布id
     */
    @Column(name = "saletable_id")
    private Integer saletableId;

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
     * 获取活动_发布中间表id
     *
     * @return id - 活动_发布中间表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置活动_发布中间表id
     *
     * @param id 活动_发布中间表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取活动id
     *
     * @return active_id - 活动id
     */
    public Integer getActiveId() {
        return activeId;
    }

    /**
     * 设置活动id
     *
     * @param activeId 活动id
     */
    public void setActiveId(Integer activeId) {
        this.activeId = activeId;
    }

    /**
     * 获取发布id
     *
     * @return saletable_id - 发布id
     */
    public Integer getSaletableId() {
        return saletableId;
    }

    /**
     * 设置发布id
     *
     * @param saletableId 发布id
     */
    public void setSaletableId(Integer saletableId) {
        this.saletableId = saletableId;
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