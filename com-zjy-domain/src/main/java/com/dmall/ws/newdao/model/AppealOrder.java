package com.dmall.ws.newdao.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 *
 * @author junyizeng
 * @date 2019-6-17
 *
 */
public class AppealOrder implements Serializable {
    /**  */
    private Long id;

    /** 申述单号 */
    private String appealOrderNum;

    /** 工单号 */
    private String workOrderNum;

    /** 工单id */
    private Long workOrderId;

    /** 订单号 */
    private String orderNum;

    /** 商家id */
    private Long venderId;

    /** 商家名称 */
    private String venderName;

    /** 门店id */
    private Long storeId;

    /** 门店名称 */
    private String storeName;

    /** 申请人所在部门 */
    private String department;

    /** 申述类型 0：类型判定错误 1：门店无责 2：修改责任人 */
    private Byte appealType;

    /** 申述描述 */
    private String content;

    /** 申述状态 0：待审核 1：审核通过 2：审核拒绝 */
    private Byte appealStatus;

    /** 审核意见 */
    private String opinion;

    /** yn */
    private Byte yn;

    /** 创建时间 */
    private Date created;

    /** 创建人 */
    private String creator;

    /** 修改时间 */
    private Date modified;

    /** 修改人 */
    private String upator;

    /**  */
    private String imgUrl1;

    /**  */
    private String imgUrl2;

    /**  */
    private String imgUrl3;

    /** 是否回访 */
    private Byte followupFlag;

    /**  */
    private Byte workOrderType;

    /**  */
    private Byte orderSaleType;

    /**  */
    private String upatorRealName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppealOrderNum() {
        return appealOrderNum;
    }

    public void setAppealOrderNum(String appealOrderNum) {
        this.appealOrderNum = appealOrderNum == null ? null : appealOrderNum.trim();
    }

    public String getWorkOrderNum() {
        return workOrderNum;
    }

    public void setWorkOrderNum(String workOrderNum) {
        this.workOrderNum = workOrderNum == null ? null : workOrderNum.trim();
    }

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Long getVenderId() {
        return venderId;
    }

    public void setVenderId(Long venderId) {
        this.venderId = venderId;
    }

    public String getVenderName() {
        return venderName;
    }

    public void setVenderName(String venderName) {
        this.venderName = venderName == null ? null : venderName.trim();
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Byte getAppealType() {
        return appealType;
    }

    public void setAppealType(Byte appealType) {
        this.appealType = appealType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Byte getAppealStatus() {
        return appealStatus;
    }

    public void setAppealStatus(Byte appealStatus) {
        this.appealStatus = appealStatus;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getUpator() {
        return upator;
    }

    public void setUpator(String upator) {
        this.upator = upator == null ? null : upator.trim();
    }

    public String getImgUrl1() {
        return imgUrl1;
    }

    public void setImgUrl1(String imgUrl1) {
        this.imgUrl1 = imgUrl1 == null ? null : imgUrl1.trim();
    }

    public String getImgUrl2() {
        return imgUrl2;
    }

    public void setImgUrl2(String imgUrl2) {
        this.imgUrl2 = imgUrl2 == null ? null : imgUrl2.trim();
    }

    public String getImgUrl3() {
        return imgUrl3;
    }

    public void setImgUrl3(String imgUrl3) {
        this.imgUrl3 = imgUrl3 == null ? null : imgUrl3.trim();
    }

    public Byte getFollowupFlag() {
        return followupFlag;
    }

    public void setFollowupFlag(Byte followupFlag) {
        this.followupFlag = followupFlag;
    }

    public Byte getWorkOrderType() {
        return workOrderType;
    }

    public void setWorkOrderType(Byte workOrderType) {
        this.workOrderType = workOrderType;
    }

    public Byte getOrderSaleType() {
        return orderSaleType;
    }

    public void setOrderSaleType(Byte orderSaleType) {
        this.orderSaleType = orderSaleType;
    }

    public String getUpatorRealName() {
        return upatorRealName;
    }

    public void setUpatorRealName(String upatorRealName) {
        this.upatorRealName = upatorRealName == null ? null : upatorRealName.trim();
    }
}