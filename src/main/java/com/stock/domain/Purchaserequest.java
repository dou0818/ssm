package com.stock.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "purchaserequest")
public class Purchaserequest {
    /**
     * 采购申请单id
     */
    @Id
    @Column(name = "pr_id")
    @GeneratedValue(generator = "JDBC")
    private Integer prId;

    /**
     * 申请人id
     */
    @Column(name = "proposerid")
    private Integer proposerid;

    /**
     * 申请时间
     */
    @Column(name = "proposetime")
    private Date proposetime;

    /**
     * 审批时间
     */
    @Column(name = "approvaltime")
    private Date approvaltime;

    /**
     * 申请单状态
     */
    @Column(name = "pr_state")
    private String prState;

    /**
     * 审核人id
     */
    @Column(name = "verifierid")
    private Integer verifierid;

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
     * 获取申请人id
     *
     * @return proposerid - 申请人id
     */
    public Integer getProposerid() {
        return proposerid;
    }

    /**
     * 设置申请人id
     *
     * @param proposerid 申请人id
     */
    public void setProposerid(Integer proposerid) {
        this.proposerid = proposerid;
    }

    /**
     * 获取申请时间
     *
     * @return proposetime - 申请时间
     */
    public Date getProposetime() {
        return proposetime;
    }

    /**
     * 设置申请时间
     *
     * @param proposetime 申请时间
     */
    public void setProposetime(Date proposetime) {
        this.proposetime = proposetime;
    }

    /**
     * 获取审批时间
     *
     * @return approvaltime - 审批时间
     */
    public Date getApprovaltime() {
        return approvaltime;
    }

    /**
     * 设置审批时间
     *
     * @param approvaltime 审批时间
     */
    public void setApprovaltime(Date approvaltime) {
        this.approvaltime = approvaltime;
    }

    /**
     * 获取申请单状态
     *
     * @return pr_state - 申请单状态
     */
    public String getPrState() {
        return prState;
    }

    /**
     * 设置申请单状态
     *
     * @param prState 申请单状态
     */
    public void setPrState(String prState) {
        this.prState = prState;
    }

    /**
     * 获取审核人id
     *
     * @return verifierid - 审核人id
     */
    public Integer getVerifierid() {
        return verifierid;
    }

    /**
     * 设置审核人id
     *
     * @param verifierid 审核人id
     */
    public void setVerifierid(Integer verifierid) {
        this.verifierid = verifierid;
    }
}