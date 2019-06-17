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
public class WsWorkOrder implements Serializable {
    /** 工单表 */
    private Long id;

    /** 工单号 */
    private String workOrderNum;

    /** 电话号 */
    private String telNum;

    /** 订单号 */
    private String orderNum;

    /** 订单类型（1：手机订单；3线下订单） */
    private Byte orderType;

    /** 订单销售类型 */
    private Byte orderSaleType;

    /** 业务类型 */
    private Integer problemTypesId;

    /** 订单门店id */
    private Long orderStoreId;

    /** 门店id */
    private Long storeId;

    /** 紧急程度 1:一级 2：二级 3：三级 */
    private Integer grade;

    /** 标题 */
    private String title;

    /** 内容 */
    private String content;

    /** 备注 */
    private String remark;

    /** 状态状态 0待提交,1待处理(等待门店接单)，2，处理中（门店接单后，不管回复多少次，全部属于处理中），3关闭状态 */
    private Integer status;

    /** 二级状态。标示工单的流转状态，0未处理状态，1是发起人已回复，2是接收人已回复。用来分对象的判断当前工单的流转状态，模拟工作流；3等待门店/站点接单；4等待客服接单；5失效 */
    private Integer recordStatus;

    /** 类型 0发给门店，1发给自己（如果是发给自己的）；2：站点 */
    private Byte msgType;

    /** //订单结果信息。两位数字的字符标示，超时关闭，超时响应，[01,00,10]。只针对关闭的工单。 */
    private String closeStatus;

    /** 发起人 */
    private Integer senderId;

    /** 发起人姓名 */
    private String senderName;

    /** 接收人 */
    private Integer sendeeId;

    /** 接收人姓名 */
    private String sendeeName;

    /** 创建时间 */
    private Date createTime;

    /** 提交时间 */
    private Date submitTime;

    /** 接单时间 */
    private Date receiveTime;

    /** 关单时间 */
    private Date endTime;

    /** 最后更新时间 */
    private Date lastUpdateTime;

    /** 记录ids */
    private String record;

    /** 创建人id */
    private Long createId;

    /** 创建人 */
    private String createName;

    /** 当前发送的催单的次数 */
    private Integer currentNum;

    /** 已发送催单的数 */
    private Integer reminderNum;

    /** 工单催单记录时间 */
    private Date reminderTime;

    /** 工单类型 1:普通客服工单 2:APP用户反馈 3:在线工单 4:回呼工单 5:APP售后工单 6:质检工单 7:三方今后工单 */
    private Byte type;

    /** 用户电话号码 */
    private String userTelNum;

    /** 反馈图片（多张图片以","分割） */
    private String feedBackSnapshoots;

    /** 反馈用户ID */
    private Long userId;

    /** 反馈用户name */
    private String userName;

    /** APP反馈商家ID */
    private Long appVenderId;

    /** APP反馈门店ID */
    private Long appStoreId;

    /** 反馈Id */
    private Long feedbackId;

    /** app问题Id */
    private Integer appProblemId;

    /** 关闭人 */
    private String closerName;

    /** 订单配送类型（1：配送；2：自提） */
    private Byte shipmentType;

    /** 订单销售类型（1：普通订单  2：预售订单  3：抢购订单  4：美通卡  5：拼团订单  6：虚拟多点卡  7：海淘  8：全球精选卡  9：线下体验店  10：电子美通卡  11：实物多点卡  18：智能购  19：便当  20：实物卡券  21：家居  22：抽奖  23：外单） */
    private Byte saleType;

    /** 联系人 */
    private String contactPerson;

    /** 收货人 */
    private String consignee;

    /** 收货人电话 */
    private String consigneeTel;

    /** 大区（-1：空；1：华北；2：华东；3：华南；4：华中；5：西南；6：西北；7：东北） */
    private Integer largeArea;

    /** 工单类型最新修改日志id */
    private Long updateLogId;

    /** 工单类型为app时，回复给app用户的内容。 */
    private String appFeedback;

    /** 定责类型。0无责；1拣货员；2自有配送；3三方配送；4其它人员；5DC拣货，6DC运输，7中粮；8DC；9配送员；10门店一责；11门店 */
    private Byte dutyType;

    /** 父订单号 */
    private Long parentOrderId;

    /** 用户期望送达时间 */
    private String shipDatetime;

    /** 定责对象 */
    private String dutyValue;

    /** 门店回复次数 */
    private Integer storeReplyNum;

    /** 定责操作 0:无责 1：定责 2：申述 3：暂缓定责 */
    private Byte dutyOp;

    /** 责任人工号 */
    private String staffNum;

    /** 申请单号 */
    private String applyOrderNum;

    /** 售后单号 */
    private Long aftersaleOrderNum;

    /** 售后返回次数 */
    private Integer applyReturnNum;

    /** 售后工单锁定工单 0：未锁定 1：锁定 2:审核通过 */
    private Byte locked;

    /** 是否有效（1：有效；-1：无效） */
    private Byte yn;

    /** 是否关注（1：是；0：否） */
    private Byte followUp;

    /** 扩展信息 */
    private Object extend;

    /** 发起人姓名 */
    private String senderRealName;

    /** 商家Id */
    private Long venderId;

    /** 取件单id */
    private Long pickupOrderId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkOrderNum() {
        return workOrderNum;
    }

