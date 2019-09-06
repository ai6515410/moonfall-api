package com.mc.moonfallapi.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andStoreNoIsNull() {
            addCriterion("store_no is null");
            return (Criteria) this;
        }

        public Criteria andStoreNoIsNotNull() {
            addCriterion("store_no is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNoEqualTo(String value) {
            addCriterion("store_no =", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotEqualTo(String value) {
            addCriterion("store_no <>", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoGreaterThan(String value) {
            addCriterion("store_no >", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoGreaterThanOrEqualTo(String value) {
            addCriterion("store_no >=", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoLessThan(String value) {
            addCriterion("store_no <", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoLessThanOrEqualTo(String value) {
            addCriterion("store_no <=", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoLike(String value) {
            addCriterion("store_no like", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotLike(String value) {
            addCriterion("store_no not like", value, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoIn(List<String> values) {
            addCriterion("store_no in", values, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotIn(List<String> values) {
            addCriterion("store_no not in", values, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoBetween(String value1, String value2) {
            addCriterion("store_no between", value1, value2, "storeNo");
            return (Criteria) this;
        }

        public Criteria andStoreNoNotBetween(String value1, String value2) {
            addCriterion("store_no not between", value1, value2, "storeNo");
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

        public Criteria andStoreAddressIsNull() {
            addCriterion("store_address is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIsNotNull() {
            addCriterion("store_address is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddressEqualTo(String value) {
            addCriterion("store_address =", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotEqualTo(String value) {
            addCriterion("store_address <>", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThan(String value) {
            addCriterion("store_address >", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressGreaterThanOrEqualTo(String value) {
            addCriterion("store_address >=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThan(String value) {
            addCriterion("store_address <", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLessThanOrEqualTo(String value) {
            addCriterion("store_address <=", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressLike(String value) {
            addCriterion("store_address like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotLike(String value) {
            addCriterion("store_address not like", value, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressIn(List<String> values) {
            addCriterion("store_address in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotIn(List<String> values) {
            addCriterion("store_address not in", values, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressBetween(String value1, String value2) {
            addCriterion("store_address between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStoreAddressNotBetween(String value1, String value2) {
            addCriterion("store_address not between", value1, value2, "storeAddress");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNull() {
            addCriterion("store_phone is null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIsNotNull() {
            addCriterion("store_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStorePhoneEqualTo(String value) {
            addCriterion("store_phone =", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotEqualTo(String value) {
            addCriterion("store_phone <>", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThan(String value) {
            addCriterion("store_phone >", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("store_phone >=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThan(String value) {
            addCriterion("store_phone <", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLessThanOrEqualTo(String value) {
            addCriterion("store_phone <=", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneLike(String value) {
            addCriterion("store_phone like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotLike(String value) {
            addCriterion("store_phone not like", value, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneIn(List<String> values) {
            addCriterion("store_phone in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotIn(List<String> values) {
            addCriterion("store_phone not in", values, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneBetween(String value1, String value2) {
            addCriterion("store_phone between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStorePhoneNotBetween(String value1, String value2) {
            addCriterion("store_phone not between", value1, value2, "storePhone");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyIsNull() {
            addCriterion("store_sale_qty is null");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyIsNotNull() {
            addCriterion("store_sale_qty is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyEqualTo(Integer value) {
            addCriterion("store_sale_qty =", value, "storeSaleQty");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyNotEqualTo(Integer value) {
            addCriterion("store_sale_qty <>", value, "storeSaleQty");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyGreaterThan(Integer value) {
            addCriterion("store_sale_qty >", value, "storeSaleQty");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_sale_qty >=", value, "storeSaleQty");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyLessThan(Integer value) {
            addCriterion("store_sale_qty <", value, "storeSaleQty");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyLessThanOrEqualTo(Integer value) {
            addCriterion("store_sale_qty <=", value, "storeSaleQty");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyIn(List<Integer> values) {
            addCriterion("store_sale_qty in", values, "storeSaleQty");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyNotIn(List<Integer> values) {
            addCriterion("store_sale_qty not in", values, "storeSaleQty");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyBetween(Integer value1, Integer value2) {
            addCriterion("store_sale_qty between", value1, value2, "storeSaleQty");
            return (Criteria) this;
        }

        public Criteria andStoreSaleQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("store_sale_qty not between", value1, value2, "storeSaleQty");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyIsNull() {
            addCriterion("store_guarantee_qty is null");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyIsNotNull() {
            addCriterion("store_guarantee_qty is not null");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyEqualTo(Integer value) {
            addCriterion("store_guarantee_qty =", value, "storeGuaranteeQty");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyNotEqualTo(Integer value) {
            addCriterion("store_guarantee_qty <>", value, "storeGuaranteeQty");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyGreaterThan(Integer value) {
            addCriterion("store_guarantee_qty >", value, "storeGuaranteeQty");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_guarantee_qty >=", value, "storeGuaranteeQty");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyLessThan(Integer value) {
            addCriterion("store_guarantee_qty <", value, "storeGuaranteeQty");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyLessThanOrEqualTo(Integer value) {
            addCriterion("store_guarantee_qty <=", value, "storeGuaranteeQty");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyIn(List<Integer> values) {
            addCriterion("store_guarantee_qty in", values, "storeGuaranteeQty");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyNotIn(List<Integer> values) {
            addCriterion("store_guarantee_qty not in", values, "storeGuaranteeQty");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyBetween(Integer value1, Integer value2) {
            addCriterion("store_guarantee_qty between", value1, value2, "storeGuaranteeQty");
            return (Criteria) this;
        }

        public Criteria andStoreGuaranteeQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("store_guarantee_qty not between", value1, value2, "storeGuaranteeQty");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyIsNull() {
            addCriterion("store_praise_qty is null");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyIsNotNull() {
            addCriterion("store_praise_qty is not null");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyEqualTo(Integer value) {
            addCriterion("store_praise_qty =", value, "storePraiseQty");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyNotEqualTo(Integer value) {
            addCriterion("store_praise_qty <>", value, "storePraiseQty");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyGreaterThan(Integer value) {
            addCriterion("store_praise_qty >", value, "storePraiseQty");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_praise_qty >=", value, "storePraiseQty");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyLessThan(Integer value) {
            addCriterion("store_praise_qty <", value, "storePraiseQty");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyLessThanOrEqualTo(Integer value) {
            addCriterion("store_praise_qty <=", value, "storePraiseQty");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyIn(List<Integer> values) {
            addCriterion("store_praise_qty in", values, "storePraiseQty");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyNotIn(List<Integer> values) {
            addCriterion("store_praise_qty not in", values, "storePraiseQty");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyBetween(Integer value1, Integer value2) {
            addCriterion("store_praise_qty between", value1, value2, "storePraiseQty");
            return (Criteria) this;
        }

        public Criteria andStorePraiseQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("store_praise_qty not between", value1, value2, "storePraiseQty");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeIsNull() {
            addCriterion("store_create_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeIsNotNull() {
            addCriterion("store_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("store_create_time =", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("store_create_time <>", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("store_create_time >", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("store_create_time >=", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("store_create_time <", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("store_create_time <=", value, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("store_create_time in", values, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("store_create_time not in", values, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("store_create_time between", value1, value2, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("store_create_time not between", value1, value2, "storeCreateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeIsNull() {
            addCriterion("store_update_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeIsNotNull() {
            addCriterion("store_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("store_update_time =", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("store_update_time <>", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("store_update_time >", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("store_update_time >=", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("store_update_time <", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("store_update_time <=", value, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("store_update_time in", values, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("store_update_time not in", values, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("store_update_time between", value1, value2, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("store_update_time not between", value1, value2, "storeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserIsNull() {
            addCriterion("store_create_user is null");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserIsNotNull() {
            addCriterion("store_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserEqualTo(String value) {
            addCriterion("store_create_user =", value, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserNotEqualTo(String value) {
            addCriterion("store_create_user <>", value, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserGreaterThan(String value) {
            addCriterion("store_create_user >", value, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("store_create_user >=", value, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserLessThan(String value) {
            addCriterion("store_create_user <", value, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserLessThanOrEqualTo(String value) {
            addCriterion("store_create_user <=", value, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserLike(String value) {
            addCriterion("store_create_user like", value, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserNotLike(String value) {
            addCriterion("store_create_user not like", value, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserIn(List<String> values) {
            addCriterion("store_create_user in", values, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserNotIn(List<String> values) {
            addCriterion("store_create_user not in", values, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserBetween(String value1, String value2) {
            addCriterion("store_create_user between", value1, value2, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreCreateUserNotBetween(String value1, String value2) {
            addCriterion("store_create_user not between", value1, value2, "storeCreateUser");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagIsNull() {
            addCriterion("store_delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagIsNotNull() {
            addCriterion("store_delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagEqualTo(Integer value) {
            addCriterion("store_delete_flag =", value, "storeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagNotEqualTo(Integer value) {
            addCriterion("store_delete_flag <>", value, "storeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagGreaterThan(Integer value) {
            addCriterion("store_delete_flag >", value, "storeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_delete_flag >=", value, "storeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagLessThan(Integer value) {
            addCriterion("store_delete_flag <", value, "storeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("store_delete_flag <=", value, "storeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagIn(List<Integer> values) {
            addCriterion("store_delete_flag in", values, "storeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagNotIn(List<Integer> values) {
            addCriterion("store_delete_flag not in", values, "storeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("store_delete_flag between", value1, value2, "storeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andStoreDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("store_delete_flag not between", value1, value2, "storeDeleteFlag");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgIsNull() {
            addCriterion("store_samll_avatar_img is null");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgIsNotNull() {
            addCriterion("store_samll_avatar_img is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgEqualTo(String value) {
            addCriterion("store_samll_avatar_img =", value, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgNotEqualTo(String value) {
            addCriterion("store_samll_avatar_img <>", value, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgGreaterThan(String value) {
            addCriterion("store_samll_avatar_img >", value, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgGreaterThanOrEqualTo(String value) {
            addCriterion("store_samll_avatar_img >=", value, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgLessThan(String value) {
            addCriterion("store_samll_avatar_img <", value, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgLessThanOrEqualTo(String value) {
            addCriterion("store_samll_avatar_img <=", value, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgLike(String value) {
            addCriterion("store_samll_avatar_img like", value, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgNotLike(String value) {
            addCriterion("store_samll_avatar_img not like", value, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgIn(List<String> values) {
            addCriterion("store_samll_avatar_img in", values, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgNotIn(List<String> values) {
            addCriterion("store_samll_avatar_img not in", values, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgBetween(String value1, String value2) {
            addCriterion("store_samll_avatar_img between", value1, value2, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreSamllAvatarImgNotBetween(String value1, String value2) {
            addCriterion("store_samll_avatar_img not between", value1, value2, "storeSamllAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgIsNull() {
            addCriterion("store_big_avatar_img is null");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgIsNotNull() {
            addCriterion("store_big_avatar_img is not null");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgEqualTo(String value) {
            addCriterion("store_big_avatar_img =", value, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgNotEqualTo(String value) {
            addCriterion("store_big_avatar_img <>", value, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgGreaterThan(String value) {
            addCriterion("store_big_avatar_img >", value, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgGreaterThanOrEqualTo(String value) {
            addCriterion("store_big_avatar_img >=", value, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgLessThan(String value) {
            addCriterion("store_big_avatar_img <", value, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgLessThanOrEqualTo(String value) {
            addCriterion("store_big_avatar_img <=", value, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgLike(String value) {
            addCriterion("store_big_avatar_img like", value, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgNotLike(String value) {
            addCriterion("store_big_avatar_img not like", value, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgIn(List<String> values) {
            addCriterion("store_big_avatar_img in", values, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgNotIn(List<String> values) {
            addCriterion("store_big_avatar_img not in", values, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgBetween(String value1, String value2) {
            addCriterion("store_big_avatar_img between", value1, value2, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreBigAvatarImgNotBetween(String value1, String value2) {
            addCriterion("store_big_avatar_img not between", value1, value2, "storeBigAvatarImg");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserIsNull() {
            addCriterion("store_update_user is null");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserIsNotNull() {
            addCriterion("store_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserEqualTo(String value) {
            addCriterion("store_update_user =", value, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserNotEqualTo(String value) {
            addCriterion("store_update_user <>", value, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserGreaterThan(String value) {
            addCriterion("store_update_user >", value, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("store_update_user >=", value, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserLessThan(String value) {
            addCriterion("store_update_user <", value, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("store_update_user <=", value, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserLike(String value) {
            addCriterion("store_update_user like", value, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserNotLike(String value) {
            addCriterion("store_update_user not like", value, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserIn(List<String> values) {
            addCriterion("store_update_user in", values, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserNotIn(List<String> values) {
            addCriterion("store_update_user not in", values, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserBetween(String value1, String value2) {
            addCriterion("store_update_user between", value1, value2, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreUpdateUserNotBetween(String value1, String value2) {
            addCriterion("store_update_user not between", value1, value2, "storeUpdateUser");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterIsNull() {
            addCriterion("store_is_foster is null");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterIsNotNull() {
            addCriterion("store_is_foster is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterEqualTo(Integer value) {
            addCriterion("store_is_foster =", value, "storeIsFoster");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterNotEqualTo(Integer value) {
            addCriterion("store_is_foster <>", value, "storeIsFoster");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterGreaterThan(Integer value) {
            addCriterion("store_is_foster >", value, "storeIsFoster");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_is_foster >=", value, "storeIsFoster");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterLessThan(Integer value) {
            addCriterion("store_is_foster <", value, "storeIsFoster");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterLessThanOrEqualTo(Integer value) {
            addCriterion("store_is_foster <=", value, "storeIsFoster");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterIn(List<Integer> values) {
            addCriterion("store_is_foster in", values, "storeIsFoster");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterNotIn(List<Integer> values) {
            addCriterion("store_is_foster not in", values, "storeIsFoster");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterBetween(Integer value1, Integer value2) {
            addCriterion("store_is_foster between", value1, value2, "storeIsFoster");
            return (Criteria) this;
        }

        public Criteria andStoreIsFosterNotBetween(Integer value1, Integer value2) {
            addCriterion("store_is_foster not between", value1, value2, "storeIsFoster");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIsNull() {
            addCriterion("store_type is null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIsNotNull() {
            addCriterion("store_type is not null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeEqualTo(Integer value) {
            addCriterion("store_type =", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeNotEqualTo(Integer value) {
            addCriterion("store_type <>", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeGreaterThan(Integer value) {
            addCriterion("store_type >", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_type >=", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeLessThan(Integer value) {
            addCriterion("store_type <", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeLessThanOrEqualTo(Integer value) {
            addCriterion("store_type <=", value, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIn(List<Integer> values) {
            addCriterion("store_type in", values, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeNotIn(List<Integer> values) {
            addCriterion("store_type not in", values, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeBetween(Integer value1, Integer value2) {
            addCriterion("store_type between", value1, value2, "storeType");
            return (Criteria) this;
        }

        public Criteria andStoreTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("store_type not between", value1, value2, "storeType");
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