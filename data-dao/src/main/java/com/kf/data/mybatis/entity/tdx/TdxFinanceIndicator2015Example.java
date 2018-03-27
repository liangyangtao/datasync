package com.kf.data.mybatis.entity.tdx;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TdxFinanceIndicator2015Example {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	public TdxFinanceIndicator2015Example() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
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

		public Criteria andShortNameIsNull() {
			addCriterion("short_name is null");
			return (Criteria) this;
		}

		public Criteria andShortNameIsNotNull() {
			addCriterion("short_name is not null");
			return (Criteria) this;
		}

		public Criteria andShortNameEqualTo(String value) {
			addCriterion("short_name =", value, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameNotEqualTo(String value) {
			addCriterion("short_name <>", value, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameGreaterThan(String value) {
			addCriterion("short_name >", value, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameGreaterThanOrEqualTo(String value) {
			addCriterion("short_name >=", value, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameLessThan(String value) {
			addCriterion("short_name <", value, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameLessThanOrEqualTo(String value) {
			addCriterion("short_name <=", value, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameLike(String value) {
			addCriterion("short_name like", value, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameNotLike(String value) {
			addCriterion("short_name not like", value, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameIn(List<String> values) {
			addCriterion("short_name in", values, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameNotIn(List<String> values) {
			addCriterion("short_name not in", values, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameBetween(String value1, String value2) {
			addCriterion("short_name between", value1, value2, "shortName");
			return (Criteria) this;
		}

		public Criteria andShortNameNotBetween(String value1, String value2) {
			addCriterion("short_name not between", value1, value2, "shortName");
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

		public Criteria andFinDtIsNull() {
			addCriterion("fin_dt is null");
			return (Criteria) this;
		}

		public Criteria andFinDtIsNotNull() {
			addCriterion("fin_dt is not null");
			return (Criteria) this;
		}

		public Criteria andFinDtEqualTo(Date value) {
			addCriterionForJDBCDate("fin_dt =", value, "finDt");
			return (Criteria) this;
		}

		public Criteria andFinDtNotEqualTo(Date value) {
			addCriterionForJDBCDate("fin_dt <>", value, "finDt");
			return (Criteria) this;
		}

		public Criteria andFinDtGreaterThan(Date value) {
			addCriterionForJDBCDate("fin_dt >", value, "finDt");
			return (Criteria) this;
		}

		public Criteria andFinDtGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fin_dt >=", value, "finDt");
			return (Criteria) this;
		}

		public Criteria andFinDtLessThan(Date value) {
			addCriterionForJDBCDate("fin_dt <", value, "finDt");
			return (Criteria) this;
		}

		public Criteria andFinDtLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("fin_dt <=", value, "finDt");
			return (Criteria) this;
		}

		public Criteria andFinDtIn(List<Date> values) {
			addCriterionForJDBCDate("fin_dt in", values, "finDt");
			return (Criteria) this;
		}

		public Criteria andFinDtNotIn(List<Date> values) {
			addCriterionForJDBCDate("fin_dt not in", values, "finDt");
			return (Criteria) this;
		}

		public Criteria andFinDtBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fin_dt between", value1, value2, "finDt");
			return (Criteria) this;
		}

		public Criteria andFinDtNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("fin_dt not between", value1, value2, "finDt");
			return (Criteria) this;
		}

		public Criteria andFinClassNameIsNull() {
			addCriterion("fin_class_name is null");
			return (Criteria) this;
		}

		public Criteria andFinClassNameIsNotNull() {
			addCriterion("fin_class_name is not null");
			return (Criteria) this;
		}

		public Criteria andFinClassNameEqualTo(String value) {
			addCriterion("fin_class_name =", value, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameNotEqualTo(String value) {
			addCriterion("fin_class_name <>", value, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameGreaterThan(String value) {
			addCriterion("fin_class_name >", value, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameGreaterThanOrEqualTo(String value) {
			addCriterion("fin_class_name >=", value, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameLessThan(String value) {
			addCriterion("fin_class_name <", value, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameLessThanOrEqualTo(String value) {
			addCriterion("fin_class_name <=", value, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameLike(String value) {
			addCriterion("fin_class_name like", value, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameNotLike(String value) {
			addCriterion("fin_class_name not like", value, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameIn(List<String> values) {
			addCriterion("fin_class_name in", values, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameNotIn(List<String> values) {
			addCriterion("fin_class_name not in", values, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameBetween(String value1, String value2) {
			addCriterion("fin_class_name between", value1, value2, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinClassNameNotBetween(String value1, String value2) {
			addCriterion("fin_class_name not between", value1, value2, "finClassName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameIsNull() {
			addCriterion("fin_currency_name is null");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameIsNotNull() {
			addCriterion("fin_currency_name is not null");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameEqualTo(String value) {
			addCriterion("fin_currency_name =", value, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameNotEqualTo(String value) {
			addCriterion("fin_currency_name <>", value, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameGreaterThan(String value) {
			addCriterion("fin_currency_name >", value, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameGreaterThanOrEqualTo(String value) {
			addCriterion("fin_currency_name >=", value, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameLessThan(String value) {
			addCriterion("fin_currency_name <", value, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameLessThanOrEqualTo(String value) {
			addCriterion("fin_currency_name <=", value, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameLike(String value) {
			addCriterion("fin_currency_name like", value, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameNotLike(String value) {
			addCriterion("fin_currency_name not like", value, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameIn(List<String> values) {
			addCriterion("fin_currency_name in", values, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameNotIn(List<String> values) {
			addCriterion("fin_currency_name not in", values, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameBetween(String value1, String value2) {
			addCriterion("fin_currency_name between", value1, value2, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinCurrencyNameNotBetween(String value1, String value2) {
			addCriterion("fin_currency_name not between", value1, value2, "finCurrencyName");
			return (Criteria) this;
		}

		public Criteria andFinDataIsNull() {
			addCriterion("fin_data is null");
			return (Criteria) this;
		}

		public Criteria andFinDataIsNotNull() {
			addCriterion("fin_data is not null");
			return (Criteria) this;
		}

		public Criteria andFinDataEqualTo(Double value) {
			addCriterion("fin_data =", value, "finData");
			return (Criteria) this;
		}

		public Criteria andFinDataNotEqualTo(Double value) {
			addCriterion("fin_data <>", value, "finData");
			return (Criteria) this;
		}

		public Criteria andFinDataGreaterThan(Double value) {
			addCriterion("fin_data >", value, "finData");
			return (Criteria) this;
		}

		public Criteria andFinDataGreaterThanOrEqualTo(Double value) {
			addCriterion("fin_data >=", value, "finData");
			return (Criteria) this;
		}

		public Criteria andFinDataLessThan(Double value) {
			addCriterion("fin_data <", value, "finData");
			return (Criteria) this;
		}

		public Criteria andFinDataLessThanOrEqualTo(Double value) {
			addCriterion("fin_data <=", value, "finData");
			return (Criteria) this;
		}

		public Criteria andFinDataIn(List<Double> values) {
			addCriterion("fin_data in", values, "finData");
			return (Criteria) this;
		}

		public Criteria andFinDataNotIn(List<Double> values) {
			addCriterion("fin_data not in", values, "finData");
			return (Criteria) this;
		}

		public Criteria andFinDataBetween(Double value1, Double value2) {
			addCriterion("fin_data between", value1, value2, "finData");
			return (Criteria) this;
		}

		public Criteria andFinDataNotBetween(Double value1, Double value2) {
			addCriterion("fin_data not between", value1, value2, "finData");
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

		public Criteria andShowOrderIsNull() {
			addCriterion("show_order is null");
			return (Criteria) this;
		}

		public Criteria andShowOrderIsNotNull() {
			addCriterion("show_order is not null");
			return (Criteria) this;
		}

		public Criteria andShowOrderEqualTo(Integer value) {
			addCriterion("show_order =", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderNotEqualTo(Integer value) {
			addCriterion("show_order <>", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderGreaterThan(Integer value) {
			addCriterion("show_order >", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("show_order >=", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderLessThan(Integer value) {
			addCriterion("show_order <", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderLessThanOrEqualTo(Integer value) {
			addCriterion("show_order <=", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderIn(List<Integer> values) {
			addCriterion("show_order in", values, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderNotIn(List<Integer> values) {
			addCriterion("show_order not in", values, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderBetween(Integer value1, Integer value2) {
			addCriterion("show_order between", value1, value2, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("show_order not between", value1, value2, "showOrder");
			return (Criteria) this;
		}

		public Criteria andDimensionsIsNull() {
			addCriterion("dimensions is null");
			return (Criteria) this;
		}

		public Criteria andDimensionsIsNotNull() {
			addCriterion("dimensions is not null");
			return (Criteria) this;
		}

		public Criteria andDimensionsEqualTo(String value) {
			addCriterion("dimensions =", value, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsNotEqualTo(String value) {
			addCriterion("dimensions <>", value, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsGreaterThan(String value) {
			addCriterion("dimensions >", value, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsGreaterThanOrEqualTo(String value) {
			addCriterion("dimensions >=", value, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsLessThan(String value) {
			addCriterion("dimensions <", value, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsLessThanOrEqualTo(String value) {
			addCriterion("dimensions <=", value, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsLike(String value) {
			addCriterion("dimensions like", value, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsNotLike(String value) {
			addCriterion("dimensions not like", value, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsIn(List<String> values) {
			addCriterion("dimensions in", values, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsNotIn(List<String> values) {
			addCriterion("dimensions not in", values, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsBetween(String value1, String value2) {
			addCriterion("dimensions between", value1, value2, "dimensions");
			return (Criteria) this;
		}

		public Criteria andDimensionsNotBetween(String value1, String value2) {
			addCriterion("dimensions not between", value1, value2, "dimensions");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tdx_finance_indicator_2015
	 * @mbggenerated  Fri Mar 23 17:20:00 CST 2018
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tdx_finance_indicator_2015
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 23 17:16:26 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}