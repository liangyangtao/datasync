package com.kf.data.mybatis.entity.tdx;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TdxCompanyExecutiveExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	public TdxCompanyExecutiveExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
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

		public Criteria andCompanyShortnameIsNull() {
			addCriterion("company_shortname is null");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameIsNotNull() {
			addCriterion("company_shortname is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameEqualTo(String value) {
			addCriterion("company_shortname =", value, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameNotEqualTo(String value) {
			addCriterion("company_shortname <>", value, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameGreaterThan(String value) {
			addCriterion("company_shortname >", value, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameGreaterThanOrEqualTo(String value) {
			addCriterion("company_shortname >=", value, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameLessThan(String value) {
			addCriterion("company_shortname <", value, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameLessThanOrEqualTo(String value) {
			addCriterion("company_shortname <=", value, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameLike(String value) {
			addCriterion("company_shortname like", value, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameNotLike(String value) {
			addCriterion("company_shortname not like", value, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameIn(List<String> values) {
			addCriterion("company_shortname in", values, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameNotIn(List<String> values) {
			addCriterion("company_shortname not in", values, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameBetween(String value1, String value2) {
			addCriterion("company_shortname between", value1, value2, "companyShortname");
			return (Criteria) this;
		}

		public Criteria andCompanyShortnameNotBetween(String value1, String value2) {
			addCriterion("company_shortname not between", value1, value2, "companyShortname");
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

		public Criteria andNameIsNull() {
			addCriterion("`name` is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("`name` is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("`name` =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("`name` <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("`name` >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("`name` >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("`name` <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("`name` <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("`name` like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("`name` not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("`name` in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("`name` not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("`name` between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("`name` not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNationalityIsNull() {
			addCriterion("nationality is null");
			return (Criteria) this;
		}

		public Criteria andNationalityIsNotNull() {
			addCriterion("nationality is not null");
			return (Criteria) this;
		}

		public Criteria andNationalityEqualTo(String value) {
			addCriterion("nationality =", value, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityNotEqualTo(String value) {
			addCriterion("nationality <>", value, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityGreaterThan(String value) {
			addCriterion("nationality >", value, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityGreaterThanOrEqualTo(String value) {
			addCriterion("nationality >=", value, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityLessThan(String value) {
			addCriterion("nationality <", value, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityLessThanOrEqualTo(String value) {
			addCriterion("nationality <=", value, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityLike(String value) {
			addCriterion("nationality like", value, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityNotLike(String value) {
			addCriterion("nationality not like", value, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityIn(List<String> values) {
			addCriterion("nationality in", values, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityNotIn(List<String> values) {
			addCriterion("nationality not in", values, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityBetween(String value1, String value2) {
			addCriterion("nationality between", value1, value2, "nationality");
			return (Criteria) this;
		}

		public Criteria andNationalityNotBetween(String value1, String value2) {
			addCriterion("nationality not between", value1, value2, "nationality");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andGenderIsNull() {
			addCriterion("gender is null");
			return (Criteria) this;
		}

		public Criteria andGenderIsNotNull() {
			addCriterion("gender is not null");
			return (Criteria) this;
		}

		public Criteria andGenderEqualTo(String value) {
			addCriterion("gender =", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotEqualTo(String value) {
			addCriterion("gender <>", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThan(String value) {
			addCriterion("gender >", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThanOrEqualTo(String value) {
			addCriterion("gender >=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThan(String value) {
			addCriterion("gender <", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThanOrEqualTo(String value) {
			addCriterion("gender <=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLike(String value) {
			addCriterion("gender like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotLike(String value) {
			addCriterion("gender not like", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderIn(List<String> values) {
			addCriterion("gender in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotIn(List<String> values) {
			addCriterion("gender not in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderBetween(String value1, String value2) {
			addCriterion("gender between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotBetween(String value1, String value2) {
			addCriterion("gender not between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andAgeIsNull() {
			addCriterion("age is null");
			return (Criteria) this;
		}

		public Criteria andAgeIsNotNull() {
			addCriterion("age is not null");
			return (Criteria) this;
		}

		public Criteria andAgeEqualTo(String value) {
			addCriterion("age =", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeNotEqualTo(String value) {
			addCriterion("age <>", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeGreaterThan(String value) {
			addCriterion("age >", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeGreaterThanOrEqualTo(String value) {
			addCriterion("age >=", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeLessThan(String value) {
			addCriterion("age <", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeLessThanOrEqualTo(String value) {
			addCriterion("age <=", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeLike(String value) {
			addCriterion("age like", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeNotLike(String value) {
			addCriterion("age not like", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeIn(List<String> values) {
			addCriterion("age in", values, "age");
			return (Criteria) this;
		}

		public Criteria andAgeNotIn(List<String> values) {
			addCriterion("age not in", values, "age");
			return (Criteria) this;
		}

		public Criteria andAgeBetween(String value1, String value2) {
			addCriterion("age between", value1, value2, "age");
			return (Criteria) this;
		}

		public Criteria andAgeNotBetween(String value1, String value2) {
			addCriterion("age not between", value1, value2, "age");
			return (Criteria) this;
		}

		public Criteria andEducationIsNull() {
			addCriterion("education is null");
			return (Criteria) this;
		}

		public Criteria andEducationIsNotNull() {
			addCriterion("education is not null");
			return (Criteria) this;
		}

		public Criteria andEducationEqualTo(String value) {
			addCriterion("education =", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationNotEqualTo(String value) {
			addCriterion("education <>", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationGreaterThan(String value) {
			addCriterion("education >", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationGreaterThanOrEqualTo(String value) {
			addCriterion("education >=", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationLessThan(String value) {
			addCriterion("education <", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationLessThanOrEqualTo(String value) {
			addCriterion("education <=", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationLike(String value) {
			addCriterion("education like", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationNotLike(String value) {
			addCriterion("education not like", value, "education");
			return (Criteria) this;
		}

		public Criteria andEducationIn(List<String> values) {
			addCriterion("education in", values, "education");
			return (Criteria) this;
		}

		public Criteria andEducationNotIn(List<String> values) {
			addCriterion("education not in", values, "education");
			return (Criteria) this;
		}

		public Criteria andEducationBetween(String value1, String value2) {
			addCriterion("education between", value1, value2, "education");
			return (Criteria) this;
		}

		public Criteria andEducationNotBetween(String value1, String value2) {
			addCriterion("education not between", value1, value2, "education");
			return (Criteria) this;
		}

		public Criteria andTermIsNull() {
			addCriterion("term is null");
			return (Criteria) this;
		}

		public Criteria andTermIsNotNull() {
			addCriterion("term is not null");
			return (Criteria) this;
		}

		public Criteria andTermEqualTo(String value) {
			addCriterion("term =", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermNotEqualTo(String value) {
			addCriterion("term <>", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermGreaterThan(String value) {
			addCriterion("term >", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermGreaterThanOrEqualTo(String value) {
			addCriterion("term >=", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermLessThan(String value) {
			addCriterion("term <", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermLessThanOrEqualTo(String value) {
			addCriterion("term <=", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermLike(String value) {
			addCriterion("term like", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermNotLike(String value) {
			addCriterion("term not like", value, "term");
			return (Criteria) this;
		}

		public Criteria andTermIn(List<String> values) {
			addCriterion("term in", values, "term");
			return (Criteria) this;
		}

		public Criteria andTermNotIn(List<String> values) {
			addCriterion("term not in", values, "term");
			return (Criteria) this;
		}

		public Criteria andTermBetween(String value1, String value2) {
			addCriterion("term between", value1, value2, "term");
			return (Criteria) this;
		}

		public Criteria andTermNotBetween(String value1, String value2) {
			addCriterion("term not between", value1, value2, "term");
			return (Criteria) this;
		}

		public Criteria andReportDateIsNull() {
			addCriterion("report_date is null");
			return (Criteria) this;
		}

		public Criteria andReportDateIsNotNull() {
			addCriterion("report_date is not null");
			return (Criteria) this;
		}

		public Criteria andReportDateEqualTo(Date value) {
			addCriterionForJDBCDate("report_date =", value, "reportDate");
			return (Criteria) this;
		}

		public Criteria andReportDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("report_date <>", value, "reportDate");
			return (Criteria) this;
		}

		public Criteria andReportDateGreaterThan(Date value) {
			addCriterionForJDBCDate("report_date >", value, "reportDate");
			return (Criteria) this;
		}

		public Criteria andReportDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("report_date >=", value, "reportDate");
			return (Criteria) this;
		}

		public Criteria andReportDateLessThan(Date value) {
			addCriterionForJDBCDate("report_date <", value, "reportDate");
			return (Criteria) this;
		}

		public Criteria andReportDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("report_date <=", value, "reportDate");
			return (Criteria) this;
		}

		public Criteria andReportDateIn(List<Date> values) {
			addCriterionForJDBCDate("report_date in", values, "reportDate");
			return (Criteria) this;
		}

		public Criteria andReportDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("report_date not in", values, "reportDate");
			return (Criteria) this;
		}

		public Criteria andReportDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("report_date between", value1, value2, "reportDate");
			return (Criteria) this;
		}

		public Criteria andReportDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("report_date not between", value1, value2, "reportDate");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tdx_company_executive
	 * @mbggenerated  Thu Mar 15 17:19:31 CST 2018
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
     * This class corresponds to the database table tdx_company_executive
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 14 15:56:17 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}