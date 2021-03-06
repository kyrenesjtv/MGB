package com.gjp.example.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MonCarBalanceInfoExample extends BaseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    public MonCarBalanceInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDaka_idIsNull() {
            addCriterion("daka_id is null");
            return (Criteria) this;
        }

        public Criteria andDaka_idIsNotNull() {
            addCriterion("daka_id is not null");
            return (Criteria) this;
        }

        public Criteria andDaka_idEqualTo(Integer value) {
            addCriterion("daka_id =", value, "daka_id");
            return (Criteria) this;
        }

        public Criteria andDaka_idNotEqualTo(Integer value) {
            addCriterion("daka_id <>", value, "daka_id");
            return (Criteria) this;
        }

        public Criteria andDaka_idGreaterThan(Integer value) {
            addCriterion("daka_id >", value, "daka_id");
            return (Criteria) this;
        }

        public Criteria andDaka_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("daka_id >=", value, "daka_id");
            return (Criteria) this;
        }

        public Criteria andDaka_idLessThan(Integer value) {
            addCriterion("daka_id <", value, "daka_id");
            return (Criteria) this;
        }

        public Criteria andDaka_idLessThanOrEqualTo(Integer value) {
            addCriterion("daka_id <=", value, "daka_id");
            return (Criteria) this;
        }

        public Criteria andDaka_idIn(List<Integer> values) {
            addCriterion("daka_id in", values, "daka_id");
            return (Criteria) this;
        }

        public Criteria andDaka_idNotIn(List<Integer> values) {
            addCriterion("daka_id not in", values, "daka_id");
            return (Criteria) this;
        }

        public Criteria andDaka_idBetween(Integer value1, Integer value2) {
            addCriterion("daka_id between", value1, value2, "daka_id");
            return (Criteria) this;
        }

        public Criteria andDaka_idNotBetween(Integer value1, Integer value2) {
            addCriterion("daka_id not between", value1, value2, "daka_id");
            return (Criteria) this;
        }

        public Criteria andBalance_stateIsNull() {
            addCriterion("balance_state is null");
            return (Criteria) this;
        }

        public Criteria andBalance_stateIsNotNull() {
            addCriterion("balance_state is not null");
            return (Criteria) this;
        }

        public Criteria andBalance_stateEqualTo(Integer value) {
            addCriterion("balance_state =", value, "balance_state");
            return (Criteria) this;
        }

        public Criteria andBalance_stateNotEqualTo(Integer value) {
            addCriterion("balance_state <>", value, "balance_state");
            return (Criteria) this;
        }

        public Criteria andBalance_stateGreaterThan(Integer value) {
            addCriterion("balance_state >", value, "balance_state");
            return (Criteria) this;
        }

        public Criteria andBalance_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_state >=", value, "balance_state");
            return (Criteria) this;
        }

        public Criteria andBalance_stateLessThan(Integer value) {
            addCriterion("balance_state <", value, "balance_state");
            return (Criteria) this;
        }

        public Criteria andBalance_stateLessThanOrEqualTo(Integer value) {
            addCriterion("balance_state <=", value, "balance_state");
            return (Criteria) this;
        }

        public Criteria andBalance_stateIn(List<Integer> values) {
            addCriterion("balance_state in", values, "balance_state");
            return (Criteria) this;
        }

        public Criteria andBalance_stateNotIn(List<Integer> values) {
            addCriterion("balance_state not in", values, "balance_state");
            return (Criteria) this;
        }

        public Criteria andBalance_stateBetween(Integer value1, Integer value2) {
            addCriterion("balance_state between", value1, value2, "balance_state");
            return (Criteria) this;
        }

        public Criteria andBalance_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_state not between", value1, value2, "balance_state");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentIsNull() {
            addCriterion("balance_payment is null");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentIsNotNull() {
            addCriterion("balance_payment is not null");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentEqualTo(BigDecimal value) {
            addCriterion("balance_payment =", value, "balance_payment");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentNotEqualTo(BigDecimal value) {
            addCriterion("balance_payment <>", value, "balance_payment");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentGreaterThan(BigDecimal value) {
            addCriterion("balance_payment >", value, "balance_payment");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_payment >=", value, "balance_payment");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentLessThan(BigDecimal value) {
            addCriterion("balance_payment <", value, "balance_payment");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_payment <=", value, "balance_payment");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentIn(List<BigDecimal> values) {
            addCriterion("balance_payment in", values, "balance_payment");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentNotIn(List<BigDecimal> values) {
            addCriterion("balance_payment not in", values, "balance_payment");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_payment between", value1, value2, "balance_payment");
            return (Criteria) this;
        }

        public Criteria andBalance_paymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_payment not between", value1, value2, "balance_payment");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateIsNull() {
            addCriterion("balance_billing_state is null");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateIsNotNull() {
            addCriterion("balance_billing_state is not null");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateEqualTo(Integer value) {
            addCriterion("balance_billing_state =", value, "balance_billing_state");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateNotEqualTo(Integer value) {
            addCriterion("balance_billing_state <>", value, "balance_billing_state");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateGreaterThan(Integer value) {
            addCriterion("balance_billing_state >", value, "balance_billing_state");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_billing_state >=", value, "balance_billing_state");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateLessThan(Integer value) {
            addCriterion("balance_billing_state <", value, "balance_billing_state");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateLessThanOrEqualTo(Integer value) {
            addCriterion("balance_billing_state <=", value, "balance_billing_state");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateIn(List<Integer> values) {
            addCriterion("balance_billing_state in", values, "balance_billing_state");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateNotIn(List<Integer> values) {
            addCriterion("balance_billing_state not in", values, "balance_billing_state");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateBetween(Integer value1, Integer value2) {
            addCriterion("balance_billing_state between", value1, value2, "balance_billing_state");
            return (Criteria) this;
        }

        public Criteria andBalance_billing_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_billing_state not between", value1, value2, "balance_billing_state");
            return (Criteria) this;
        }

        public Criteria andBalance_timeIsNull() {
            addCriterion("balance_time is null");
            return (Criteria) this;
        }

        public Criteria andBalance_timeIsNotNull() {
            addCriterion("balance_time is not null");
            return (Criteria) this;
        }

        public Criteria andBalance_timeEqualTo(Date value) {
            addCriterion("balance_time =", value, "balance_time");
            return (Criteria) this;
        }

        public Criteria andBalance_timeNotEqualTo(Date value) {
            addCriterion("balance_time <>", value, "balance_time");
            return (Criteria) this;
        }

        public Criteria andBalance_timeGreaterThan(Date value) {
            addCriterion("balance_time >", value, "balance_time");
            return (Criteria) this;
        }

        public Criteria andBalance_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("balance_time >=", value, "balance_time");
            return (Criteria) this;
        }

        public Criteria andBalance_timeLessThan(Date value) {
            addCriterion("balance_time <", value, "balance_time");
            return (Criteria) this;
        }

        public Criteria andBalance_timeLessThanOrEqualTo(Date value) {
            addCriterion("balance_time <=", value, "balance_time");
            return (Criteria) this;
        }

        public Criteria andBalance_timeIn(List<Date> values) {
            addCriterion("balance_time in", values, "balance_time");
            return (Criteria) this;
        }

        public Criteria andBalance_timeNotIn(List<Date> values) {
            addCriterion("balance_time not in", values, "balance_time");
            return (Criteria) this;
        }

        public Criteria andBalance_timeBetween(Date value1, Date value2) {
            addCriterion("balance_time between", value1, value2, "balance_time");
            return (Criteria) this;
        }

        public Criteria andBalance_timeNotBetween(Date value1, Date value2) {
            addCriterion("balance_time not between", value1, value2, "balance_time");
            return (Criteria) this;
        }

        public Criteria andCity_codeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCity_codeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCity_codeEqualTo(String value) {
            addCriterion("city_code =", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeGreaterThan(String value) {
            addCriterion("city_code >", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeLessThan(String value) {
            addCriterion("city_code <", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeLike(String value) {
            addCriterion("city_code like", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeNotLike(String value) {
            addCriterion("city_code not like", value, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeIn(List<String> values) {
            addCriterion("city_code in", values, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "city_code");
            return (Criteria) this;
        }

        public Criteria andCity_codeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "city_code");
            return (Criteria) this;
        }

        public Criteria andOld_idIsNull() {
            addCriterion("old_id is null");
            return (Criteria) this;
        }

        public Criteria andOld_idIsNotNull() {
            addCriterion("old_id is not null");
            return (Criteria) this;
        }

        public Criteria andOld_idEqualTo(Long value) {
            addCriterion("old_id =", value, "old_id");
            return (Criteria) this;
        }

        public Criteria andOld_idNotEqualTo(Long value) {
            addCriterion("old_id <>", value, "old_id");
            return (Criteria) this;
        }

        public Criteria andOld_idGreaterThan(Long value) {
            addCriterion("old_id >", value, "old_id");
            return (Criteria) this;
        }

        public Criteria andOld_idGreaterThanOrEqualTo(Long value) {
            addCriterion("old_id >=", value, "old_id");
            return (Criteria) this;
        }

        public Criteria andOld_idLessThan(Long value) {
            addCriterion("old_id <", value, "old_id");
            return (Criteria) this;
        }

        public Criteria andOld_idLessThanOrEqualTo(Long value) {
            addCriterion("old_id <=", value, "old_id");
            return (Criteria) this;
        }

        public Criteria andOld_idIn(List<Long> values) {
            addCriterion("old_id in", values, "old_id");
            return (Criteria) this;
        }

        public Criteria andOld_idNotIn(List<Long> values) {
            addCriterion("old_id not in", values, "old_id");
            return (Criteria) this;
        }

        public Criteria andOld_idBetween(Long value1, Long value2) {
            addCriterion("old_id between", value1, value2, "old_id");
            return (Criteria) this;
        }

        public Criteria andOld_idNotBetween(Long value1, Long value2) {
            addCriterion("old_id not between", value1, value2, "old_id");
            return (Criteria) this;
        }

        public Criteria andSyna_timeIsNull() {
            addCriterion("syna_time is null");
            return (Criteria) this;
        }

        public Criteria andSyna_timeIsNotNull() {
            addCriterion("syna_time is not null");
            return (Criteria) this;
        }

        public Criteria andSyna_timeEqualTo(Date value) {
            addCriterion("syna_time =", value, "syna_time");
            return (Criteria) this;
        }

        public Criteria andSyna_timeNotEqualTo(Date value) {
            addCriterion("syna_time <>", value, "syna_time");
            return (Criteria) this;
        }

        public Criteria andSyna_timeGreaterThan(Date value) {
            addCriterion("syna_time >", value, "syna_time");
            return (Criteria) this;
        }

        public Criteria andSyna_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("syna_time >=", value, "syna_time");
            return (Criteria) this;
        }

        public Criteria andSyna_timeLessThan(Date value) {
            addCriterion("syna_time <", value, "syna_time");
            return (Criteria) this;
        }

        public Criteria andSyna_timeLessThanOrEqualTo(Date value) {
            addCriterion("syna_time <=", value, "syna_time");
            return (Criteria) this;
        }

        public Criteria andSyna_timeIn(List<Date> values) {
            addCriterion("syna_time in", values, "syna_time");
            return (Criteria) this;
        }

        public Criteria andSyna_timeNotIn(List<Date> values) {
            addCriterion("syna_time not in", values, "syna_time");
            return (Criteria) this;
        }

        public Criteria andSyna_timeBetween(Date value1, Date value2) {
            addCriterion("syna_time between", value1, value2, "syna_time");
            return (Criteria) this;
        }

        public Criteria andSyna_timeNotBetween(Date value1, Date value2) {
            addCriterion("syna_time not between", value1, value2, "syna_time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated do_not_delete_during_merge Sat Sep 29 16:11:36 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table mon_car_balance_info
     *
     * @mbggenerated Sat Sep 29 16:11:36 CST 2018
     */
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