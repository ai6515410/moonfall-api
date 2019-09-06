package com.mc.moonfallapi.vo;

import java.util.ArrayList;
import java.util.List;

public class UserCollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCollectExample() {
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

        public Criteria and主键IsNull() {
            addCriterion("主键 is null");
            return (Criteria) this;
        }

        public Criteria and主键IsNotNull() {
            addCriterion("主键 is not null");
            return (Criteria) this;
        }

        public Criteria and主键EqualTo(String value) {
            addCriterion("主键 =", value, "主键");
            return (Criteria) this;
        }

        public Criteria and主键NotEqualTo(String value) {
            addCriterion("主键 <>", value, "主键");
            return (Criteria) this;
        }

        public Criteria and主键GreaterThan(String value) {
            addCriterion("主键 >", value, "主键");
            return (Criteria) this;
        }

        public Criteria and主键GreaterThanOrEqualTo(String value) {
            addCriterion("主键 >=", value, "主键");
            return (Criteria) this;
        }

        public Criteria and主键LessThan(String value) {
            addCriterion("主键 <", value, "主键");
            return (Criteria) this;
        }

        public Criteria and主键LessThanOrEqualTo(String value) {
            addCriterion("主键 <=", value, "主键");
            return (Criteria) this;
        }

        public Criteria and主键Like(String value) {
            addCriterion("主键 like", value, "主键");
            return (Criteria) this;
        }

        public Criteria and主键NotLike(String value) {
            addCriterion("主键 not like", value, "主键");
            return (Criteria) this;
        }

        public Criteria and主键In(List<String> values) {
            addCriterion("主键 in", values, "主键");
            return (Criteria) this;
        }

        public Criteria and主键NotIn(List<String> values) {
            addCriterion("主键 not in", values, "主键");
            return (Criteria) this;
        }

        public Criteria and主键Between(String value1, String value2) {
            addCriterion("主键 between", value1, value2, "主键");
            return (Criteria) this;
        }

        public Criteria and主键NotBetween(String value1, String value2) {
            addCriterion("主键 not between", value1, value2, "主键");
            return (Criteria) this;
        }

        public Criteria and商品idIsNull() {
            addCriterion("商品id is null");
            return (Criteria) this;
        }

        public Criteria and商品idIsNotNull() {
            addCriterion("商品id is not null");
            return (Criteria) this;
        }

