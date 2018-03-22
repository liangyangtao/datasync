package com.kf.data.mybatis.entity.tdx;

import java.util.Date;

public class TdxCompanyEquityFreeze {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.id
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.company_id
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private String companyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.company_name
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private String companyName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.stock_code
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private String stockCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.stockholder_name
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private String stockholderName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.executive_name
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private String executiveName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.freeze_num
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private Double freezeNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.dt_notice
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private Date dtNotice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.dt_start
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private Date dtStart;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.dt_end
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private Date dtEnd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.updated_at
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private Date updatedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_equity_freeze.freeze_reason
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	private String freezeReason;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.id
	 * @return  the value of tdx_company_equity_freeze.id
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.id
	 * @param id  the value for tdx_company_equity_freeze.id
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.company_id
	 * @return  the value of tdx_company_equity_freeze.company_id
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public String getCompanyId() {
		return companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.company_id
	 * @param companyId  the value for tdx_company_equity_freeze.company_id
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.company_name
	 * @return  the value of tdx_company_equity_freeze.company_name
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.company_name
	 * @param companyName  the value for tdx_company_equity_freeze.company_name
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.stock_code
	 * @return  the value of tdx_company_equity_freeze.stock_code
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public String getStockCode() {
		return stockCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.stock_code
	 * @param stockCode  the value for tdx_company_equity_freeze.stock_code
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.stockholder_name
	 * @return  the value of tdx_company_equity_freeze.stockholder_name
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public String getStockholderName() {
		return stockholderName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.stockholder_name
	 * @param stockholderName  the value for tdx_company_equity_freeze.stockholder_name
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setStockholderName(String stockholderName) {
		this.stockholderName = stockholderName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.executive_name
	 * @return  the value of tdx_company_equity_freeze.executive_name
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public String getExecutiveName() {
		return executiveName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.executive_name
	 * @param executiveName  the value for tdx_company_equity_freeze.executive_name
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setExecutiveName(String executiveName) {
		this.executiveName = executiveName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.freeze_num
	 * @return  the value of tdx_company_equity_freeze.freeze_num
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public Double getFreezeNum() {
		return freezeNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.freeze_num
	 * @param freezeNum  the value for tdx_company_equity_freeze.freeze_num
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setFreezeNum(Double freezeNum) {
		this.freezeNum = freezeNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.dt_notice
	 * @return  the value of tdx_company_equity_freeze.dt_notice
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public Date getDtNotice() {
		return dtNotice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.dt_notice
	 * @param dtNotice  the value for tdx_company_equity_freeze.dt_notice
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setDtNotice(Date dtNotice) {
		this.dtNotice = dtNotice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.dt_start
	 * @return  the value of tdx_company_equity_freeze.dt_start
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public Date getDtStart() {
		return dtStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.dt_start
	 * @param dtStart  the value for tdx_company_equity_freeze.dt_start
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setDtStart(Date dtStart) {
		this.dtStart = dtStart;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.dt_end
	 * @return  the value of tdx_company_equity_freeze.dt_end
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public Date getDtEnd() {
		return dtEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.dt_end
	 * @param dtEnd  the value for tdx_company_equity_freeze.dt_end
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setDtEnd(Date dtEnd) {
		this.dtEnd = dtEnd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.updated_at
	 * @return  the value of tdx_company_equity_freeze.updated_at
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.updated_at
	 * @param updatedAt  the value for tdx_company_equity_freeze.updated_at
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_equity_freeze.freeze_reason
	 * @return  the value of tdx_company_equity_freeze.freeze_reason
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public String getFreezeReason() {
		return freezeReason;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_equity_freeze.freeze_reason
	 * @param freezeReason  the value for tdx_company_equity_freeze.freeze_reason
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	public void setFreezeReason(String freezeReason) {
		this.freezeReason = freezeReason;
	}
}