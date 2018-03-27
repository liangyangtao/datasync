package com.kf.data.mybatis.entity.online;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NeeqSecompanyMarketMakingHisOnlineExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    public NeeqSecompanyMarketMakingHisOnlineExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
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
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
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

        public Criteria andSecompanyIdIsNull() {
            addCriterion("secompany_id is null");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdIsNotNull() {
            addCriterion("secompany_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdEqualTo(String value) {
            addCriterion("secompany_id =", value, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdNotEqualTo(String value) {
            addCriterion("secompany_id <>", value, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdGreaterThan(String value) {
            addCriterion("secompany_id >", value, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("secompany_id >=", value, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdLessThan(String value) {
            addCriterion("secompany_id <", value, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdLessThanOrEqualTo(String value) {
            addCriterion("secompany_id <=", value, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdLike(String value) {
            addCriterion("secompany_id like", value, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdNotLike(String value) {
            addCriterion("secompany_id not like", value, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdIn(List<String> values) {
            addCriterion("secompany_id in", values, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdNotIn(List<String> values) {
            addCriterion("secompany_id not in", values, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdBetween(String value1, String value2) {
            addCriterion("secompany_id between", value1, value2, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyIdNotBetween(String value1, String value2) {
            addCriterion("secompany_id not between", value1, value2, "secompanyId");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameIsNull() {
            addCriterion("secompany_shortname is null");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameIsNotNull() {
            addCriterion("secompany_shortname is not null");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameEqualTo(String value) {
            addCriterion("secompany_shortname =", value, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameNotEqualTo(String value) {
            addCriterion("secompany_shortname <>", value, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameGreaterThan(String value) {
            addCriterion("secompany_shortname >", value, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("secompany_shortname >=", value, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameLessThan(String value) {
            addCriterion("secompany_shortname <", value, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameLessThanOrEqualTo(String value) {
            addCriterion("secompany_shortname <=", value, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameLike(String value) {
            addCriterion("secompany_shortname like", value, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameNotLike(String value) {
            addCriterion("secompany_shortname not like", value, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameIn(List<String> values) {
            addCriterion("secompany_shortname in", values, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameNotIn(List<String> values) {
            addCriterion("secompany_shortname not in", values, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameBetween(String value1, String value2) {
            addCriterion("secompany_shortname between", value1, value2, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyShortnameNotBetween(String value1, String value2) {
            addCriterion("secompany_shortname not between", value1, value2, "secompanyShortname");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameIsNull() {
            addCriterion("secompany_name is null");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameIsNotNull() {
            addCriterion("secompany_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameEqualTo(String value) {
            addCriterion("secompany_name =", value, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameNotEqualTo(String value) {
            addCriterion("secompany_name <>", value, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameGreaterThan(String value) {
            addCriterion("secompany_name >", value, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("secompany_name >=", value, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameLessThan(String value) {
            addCriterion("secompany_name <", value, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameLessThanOrEqualTo(String value) {
            addCriterion("secompany_name <=", value, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameLike(String value) {
            addCriterion("secompany_name like", value, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameNotLike(String value) {
            addCriterion("secompany_name not like", value, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameIn(List<String> values) {
            addCriterion("secompany_name in", values, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameNotIn(List<String> values) {
            addCriterion("secompany_name not in", values, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameBetween(String value1, String value2) {
            addCriterion("secompany_name between", value1, value2, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andSecompanyNameNotBetween(String value1, String value2) {
            addCriterion("secompany_name not between", value1, value2, "secompanyName");
            return (Criteria) this;
        }

        public Criteria andDateMachineIsNull() {
            addCriterion("date_machine is null");
            return (Criteria) this;
        }

        public Criteria andDateMachineIsNotNull() {
            addCriterion("date_machine is not null");
            return (Criteria) this;
        }

        public Criteria andDateMachineEqualTo(Integer value) {
            addCriterion("date_machine =", value, "dateMachine");
            return (Criteria) this;
        }

        public Criteria andDateMachineNotEqualTo(Integer value) {
            addCriterion("date_machine <>", value, "dateMachine");
            return (Criteria) this;
        }

        public Criteria andDateMachineGreaterThan(Integer value) {
            addCriterion("date_machine >", value, "dateMachine");
            return (Criteria) this;
        }

        public Criteria andDateMachineGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_machine >=", value, "dateMachine");
            return (Criteria) this;
        }

        public Criteria andDateMachineLessThan(Integer value) {
            addCriterion("date_machine <", value, "dateMachine");
            return (Criteria) this;
        }

        public Criteria andDateMachineLessThanOrEqualTo(Integer value) {
            addCriterion("date_machine <=", value, "dateMachine");
            return (Criteria) this;
        }

        public Criteria andDateMachineIn(List<Integer> values) {
            addCriterion("date_machine in", values, "dateMachine");
            return (Criteria) this;
        }

        public Criteria andDateMachineNotIn(List<Integer> values) {
            addCriterion("date_machine not in", values, "dateMachine");
            return (Criteria) this;
        }

        public Criteria andDateMachineBetween(Integer value1, Integer value2) {
            addCriterion("date_machine between", value1, value2, "dateMachine");
            return (Criteria) this;
        }

        public Criteria andDateMachineNotBetween(Integer value1, Integer value2) {
            addCriterion("date_machine not between", value1, value2, "dateMachine");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("`date` like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("`date` not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("`number` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 23 11:19:07 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table neeq_secompany_market_making_his
     *
     * @mbggenerated Fri Mar 23 11:19:07 CST 2018
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