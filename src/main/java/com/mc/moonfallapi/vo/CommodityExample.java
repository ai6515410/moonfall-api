package com.mc.moonfallapi.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIsNull() {
            addCriterion("commodity_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIsNotNull() {
            addCriterion("commodity_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdEqualTo(String value) {
            addCriterion("commodity_type_id =", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotEqualTo(String value) {
            addCriterion("commodity_type_id <>", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThan(String value) {
            addCriterion("commodity_type_id >", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_type_id >=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThan(String value) {
            addCriterion("commodity_type_id <", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLessThanOrEqualTo(String value) {
            addCriterion("commodity_type_id <=", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdLike(String value) {
            addCriterion("commodity_type_id like", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotLike(String value) {
            addCriterion("commodity_type_id not like", value, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdIn(List<String> values) {
            addCriterion("commodity_type_id in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotIn(List<String> values) {
            addCriterion("commodity_type_id not in", values, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdBetween(String value1, String value2) {
            addCriterion("commodity_type_id between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeIdNotBetween(String value1, String value2) {
            addCriterion("commodity_type_id not between", value1, value2, "commodityTypeId");
            return (Criteria) this;
        }

        public Criteria andCommodityNoIsNull() {
            addCriterion("commodity_no is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNoIsNotNull() {
            addCriterion("commodity_no is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNoEqualTo(String value) {
            addCriterion("commodity_no =", value, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoNotEqualTo(String value) {
            addCriterion("commodity_no <>", value, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoGreaterThan(String value) {
            addCriterion("commodity_no >", value, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_no >=", value, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoLessThan(String value) {
            addCriterion("commodity_no <", value, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoLessThanOrEqualTo(String value) {
            addCriterion("commodity_no <=", value, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoLike(String value) {
            addCriterion("commodity_no like", value, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoNotLike(String value) {
            addCriterion("commodity_no not like", value, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoIn(List<String> values) {
            addCriterion("commodity_no in", values, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoNotIn(List<String> values) {
            addCriterion("commodity_no not in", values, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoBetween(String value1, String value2) {
            addCriterion("commodity_no between", value1, value2, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNoNotBetween(String value1, String value2) {
            addCriterion("commodity_no not between", value1, value2, "commodityNo");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIsNull() {
            addCriterion("commodity_status is null");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIsNotNull() {
            addCriterion("commodity_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusEqualTo(Integer value) {
            addCriterion("commodity_status =", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotEqualTo(Integer value) {
            addCriterion("commodity_status <>", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusGreaterThan(Integer value) {
            addCriterion("commodity_status >", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_status >=", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusLessThan(Integer value) {
            addCriterion("commodity_status <", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_status <=", value, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusIn(List<Integer> values) {
            addCriterion("commodity_status in", values, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotIn(List<Integer> values) {
            addCriterion("commodity_status not in", values, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusBetween(Integer value1, Integer value2) {
            addCriterion("commodity_status between", value1, value2, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_status not between", value1, value2, "commodityStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityIsNull() {
            addCriterion("commodity_quantity is null");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityIsNotNull() {
            addCriterion("commodity_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityEqualTo(Integer value) {
            addCriterion("commodity_quantity =", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityNotEqualTo(Integer value) {
            addCriterion("commodity_quantity <>", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityGreaterThan(Integer value) {
            addCriterion("commodity_quantity >", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_quantity >=", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityLessThan(Integer value) {
            addCriterion("commodity_quantity <", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_quantity <=", value, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityIn(List<Integer> values) {
            addCriterion("commodity_quantity in", values, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityNotIn(List<Integer> values) {
            addCriterion("commodity_quantity not in", values, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityBetween(Integer value1, Integer value2) {
            addCriterion("commodity_quantity between", value1, value2, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_quantity not between", value1, value2, "commodityQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIsNull() {
            addCriterion("commodity_comment is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIsNotNull() {
            addCriterion("commodity_comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentEqualTo(String value) {
            addCriterion("commodity_comment =", value, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentNotEqualTo(String value) {
            addCriterion("commodity_comment <>", value, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentGreaterThan(String value) {
            addCriterion("commodity_comment >", value, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_comment >=", value, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentLessThan(String value) {
            addCriterion("commodity_comment <", value, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentLessThanOrEqualTo(String value) {
            addCriterion("commodity_comment <=", value, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentLike(String value) {
            addCriterion("commodity_comment like", value, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentNotLike(String value) {
            addCriterion("commodity_comment not like", value, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentIn(List<String> values) {
            addCriterion("commodity_comment in", values, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentNotIn(List<String> values) {
            addCriterion("commodity_comment not in", values, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentBetween(String value1, String value2) {
            addCriterion("commodity_comment between", value1, value2, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityCommentNotBetween(String value1, String value2) {
            addCriterion("commodity_comment not between", value1, value2, "commodityComment");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeIsNull() {
            addCriterion("commodity_attribute is null");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeIsNotNull() {
            addCriterion("commodity_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeEqualTo(Integer value) {
            addCriterion("commodity_attribute =", value, "commodityAttribute");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeNotEqualTo(Integer value) {
            addCriterion("commodity_attribute <>", value, "commodityAttribute");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeGreaterThan(Integer value) {
            addCriterion("commodity_attribute >", value, "commodityAttribute");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_attribute >=", value, "commodityAttribute");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeLessThan(Integer value) {
            addCriterion("commodity_attribute <", value, "commodityAttribute");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_attribute <=", value, "commodityAttribute");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeIn(List<Integer> values) {
            addCriterion("commodity_attribute in", values, "commodityAttribute");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeNotIn(List<Integer> values) {
            addCriterion("commodity_attribute not in", values, "commodityAttribute");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeBetween(Integer value1, Integer value2) {
            addCriterion("commodity_attribute between", value1, value2, "commodityAttribute");
            return (Criteria) this;
        }

        public Criteria andCommodityAttributeNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_attribute not between", value1, value2, "commodityAttribute");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityIsNull() {
            addCriterion("commodity_effective_quantity is null");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityIsNotNull() {
            addCriterion("commodity_effective_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityEqualTo(Integer value) {
            addCriterion("commodity_effective_quantity =", value, "commodityEffectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityNotEqualTo(Integer value) {
            addCriterion("commodity_effective_quantity <>", value, "commodityEffectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityGreaterThan(Integer value) {
            addCriterion("commodity_effective_quantity >", value, "commodityEffectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_effective_quantity >=", value, "commodityEffectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityLessThan(Integer value) {
            addCriterion("commodity_effective_quantity <", value, "commodityEffectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_effective_quantity <=", value, "commodityEffectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityIn(List<Integer> values) {
            addCriterion("commodity_effective_quantity in", values, "commodityEffectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityNotIn(List<Integer> values) {
            addCriterion("commodity_effective_quantity not in", values, "commodityEffectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityBetween(Integer value1, Integer value2) {
            addCriterion("commodity_effective_quantity between", value1, value2, "commodityEffectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityEffectiveQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_effective_quantity not between", value1, value2, "commodityEffectiveQuantity");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeIsNull() {
            addCriterion("commodity_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeIsNotNull() {
            addCriterion("commodity_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("commodity_create_time =", value, "commodityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("commodity_create_time <>", value, "commodityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("commodity_create_time >", value, "commodityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commodity_create_time >=", value, "commodityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("commodity_create_time <", value, "commodityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commodity_create_time <=", value, "commodityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("commodity_create_time in", values, "commodityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("commodity_create_time not in", values, "commodityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commodity_create_time between", value1, value2, "commodityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commodity_create_time not between", value1, value2, "commodityCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserIsNull() {
            addCriterion("commodity_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserIsNotNull() {
            addCriterion("commodity_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserEqualTo(String value) {
            addCriterion("commodity_create_user =", value, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserNotEqualTo(String value) {
            addCriterion("commodity_create_user <>", value, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserGreaterThan(String value) {
            addCriterion("commodity_create_user >", value, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_create_user >=", value, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserLessThan(String value) {
            addCriterion("commodity_create_user <", value, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserLessThanOrEqualTo(String value) {
            addCriterion("commodity_create_user <=", value, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserLike(String value) {
            addCriterion("commodity_create_user like", value, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserNotLike(String value) {
            addCriterion("commodity_create_user not like", value, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserIn(List<String> values) {
            addCriterion("commodity_create_user in", values, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserNotIn(List<String> values) {
            addCriterion("commodity_create_user not in", values, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserBetween(String value1, String value2) {
            addCriterion("commodity_create_user between", value1, value2, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityCreateUserNotBetween(String value1, String value2) {
            addCriterion("commodity_create_user not between", value1, value2, "commodityCreateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeIsNull() {
            addCriterion("commodity_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeIsNotNull() {
            addCriterion("commodity_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("commodity_update_time =", value, "commodityUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("commodity_update_time <>", value, "commodityUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("commodity_update_time >", value, "commodityUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commodity_update_time >=", value, "commodityUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("commodity_update_time <", value, "commodityUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commodity_update_time <=", value, "commodityUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("commodity_update_time in", values, "commodityUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("commodity_update_time not in", values, "commodityUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commodity_update_time between", value1, value2, "commodityUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commodity_update_time not between", value1, value2, "commodityUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserIsNull() {
            addCriterion("commodity_update_user is null");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserIsNotNull() {
            addCriterion("commodity_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserEqualTo(String value) {
            addCriterion("commodity_update_user =", value, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserNotEqualTo(String value) {
            addCriterion("commodity_update_user <>", value, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserGreaterThan(String value) {
            addCriterion("commodity_update_user >", value, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_update_user >=", value, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserLessThan(String value) {
            addCriterion("commodity_update_user <", value, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("commodity_update_user <=", value, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserLike(String value) {
            addCriterion("commodity_update_user like", value, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserNotLike(String value) {
            addCriterion("commodity_update_user not like", value, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserIn(List<String> values) {
            addCriterion("commodity_update_user in", values, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserNotIn(List<String> values) {
            addCriterion("commodity_update_user not in", values, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserBetween(String value1, String value2) {
            addCriterion("commodity_update_user between", value1, value2, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityUpdateUserNotBetween(String value1, String value2) {
            addCriterion("commodity_update_user not between", value1, value2, "commodityUpdateUser");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagIsNull() {
            addCriterion("commodity_delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagIsNotNull() {
            addCriterion("commodity_delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagEqualTo(Integer value) {
            addCriterion("commodity_delete_flag =", value, "commodityDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagNotEqualTo(Integer value) {
            addCriterion("commodity_delete_flag <>", value, "commodityDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagGreaterThan(Integer value) {
            addCriterion("commodity_delete_flag >", value, "commodityDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_delete_flag >=", value, "commodityDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagLessThan(Integer value) {
            addCriterion("commodity_delete_flag <", value, "commodityDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_delete_flag <=", value, "commodityDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagIn(List<Integer> values) {
            addCriterion("commodity_delete_flag in", values, "commodityDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagNotIn(List<Integer> values) {
            addCriterion("commodity_delete_flag not in", values, "commodityDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("commodity_delete_flag between", value1, value2, "commodityDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_delete_flag not between", value1, value2, "commodityDeleteFlag");
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