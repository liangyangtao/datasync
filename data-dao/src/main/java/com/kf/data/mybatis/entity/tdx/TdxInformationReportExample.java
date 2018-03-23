package com.kf.data.mybatis.entity.tdx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TdxInformationReportExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	public TdxInformationReportExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
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

		public Criteria andPublishDateIsNull() {
			addCriterion("publish_date is null");
			return (Criteria) this;
		}

		public Criteria andPublishDateIsNotNull() {
			addCriterion("publish_date is not null");
			return (Criteria) this;
		}

		public Criteria andPublishDateEqualTo(String value) {
			addCriterion("publish_date =", value, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateNotEqualTo(String value) {
			addCriterion("publish_date <>", value, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateGreaterThan(String value) {
			addCriterion("publish_date >", value, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateGreaterThanOrEqualTo(String value) {
			addCriterion("publish_date >=", value, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateLessThan(String value) {
			addCriterion("publish_date <", value, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateLessThanOrEqualTo(String value) {
			addCriterion("publish_date <=", value, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateLike(String value) {
			addCriterion("publish_date like", value, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateNotLike(String value) {
			addCriterion("publish_date not like", value, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateIn(List<String> values) {
			addCriterion("publish_date in", values, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateNotIn(List<String> values) {
			addCriterion("publish_date not in", values, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateBetween(String value1, String value2) {
			addCriterion("publish_date between", value1, value2, "publishDate");
			return (Criteria) this;
		}

		public Criteria andPublishDateNotBetween(String value1, String value2) {
			addCriterion("publish_date not between", value1, value2, "publishDate");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameIsNull() {
			addCriterion("report_type_name is null");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameIsNotNull() {
			addCriterion("report_type_name is not null");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameEqualTo(String value) {
			addCriterion("report_type_name =", value, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameNotEqualTo(String value) {
			addCriterion("report_type_name <>", value, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameGreaterThan(String value) {
			addCriterion("report_type_name >", value, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameGreaterThanOrEqualTo(String value) {
			addCriterion("report_type_name >=", value, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameLessThan(String value) {
			addCriterion("report_type_name <", value, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameLessThanOrEqualTo(String value) {
			addCriterion("report_type_name <=", value, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameLike(String value) {
			addCriterion("report_type_name like", value, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameNotLike(String value) {
			addCriterion("report_type_name not like", value, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameIn(List<String> values) {
			addCriterion("report_type_name in", values, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameNotIn(List<String> values) {
			addCriterion("report_type_name not in", values, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameBetween(String value1, String value2) {
			addCriterion("report_type_name between", value1, value2, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andReportTypeNameNotBetween(String value1, String value2) {
			addCriterion("report_type_name not between", value1, value2, "reportTypeName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameIsNull() {
			addCriterion("spcurities_name is null");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameIsNotNull() {
			addCriterion("spcurities_name is not null");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameEqualTo(String value) {
			addCriterion("spcurities_name =", value, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameNotEqualTo(String value) {
			addCriterion("spcurities_name <>", value, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameGreaterThan(String value) {
			addCriterion("spcurities_name >", value, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameGreaterThanOrEqualTo(String value) {
			addCriterion("spcurities_name >=", value, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameLessThan(String value) {
			addCriterion("spcurities_name <", value, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameLessThanOrEqualTo(String value) {
			addCriterion("spcurities_name <=", value, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameLike(String value) {
			addCriterion("spcurities_name like", value, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameNotLike(String value) {
			addCriterion("spcurities_name not like", value, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameIn(List<String> values) {
			addCriterion("spcurities_name in", values, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameNotIn(List<String> values) {
			addCriterion("spcurities_name not in", values, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameBetween(String value1, String value2) {
			addCriterion("spcurities_name between", value1, value2, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSpcuritiesNameNotBetween(String value1, String value2) {
			addCriterion("spcurities_name not between", value1, value2, "spcuritiesName");
			return (Criteria) this;
		}

		public Criteria andSnameIsNull() {
			addCriterion("sname is null");
			return (Criteria) this;
		}

		public Criteria andSnameIsNotNull() {
			addCriterion("sname is not null");
			return (Criteria) this;
		}

		public Criteria andSnameEqualTo(String value) {
			addCriterion("sname =", value, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameNotEqualTo(String value) {
			addCriterion("sname <>", value, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameGreaterThan(String value) {
			addCriterion("sname >", value, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameGreaterThanOrEqualTo(String value) {
			addCriterion("sname >=", value, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameLessThan(String value) {
			addCriterion("sname <", value, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameLessThanOrEqualTo(String value) {
			addCriterion("sname <=", value, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameLike(String value) {
			addCriterion("sname like", value, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameNotLike(String value) {
			addCriterion("sname not like", value, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameIn(List<String> values) {
			addCriterion("sname in", values, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameNotIn(List<String> values) {
			addCriterion("sname not in", values, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameBetween(String value1, String value2) {
			addCriterion("sname between", value1, value2, "sname");
			return (Criteria) this;
		}

		public Criteria andSnameNotBetween(String value1, String value2) {
			addCriterion("sname not between", value1, value2, "sname");
			return (Criteria) this;
		}

		public Criteria andReporterIsNull() {
			addCriterion("reporter is null");
			return (Criteria) this;
		}

		public Criteria andReporterIsNotNull() {
			addCriterion("reporter is not null");
			return (Criteria) this;
		}

		public Criteria andReporterEqualTo(String value) {
			addCriterion("reporter =", value, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterNotEqualTo(String value) {
			addCriterion("reporter <>", value, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterGreaterThan(String value) {
			addCriterion("reporter >", value, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterGreaterThanOrEqualTo(String value) {
			addCriterion("reporter >=", value, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterLessThan(String value) {
			addCriterion("reporter <", value, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterLessThanOrEqualTo(String value) {
			addCriterion("reporter <=", value, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterLike(String value) {
			addCriterion("reporter like", value, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterNotLike(String value) {
			addCriterion("reporter not like", value, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterIn(List<String> values) {
			addCriterion("reporter in", values, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterNotIn(List<String> values) {
			addCriterion("reporter not in", values, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterBetween(String value1, String value2) {
			addCriterion("reporter between", value1, value2, "reporter");
			return (Criteria) this;
		}

		public Criteria andReporterNotBetween(String value1, String value2) {
			addCriterion("reporter not between", value1, value2, "reporter");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tdx_information_report
	 * @mbggenerated  Fri Mar 23 14:06:33 CST 2018
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
     * This class corresponds to the database table tdx_information_report
     *
     * @mbggenerated do_not_delete_during_merge Fri Mar 23 14:04:08 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}