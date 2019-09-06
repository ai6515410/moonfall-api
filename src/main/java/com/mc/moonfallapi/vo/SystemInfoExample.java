package com.mc.moonfallapi.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SystemInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemInfoExample() {
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

        public Criteria andSystemInfoIsNull() {
            addCriterion("system_info is null");
            return (Criteria) this;
        }

        public Criteria andSystemInfoIsNotNull() {
            addCriterion("system_info is not null");
            return (Criteria) this;
        }

        public Criteria andSystemInfoEqualTo(String value) {
            addCriterion("system_info =", value, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoNotEqualTo(String value) {
            addCriterion("system_info <>", value, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoGreaterThan(String value) {
            addCriterion("system_info >", value, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoGreaterThanOrEqualTo(String value) {
            addCriterion("system_info >=", value, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoLessThan(String value) {
            addCriterion("system_info <", value, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoLessThanOrEqualTo(String value) {
            addCriterion("system_info <=", value, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoLike(String value) {
            addCriterion("system_info like", value, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoNotLike(String value) {
            addCriterion("system_info not like", value, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoIn(List<String> values) {
            addCriterion("system_info in", values, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoNotIn(List<String> values) {
            addCriterion("system_info not in", values, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoBetween(String value1, String value2) {
            addCriterion("system_info between", value1, value2, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemInfoNotBetween(String value1, String value2) {
            addCriterion("system_info not between", value1, value2, "systemInfo");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagIsNull() {
            addCriterion("system_delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagIsNotNull() {
            addCriterion("system_delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagEqualTo(Integer value) {
            addCriterion("system_delete_flag =", value, "systemDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagNotEqualTo(Integer value) {
            addCriterion("system_delete_flag <>", value, "systemDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagGreaterThan(Integer value) {
            addCriterion("system_delete_flag >", value, "systemDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_delete_flag >=", value, "systemDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagLessThan(Integer value) {
            addCriterion("system_delete_flag <", value, "systemDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("system_delete_flag <=", value, "systemDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagIn(List<Integer> values) {
            addCriterion("system_delete_flag in", values, "systemDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagNotIn(List<Integer> values) {
            addCriterion("system_delete_flag not in", values, "systemDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("system_delete_flag between", value1, value2, "systemDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSystemDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("system_delete_flag not between", value1, value2, "systemDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeIsNull() {
            addCriterion("system_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeIsNotNull() {
            addCriterion("system_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("system_create_time =", value, "systemCreateTime");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("system_create_time <>", value, "systemCreateTime");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("system_create_time >", value, "systemCreateTime");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("system_create_time >=", value, "systemCreateTime");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("system_create_time <", value, "systemCreateTime");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("system_create_time <=", value, "systemCreateTime");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("system_create_time in", values, "systemCreateTime");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("system_create_time not in", values, "systemCreateTime");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("system_create_time between", value1, value2, "systemCreateTime");
            return (Criteria) this;
        }

        public Criteria andSystemCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("system_create_time not between", value1, value2, "systemCreateTime");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserIsNull() {
            addCriterion("system_create_user is null");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserIsNotNull() {
            addCriterion("system_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserEqualTo(String value) {
            addCriterion("system_create_user =", value, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserNotEqualTo(String value) {
            addCriterion("system_create_user <>", value, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserGreaterThan(String value) {
            addCriterion("system_create_user >", value, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("system_create_user >=", value, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserLessThan(String value) {
            addCriterion("system_create_user <", value, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserLessThanOrEqualTo(String value) {
            addCriterion("system_create_user <=", value, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserLike(String value) {
            addCriterion("system_create_user like", value, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserNotLike(String value) {
            addCriterion("system_create_user not like", value, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserIn(List<String> values) {
            addCriterion("system_create_user in", values, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserNotIn(List<String> values) {
            addCriterion("system_create_user not in", values, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserBetween(String value1, String value2) {
            addCriterion("system_create_user between", value1, value2, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemCreateUserNotBetween(String value1, String value2) {
            addCriterion("system_create_user not between", value1, value2, "systemCreateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeIsNull() {
            addCriterion("system_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeIsNotNull() {
            addCriterion("system_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("system_update_time =", value, "systemUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("system_update_time <>", value, "systemUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("system_update_time >", value, "systemUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("system_update_time >=", value, "systemUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("system_update_time <", value, "systemUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("system_update_time <=", value, "systemUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("system_update_time in", values, "systemUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("system_update_time not in", values, "systemUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("system_update_time between", value1, value2, "systemUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("system_update_time not between", value1, value2, "systemUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserIsNull() {
            addCriterion("system_update_user is null");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserIsNotNull() {
            addCriterion("system_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserEqualTo(String value) {
            addCriterion("system_update_user =", value, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserNotEqualTo(String value) {
            addCriterion("system_update_user <>", value, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserGreaterThan(String value) {
            addCriterion("system_update_user >", value, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("system_update_user >=", value, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserLessThan(String value) {
            addCriterion("system_update_user <", value, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("system_update_user <=", value, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserLike(String value) {
            addCriterion("system_update_user like", value, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserNotLike(String value) {
            addCriterion("system_update_user not like", value, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserIn(List<String> values) {
            addCriterion("system_update_user in", values, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserNotIn(List<String> values) {
            addCriterion("system_update_user not in", values, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserBetween(String value1, String value2) {
            addCriterion("system_update_user between", value1, value2, "systemUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSystemUpdateUserNotBetween(String value1, String value2) {
            addCriterion("system_update_user not between", value1, value2, "systemUpdateUser");
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