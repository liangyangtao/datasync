package com.kf.data.mybatis.entity.online;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NeeqCompanyExecutiveResumeOnlineExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    public NeeqCompanyExecutiveResumeOnlineExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
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
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
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

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(String value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(String value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(String value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(String value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(String value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLike(String value) {
            addCriterion("person_id like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotLike(String value) {
            addCriterion("person_id not like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<String> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<String> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(String value1, String value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(String value1, String value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andDtStartIsNull() {
            addCriterion("dt_start is null");
            return (Criteria) this;
        }

        public Criteria andDtStartIsNotNull() {
            addCriterion("dt_start is not null");
            return (Criteria) this;
        }

        public Criteria andDtStartEqualTo(Date value) {
            addCriterionForJDBCDate("dt_start =", value, "dtStart");
            return (Criteria) this;
        }

        public Criteria andDtStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("dt_start <>", value, "dtStart");
            return (Criteria) this;
        }

        public Criteria andDtStartGreaterThan(Date value) {
            addCriterionForJDBCDate("dt_start >", value, "dtStart");
            return (Criteria) this;
        }

        public Criteria andDtStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_start >=", value, "dtStart");
            return (Criteria) this;
        }

        public Criteria andDtStartLessThan(Date value) {
            addCriterionForJDBCDate("dt_start <", value, "dtStart");
            return (Criteria) this;
        }

        public Criteria andDtStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_start <=", value, "dtStart");
            return (Criteria) this;
        }

        public Criteria andDtStartIn(List<Date> values) {
            addCriterionForJDBCDate("dt_start in", values, "dtStart");
            return (Criteria) this;
        }

        public Criteria andDtStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("dt_start not in", values, "dtStart");
            return (Criteria) this;
        }

        public Criteria andDtStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_start between", value1, value2, "dtStart");
            return (Criteria) this;
        }

        public Criteria andDtStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_start not between", value1, value2, "dtStart");
            return (Criteria) this;
        }

        public Criteria andDtEndIsNull() {
            addCriterion("dt_end is null");
            return (Criteria) this;
        }

        public Criteria andDtEndIsNotNull() {
            addCriterion("dt_end is not null");
            return (Criteria) this;
        }

        public Criteria andDtEndEqualTo(Date value) {
            addCriterionForJDBCDate("dt_end =", value, "dtEnd");
            return (Criteria) this;
        }

        public Criteria andDtEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("dt_end <>", value, "dtEnd");
            return (Criteria) this;
        }

        public Criteria andDtEndGreaterThan(Date value) {
            addCriterionForJDBCDate("dt_end >", value, "dtEnd");
            return (Criteria) this;
        }

        public Criteria andDtEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_end >=", value, "dtEnd");
            return (Criteria) this;
        }

        public Criteria andDtEndLessThan(Date value) {
            addCriterionForJDBCDate("dt_end <", value, "dtEnd");
            return (Criteria) this;
        }

        public Criteria andDtEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_end <=", value, "dtEnd");
            return (Criteria) this;
        }

        public Criteria andDtEndIn(List<Date> values) {
            addCriterionForJDBCDate("dt_end in", values, "dtEnd");
            return (Criteria) this;
        }

        public Criteria andDtEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("dt_end not in", values, "dtEnd");
            return (Criteria) this;
        }

        public Criteria andDtEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_end between", value1, value2, "dtEnd");
            return (Criteria) this;
        }

        public Criteria andDtEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_end not between", value1, value2, "dtEnd");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andDtReportIsNull() {
            addCriterion("dt_report is null");
            return (Criteria) this;
        }

        public Criteria andDtReportIsNotNull() {
            addCriterion("dt_report is not null");
            return (Criteria) this;
        }

        public Criteria andDtReportEqualTo(Date value) {
            addCriterionForJDBCDate("dt_report =", value, "dtReport");
            return (Criteria) this;
        }

        public Criteria andDtReportNotEqualTo(Date value) {
            addCriterionForJDBCDate("dt_report <>", value, "dtReport");
            return (Criteria) this;
        }

        public Criteria andDtReportGreaterThan(Date value) {
            addCriterionForJDBCDate("dt_report >", value, "dtReport");
            return (Criteria) this;
        }

        public Criteria andDtReportGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_report >=", value, "dtReport");
            return (Criteria) this;
        }

        public Criteria andDtReportLessThan(Date value) {
            addCriterionForJDBCDate("dt_report <", value, "dtReport");
            return (Criteria) this;
        }

        public Criteria andDtReportLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_report <=", value, "dtReport");
            return (Criteria) this;
        }

        public Criteria andDtReportIn(List<Date> values) {
            addCriterionForJDBCDate("dt_report in", values, "dtReport");
            return (Criteria) this;
        }

        public Criteria andDtReportNotIn(List<Date> values) {
            addCriterionForJDBCDate("dt_report not in", values, "dtReport");
            return (Criteria) this;
        }

        public Criteria andDtReportBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_report between", value1, value2, "dtReport");
            return (Criteria) this;
        }

        public Criteria andDtReportNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_report not between", value1, value2, "dtReport");
            return (Criteria) this;
        }

        public Criteria andPersonTitleIsNull() {
            addCriterion("person_title is null");
            return (Criteria) this;
        }

        public Criteria andPersonTitleIsNotNull() {
            addCriterion("person_title is not null");
            return (Criteria) this;
        }

        public Criteria andPersonTitleEqualTo(String value) {
            addCriterion("person_title =", value, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleNotEqualTo(String value) {
            addCriterion("person_title <>", value, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleGreaterThan(String value) {
            addCriterion("person_title >", value, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleGreaterThanOrEqualTo(String value) {
            addCriterion("person_title >=", value, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleLessThan(String value) {
            addCriterion("person_title <", value, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleLessThanOrEqualTo(String value) {
            addCriterion("person_title <=", value, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleLike(String value) {
            addCriterion("person_title like", value, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleNotLike(String value) {
            addCriterion("person_title not like", value, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleIn(List<String> values) {
            addCriterion("person_title in", values, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleNotIn(List<String> values) {
            addCriterion("person_title not in", values, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleBetween(String value1, String value2) {
            addCriterion("person_title between", value1, value2, "personTitle");
            return (Criteria) this;
        }

        public Criteria andPersonTitleNotBetween(String value1, String value2) {
            addCriterion("person_title not between", value1, value2, "personTitle");
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
     * This class corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 14 17:12:39 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table neeq_company_executive_resume
     *
     * @mbggenerated Wed Mar 14 17:12:39 CST 2018
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