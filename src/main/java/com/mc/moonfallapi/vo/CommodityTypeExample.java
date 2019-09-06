package com.mc.moonfallapi.vo;

import java.util.ArrayList;
import java.util.List;

public class CommodityTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityTypeExample() {
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

        public Criteria andCommodityTypeNoIsNull() {
            addCriterion("commodity_type_no is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoIsNotNull() {
            addCriterion("commodity_type_no is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoEqualTo(String value) {
            addCriterion("commodity_type_no =", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoNotEqualTo(String value) {
            addCriterion("commodity_type_no <>", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoGreaterThan(String value) {
            addCriterion("commodity_type_no >", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_type_no >=", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoLessThan(String value) {
            addCriterion("commodity_type_no <", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoLessThanOrEqualTo(String value) {
            addCriterion("commodity_type_no <=", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoLike(String value) {
            addCriterion("commodity_type_no like", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoNotLike(String value) {
            addCriterion("commodity_type_no not like", value, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoIn(List<String> values) {
            addCriterion("commodity_type_no in", values, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoNotIn(List<String> values) {
            addCriterion("commodity_type_no not in", values, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoBetween(String value1, String value2) {
            addCriterion("commodity_type_no between", value1, value2, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNoNotBetween(String value1, String value2) {
            addCriterion("commodity_type_no not between", value1, value2, "commodityTypeNo");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameIsNull() {
            addCriterion("commodity_type_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameIsNotNull() {
            addCriterion("commodity_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameEqualTo(String value) {
            addCriterion("commodity_type_name =", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotEqualTo(String value) {
            addCriterion("commodity_type_name <>", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameGreaterThan(String value) {
            addCriterion("commodity_type_name >", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_type_name >=", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameLessThan(String value) {
            addCriterion("commodity_type_name <", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_type_name <=", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameLike(String value) {
            addCriterion("commodity_type_name like", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotLike(String value) {
            addCriterion("commodity_type_name not like", value, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameIn(List<String> values) {
            addCriterion("commodity_type_name in", values, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotIn(List<String> values) {
            addCriterion("commodity_type_name not in", values, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameBetween(String value1, String value2) {
            addCriterion("commodity_type_name between", value1, value2, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeNameNotBetween(String value1, String value2) {
            addCriterion("commodity_type_name not between", value1, value2, "commodityTypeName");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagIsNull() {
            addCriterion("commodity_type_delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagIsNotNull() {
            addCriterion("commodity_type_delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagEqualTo(Integer value) {
            addCriterion("commodity_type_delete_flag =", value, "commodityTypeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagNotEqualTo(Integer value) {
            addCriterion("commodity_type_delete_flag <>", value, "commodityTypeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagGreaterThan(Integer value) {
            addCriterion("commodity_type_delete_flag >", value, "commodityTypeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_type_delete_flag >=", value, "commodityTypeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagLessThan(Integer value) {
            addCriterion("commodity_type_delete_flag <", value, "commodityTypeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_type_delete_flag <=", value, "commodityTypeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagIn(List<Integer> values) {
            addCriterion("commodity_type_delete_flag in", values, "commodityTypeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagNotIn(List<Integer> values) {
            addCriterion("commodity_type_delete_flag not in", values, "commodityTypeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("commodity_type_delete_flag between", value1, value2, "commodityTypeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityTypeDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_type_delete_flag not between", value1, value2, "commodityTypeDeleteFlag");
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