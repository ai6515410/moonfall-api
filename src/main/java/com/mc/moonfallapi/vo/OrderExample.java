package com.mc.moonfallapi.vo;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria and店铺idIsNull() {
            addCriterion("店铺id is null");
            return (Criteria) this;
        }

        public Criteria and店铺idIsNotNull() {
            addCriterion("店铺id is not null");
            return (Criteria) this;
        }

        public Criteria and店铺idEqualTo(String value) {
            addCriterion("店铺id =", value, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idNotEqualTo(String value) {
            addCriterion("店铺id <>", value, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idGreaterThan(String value) {
            addCriterion("店铺id >", value, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idGreaterThanOrEqualTo(String value) {
            addCriterion("店铺id >=", value, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idLessThan(String value) {
            addCriterion("店铺id <", value, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idLessThanOrEqualTo(String value) {
            addCriterion("店铺id <=", value, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idLike(String value) {
            addCriterion("店铺id like", value, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idNotLike(String value) {
            addCriterion("店铺id not like", value, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idIn(List<String> values) {
            addCriterion("店铺id in", values, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idNotIn(List<String> values) {
            addCriterion("店铺id not in", values, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idBetween(String value1, String value2) {
            addCriterion("店铺id between", value1, value2, "店铺id");
            return (Criteria) this;
        }

        public Criteria and店铺idNotBetween(String value1, String value2) {
            addCriterion("店铺id not between", value1, value2, "店铺id");
            return (Criteria) this;
        }

        public Criteria and用户idIsNull() {
            addCriterion("用户id is null");
            return (Criteria) this;
        }

        public Criteria and用户idIsNotNull() {
            addCriterion("用户id is not null");
            return (Criteria) this;
        }

        public Criteria and用户idEqualTo(String value) {
            addCriterion("用户id =", value, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idNotEqualTo(String value) {
            addCriterion("用户id <>", value, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idGreaterThan(String value) {
            addCriterion("用户id >", value, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idGreaterThanOrEqualTo(String value) {
            addCriterion("用户id >=", value, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idLessThan(String value) {
            addCriterion("用户id <", value, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idLessThanOrEqualTo(String value) {
            addCriterion("用户id <=", value, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idLike(String value) {
            addCriterion("用户id like", value, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idNotLike(String value) {
            addCriterion("用户id not like", value, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idIn(List<String> values) {
            addCriterion("用户id in", values, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idNotIn(List<String> values) {
            addCriterion("用户id not in", values, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idBetween(String value1, String value2) {
            addCriterion("用户id between", value1, value2, "用户id");
            return (Criteria) this;
        }

        public Criteria and用户idNotBetween(String value1, String value2) {
            addCriterion("用户id not between", value1, value2, "用户id");
            return (Criteria) this;
        }

        public Criteria and订单类型IsNull() {
            addCriterion("订单类型 is null");
            return (Criteria) this;
        }

        public Criteria and订单类型IsNotNull() {
            addCriterion("订单类型 is not null");
            return (Criteria) this;
        }

        public Criteria and订单类型EqualTo(String value) {
            addCriterion("订单类型 =", value, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型NotEqualTo(String value) {
            addCriterion("订单类型 <>", value, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型GreaterThan(String value) {
            addCriterion("订单类型 >", value, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型GreaterThanOrEqualTo(String value) {
            addCriterion("订单类型 >=", value, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型LessThan(String value) {
            addCriterion("订单类型 <", value, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型LessThanOrEqualTo(String value) {
            addCriterion("订单类型 <=", value, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型Like(String value) {
            addCriterion("订单类型 like", value, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型NotLike(String value) {
            addCriterion("订单类型 not like", value, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型In(List<String> values) {
            addCriterion("订单类型 in", values, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型NotIn(List<String> values) {
            addCriterion("订单类型 not in", values, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型Between(String value1, String value2) {
            addCriterion("订单类型 between", value1, value2, "订单类型");
            return (Criteria) this;
        }

        public Criteria and订单类型NotBetween(String value1, String value2) {
            addCriterion("订单类型 not between", value1, value2, "订单类型");
            return (Criteria) this;
        }

        public Criteria and金额总数IsNull() {
            addCriterion("金额总数 is null");
            return (Criteria) this;
        }

        public Criteria and金额总数IsNotNull() {
            addCriterion("金额总数 is not null");
            return (Criteria) this;
        }

        public Criteria and金额总数EqualTo(String value) {
            addCriterion("金额总数 =", value, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数NotEqualTo(String value) {
            addCriterion("金额总数 <>", value, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数GreaterThan(String value) {
            addCriterion("金额总数 >", value, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数GreaterThanOrEqualTo(String value) {
            addCriterion("金额总数 >=", value, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数LessThan(String value) {
            addCriterion("金额总数 <", value, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数LessThanOrEqualTo(String value) {
            addCriterion("金额总数 <=", value, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数Like(String value) {
            addCriterion("金额总数 like", value, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数NotLike(String value) {
            addCriterion("金额总数 not like", value, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数In(List<String> values) {
            addCriterion("金额总数 in", values, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数NotIn(List<String> values) {
            addCriterion("金额总数 not in", values, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数Between(String value1, String value2) {
            addCriterion("金额总数 between", value1, value2, "金额总数");
            return (Criteria) this;
        }

        public Criteria and金额总数NotBetween(String value1, String value2) {
            addCriterion("金额总数 not between", value1, value2, "金额总数");
            return (Criteria) this;
        }

        public Criteria and创建时间IsNull() {
            addCriterion("创建时间 is null");
            return (Criteria) this;
        }

        public Criteria and创建时间IsNotNull() {
            addCriterion("创建时间 is not null");
            return (Criteria) this;
        }

        public Criteria and创建时间EqualTo(String value) {
            addCriterion("创建时间 =", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间NotEqualTo(String value) {
            addCriterion("创建时间 <>", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间GreaterThan(String value) {
            addCriterion("创建时间 >", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间GreaterThanOrEqualTo(String value) {
            addCriterion("创建时间 >=", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间LessThan(String value) {
            addCriterion("创建时间 <", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间LessThanOrEqualTo(String value) {
            addCriterion("创建时间 <=", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间Like(String value) {
            addCriterion("创建时间 like", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间NotLike(String value) {
            addCriterion("创建时间 not like", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间In(List<String> values) {
            addCriterion("创建时间 in", values, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间NotIn(List<String> values) {
            addCriterion("创建时间 not in", values, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间Between(String value1, String value2) {
            addCriterion("创建时间 between", value1, value2, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间NotBetween(String value1, String value2) {
            addCriterion("创建时间 not between", value1, value2, "创建时间");
            return (Criteria) this;
        }

        public Criteria and更新时间IsNull() {
            addCriterion("更新时间 is null");
            return (Criteria) this;
        }

        public Criteria and更新时间IsNotNull() {
            addCriterion("更新时间 is not null");
            return (Criteria) this;
        }

        public Criteria and更新时间EqualTo(String value) {
            addCriterion("更新时间 =", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间NotEqualTo(String value) {
            addCriterion("更新时间 <>", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间GreaterThan(String value) {
            addCriterion("更新时间 >", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间GreaterThanOrEqualTo(String value) {
            addCriterion("更新时间 >=", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间LessThan(String value) {
            addCriterion("更新时间 <", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间LessThanOrEqualTo(String value) {
            addCriterion("更新时间 <=", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间Like(String value) {
            addCriterion("更新时间 like", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间NotLike(String value) {
            addCriterion("更新时间 not like", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间In(List<String> values) {
            addCriterion("更新时间 in", values, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间NotIn(List<String> values) {
            addCriterion("更新时间 not in", values, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间Between(String value1, String value2) {
            addCriterion("更新时间 between", value1, value2, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间NotBetween(String value1, String value2) {
            addCriterion("更新时间 not between", value1, value2, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新人IsNull() {
            addCriterion("更新人 is null");
            return (Criteria) this;
        }

        public Criteria and更新人IsNotNull() {
            addCriterion("更新人 is not null");
            return (Criteria) this;
        }

        public Criteria and更新人EqualTo(String value) {
            addCriterion("更新人 =", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人NotEqualTo(String value) {
            addCriterion("更新人 <>", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人GreaterThan(String value) {
            addCriterion("更新人 >", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人GreaterThanOrEqualTo(String value) {
            addCriterion("更新人 >=", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人LessThan(String value) {
            addCriterion("更新人 <", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人LessThanOrEqualTo(String value) {
            addCriterion("更新人 <=", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人Like(String value) {
            addCriterion("更新人 like", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人NotLike(String value) {
            addCriterion("更新人 not like", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人In(List<String> values) {
            addCriterion("更新人 in", values, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人NotIn(List<String> values) {
            addCriterion("更新人 not in", values, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人Between(String value1, String value2) {
            addCriterion("更新人 between", value1, value2, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人NotBetween(String value1, String value2) {
            addCriterion("更新人 not between", value1, value2, "更新人");
            return (Criteria) this;
        }

        public Criteria and订单状态IsNull() {
            addCriterion("订单状态 is null");
            return (Criteria) this;
        }

        public Criteria and订单状态IsNotNull() {
            addCriterion("订单状态 is not null");
            return (Criteria) this;
        }

        public Criteria and订单状态EqualTo(String value) {
            addCriterion("订单状态 =", value, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态NotEqualTo(String value) {
            addCriterion("订单状态 <>", value, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态GreaterThan(String value) {
            addCriterion("订单状态 >", value, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态GreaterThanOrEqualTo(String value) {
            addCriterion("订单状态 >=", value, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态LessThan(String value) {
            addCriterion("订单状态 <", value, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态LessThanOrEqualTo(String value) {
            addCriterion("订单状态 <=", value, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态Like(String value) {
            addCriterion("订单状态 like", value, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态NotLike(String value) {
            addCriterion("订单状态 not like", value, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态In(List<String> values) {
            addCriterion("订单状态 in", values, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态NotIn(List<String> values) {
            addCriterion("订单状态 not in", values, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态Between(String value1, String value2) {
            addCriterion("订单状态 between", value1, value2, "订单状态");
            return (Criteria) this;
        }

        public Criteria and订单状态NotBetween(String value1, String value2) {
            addCriterion("订单状态 not between", value1, value2, "订单状态");
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