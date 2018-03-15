package com.kf.data.mybatis.entity.tdx;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TdxCompanyDivExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	public TdxCompanyDivExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
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

		public Criteria andDivDscrpIsNull() {
			addCriterion("div_dscrp is null");
			return (Criteria) this;
		}

		public Criteria andDivDscrpIsNotNull() {
			addCriterion("div_dscrp is not null");
			return (Criteria) this;
		}

		public Criteria andDivDscrpEqualTo(String value) {
			addCriterion("div_dscrp =", value, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpNotEqualTo(String value) {
			addCriterion("div_dscrp <>", value, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpGreaterThan(String value) {
			addCriterion("div_dscrp >", value, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpGreaterThanOrEqualTo(String value) {
			addCriterion("div_dscrp >=", value, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpLessThan(String value) {
			addCriterion("div_dscrp <", value, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpLessThanOrEqualTo(String value) {
			addCriterion("div_dscrp <=", value, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpLike(String value) {
			addCriterion("div_dscrp like", value, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpNotLike(String value) {
			addCriterion("div_dscrp not like", value, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpIn(List<String> values) {
			addCriterion("div_dscrp in", values, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpNotIn(List<String> values) {
			addCriterion("div_dscrp not in", values, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpBetween(String value1, String value2) {
			addCriterion("div_dscrp between", value1, value2, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDivDscrpNotBetween(String value1, String value2) {
			addCriterion("div_dscrp not between", value1, value2, "divDscrp");
			return (Criteria) this;
		}

		public Criteria andDtRegistIsNull() {
			addCriterion("dt_regist is null");
			return (Criteria) this;
		}

		public Criteria andDtRegistIsNotNull() {
			addCriterion("dt_regist is not null");
			return (Criteria) this;
		}

		public Criteria andDtRegistEqualTo(Date value) {
			addCriterionForJDBCDate("dt_regist =", value, "dtRegist");
			return (Criteria) this;
		}

		public Criteria andDtRegistNotEqualTo(Date value) {
			addCriterionForJDBCDate("dt_regist <>", value, "dtRegist");
			return (Criteria) this;
		}

		public Criteria andDtRegistGreaterThan(Date value) {
			addCriterionForJDBCDate("dt_regist >", value, "dtRegist");
			return (Criteria) this;
		}

		public Criteria andDtRegistGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("dt_regist >=", value, "dtRegist");
			return (Criteria) this;
		}

		public Criteria andDtRegistLessThan(Date value) {
			addCriterionForJDBCDate("dt_regist <", value, "dtRegist");
			return (Criteria) this;
		}

		public Criteria andDtRegistLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("dt_regist <=", value, "dtRegist");
			return (Criteria) this;
		}

		public Criteria andDtRegistIn(List<Date> values) {
			addCriterionForJDBCDate("dt_regist in", values, "dtRegist");
			return (Criteria) this;
		}

		public Criteria andDtRegistNotIn(List<Date> values) {
			addCriterionForJDBCDate("dt_regist not in", values, "dtRegist");
			return (Criteria) this;
		}

		public Criteria andDtRegistBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("dt_regist between", value1, value2, "dtRegist");
			return (Criteria) this;
		}

		public Criteria andDtRegistNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("dt_regist not between", value1, value2, "dtRegist");
			return (Criteria) this;
		}

		public Criteria andProgressNameIsNull() {
			addCriterion("progress_name is null");
			return (Criteria) this;
		}

		public Criteria andProgressNameIsNotNull() {
			addCriterion("progress_name is not null");
			return (Criteria) this;
		}

		public Criteria andProgressNameEqualTo(String value) {
			addCriterion("progress_name =", value, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameNotEqualTo(String value) {
			addCriterion("progress_name <>", value, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameGreaterThan(String value) {
			addCriterion("progress_name >", value, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameGreaterThanOrEqualTo(String value) {
			addCriterion("progress_name >=", value, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameLessThan(String value) {
			addCriterion("progress_name <", value, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameLessThanOrEqualTo(String value) {
			addCriterion("progress_name <=", value, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameLike(String value) {
			addCriterion("progress_name like", value, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameNotLike(String value) {
			addCriterion("progress_name not like", value, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameIn(List<String> values) {
			addCriterion("progress_name in", values, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameNotIn(List<String> values) {
			addCriterion("progress_name not in", values, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameBetween(String value1, String value2) {
			addCriterion("progress_name between", value1, value2, "progressName");
			return (Criteria) this;
		}

		public Criteria andProgressNameNotBetween(String value1, String value2) {
			addCriterion("progress_name not between", value1, value2, "progressName");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxIsNull() {
			addCriterion("div_pre_tax is null");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxIsNotNull() {
			addCriterion("div_pre_tax is not null");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxEqualTo(Double value) {
			addCriterion("div_pre_tax =", value, "divPreTax");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxNotEqualTo(Double value) {
			addCriterion("div_pre_tax <>", value, "divPreTax");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxGreaterThan(Double value) {
			addCriterion("div_pre_tax >", value, "divPreTax");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxGreaterThanOrEqualTo(Double value) {
			addCriterion("div_pre_tax >=", value, "divPreTax");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxLessThan(Double value) {
			addCriterion("div_pre_tax <", value, "divPreTax");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxLessThanOrEqualTo(Double value) {
			addCriterion("div_pre_tax <=", value, "divPreTax");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxIn(List<Double> values) {
			addCriterion("div_pre_tax in", values, "divPreTax");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxNotIn(List<Double> values) {
			addCriterion("div_pre_tax not in", values, "divPreTax");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxBetween(Double value1, Double value2) {
			addCriterion("div_pre_tax between", value1, value2, "divPreTax");
			return (Criteria) this;
		}

		public Criteria andDivPreTaxNotBetween(Double value1, Double value2) {
			addCriterion("div_pre_tax not between", value1, value2, "divPreTax");
			return (Criteria) this;
		}

		public Criteria andTransferRatioIsNull() {
			addCriterion("transfer_ratio is null");
			return (Criteria) this;
		}

		public Criteria andTransferRatioIsNotNull() {
			addCriterion("transfer_ratio is not null");
			return (Criteria) this;
		}

		public Criteria andTransferRatioEqualTo(Double value) {
			addCriterion("transfer_ratio =", value, "transferRatio");
			return (Criteria) this;
		}

		public Criteria andTransferRatioNotEqualTo(Double value) {
			addCriterion("transfer_ratio <>", value, "transferRatio");
			return (Criteria) this;
		}

		public Criteria andTransferRatioGreaterThan(Double value) {
			addCriterion("transfer_ratio >", value, "transferRatio");
			return (Criteria) this;
		}

		public Criteria andTransferRatioGreaterThanOrEqualTo(Double value) {
			addCriterion("transfer_ratio >=", value, "transferRatio");
			return (Criteria) this;
		}

		public Criteria andTransferRatioLessThan(Double value) {
			addCriterion("transfer_ratio <", value, "transferRatio");
			return (Criteria) this;
		}

		public Criteria andTransferRatioLessThanOrEqualTo(Double value) {
			addCriterion("transfer_ratio <=", value, "transferRatio");
			return (Criteria) this;
		}

		public Criteria andTransferRatioIn(List<Double> values) {
			addCriterion("transfer_ratio in", values, "transferRatio");
			return (Criteria) this;
		}

		public Criteria andTransferRatioNotIn(List<Double> values) {
			addCriterion("transfer_ratio not in", values, "transferRatio");
			return (Criteria) this;
		}

		public Criteria andTransferRatioBetween(Double value1, Double value2) {
			addCriterion("transfer_ratio between", value1, value2, "transferRatio");
			return (Criteria) this;
		}

		public Criteria andTransferRatioNotBetween(Double value1, Double value2) {
			addCriterion("transfer_ratio not between", value1, value2, "transferRatio");
			return (Criteria) this;
		}

		public Criteria andDtPlanIsNull() {
			addCriterion("dt_plan is null");
			return (Criteria) this;
		}

		public Criteria andDtPlanIsNotNull() {
			addCriterion("dt_plan is not null");
			return (Criteria) this;
		}

		public Criteria andDtPlanEqualTo(Date value) {
			addCriterionForJDBCDate("dt_plan =", value, "dtPlan");
			return (Criteria) this;
		}

		public Criteria andDtPlanNotEqualTo(Date value) {
			addCriterionForJDBCDate("dt_plan <>", value, "dtPlan");
			return (Criteria) this;
		}

		public Criteria andDtPlanGreaterThan(Date value) {
			addCriterionForJDBCDate("dt_plan >", value, "dtPlan");
			return (Criteria) this;
		}

		public Criteria andDtPlanGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("dt_plan >=", value, "dtPlan");
			return (Criteria) this;
		}

		public Criteria andDtPlanLessThan(Date value) {
			addCriterionForJDBCDate("dt_plan <", value, "dtPlan");
			return (Criteria) this;
		}

		public Criteria andDtPlanLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("dt_plan <=", value, "dtPlan");
			return (Criteria) this;
		}

		public Criteria andDtPlanIn(List<Date> values) {
			addCriterionForJDBCDate("dt_plan in", values, "dtPlan");
			return (Criteria) this;
		}

		public Criteria andDtPlanNotIn(List<Date> values) {
			addCriterionForJDBCDate("dt_plan not in", values, "dtPlan");
			return (Criteria) this;
		}

		public Criteria andDtPlanBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("dt_plan between", value1, value2, "dtPlan");
			return (Criteria) this;
		}

		public Criteria andDtPlanNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("dt_plan not between", value1, value2, "dtPlan");
			return (Criteria) this;
		}

		public Criteria andDivObjIsNull() {
			addCriterion("div_obj is null");
			return (Criteria) this;
		}

		public Criteria andDivObjIsNotNull() {
			addCriterion("div_obj is not null");
			return (Criteria) this;
		}

		public Criteria andDivObjEqualTo(String value) {
			addCriterion("div_obj =", value, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjNotEqualTo(String value) {
			addCriterion("div_obj <>", value, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjGreaterThan(String value) {
			addCriterion("div_obj >", value, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjGreaterThanOrEqualTo(String value) {
			addCriterion("div_obj >=", value, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjLessThan(String value) {
			addCriterion("div_obj <", value, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjLessThanOrEqualTo(String value) {
			addCriterion("div_obj <=", value, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjLike(String value) {
			addCriterion("div_obj like", value, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjNotLike(String value) {
			addCriterion("div_obj not like", value, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjIn(List<String> values) {
			addCriterion("div_obj in", values, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjNotIn(List<String> values) {
			addCriterion("div_obj not in", values, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjBetween(String value1, String value2) {
			addCriterion("div_obj between", value1, value2, "divObj");
			return (Criteria) this;
		}

		public Criteria andDivObjNotBetween(String value1, String value2) {
			addCriterion("div_obj not between", value1, value2, "divObj");
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

		public Criteria andDtDivExIsNull() {
			addCriterion("dt_div_ex is null");
			return (Criteria) this;
		}

		public Criteria andDtDivExIsNotNull() {
			addCriterion("dt_div_ex is not null");
			return (Criteria) this;
		}

		public Criteria andDtDivExEqualTo(Date value) {
			addCriterionForJDBCDate("dt_div_ex =", value, "dtDivEx");
			return (Criteria) this;
		}

		public Criteria andDtDivExNotEqualTo(Date value) {
			addCriterionForJDBCDate("dt_div_ex <>", value, "dtDivEx");
			return (Criteria) this;
		}

		public Criteria andDtDivExGreaterThan(Date value) {
			addCriterionForJDBCDate("dt_div_ex >", value, "dtDivEx");
			return (Criteria) this;
		}

		public Criteria andDtDivExGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("dt_div_ex >=", value, "dtDivEx");
			return (Criteria) this;
		}

		public Criteria andDtDivExLessThan(Date value) {
			addCriterionForJDBCDate("dt_div_ex <", value, "dtDivEx");
			return (Criteria) this;
		}

		public Criteria andDtDivExLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("dt_div_ex <=", value, "dtDivEx");
			return (Criteria) this;
		}

		public Criteria andDtDivExIn(List<Date> values) {
			addCriterionForJDBCDate("dt_div_ex in", values, "dtDivEx");
			return (Criteria) this;
		}

		public Criteria andDtDivExNotIn(List<Date> values) {
			addCriterionForJDBCDate("dt_div_ex not in", values, "dtDivEx");
			return (Criteria) this;
		}

		public Criteria andDtDivExBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("dt_div_ex between", value1, value2, "dtDivEx");
			return (Criteria) this;
		}

		public Criteria andDtDivExNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("dt_div_ex not between", value1, value2, "dtDivEx");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tdx_company_div
	 * @mbggenerated  Thu Mar 15 16:29:33 CST 2018
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
     * This class corresponds to the database table tdx_company_div
     *
     * @mbggenerated do_not_delete_during_merge Thu Mar 15 10:44:23 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}