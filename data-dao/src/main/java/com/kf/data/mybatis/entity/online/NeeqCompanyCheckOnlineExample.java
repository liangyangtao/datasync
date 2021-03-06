package com.kf.data.mybatis.entity.online;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NeeqCompanyCheckOnlineExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	public NeeqCompanyCheckOnlineExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
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

		public Criteria andCompanyNameIsNull() {
			addCriterion("company_name is null");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIsNotNull() {
			addCriterion("company_name is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyNameEqualTo(String value) {
			addCriterion("company_name =", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotEqualTo(String value) {
			addCriterion("company_name <>", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameGreaterThan(String value) {
			addCriterion("company_name >", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
			addCriterion("company_name >=", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLessThan(String value) {
			addCriterion("company_name <", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLessThanOrEqualTo(String value) {
			addCriterion("company_name <=", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameLike(String value) {
			addCriterion("company_name like", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotLike(String value) {
			addCriterion("company_name not like", value, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameIn(List<String> values) {
			addCriterion("company_name in", values, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotIn(List<String> values) {
			addCriterion("company_name not in", values, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameBetween(String value1, String value2) {
			addCriterion("company_name between", value1, value2, "companyName");
			return (Criteria) this;
		}

		public Criteria andCompanyNameNotBetween(String value1, String value2) {
			addCriterion("company_name not between", value1, value2, "companyName");
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

		public Criteria andDateEqualTo(Date value) {
			addCriterionForJDBCDate("`date` =", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("`date` <>", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThan(Date value) {
			addCriterionForJDBCDate("`date` >", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("`date` >=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThan(Date value) {
			addCriterionForJDBCDate("`date` <", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("`date` <=", value, "date");
			return (Criteria) this;
		}

		public Criteria andDateIn(List<Date> values) {
			addCriterionForJDBCDate("`date` in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("`date` not in", values, "date");
			return (Criteria) this;
		}

		public Criteria andDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("`date` between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("`date` not between", value1, value2, "date");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyIsNull() {
			addCriterion("check_agency is null");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyIsNotNull() {
			addCriterion("check_agency is not null");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyEqualTo(String value) {
			addCriterion("check_agency =", value, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyNotEqualTo(String value) {
			addCriterion("check_agency <>", value, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyGreaterThan(String value) {
			addCriterion("check_agency >", value, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyGreaterThanOrEqualTo(String value) {
			addCriterion("check_agency >=", value, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyLessThan(String value) {
			addCriterion("check_agency <", value, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyLessThanOrEqualTo(String value) {
			addCriterion("check_agency <=", value, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyLike(String value) {
			addCriterion("check_agency like", value, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyNotLike(String value) {
			addCriterion("check_agency not like", value, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyIn(List<String> values) {
			addCriterion("check_agency in", values, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyNotIn(List<String> values) {
			addCriterion("check_agency not in", values, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyBetween(String value1, String value2) {
			addCriterion("check_agency between", value1, value2, "checkAgency");
			return (Criteria) this;
		}

		public Criteria andCheckAgencyNotBetween(String value1, String value2) {
			addCriterion("check_agency not between", value1, value2, "checkAgency");
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

		public Criteria andTypeEqualTo(String value) {
			addCriterion("`type` =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("`type` <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("`type` >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("`type` >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("`type` <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("`type` <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("`type` like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("`type` not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("`type` in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("`type` not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("`type` between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("`type` not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andResultIsNull() {
			addCriterion("`result` is null");
			return (Criteria) this;
		}

		public Criteria andResultIsNotNull() {
			addCriterion("`result` is not null");
			return (Criteria) this;
		}

		public Criteria andResultEqualTo(String value) {
			addCriterion("`result` =", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultNotEqualTo(String value) {
			addCriterion("`result` <>", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultGreaterThan(String value) {
			addCriterion("`result` >", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultGreaterThanOrEqualTo(String value) {
			addCriterion("`result` >=", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultLessThan(String value) {
			addCriterion("`result` <", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultLessThanOrEqualTo(String value) {
			addCriterion("`result` <=", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultLike(String value) {
			addCriterion("`result` like", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultNotLike(String value) {
			addCriterion("`result` not like", value, "result");
			return (Criteria) this;
		}

		public Criteria andResultIn(List<String> values) {
			addCriterion("`result` in", values, "result");
			return (Criteria) this;
		}

		public Criteria andResultNotIn(List<String> values) {
			addCriterion("`result` not in", values, "result");
			return (Criteria) this;
		}

		public Criteria andResultBetween(String value1, String value2) {
			addCriterion("`result` between", value1, value2, "result");
			return (Criteria) this;
		}

		public Criteria andResultNotBetween(String value1, String value2) {
			addCriterion("`result` not between", value1, value2, "result");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table neeq_company_check
	 * @mbggenerated  Thu Mar 22 11:49:10 CST 2018
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
     * This class corresponds to the database table neeq_company_check
     *
     * @mbggenerated do_not_delete_during_merge Thu Mar 22 11:48:31 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}