        public Criteria and商品idEqualTo(String value) {
            addCriterion("商品id =", value, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idNotEqualTo(String value) {
            addCriterion("商品id <>", value, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idGreaterThan(String value) {
            addCriterion("商品id >", value, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idGreaterThanOrEqualTo(String value) {
            addCriterion("商品id >=", value, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idLessThan(String value) {
            addCriterion("商品id <", value, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idLessThanOrEqualTo(String value) {
            addCriterion("商品id <=", value, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idLike(String value) {
            addCriterion("商品id like", value, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idNotLike(String value) {
            addCriterion("商品id not like", value, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idIn(List<String> values) {
            addCriterion("商品id in", values, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idNotIn(List<String> values) {
            addCriterion("商品id not in", values, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idBetween(String value1, String value2) {
            addCriterion("商品id between", value1, value2, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品idNotBetween(String value1, String value2) {
            addCriterion("商品id not between", value1, value2, "商品id");
            return (Criteria) this;
        }

        public Criteria and商品数量IsNull() {
            addCriterion("商品数量 is null");
            return (Criteria) this;
        }

        public Criteria and商品数量IsNotNull() {
            addCriterion("商品数量 is not null");
            return (Criteria) this;
        }

        public Criteria and商品数量EqualTo(String value) {
            addCriterion("商品数量 =", value, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量NotEqualTo(String value) {
            addCriterion("商品数量 <>", value, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量GreaterThan(String value) {
            addCriterion("商品数量 >", value, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量GreaterThanOrEqualTo(String value) {
            addCriterion("商品数量 >=", value, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量LessThan(String value) {
            addCriterion("商品数量 <", value, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量LessThanOrEqualTo(String value) {
            addCriterion("商品数量 <=", value, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量Like(String value) {
            addCriterion("商品数量 like", value, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量NotLike(String value) {
            addCriterion("商品数量 not like", value, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量In(List<String> values) {
            addCriterion("商品数量 in", values, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量NotIn(List<String> values) {
            addCriterion("商品数量 not in", values, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量Between(String value1, String value2) {
            addCriterion("商品数量 between", value1, value2, "商品数量");
            return (Criteria) this;
        }

        public Criteria and商品数量NotBetween(String value1, String value2) {
            addCriterion("商品数量 not between", value1, value2, "商品数量");
            return (Criteria) this;
        }

        public Criteria and订单idIsNull() {
            addCriterion("订单id is null");
            return (Criteria) this;
        }

        public Criteria and订单idIsNotNull() {
            addCriterion("订单id is not null");
            return (Criteria) this;
        }

        public Criteria and订单idEqualTo(String value) {
            addCriterion("订单id =", value, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idNotEqualTo(String value) {
            addCriterion("订单id <>", value, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idGreaterThan(String value) {
            addCriterion("订单id >", value, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idGreaterThanOrEqualTo(String value) {
            addCriterion("订单id >=", value, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idLessThan(String value) {
            addCriterion("订单id <", value, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idLessThanOrEqualTo(String value) {
            addCriterion("订单id <=", value, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idLike(String value) {
            addCriterion("订单id like", value, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idNotLike(String value) {
            addCriterion("订单id not like", value, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idIn(List<String> values) {
            addCriterion("订单id in", values, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idNotIn(List<String> values) {
            addCriterion("订单id not in", values, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idBetween(String value1, String value2) {
            addCriterion("订单id between", value1, value2, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单idNotBetween(String value1, String value2) {
            addCriterion("订单id not between", value1, value2, "订单id");
            return (Criteria) this;
        }

        public Criteria and订单编号IsNull() {
            addCriterion("订单编号 is null");
            return (Criteria) this;
        }

        public Criteria and订单编号IsNotNull() {
            addCriterion("订单编号 is not null");
            return (Criteria) this;
        }

        public Criteria and订单编号EqualTo(String value) {
            addCriterion("订单编号 =", value, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号NotEqualTo(String value) {
            addCriterion("订单编号 <>", value, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号GreaterThan(String value) {
            addCriterion("订单编号 >", value, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号GreaterThanOrEqualTo(String value) {
            addCriterion("订单编号 >=", value, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号LessThan(String value) {
            addCriterion("订单编号 <", value, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号LessThanOrEqualTo(String value) {
            addCriterion("订单编号 <=", value, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号Like(String value) {
            addCriterion("订单编号 like", value, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号NotLike(String value) {
            addCriterion("订单编号 not like", value, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号In(List<String> values) {
            addCriterion("订单编号 in", values, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号NotIn(List<String> values) {
            addCriterion("订单编号 not in", values, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号Between(String value1, String value2) {
            addCriterion("订单编号 between", value1, value2, "订单编号");
            return (Criteria) this;
        }

        public Criteria and订单编号NotBetween(String value1, String value2) {
            addCriterion("订单编号 not between", value1, value2, "订单编号");
            return (Criteria) this;
        }

        public Criteria andColumn6IsNull() {
            addCriterion("Column_6 is null");
            return (Criteria) this;
        }

        public Criteria andColumn6IsNotNull() {
            addCriterion("Column_6 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn6EqualTo(String value) {
            addCriterion("Column_6 =", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotEqualTo(String value) {
            addCriterion("Column_6 <>", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6GreaterThan(String value) {
            addCriterion("Column_6 >", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6GreaterThanOrEqualTo(String value) {
            addCriterion("Column_6 >=", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6LessThan(String value) {
            addCriterion("Column_6 <", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6LessThanOrEqualTo(String value) {
            addCriterion("Column_6 <=", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6Like(String value) {
            addCriterion("Column_6 like", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotLike(String value) {
            addCriterion("Column_6 not like", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6In(List<String> values) {
            addCriterion("Column_6 in", values, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotIn(List<String> values) {
            addCriterion("Column_6 not in", values, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6Between(String value1, String value2) {
            addCriterion("Column_6 between", value1, value2, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotBetween(String value1, String value2) {
            addCriterion("Column_6 not between", value1, value2, "column6");
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