    public void setWorkOrderNum(String workOrderNum) {
        this.workOrderNum = workOrderNum == null ? null : workOrderNum.trim();
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum == null ? null : telNum.trim();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public Byte getOrderSaleType() {
        return orderSaleType;
    }

    public void setOrderSaleType(Byte orderSaleType) {
        this.orderSaleType = orderSaleType;
    }

    public Integer getProblemTypesId() {
        return problemTypesId;
    }

    public void setProblemTypesId(Integer problemTypesId) {
        this.problemTypesId = problemTypesId;
    }

    public Long getOrderStoreId() {
        return orderStoreId;
    }

    public void setOrderStoreId(Long orderStoreId) {
        this.orderStoreId = orderStoreId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Byte getMsgType() {
        return msgType;
    }

    public void setMsgType(Byte msgType) {
        this.msgType = msgType;
    }

    public String getCloseStatus() {
        return closeStatus;
    }

    public void setCloseStatus(String closeStatus) {
        this.closeStatus = closeStatus == null ? null : closeStatus.trim();
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName == null ? null : senderName.trim();
    }

    public Integer getSendeeId() {
        return sendeeId;
    }

    public void setSendeeId(Integer sendeeId) {
        this.sendeeId = sendeeId;
    }

    public String getSendeeName() {
        return sendeeName;
    }

    public void setSendeeName(String sendeeName) {
        this.sendeeName = sendeeName == null ? null : sendeeName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    public Integer getReminderNum() {
        return reminderNum;
    }

    public void setReminderNum(Integer reminderNum) {
        this.reminderNum = reminderNum;
    }

    public Date getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Date reminderTime) {
        this.reminderTime = reminderTime;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getUserTelNum() {
        return userTelNum;
    }

    public void setUserTelNum(String userTelNum) {
        this.userTelNum = userTelNum == null ? null : userTelNum.trim();
    }

    public String getFeedBackSnapshoots() {
        return feedBackSnapshoots;
    }

    public void setFeedBackSnapshoots(String feedBackSnapshoots) {
        this.feedBackSnapshoots = feedBackSnapshoots == null ? null : feedBackSnapshoots.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getAppVenderId() {
        return appVenderId;
    }

    public void setAppVenderId(Long appVenderId) {
        this.appVenderId = appVenderId;
    }

    public Long getAppStoreId() {
        return appStoreId;
    }

    public void setAppStoreId(Long appStoreId) {
        this.appStoreId = appStoreId;
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Integer getAppProblemId() {
        return appProblemId;
    }

    public void setAppProblemId(Integer appProblemId) {
        this.appProblemId = appProblemId;
    }

    public String getCloserName() {
        return closerName;
    }

    public void setCloserName(String closerName) {
        this.closerName = closerName == null ? null : closerName.trim();
    }

    public Byte getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(Byte shipmentType) {
        this.shipmentType = shipmentType;
    }

    public Byte getSaleType() {
        return saleType;
    }

    public void setSaleType(Byte saleType) {
        this.saleType = saleType;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsigneeTel() {
        return consigneeTel;
    }

    public void setConsigneeTel(String consigneeTel) {
        this.consigneeTel = consigneeTel == null ? null : consigneeTel.trim();
    }

    public Integer getLargeArea() {
        return largeArea;
    }

    public void setLargeArea(Integer largeArea) {
        this.largeArea = largeArea;
    }

    public Long getUpdateLogId() {
        return updateLogId;
    }

    public void setUpdateLogId(Long updateLogId) {
        this.updateLogId = updateLogId;
    }

    public String getAppFeedback() {
        return appFeedback;
    }

    public void setAppFeedback(String appFeedback) {
        this.appFeedback = appFeedback == null ? null : appFeedback.trim();
    }

    public Byte getDutyType() {
        return dutyType;
    }

    public void setDutyType(Byte dutyType) {
        this.dutyType = dutyType;
    }

    public Long getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(Long parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public String getShipDatetime() {
        return shipDatetime;
    }

    public void setShipDatetime(String shipDatetime) {
        this.shipDatetime = shipDatetime == null ? null : shipDatetime.trim();
    }

    public String getDutyValue() {
        return dutyValue;
    }

    public void setDutyValue(String dutyValue) {
        this.dutyValue = dutyValue == null ? null : dutyValue.trim();
    }

    public Integer getStoreReplyNum() {
        return storeReplyNum;
    }

    public void setStoreReplyNum(Integer storeReplyNum) {
        this.storeReplyNum = storeReplyNum;
    }

    public Byte getDutyOp() {
        return dutyOp;
    }

    public void setDutyOp(Byte dutyOp) {
        this.dutyOp = dutyOp;
    }

    public String getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum == null ? null : staffNum.trim();
    }

    public String getApplyOrderNum() {
        return applyOrderNum;
    }

    public void setApplyOrderNum(String applyOrderNum) {
        this.applyOrderNum = applyOrderNum == null ? null : applyOrderNum.trim();
    }

    public Long getAftersaleOrderNum() {
        return aftersaleOrderNum;
    }

    public void setAftersaleOrderNum(Long aftersaleOrderNum) {
        this.aftersaleOrderNum = aftersaleOrderNum;
    }

    public Integer getApplyReturnNum() {
        return applyReturnNum;
    }

    public void setApplyReturnNum(Integer applyReturnNum) {
        this.applyReturnNum = applyReturnNum;
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }

    public Byte getFollowUp() {
        return followUp;
    }

    public void setFollowUp(Byte followUp) {
        this.followUp = followUp;
    }

    public Object getExtend() {
        return extend;
    }

    public void setExtend(Object extend) {
        this.extend = extend;
    }

    public String getSenderRealName() {
        return senderRealName;
    }

    public void setSenderRealName(String senderRealName) {
        this.senderRealName = senderRealName == null ? null : senderRealName.trim();
    }

    public Long getVenderId() {
        return venderId;
    }

    public void setVenderId(Long venderId) {
        this.venderId = venderId;
    }

    public Long getPickupOrderId() {
        return pickupOrderId;
    }

    public void setPickupOrderId(Long pickupOrderId) {
        this.pickupOrderId = pickupOrderId;
    }
}