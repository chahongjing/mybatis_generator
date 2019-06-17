package com.dmall.ws.newdao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppealOrderCondition {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitOffset = -1;

    protected int limitSize = 1;

    public AppealOrderCondition() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitOffset(int limitOffset) {
        this.limitOffset = limitOffset;
    }

    public void setLimitSize(int limitSize) {
        this.limitSize = limitSize;
    }

    public int getLimitOffset() {
        return limitOffset;
    }

    public int getLimitSize() {
        return limitSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumIsNull() {
            addCriterion("appeal_order_num is null");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumIsNotNull() {
            addCriterion("appeal_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumEqualTo(String value) {
            addCriterion("appeal_order_num =", value, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumNotEqualTo(String value) {
            addCriterion("appeal_order_num <>", value, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumGreaterThan(String value) {
            addCriterion("appeal_order_num >", value, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("appeal_order_num >=", value, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumLessThan(String value) {
            addCriterion("appeal_order_num <", value, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumLessThanOrEqualTo(String value) {
            addCriterion("appeal_order_num <=", value, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumLike(String value) {
            addCriterion("appeal_order_num like", value, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumNotLike(String value) {
            addCriterion("appeal_order_num not like", value, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumIn(List<String> values) {
            addCriterion("appeal_order_num in", values, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumNotIn(List<String> values) {
            addCriterion("appeal_order_num not in", values, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumBetween(String value1, String value2) {
            addCriterion("appeal_order_num between", value1, value2, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andAppealOrderNumNotBetween(String value1, String value2) {
            addCriterion("appeal_order_num not between", value1, value2, "appealOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumIsNull() {
            addCriterion("work_order_num is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumIsNotNull() {
            addCriterion("work_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumEqualTo(String value) {
            addCriterion("work_order_num =", value, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumNotEqualTo(String value) {
            addCriterion("work_order_num <>", value, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumGreaterThan(String value) {
            addCriterion("work_order_num >", value, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("work_order_num >=", value, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumLessThan(String value) {
            addCriterion("work_order_num <", value, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumLessThanOrEqualTo(String value) {
            addCriterion("work_order_num <=", value, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumLike(String value) {
            addCriterion("work_order_num like", value, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumNotLike(String value) {
            addCriterion("work_order_num not like", value, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumIn(List<String> values) {
            addCriterion("work_order_num in", values, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumNotIn(List<String> values) {
            addCriterion("work_order_num not in", values, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumBetween(String value1, String value2) {
            addCriterion("work_order_num between", value1, value2, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderNumNotBetween(String value1, String value2) {
            addCriterion("work_order_num not between", value1, value2, "workOrderNum");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIsNull() {
            addCriterion("work_order_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIsNotNull() {
            addCriterion("work_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdEqualTo(Long value) {
            addCriterion("work_order_id =", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotEqualTo(Long value) {
            addCriterion("work_order_id <>", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdGreaterThan(Long value) {
            addCriterion("work_order_id >", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("work_order_id >=", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLessThan(Long value) {
            addCriterion("work_order_id <", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("work_order_id <=", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIn(List<Long> values) {
            addCriterion("work_order_id in", values, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotIn(List<Long> values) {
            addCriterion("work_order_id not in", values, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdBetween(Long value1, Long value2) {
            addCriterion("work_order_id between", value1, value2, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("work_order_id not between", value1, value2, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andVenderIdIsNull() {
            addCriterion("vender_id is null");
            return (Criteria) this;
        }

        public Criteria andVenderIdIsNotNull() {
            addCriterion("vender_id is not null");
            return (Criteria) this;
        }

        public Criteria andVenderIdEqualTo(Long value) {
            addCriterion("vender_id =", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdNotEqualTo(Long value) {
            addCriterion("vender_id <>", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdGreaterThan(Long value) {
            addCriterion("vender_id >", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("vender_id >=", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdLessThan(Long value) {
            addCriterion("vender_id <", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdLessThanOrEqualTo(Long value) {
            addCriterion("vender_id <=", value, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdIn(List<Long> values) {
            addCriterion("vender_id in", values, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdNotIn(List<Long> values) {
            addCriterion("vender_id not in", values, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdBetween(Long value1, Long value2) {
            addCriterion("vender_id between", value1, value2, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderIdNotBetween(Long value1, Long value2) {
            addCriterion("vender_id not between", value1, value2, "venderId");
            return (Criteria) this;
        }

        public Criteria andVenderNameIsNull() {
            addCriterion("vender_name is null");
            return (Criteria) this;
        }

        public Criteria andVenderNameIsNotNull() {
            addCriterion("vender_name is not null");
            return (Criteria) this;
        }

        public Criteria andVenderNameEqualTo(String value) {
            addCriterion("vender_name =", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameNotEqualTo(String value) {
            addCriterion("vender_name <>", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameGreaterThan(String value) {
            addCriterion("vender_name >", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("vender_name >=", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameLessThan(String value) {
            addCriterion("vender_name <", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameLessThanOrEqualTo(String value) {
            addCriterion("vender_name <=", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameLike(String value) {
            addCriterion("vender_name like", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameNotLike(String value) {
            addCriterion("vender_name not like", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameIn(List<String> values) {
            addCriterion("vender_name in", values, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameNotIn(List<String> values) {
            addCriterion("vender_name not in", values, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameBetween(String value1, String value2) {
            addCriterion("vender_name between", value1, value2, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameNotBetween(String value1, String value2) {
            addCriterion("vender_name not between", value1, value2, "venderName");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andAppealTypeIsNull() {
            addCriterion("appeal_type is null");
            return (Criteria) this;
        }

        public Criteria andAppealTypeIsNotNull() {
            addCriterion("appeal_type is not null");
            return (Criteria) this;
        }

        public Criteria andAppealTypeEqualTo(Byte value) {
            addCriterion("appeal_type =", value, "appealType");
            return (Criteria) this;
        }

        public Criteria andAppealTypeNotEqualTo(Byte value) {
            addCriterion("appeal_type <>", value, "appealType");
            return (Criteria) this;
        }

        public Criteria andAppealTypeGreaterThan(Byte value) {
            addCriterion("appeal_type >", value, "appealType");
            return (Criteria) this;
        }

        public Criteria andAppealTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("appeal_type >=", value, "appealType");
            return (Criteria) this;
        }

        public Criteria andAppealTypeLessThan(Byte value) {
            addCriterion("appeal_type <", value, "appealType");
            return (Criteria) this;
        }

        public Criteria andAppealTypeLessThanOrEqualTo(Byte value) {
            addCriterion("appeal_type <=", value, "appealType");
            return (Criteria) this;
        }

        public Criteria andAppealTypeIn(List<Byte> values) {
            addCriterion("appeal_type in", values, "appealType");
            return (Criteria) this;
        }

        public Criteria andAppealTypeNotIn(List<Byte> values) {
            addCriterion("appeal_type not in", values, "appealType");
            return (Criteria) this;
        }

        public Criteria andAppealTypeBetween(Byte value1, Byte value2) {
            addCriterion("appeal_type between", value1, value2, "appealType");
            return (Criteria) this;
        }

        public Criteria andAppealTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("appeal_type not between", value1, value2, "appealType");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andAppealStatusIsNull() {
            addCriterion("appeal_status is null");
            return (Criteria) this;
        }

        public Criteria andAppealStatusIsNotNull() {
            addCriterion("appeal_status is not null");
            return (Criteria) this;
        }

        public Criteria andAppealStatusEqualTo(Byte value) {
            addCriterion("appeal_status =", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusNotEqualTo(Byte value) {
            addCriterion("appeal_status <>", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusGreaterThan(Byte value) {
            addCriterion("appeal_status >", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("appeal_status >=", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusLessThan(Byte value) {
            addCriterion("appeal_status <", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusLessThanOrEqualTo(Byte value) {
            addCriterion("appeal_status <=", value, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusIn(List<Byte> values) {
            addCriterion("appeal_status in", values, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusNotIn(List<Byte> values) {
            addCriterion("appeal_status not in", values, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusBetween(Byte value1, Byte value2) {
            addCriterion("appeal_status between", value1, value2, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andAppealStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("appeal_status not between", value1, value2, "appealStatus");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNull() {
            addCriterion("opinion is null");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNotNull() {
            addCriterion("opinion is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionEqualTo(String value) {
            addCriterion("opinion =", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotEqualTo(String value) {
            addCriterion("opinion <>", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThan(String value) {
            addCriterion("opinion >", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("opinion >=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThan(String value) {
            addCriterion("opinion <", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThanOrEqualTo(String value) {
            addCriterion("opinion <=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLike(String value) {
            addCriterion("opinion like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotLike(String value) {
            addCriterion("opinion not like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionIn(List<String> values) {
            addCriterion("opinion in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotIn(List<String> values) {
            addCriterion("opinion not in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionBetween(String value1, String value2) {
            addCriterion("opinion between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotBetween(String value1, String value2) {
            addCriterion("opinion not between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andYnIsNull() {
            addCriterion("yn is null");
            return (Criteria) this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("yn is not null");
            return (Criteria) this;
        }

        public Criteria andYnEqualTo(Byte value) {
            addCriterion("yn =", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotEqualTo(Byte value) {
            addCriterion("yn <>", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThan(Byte value) {
            addCriterion("yn >", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThanOrEqualTo(Byte value) {
            addCriterion("yn >=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThan(Byte value) {
            addCriterion("yn <", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThanOrEqualTo(Byte value) {
            addCriterion("yn <=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnIn(List<Byte> values) {
            addCriterion("yn in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotIn(List<Byte> values) {
            addCriterion("yn not in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnBetween(Byte value1, Byte value2) {
            addCriterion("yn between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotBetween(Byte value1, Byte value2) {
            addCriterion("yn not between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andUpatorIsNull() {
            addCriterion("upator is null");
            return (Criteria) this;
        }

        public Criteria andUpatorIsNotNull() {
            addCriterion("upator is not null");
            return (Criteria) this;
        }

        public Criteria andUpatorEqualTo(String value) {
            addCriterion("upator =", value, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorNotEqualTo(String value) {
            addCriterion("upator <>", value, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorGreaterThan(String value) {
            addCriterion("upator >", value, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorGreaterThanOrEqualTo(String value) {
            addCriterion("upator >=", value, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorLessThan(String value) {
            addCriterion("upator <", value, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorLessThanOrEqualTo(String value) {
            addCriterion("upator <=", value, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorLike(String value) {
            addCriterion("upator like", value, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorNotLike(String value) {
            addCriterion("upator not like", value, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorIn(List<String> values) {
            addCriterion("upator in", values, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorNotIn(List<String> values) {
            addCriterion("upator not in", values, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorBetween(String value1, String value2) {
            addCriterion("upator between", value1, value2, "upator");
            return (Criteria) this;
        }

        public Criteria andUpatorNotBetween(String value1, String value2) {
            addCriterion("upator not between", value1, value2, "upator");
            return (Criteria) this;
        }

        public Criteria andImgUrl1IsNull() {
            addCriterion("img_url1 is null");
            return (Criteria) this;
        }

        public Criteria andImgUrl1IsNotNull() {
            addCriterion("img_url1 is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrl1EqualTo(String value) {
            addCriterion("img_url1 =", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotEqualTo(String value) {
            addCriterion("img_url1 <>", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1GreaterThan(String value) {
            addCriterion("img_url1 >", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("img_url1 >=", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1LessThan(String value) {
            addCriterion("img_url1 <", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1LessThanOrEqualTo(String value) {
            addCriterion("img_url1 <=", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1Like(String value) {
            addCriterion("img_url1 like", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotLike(String value) {
            addCriterion("img_url1 not like", value, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1In(List<String> values) {
            addCriterion("img_url1 in", values, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotIn(List<String> values) {
            addCriterion("img_url1 not in", values, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1Between(String value1, String value2) {
            addCriterion("img_url1 between", value1, value2, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl1NotBetween(String value1, String value2) {
            addCriterion("img_url1 not between", value1, value2, "imgUrl1");
            return (Criteria) this;
        }

        public Criteria andImgUrl2IsNull() {
            addCriterion("img_url2 is null");
            return (Criteria) this;
        }

        public Criteria andImgUrl2IsNotNull() {
            addCriterion("img_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrl2EqualTo(String value) {
            addCriterion("img_url2 =", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotEqualTo(String value) {
            addCriterion("img_url2 <>", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2GreaterThan(String value) {
            addCriterion("img_url2 >", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("img_url2 >=", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2LessThan(String value) {
            addCriterion("img_url2 <", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2LessThanOrEqualTo(String value) {
            addCriterion("img_url2 <=", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2Like(String value) {
            addCriterion("img_url2 like", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotLike(String value) {
            addCriterion("img_url2 not like", value, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2In(List<String> values) {
            addCriterion("img_url2 in", values, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotIn(List<String> values) {
            addCriterion("img_url2 not in", values, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2Between(String value1, String value2) {
            addCriterion("img_url2 between", value1, value2, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl2NotBetween(String value1, String value2) {
            addCriterion("img_url2 not between", value1, value2, "imgUrl2");
            return (Criteria) this;
        }

        public Criteria andImgUrl3IsNull() {
            addCriterion("img_url3 is null");
            return (Criteria) this;
        }

        public Criteria andImgUrl3IsNotNull() {
            addCriterion("img_url3 is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrl3EqualTo(String value) {
            addCriterion("img_url3 =", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotEqualTo(String value) {
            addCriterion("img_url3 <>", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3GreaterThan(String value) {
            addCriterion("img_url3 >", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3GreaterThanOrEqualTo(String value) {
            addCriterion("img_url3 >=", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3LessThan(String value) {
            addCriterion("img_url3 <", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3LessThanOrEqualTo(String value) {
            addCriterion("img_url3 <=", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3Like(String value) {
            addCriterion("img_url3 like", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotLike(String value) {
            addCriterion("img_url3 not like", value, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3In(List<String> values) {
            addCriterion("img_url3 in", values, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotIn(List<String> values) {
            addCriterion("img_url3 not in", values, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3Between(String value1, String value2) {
            addCriterion("img_url3 between", value1, value2, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andImgUrl3NotBetween(String value1, String value2) {
            addCriterion("img_url3 not between", value1, value2, "imgUrl3");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagIsNull() {
            addCriterion("followup_flag is null");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagIsNotNull() {
            addCriterion("followup_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagEqualTo(Byte value) {
            addCriterion("followup_flag =", value, "followupFlag");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagNotEqualTo(Byte value) {
            addCriterion("followup_flag <>", value, "followupFlag");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagGreaterThan(Byte value) {
            addCriterion("followup_flag >", value, "followupFlag");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("followup_flag >=", value, "followupFlag");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagLessThan(Byte value) {
            addCriterion("followup_flag <", value, "followupFlag");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagLessThanOrEqualTo(Byte value) {
            addCriterion("followup_flag <=", value, "followupFlag");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagIn(List<Byte> values) {
            addCriterion("followup_flag in", values, "followupFlag");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagNotIn(List<Byte> values) {
            addCriterion("followup_flag not in", values, "followupFlag");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagBetween(Byte value1, Byte value2) {
            addCriterion("followup_flag between", value1, value2, "followupFlag");
            return (Criteria) this;
        }

        public Criteria andFollowupFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("followup_flag not between", value1, value2, "followupFlag");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeIsNull() {
            addCriterion("work_order_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeIsNotNull() {
            addCriterion("work_order_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeEqualTo(Byte value) {
            addCriterion("work_order_type =", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeNotEqualTo(Byte value) {
            addCriterion("work_order_type <>", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeGreaterThan(Byte value) {
            addCriterion("work_order_type >", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("work_order_type >=", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeLessThan(Byte value) {
            addCriterion("work_order_type <", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeLessThanOrEqualTo(Byte value) {
            addCriterion("work_order_type <=", value, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeIn(List<Byte> values) {
            addCriterion("work_order_type in", values, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeNotIn(List<Byte> values) {
            addCriterion("work_order_type not in", values, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeBetween(Byte value1, Byte value2) {
            addCriterion("work_order_type between", value1, value2, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andWorkOrderTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("work_order_type not between", value1, value2, "workOrderType");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeIsNull() {
            addCriterion("order_sale_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeIsNotNull() {
            addCriterion("order_sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeEqualTo(Byte value) {
            addCriterion("order_sale_type =", value, "orderSaleType");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeNotEqualTo(Byte value) {
            addCriterion("order_sale_type <>", value, "orderSaleType");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeGreaterThan(Byte value) {
            addCriterion("order_sale_type >", value, "orderSaleType");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_sale_type >=", value, "orderSaleType");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeLessThan(Byte value) {
            addCriterion("order_sale_type <", value, "orderSaleType");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeLessThanOrEqualTo(Byte value) {
            addCriterion("order_sale_type <=", value, "orderSaleType");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeIn(List<Byte> values) {
            addCriterion("order_sale_type in", values, "orderSaleType");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeNotIn(List<Byte> values) {
            addCriterion("order_sale_type not in", values, "orderSaleType");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeBetween(Byte value1, Byte value2) {
            addCriterion("order_sale_type between", value1, value2, "orderSaleType");
            return (Criteria) this;
        }

        public Criteria andOrderSaleTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("order_sale_type not between", value1, value2, "orderSaleType");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameIsNull() {
            addCriterion("upator_real_name is null");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameIsNotNull() {
            addCriterion("upator_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameEqualTo(String value) {
            addCriterion("upator_real_name =", value, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameNotEqualTo(String value) {
            addCriterion("upator_real_name <>", value, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameGreaterThan(String value) {
            addCriterion("upator_real_name >", value, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("upator_real_name >=", value, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameLessThan(String value) {
            addCriterion("upator_real_name <", value, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameLessThanOrEqualTo(String value) {
            addCriterion("upator_real_name <=", value, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameLike(String value) {
            addCriterion("upator_real_name like", value, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameNotLike(String value) {
            addCriterion("upator_real_name not like", value, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameIn(List<String> values) {
            addCriterion("upator_real_name in", values, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameNotIn(List<String> values) {
            addCriterion("upator_real_name not in", values, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameBetween(String value1, String value2) {
            addCriterion("upator_real_name between", value1, value2, "upatorRealName");
            return (Criteria) this;
        }

        public Criteria andUpatorRealNameNotBetween(String value1, String value2) {
            addCriterion("upator_real_name not between", value1, value2, "upatorRealName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}