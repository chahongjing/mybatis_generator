package com.dmall.ws.newdao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WsWorkOrderCondition {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitOffset = -1;

    protected int limitSize = 1;

    public WsWorkOrderCondition() {
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

        public Criteria andTelNumIsNull() {
            addCriterion("tel_num is null");
            return (Criteria) this;
        }

        public Criteria andTelNumIsNotNull() {
            addCriterion("tel_num is not null");
            return (Criteria) this;
        }

        public Criteria andTelNumEqualTo(String value) {
            addCriterion("tel_num =", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotEqualTo(String value) {
            addCriterion("tel_num <>", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumGreaterThan(String value) {
            addCriterion("tel_num >", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumGreaterThanOrEqualTo(String value) {
            addCriterion("tel_num >=", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumLessThan(String value) {
            addCriterion("tel_num <", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumLessThanOrEqualTo(String value) {
            addCriterion("tel_num <=", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumLike(String value) {
            addCriterion("tel_num like", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotLike(String value) {
            addCriterion("tel_num not like", value, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumIn(List<String> values) {
            addCriterion("tel_num in", values, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotIn(List<String> values) {
            addCriterion("tel_num not in", values, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumBetween(String value1, String value2) {
            addCriterion("tel_num between", value1, value2, "telNum");
            return (Criteria) this;
        }

        public Criteria andTelNumNotBetween(String value1, String value2) {
            addCriterion("tel_num not between", value1, value2, "telNum");
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

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Byte value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Byte value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Byte value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Byte value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Byte value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Byte> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Byte> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Byte value1, Byte value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
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

        public Criteria andProblemTypesIdIsNull() {
            addCriterion("problem_types_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdIsNotNull() {
            addCriterion("problem_types_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdEqualTo(Integer value) {
            addCriterion("problem_types_id =", value, "problemTypesId");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdNotEqualTo(Integer value) {
            addCriterion("problem_types_id <>", value, "problemTypesId");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdGreaterThan(Integer value) {
            addCriterion("problem_types_id >", value, "problemTypesId");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_types_id >=", value, "problemTypesId");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdLessThan(Integer value) {
            addCriterion("problem_types_id <", value, "problemTypesId");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdLessThanOrEqualTo(Integer value) {
            addCriterion("problem_types_id <=", value, "problemTypesId");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdIn(List<Integer> values) {
            addCriterion("problem_types_id in", values, "problemTypesId");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdNotIn(List<Integer> values) {
            addCriterion("problem_types_id not in", values, "problemTypesId");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdBetween(Integer value1, Integer value2) {
            addCriterion("problem_types_id between", value1, value2, "problemTypesId");
            return (Criteria) this;
        }

        public Criteria andProblemTypesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_types_id not between", value1, value2, "problemTypesId");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdIsNull() {
            addCriterion("order_store_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdIsNotNull() {
            addCriterion("order_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdEqualTo(Long value) {
            addCriterion("order_store_id =", value, "orderStoreId");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdNotEqualTo(Long value) {
            addCriterion("order_store_id <>", value, "orderStoreId");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdGreaterThan(Long value) {
            addCriterion("order_store_id >", value, "orderStoreId");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_store_id >=", value, "orderStoreId");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdLessThan(Long value) {
            addCriterion("order_store_id <", value, "orderStoreId");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("order_store_id <=", value, "orderStoreId");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdIn(List<Long> values) {
            addCriterion("order_store_id in", values, "orderStoreId");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdNotIn(List<Long> values) {
            addCriterion("order_store_id not in", values, "orderStoreId");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdBetween(Long value1, Long value2) {
            addCriterion("order_store_id between", value1, value2, "orderStoreId");
            return (Criteria) this;
        }

        public Criteria andOrderStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("order_store_id not between", value1, value2, "orderStoreId");
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

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNull() {
            addCriterion("record_status is null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNotNull() {
            addCriterion("record_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusEqualTo(Integer value) {
            addCriterion("record_status =", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotEqualTo(Integer value) {
            addCriterion("record_status <>", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThan(Integer value) {
            addCriterion("record_status >", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_status >=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThan(Integer value) {
            addCriterion("record_status <", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThanOrEqualTo(Integer value) {
            addCriterion("record_status <=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIn(List<Integer> values) {
            addCriterion("record_status in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotIn(List<Integer> values) {
            addCriterion("record_status not in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusBetween(Integer value1, Integer value2) {
            addCriterion("record_status between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("record_status not between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNull() {
            addCriterion("msg_type is null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIsNotNull() {
            addCriterion("msg_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTypeEqualTo(Byte value) {
            addCriterion("msg_type =", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotEqualTo(Byte value) {
            addCriterion("msg_type <>", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThan(Byte value) {
            addCriterion("msg_type >", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("msg_type >=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThan(Byte value) {
            addCriterion("msg_type <", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeLessThanOrEqualTo(Byte value) {
            addCriterion("msg_type <=", value, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeIn(List<Byte> values) {
            addCriterion("msg_type in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotIn(List<Byte> values) {
            addCriterion("msg_type not in", values, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeBetween(Byte value1, Byte value2) {
            addCriterion("msg_type between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andMsgTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("msg_type not between", value1, value2, "msgType");
            return (Criteria) this;
        }

        public Criteria andCloseStatusIsNull() {
            addCriterion("close_status is null");
            return (Criteria) this;
        }

        public Criteria andCloseStatusIsNotNull() {
            addCriterion("close_status is not null");
            return (Criteria) this;
        }

        public Criteria andCloseStatusEqualTo(String value) {
            addCriterion("close_status =", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusNotEqualTo(String value) {
            addCriterion("close_status <>", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusGreaterThan(String value) {
            addCriterion("close_status >", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("close_status >=", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusLessThan(String value) {
            addCriterion("close_status <", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusLessThanOrEqualTo(String value) {
            addCriterion("close_status <=", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusLike(String value) {
            addCriterion("close_status like", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusNotLike(String value) {
            addCriterion("close_status not like", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusIn(List<String> values) {
            addCriterion("close_status in", values, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusNotIn(List<String> values) {
            addCriterion("close_status not in", values, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusBetween(String value1, String value2) {
            addCriterion("close_status between", value1, value2, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusNotBetween(String value1, String value2) {
            addCriterion("close_status not between", value1, value2, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNull() {
            addCriterion("sender_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(Integer value) {
            addCriterion("sender_id =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(Integer value) {
            addCriterion("sender_id <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(Integer value) {
            addCriterion("sender_id >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sender_id >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(Integer value) {
            addCriterion("sender_id <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("sender_id <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<Integer> values) {
            addCriterion("sender_id in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<Integer> values) {
            addCriterion("sender_id not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(Integer value1, Integer value2) {
            addCriterion("sender_id between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sender_id not between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNull() {
            addCriterion("sender_name is null");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNotNull() {
            addCriterion("sender_name is not null");
            return (Criteria) this;
        }

        public Criteria andSenderNameEqualTo(String value) {
            addCriterion("sender_name =", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotEqualTo(String value) {
            addCriterion("sender_name <>", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThan(String value) {
            addCriterion("sender_name >", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("sender_name >=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThan(String value) {
            addCriterion("sender_name <", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThanOrEqualTo(String value) {
            addCriterion("sender_name <=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLike(String value) {
            addCriterion("sender_name like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotLike(String value) {
            addCriterion("sender_name not like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameIn(List<String> values) {
            addCriterion("sender_name in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotIn(List<String> values) {
            addCriterion("sender_name not in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameBetween(String value1, String value2) {
            addCriterion("sender_name between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotBetween(String value1, String value2) {
            addCriterion("sender_name not between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSendeeIdIsNull() {
            addCriterion("sendee_id is null");
            return (Criteria) this;
        }

        public Criteria andSendeeIdIsNotNull() {
            addCriterion("sendee_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendeeIdEqualTo(Integer value) {
            addCriterion("sendee_id =", value, "sendeeId");
            return (Criteria) this;
        }

        public Criteria andSendeeIdNotEqualTo(Integer value) {
            addCriterion("sendee_id <>", value, "sendeeId");
            return (Criteria) this;
        }

        public Criteria andSendeeIdGreaterThan(Integer value) {
            addCriterion("sendee_id >", value, "sendeeId");
            return (Criteria) this;
        }

        public Criteria andSendeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendee_id >=", value, "sendeeId");
            return (Criteria) this;
        }

        public Criteria andSendeeIdLessThan(Integer value) {
            addCriterion("sendee_id <", value, "sendeeId");
            return (Criteria) this;
        }

        public Criteria andSendeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sendee_id <=", value, "sendeeId");
            return (Criteria) this;
        }

        public Criteria andSendeeIdIn(List<Integer> values) {
            addCriterion("sendee_id in", values, "sendeeId");
            return (Criteria) this;
        }

        public Criteria andSendeeIdNotIn(List<Integer> values) {
            addCriterion("sendee_id not in", values, "sendeeId");
            return (Criteria) this;
        }

        public Criteria andSendeeIdBetween(Integer value1, Integer value2) {
            addCriterion("sendee_id between", value1, value2, "sendeeId");
            return (Criteria) this;
        }

        public Criteria andSendeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sendee_id not between", value1, value2, "sendeeId");
            return (Criteria) this;
        }

        public Criteria andSendeeNameIsNull() {
            addCriterion("sendee_name is null");
            return (Criteria) this;
        }

        public Criteria andSendeeNameIsNotNull() {
            addCriterion("sendee_name is not null");
            return (Criteria) this;
        }

        public Criteria andSendeeNameEqualTo(String value) {
            addCriterion("sendee_name =", value, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameNotEqualTo(String value) {
            addCriterion("sendee_name <>", value, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameGreaterThan(String value) {
            addCriterion("sendee_name >", value, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("sendee_name >=", value, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameLessThan(String value) {
            addCriterion("sendee_name <", value, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameLessThanOrEqualTo(String value) {
            addCriterion("sendee_name <=", value, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameLike(String value) {
            addCriterion("sendee_name like", value, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameNotLike(String value) {
            addCriterion("sendee_name not like", value, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameIn(List<String> values) {
            addCriterion("sendee_name in", values, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameNotIn(List<String> values) {
            addCriterion("sendee_name not in", values, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameBetween(String value1, String value2) {
            addCriterion("sendee_name between", value1, value2, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andSendeeNameNotBetween(String value1, String value2) {
            addCriterion("sendee_name not between", value1, value2, "sendeeName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("record is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("record is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(String value) {
            addCriterion("record =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(String value) {
            addCriterion("record <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(String value) {
            addCriterion("record >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(String value) {
            addCriterion("record >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(String value) {
            addCriterion("record <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(String value) {
            addCriterion("record <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLike(String value) {
            addCriterion("record like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotLike(String value) {
            addCriterion("record not like", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<String> values) {
            addCriterion("record in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<String> values) {
            addCriterion("record not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(String value1, String value2) {
            addCriterion("record between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(String value1, String value2) {
            addCriterion("record not between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCurrentNumIsNull() {
            addCriterion("current_num is null");
            return (Criteria) this;
        }

        public Criteria andCurrentNumIsNotNull() {
            addCriterion("current_num is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentNumEqualTo(Integer value) {
            addCriterion("current_num =", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumNotEqualTo(Integer value) {
            addCriterion("current_num <>", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumGreaterThan(Integer value) {
            addCriterion("current_num >", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_num >=", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumLessThan(Integer value) {
            addCriterion("current_num <", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumLessThanOrEqualTo(Integer value) {
            addCriterion("current_num <=", value, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumIn(List<Integer> values) {
            addCriterion("current_num in", values, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumNotIn(List<Integer> values) {
            addCriterion("current_num not in", values, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumBetween(Integer value1, Integer value2) {
            addCriterion("current_num between", value1, value2, "currentNum");
            return (Criteria) this;
        }

        public Criteria andCurrentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("current_num not between", value1, value2, "currentNum");
            return (Criteria) this;
        }

        public Criteria andReminderNumIsNull() {
            addCriterion("reminder_num is null");
            return (Criteria) this;
        }

        public Criteria andReminderNumIsNotNull() {
            addCriterion("reminder_num is not null");
            return (Criteria) this;
        }

        public Criteria andReminderNumEqualTo(Integer value) {
            addCriterion("reminder_num =", value, "reminderNum");
            return (Criteria) this;
        }

        public Criteria andReminderNumNotEqualTo(Integer value) {
            addCriterion("reminder_num <>", value, "reminderNum");
            return (Criteria) this;
        }

        public Criteria andReminderNumGreaterThan(Integer value) {
            addCriterion("reminder_num >", value, "reminderNum");
            return (Criteria) this;
        }

        public Criteria andReminderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reminder_num >=", value, "reminderNum");
            return (Criteria) this;
        }

        public Criteria andReminderNumLessThan(Integer value) {
            addCriterion("reminder_num <", value, "reminderNum");
            return (Criteria) this;
        }

        public Criteria andReminderNumLessThanOrEqualTo(Integer value) {
            addCriterion("reminder_num <=", value, "reminderNum");
            return (Criteria) this;
        }

        public Criteria andReminderNumIn(List<Integer> values) {
            addCriterion("reminder_num in", values, "reminderNum");
            return (Criteria) this;
        }

        public Criteria andReminderNumNotIn(List<Integer> values) {
            addCriterion("reminder_num not in", values, "reminderNum");
            return (Criteria) this;
        }

        public Criteria andReminderNumBetween(Integer value1, Integer value2) {
            addCriterion("reminder_num between", value1, value2, "reminderNum");
            return (Criteria) this;
        }

        public Criteria andReminderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reminder_num not between", value1, value2, "reminderNum");
            return (Criteria) this;
        }

        public Criteria andReminderTimeIsNull() {
            addCriterion("reminder_time is null");
            return (Criteria) this;
        }

        public Criteria andReminderTimeIsNotNull() {
            addCriterion("reminder_time is not null");
            return (Criteria) this;
        }

        public Criteria andReminderTimeEqualTo(Date value) {
            addCriterion("reminder_time =", value, "reminderTime");
            return (Criteria) this;
        }

        public Criteria andReminderTimeNotEqualTo(Date value) {
            addCriterion("reminder_time <>", value, "reminderTime");
            return (Criteria) this;
        }

        public Criteria andReminderTimeGreaterThan(Date value) {
            addCriterion("reminder_time >", value, "reminderTime");
            return (Criteria) this;
        }

        public Criteria andReminderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reminder_time >=", value, "reminderTime");
            return (Criteria) this;
        }

        public Criteria andReminderTimeLessThan(Date value) {
            addCriterion("reminder_time <", value, "reminderTime");
            return (Criteria) this;
        }

        public Criteria andReminderTimeLessThanOrEqualTo(Date value) {
            addCriterion("reminder_time <=", value, "reminderTime");
            return (Criteria) this;
        }

        public Criteria andReminderTimeIn(List<Date> values) {
            addCriterion("reminder_time in", values, "reminderTime");
            return (Criteria) this;
        }

        public Criteria andReminderTimeNotIn(List<Date> values) {
            addCriterion("reminder_time not in", values, "reminderTime");
            return (Criteria) this;
        }

        public Criteria andReminderTimeBetween(Date value1, Date value2) {
            addCriterion("reminder_time between", value1, value2, "reminderTime");
            return (Criteria) this;
        }

        public Criteria andReminderTimeNotBetween(Date value1, Date value2) {
            addCriterion("reminder_time not between", value1, value2, "reminderTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUserTelNumIsNull() {
            addCriterion("user_tel_num is null");
            return (Criteria) this;
        }

        public Criteria andUserTelNumIsNotNull() {
            addCriterion("user_tel_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelNumEqualTo(String value) {
            addCriterion("user_tel_num =", value, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumNotEqualTo(String value) {
            addCriterion("user_tel_num <>", value, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumGreaterThan(String value) {
            addCriterion("user_tel_num >", value, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumGreaterThanOrEqualTo(String value) {
            addCriterion("user_tel_num >=", value, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumLessThan(String value) {
            addCriterion("user_tel_num <", value, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumLessThanOrEqualTo(String value) {
            addCriterion("user_tel_num <=", value, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumLike(String value) {
            addCriterion("user_tel_num like", value, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumNotLike(String value) {
            addCriterion("user_tel_num not like", value, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumIn(List<String> values) {
            addCriterion("user_tel_num in", values, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumNotIn(List<String> values) {
            addCriterion("user_tel_num not in", values, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumBetween(String value1, String value2) {
            addCriterion("user_tel_num between", value1, value2, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andUserTelNumNotBetween(String value1, String value2) {
            addCriterion("user_tel_num not between", value1, value2, "userTelNum");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsIsNull() {
            addCriterion("feed_back_snapshoots is null");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsIsNotNull() {
            addCriterion("feed_back_snapshoots is not null");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsEqualTo(String value) {
            addCriterion("feed_back_snapshoots =", value, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsNotEqualTo(String value) {
            addCriterion("feed_back_snapshoots <>", value, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsGreaterThan(String value) {
            addCriterion("feed_back_snapshoots >", value, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsGreaterThanOrEqualTo(String value) {
            addCriterion("feed_back_snapshoots >=", value, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsLessThan(String value) {
            addCriterion("feed_back_snapshoots <", value, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsLessThanOrEqualTo(String value) {
            addCriterion("feed_back_snapshoots <=", value, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsLike(String value) {
            addCriterion("feed_back_snapshoots like", value, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsNotLike(String value) {
            addCriterion("feed_back_snapshoots not like", value, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsIn(List<String> values) {
            addCriterion("feed_back_snapshoots in", values, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsNotIn(List<String> values) {
            addCriterion("feed_back_snapshoots not in", values, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsBetween(String value1, String value2) {
            addCriterion("feed_back_snapshoots between", value1, value2, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andFeedBackSnapshootsNotBetween(String value1, String value2) {
            addCriterion("feed_back_snapshoots not between", value1, value2, "feedBackSnapshoots");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdIsNull() {
            addCriterion("app_vender_id is null");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdIsNotNull() {
            addCriterion("app_vender_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdEqualTo(Long value) {
            addCriterion("app_vender_id =", value, "appVenderId");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdNotEqualTo(Long value) {
            addCriterion("app_vender_id <>", value, "appVenderId");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdGreaterThan(Long value) {
            addCriterion("app_vender_id >", value, "appVenderId");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("app_vender_id >=", value, "appVenderId");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdLessThan(Long value) {
            addCriterion("app_vender_id <", value, "appVenderId");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdLessThanOrEqualTo(Long value) {
            addCriterion("app_vender_id <=", value, "appVenderId");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdIn(List<Long> values) {
            addCriterion("app_vender_id in", values, "appVenderId");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdNotIn(List<Long> values) {
            addCriterion("app_vender_id not in", values, "appVenderId");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdBetween(Long value1, Long value2) {
            addCriterion("app_vender_id between", value1, value2, "appVenderId");
            return (Criteria) this;
        }

        public Criteria andAppVenderIdNotBetween(Long value1, Long value2) {
            addCriterion("app_vender_id not between", value1, value2, "appVenderId");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdIsNull() {
            addCriterion("app_store_id is null");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdIsNotNull() {
            addCriterion("app_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdEqualTo(Long value) {
            addCriterion("app_store_id =", value, "appStoreId");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdNotEqualTo(Long value) {
            addCriterion("app_store_id <>", value, "appStoreId");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdGreaterThan(Long value) {
            addCriterion("app_store_id >", value, "appStoreId");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("app_store_id >=", value, "appStoreId");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdLessThan(Long value) {
            addCriterion("app_store_id <", value, "appStoreId");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("app_store_id <=", value, "appStoreId");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdIn(List<Long> values) {
            addCriterion("app_store_id in", values, "appStoreId");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdNotIn(List<Long> values) {
            addCriterion("app_store_id not in", values, "appStoreId");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdBetween(Long value1, Long value2) {
            addCriterion("app_store_id between", value1, value2, "appStoreId");
            return (Criteria) this;
        }

        public Criteria andAppStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("app_store_id not between", value1, value2, "appStoreId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIsNull() {
            addCriterion("feedback_id is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIsNotNull() {
            addCriterion("feedback_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdEqualTo(Long value) {
            addCriterion("feedback_id =", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotEqualTo(Long value) {
            addCriterion("feedback_id <>", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThan(Long value) {
            addCriterion("feedback_id >", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("feedback_id >=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThan(Long value) {
            addCriterion("feedback_id <", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThanOrEqualTo(Long value) {
            addCriterion("feedback_id <=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIn(List<Long> values) {
            addCriterion("feedback_id in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotIn(List<Long> values) {
            addCriterion("feedback_id not in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdBetween(Long value1, Long value2) {
            addCriterion("feedback_id between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotBetween(Long value1, Long value2) {
            addCriterion("feedback_id not between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdIsNull() {
            addCriterion("app_problem_id is null");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdIsNotNull() {
            addCriterion("app_problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdEqualTo(Integer value) {
            addCriterion("app_problem_id =", value, "appProblemId");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdNotEqualTo(Integer value) {
            addCriterion("app_problem_id <>", value, "appProblemId");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdGreaterThan(Integer value) {
            addCriterion("app_problem_id >", value, "appProblemId");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_problem_id >=", value, "appProblemId");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdLessThan(Integer value) {
            addCriterion("app_problem_id <", value, "appProblemId");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_problem_id <=", value, "appProblemId");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdIn(List<Integer> values) {
            addCriterion("app_problem_id in", values, "appProblemId");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdNotIn(List<Integer> values) {
            addCriterion("app_problem_id not in", values, "appProblemId");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdBetween(Integer value1, Integer value2) {
            addCriterion("app_problem_id between", value1, value2, "appProblemId");
            return (Criteria) this;
        }

        public Criteria andAppProblemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_problem_id not between", value1, value2, "appProblemId");
            return (Criteria) this;
        }

        public Criteria andCloserNameIsNull() {
            addCriterion("closer_name is null");
            return (Criteria) this;
        }

        public Criteria andCloserNameIsNotNull() {
            addCriterion("closer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCloserNameEqualTo(String value) {
            addCriterion("closer_name =", value, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameNotEqualTo(String value) {
            addCriterion("closer_name <>", value, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameGreaterThan(String value) {
            addCriterion("closer_name >", value, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameGreaterThanOrEqualTo(String value) {
            addCriterion("closer_name >=", value, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameLessThan(String value) {
            addCriterion("closer_name <", value, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameLessThanOrEqualTo(String value) {
            addCriterion("closer_name <=", value, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameLike(String value) {
            addCriterion("closer_name like", value, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameNotLike(String value) {
            addCriterion("closer_name not like", value, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameIn(List<String> values) {
            addCriterion("closer_name in", values, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameNotIn(List<String> values) {
            addCriterion("closer_name not in", values, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameBetween(String value1, String value2) {
            addCriterion("closer_name between", value1, value2, "closerName");
            return (Criteria) this;
        }

        public Criteria andCloserNameNotBetween(String value1, String value2) {
            addCriterion("closer_name not between", value1, value2, "closerName");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeIsNull() {
            addCriterion("shipment_type is null");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeIsNotNull() {
            addCriterion("shipment_type is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeEqualTo(Byte value) {
            addCriterion("shipment_type =", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeNotEqualTo(Byte value) {
            addCriterion("shipment_type <>", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeGreaterThan(Byte value) {
            addCriterion("shipment_type >", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("shipment_type >=", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeLessThan(Byte value) {
            addCriterion("shipment_type <", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeLessThanOrEqualTo(Byte value) {
            addCriterion("shipment_type <=", value, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeIn(List<Byte> values) {
            addCriterion("shipment_type in", values, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeNotIn(List<Byte> values) {
            addCriterion("shipment_type not in", values, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeBetween(Byte value1, Byte value2) {
            addCriterion("shipment_type between", value1, value2, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andShipmentTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("shipment_type not between", value1, value2, "shipmentType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNull() {
            addCriterion("sale_type is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNotNull() {
            addCriterion("sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeEqualTo(Byte value) {
            addCriterion("sale_type =", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotEqualTo(Byte value) {
            addCriterion("sale_type <>", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThan(Byte value) {
            addCriterion("sale_type >", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("sale_type >=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThan(Byte value) {
            addCriterion("sale_type <", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThanOrEqualTo(Byte value) {
            addCriterion("sale_type <=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIn(List<Byte> values) {
            addCriterion("sale_type in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotIn(List<Byte> values) {
            addCriterion("sale_type not in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeBetween(Byte value1, Byte value2) {
            addCriterion("sale_type between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("sale_type not between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNull() {
            addCriterion("contact_person is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNotNull() {
            addCriterion("contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonEqualTo(String value) {
            addCriterion("contact_person =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("contact_person <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThan(String value) {
            addCriterion("contact_person >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThan(String value) {
            addCriterion("contact_person <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("contact_person <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLike(String value) {
            addCriterion("contact_person like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotLike(String value) {
            addCriterion("contact_person not like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonIn(List<String> values) {
            addCriterion("contact_person in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("contact_person not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("contact_person between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("contact_person not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIsNull() {
            addCriterion("consignee_tel is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIsNotNull() {
            addCriterion("consignee_tel is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelEqualTo(String value) {
            addCriterion("consignee_tel =", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotEqualTo(String value) {
            addCriterion("consignee_tel <>", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelGreaterThan(String value) {
            addCriterion("consignee_tel >", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_tel >=", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLessThan(String value) {
            addCriterion("consignee_tel <", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLessThanOrEqualTo(String value) {
            addCriterion("consignee_tel <=", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLike(String value) {
            addCriterion("consignee_tel like", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotLike(String value) {
            addCriterion("consignee_tel not like", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIn(List<String> values) {
            addCriterion("consignee_tel in", values, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotIn(List<String> values) {
            addCriterion("consignee_tel not in", values, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelBetween(String value1, String value2) {
            addCriterion("consignee_tel between", value1, value2, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotBetween(String value1, String value2) {
            addCriterion("consignee_tel not between", value1, value2, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andLargeAreaIsNull() {
            addCriterion("large_area is null");
            return (Criteria) this;
        }

        public Criteria andLargeAreaIsNotNull() {
            addCriterion("large_area is not null");
            return (Criteria) this;
        }

        public Criteria andLargeAreaEqualTo(Integer value) {
            addCriterion("large_area =", value, "largeArea");
            return (Criteria) this;
        }

        public Criteria andLargeAreaNotEqualTo(Integer value) {
            addCriterion("large_area <>", value, "largeArea");
            return (Criteria) this;
        }

        public Criteria andLargeAreaGreaterThan(Integer value) {
            addCriterion("large_area >", value, "largeArea");
            return (Criteria) this;
        }

        public Criteria andLargeAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("large_area >=", value, "largeArea");
            return (Criteria) this;
        }

        public Criteria andLargeAreaLessThan(Integer value) {
            addCriterion("large_area <", value, "largeArea");
            return (Criteria) this;
        }

        public Criteria andLargeAreaLessThanOrEqualTo(Integer value) {
            addCriterion("large_area <=", value, "largeArea");
            return (Criteria) this;
        }

        public Criteria andLargeAreaIn(List<Integer> values) {
            addCriterion("large_area in", values, "largeArea");
            return (Criteria) this;
        }

        public Criteria andLargeAreaNotIn(List<Integer> values) {
            addCriterion("large_area not in", values, "largeArea");
            return (Criteria) this;
        }

        public Criteria andLargeAreaBetween(Integer value1, Integer value2) {
            addCriterion("large_area between", value1, value2, "largeArea");
            return (Criteria) this;
        }

        public Criteria andLargeAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("large_area not between", value1, value2, "largeArea");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdIsNull() {
            addCriterion("update_log_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdIsNotNull() {
            addCriterion("update_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdEqualTo(Long value) {
            addCriterion("update_log_id =", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdNotEqualTo(Long value) {
            addCriterion("update_log_id <>", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdGreaterThan(Long value) {
            addCriterion("update_log_id >", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_log_id >=", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdLessThan(Long value) {
            addCriterion("update_log_id <", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdLessThanOrEqualTo(Long value) {
            addCriterion("update_log_id <=", value, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdIn(List<Long> values) {
            addCriterion("update_log_id in", values, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdNotIn(List<Long> values) {
            addCriterion("update_log_id not in", values, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdBetween(Long value1, Long value2) {
            addCriterion("update_log_id between", value1, value2, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andUpdateLogIdNotBetween(Long value1, Long value2) {
            addCriterion("update_log_id not between", value1, value2, "updateLogId");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackIsNull() {
            addCriterion("app_feedback is null");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackIsNotNull() {
            addCriterion("app_feedback is not null");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackEqualTo(String value) {
            addCriterion("app_feedback =", value, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackNotEqualTo(String value) {
            addCriterion("app_feedback <>", value, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackGreaterThan(String value) {
            addCriterion("app_feedback >", value, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("app_feedback >=", value, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackLessThan(String value) {
            addCriterion("app_feedback <", value, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackLessThanOrEqualTo(String value) {
            addCriterion("app_feedback <=", value, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackLike(String value) {
            addCriterion("app_feedback like", value, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackNotLike(String value) {
            addCriterion("app_feedback not like", value, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackIn(List<String> values) {
            addCriterion("app_feedback in", values, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackNotIn(List<String> values) {
            addCriterion("app_feedback not in", values, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackBetween(String value1, String value2) {
            addCriterion("app_feedback between", value1, value2, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andAppFeedbackNotBetween(String value1, String value2) {
            addCriterion("app_feedback not between", value1, value2, "appFeedback");
            return (Criteria) this;
        }

        public Criteria andDutyTypeIsNull() {
            addCriterion("duty_type is null");
            return (Criteria) this;
        }

        public Criteria andDutyTypeIsNotNull() {
            addCriterion("duty_type is not null");
            return (Criteria) this;
        }

        public Criteria andDutyTypeEqualTo(Byte value) {
            addCriterion("duty_type =", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeNotEqualTo(Byte value) {
            addCriterion("duty_type <>", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeGreaterThan(Byte value) {
            addCriterion("duty_type >", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("duty_type >=", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeLessThan(Byte value) {
            addCriterion("duty_type <", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeLessThanOrEqualTo(Byte value) {
            addCriterion("duty_type <=", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeIn(List<Byte> values) {
            addCriterion("duty_type in", values, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeNotIn(List<Byte> values) {
            addCriterion("duty_type not in", values, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeBetween(Byte value1, Byte value2) {
            addCriterion("duty_type between", value1, value2, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("duty_type not between", value1, value2, "dutyType");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdIsNull() {
            addCriterion("parent_order_id is null");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdIsNotNull() {
            addCriterion("parent_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdEqualTo(Long value) {
            addCriterion("parent_order_id =", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdNotEqualTo(Long value) {
            addCriterion("parent_order_id <>", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdGreaterThan(Long value) {
            addCriterion("parent_order_id >", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_order_id >=", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdLessThan(Long value) {
            addCriterion("parent_order_id <", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_order_id <=", value, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdIn(List<Long> values) {
            addCriterion("parent_order_id in", values, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdNotIn(List<Long> values) {
            addCriterion("parent_order_id not in", values, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdBetween(Long value1, Long value2) {
            addCriterion("parent_order_id between", value1, value2, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_order_id not between", value1, value2, "parentOrderId");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeIsNull() {
            addCriterion("ship_datetime is null");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeIsNotNull() {
            addCriterion("ship_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeEqualTo(String value) {
            addCriterion("ship_datetime =", value, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeNotEqualTo(String value) {
            addCriterion("ship_datetime <>", value, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeGreaterThan(String value) {
            addCriterion("ship_datetime >", value, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_datetime >=", value, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeLessThan(String value) {
            addCriterion("ship_datetime <", value, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeLessThanOrEqualTo(String value) {
            addCriterion("ship_datetime <=", value, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeLike(String value) {
            addCriterion("ship_datetime like", value, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeNotLike(String value) {
            addCriterion("ship_datetime not like", value, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeIn(List<String> values) {
            addCriterion("ship_datetime in", values, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeNotIn(List<String> values) {
            addCriterion("ship_datetime not in", values, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeBetween(String value1, String value2) {
            addCriterion("ship_datetime between", value1, value2, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andShipDatetimeNotBetween(String value1, String value2) {
            addCriterion("ship_datetime not between", value1, value2, "shipDatetime");
            return (Criteria) this;
        }

        public Criteria andDutyValueIsNull() {
            addCriterion("duty_value is null");
            return (Criteria) this;
        }

        public Criteria andDutyValueIsNotNull() {
            addCriterion("duty_value is not null");
            return (Criteria) this;
        }

        public Criteria andDutyValueEqualTo(String value) {
            addCriterion("duty_value =", value, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueNotEqualTo(String value) {
            addCriterion("duty_value <>", value, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueGreaterThan(String value) {
            addCriterion("duty_value >", value, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueGreaterThanOrEqualTo(String value) {
            addCriterion("duty_value >=", value, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueLessThan(String value) {
            addCriterion("duty_value <", value, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueLessThanOrEqualTo(String value) {
            addCriterion("duty_value <=", value, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueLike(String value) {
            addCriterion("duty_value like", value, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueNotLike(String value) {
            addCriterion("duty_value not like", value, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueIn(List<String> values) {
            addCriterion("duty_value in", values, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueNotIn(List<String> values) {
            addCriterion("duty_value not in", values, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueBetween(String value1, String value2) {
            addCriterion("duty_value between", value1, value2, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andDutyValueNotBetween(String value1, String value2) {
            addCriterion("duty_value not between", value1, value2, "dutyValue");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumIsNull() {
            addCriterion("store_reply_num is null");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumIsNotNull() {
            addCriterion("store_reply_num is not null");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumEqualTo(Integer value) {
            addCriterion("store_reply_num =", value, "storeReplyNum");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumNotEqualTo(Integer value) {
            addCriterion("store_reply_num <>", value, "storeReplyNum");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumGreaterThan(Integer value) {
            addCriterion("store_reply_num >", value, "storeReplyNum");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_reply_num >=", value, "storeReplyNum");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumLessThan(Integer value) {
            addCriterion("store_reply_num <", value, "storeReplyNum");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumLessThanOrEqualTo(Integer value) {
            addCriterion("store_reply_num <=", value, "storeReplyNum");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumIn(List<Integer> values) {
            addCriterion("store_reply_num in", values, "storeReplyNum");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumNotIn(List<Integer> values) {
            addCriterion("store_reply_num not in", values, "storeReplyNum");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumBetween(Integer value1, Integer value2) {
            addCriterion("store_reply_num between", value1, value2, "storeReplyNum");
            return (Criteria) this;
        }

        public Criteria andStoreReplyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("store_reply_num not between", value1, value2, "storeReplyNum");
            return (Criteria) this;
        }

        public Criteria andDutyOpIsNull() {
            addCriterion("duty_op is null");
            return (Criteria) this;
        }

        public Criteria andDutyOpIsNotNull() {
            addCriterion("duty_op is not null");
            return (Criteria) this;
        }

        public Criteria andDutyOpEqualTo(Byte value) {
            addCriterion("duty_op =", value, "dutyOp");
            return (Criteria) this;
        }

        public Criteria andDutyOpNotEqualTo(Byte value) {
            addCriterion("duty_op <>", value, "dutyOp");
            return (Criteria) this;
        }

        public Criteria andDutyOpGreaterThan(Byte value) {
            addCriterion("duty_op >", value, "dutyOp");
            return (Criteria) this;
        }

        public Criteria andDutyOpGreaterThanOrEqualTo(Byte value) {
            addCriterion("duty_op >=", value, "dutyOp");
            return (Criteria) this;
        }

        public Criteria andDutyOpLessThan(Byte value) {
            addCriterion("duty_op <", value, "dutyOp");
            return (Criteria) this;
        }

        public Criteria andDutyOpLessThanOrEqualTo(Byte value) {
            addCriterion("duty_op <=", value, "dutyOp");
            return (Criteria) this;
        }

        public Criteria andDutyOpIn(List<Byte> values) {
            addCriterion("duty_op in", values, "dutyOp");
            return (Criteria) this;
        }

        public Criteria andDutyOpNotIn(List<Byte> values) {
            addCriterion("duty_op not in", values, "dutyOp");
            return (Criteria) this;
        }

        public Criteria andDutyOpBetween(Byte value1, Byte value2) {
            addCriterion("duty_op between", value1, value2, "dutyOp");
            return (Criteria) this;
        }

        public Criteria andDutyOpNotBetween(Byte value1, Byte value2) {
            addCriterion("duty_op not between", value1, value2, "dutyOp");
            return (Criteria) this;
        }

        public Criteria andStaffNumIsNull() {
            addCriterion("staff_num is null");
            return (Criteria) this;
        }

        public Criteria andStaffNumIsNotNull() {
            addCriterion("staff_num is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNumEqualTo(String value) {
            addCriterion("staff_num =", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotEqualTo(String value) {
            addCriterion("staff_num <>", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumGreaterThan(String value) {
            addCriterion("staff_num >", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumGreaterThanOrEqualTo(String value) {
            addCriterion("staff_num >=", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLessThan(String value) {
            addCriterion("staff_num <", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLessThanOrEqualTo(String value) {
            addCriterion("staff_num <=", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLike(String value) {
            addCriterion("staff_num like", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotLike(String value) {
            addCriterion("staff_num not like", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumIn(List<String> values) {
            addCriterion("staff_num in", values, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotIn(List<String> values) {
            addCriterion("staff_num not in", values, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumBetween(String value1, String value2) {
            addCriterion("staff_num between", value1, value2, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotBetween(String value1, String value2) {
            addCriterion("staff_num not between", value1, value2, "staffNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumIsNull() {
            addCriterion("apply_order_num is null");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumIsNotNull() {
            addCriterion("apply_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumEqualTo(String value) {
            addCriterion("apply_order_num =", value, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumNotEqualTo(String value) {
            addCriterion("apply_order_num <>", value, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumGreaterThan(String value) {
            addCriterion("apply_order_num >", value, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("apply_order_num >=", value, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumLessThan(String value) {
            addCriterion("apply_order_num <", value, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumLessThanOrEqualTo(String value) {
            addCriterion("apply_order_num <=", value, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumLike(String value) {
            addCriterion("apply_order_num like", value, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumNotLike(String value) {
            addCriterion("apply_order_num not like", value, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumIn(List<String> values) {
            addCriterion("apply_order_num in", values, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumNotIn(List<String> values) {
            addCriterion("apply_order_num not in", values, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumBetween(String value1, String value2) {
            addCriterion("apply_order_num between", value1, value2, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyOrderNumNotBetween(String value1, String value2) {
            addCriterion("apply_order_num not between", value1, value2, "applyOrderNum");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumIsNull() {
            addCriterion("aftersale_order_num is null");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumIsNotNull() {
            addCriterion("aftersale_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumEqualTo(Long value) {
            addCriterion("aftersale_order_num =", value, "aftersaleOrderNum");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumNotEqualTo(Long value) {
            addCriterion("aftersale_order_num <>", value, "aftersaleOrderNum");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumGreaterThan(Long value) {
            addCriterion("aftersale_order_num >", value, "aftersaleOrderNum");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumGreaterThanOrEqualTo(Long value) {
            addCriterion("aftersale_order_num >=", value, "aftersaleOrderNum");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumLessThan(Long value) {
            addCriterion("aftersale_order_num <", value, "aftersaleOrderNum");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumLessThanOrEqualTo(Long value) {
            addCriterion("aftersale_order_num <=", value, "aftersaleOrderNum");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumIn(List<Long> values) {
            addCriterion("aftersale_order_num in", values, "aftersaleOrderNum");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumNotIn(List<Long> values) {
            addCriterion("aftersale_order_num not in", values, "aftersaleOrderNum");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumBetween(Long value1, Long value2) {
            addCriterion("aftersale_order_num between", value1, value2, "aftersaleOrderNum");
            return (Criteria) this;
        }

        public Criteria andAftersaleOrderNumNotBetween(Long value1, Long value2) {
            addCriterion("aftersale_order_num not between", value1, value2, "aftersaleOrderNum");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumIsNull() {
            addCriterion("apply_return_num is null");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumIsNotNull() {
            addCriterion("apply_return_num is not null");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumEqualTo(Integer value) {
            addCriterion("apply_return_num =", value, "applyReturnNum");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumNotEqualTo(Integer value) {
            addCriterion("apply_return_num <>", value, "applyReturnNum");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumGreaterThan(Integer value) {
            addCriterion("apply_return_num >", value, "applyReturnNum");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_return_num >=", value, "applyReturnNum");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumLessThan(Integer value) {
            addCriterion("apply_return_num <", value, "applyReturnNum");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumLessThanOrEqualTo(Integer value) {
            addCriterion("apply_return_num <=", value, "applyReturnNum");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumIn(List<Integer> values) {
            addCriterion("apply_return_num in", values, "applyReturnNum");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumNotIn(List<Integer> values) {
            addCriterion("apply_return_num not in", values, "applyReturnNum");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumBetween(Integer value1, Integer value2) {
            addCriterion("apply_return_num between", value1, value2, "applyReturnNum");
            return (Criteria) this;
        }

        public Criteria andApplyReturnNumNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_return_num not between", value1, value2, "applyReturnNum");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Byte value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Byte value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Byte value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Byte value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Byte value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Byte value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Byte> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Byte> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Byte value1, Byte value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Byte value1, Byte value2) {
            addCriterion("locked not between", value1, value2, "locked");
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

        public Criteria andFollowUpIsNull() {
            addCriterion("follow_up is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpIsNotNull() {
            addCriterion("follow_up is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpEqualTo(Byte value) {
            addCriterion("follow_up =", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotEqualTo(Byte value) {
            addCriterion("follow_up <>", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpGreaterThan(Byte value) {
            addCriterion("follow_up >", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpGreaterThanOrEqualTo(Byte value) {
            addCriterion("follow_up >=", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpLessThan(Byte value) {
            addCriterion("follow_up <", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpLessThanOrEqualTo(Byte value) {
            addCriterion("follow_up <=", value, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpIn(List<Byte> values) {
            addCriterion("follow_up in", values, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotIn(List<Byte> values) {
            addCriterion("follow_up not in", values, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpBetween(Byte value1, Byte value2) {
            addCriterion("follow_up between", value1, value2, "followUp");
            return (Criteria) this;
        }

        public Criteria andFollowUpNotBetween(Byte value1, Byte value2) {
            addCriterion("follow_up not between", value1, value2, "followUp");
            return (Criteria) this;
        }

        public Criteria andExtendIsNull() {
            addCriterion("extend is null");
            return (Criteria) this;
        }

        public Criteria andExtendIsNotNull() {
            addCriterion("extend is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEqualTo(Object value) {
            addCriterion("extend =", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotEqualTo(Object value) {
            addCriterion("extend <>", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendGreaterThan(Object value) {
            addCriterion("extend >", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendGreaterThanOrEqualTo(Object value) {
            addCriterion("extend >=", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLessThan(Object value) {
            addCriterion("extend <", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLessThanOrEqualTo(Object value) {
            addCriterion("extend <=", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendIn(List<Object> values) {
            addCriterion("extend in", values, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotIn(List<Object> values) {
            addCriterion("extend not in", values, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendBetween(Object value1, Object value2) {
            addCriterion("extend between", value1, value2, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotBetween(Object value1, Object value2) {
            addCriterion("extend not between", value1, value2, "extend");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameIsNull() {
            addCriterion("sender_real_name is null");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameIsNotNull() {
            addCriterion("sender_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameEqualTo(String value) {
            addCriterion("sender_real_name =", value, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameNotEqualTo(String value) {
            addCriterion("sender_real_name <>", value, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameGreaterThan(String value) {
            addCriterion("sender_real_name >", value, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("sender_real_name >=", value, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameLessThan(String value) {
            addCriterion("sender_real_name <", value, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameLessThanOrEqualTo(String value) {
            addCriterion("sender_real_name <=", value, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameLike(String value) {
            addCriterion("sender_real_name like", value, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameNotLike(String value) {
            addCriterion("sender_real_name not like", value, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameIn(List<String> values) {
            addCriterion("sender_real_name in", values, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameNotIn(List<String> values) {
            addCriterion("sender_real_name not in", values, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameBetween(String value1, String value2) {
            addCriterion("sender_real_name between", value1, value2, "senderRealName");
            return (Criteria) this;
        }

        public Criteria andSenderRealNameNotBetween(String value1, String value2) {
            addCriterion("sender_real_name not between", value1, value2, "senderRealName");
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

        public Criteria andPickupOrderIdIsNull() {
            addCriterion("pickup_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdIsNotNull() {
            addCriterion("pickup_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdEqualTo(Long value) {
            addCriterion("pickup_order_id =", value, "pickupOrderId");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdNotEqualTo(Long value) {
            addCriterion("pickup_order_id <>", value, "pickupOrderId");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdGreaterThan(Long value) {
            addCriterion("pickup_order_id >", value, "pickupOrderId");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pickup_order_id >=", value, "pickupOrderId");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdLessThan(Long value) {
            addCriterion("pickup_order_id <", value, "pickupOrderId");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("pickup_order_id <=", value, "pickupOrderId");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdIn(List<Long> values) {
            addCriterion("pickup_order_id in", values, "pickupOrderId");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdNotIn(List<Long> values) {
            addCriterion("pickup_order_id not in", values, "pickupOrderId");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdBetween(Long value1, Long value2) {
            addCriterion("pickup_order_id between", value1, value2, "pickupOrderId");
            return (Criteria) this;
        }

        public Criteria andPickupOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("pickup_order_id not between", value1, value2, "pickupOrderId");
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