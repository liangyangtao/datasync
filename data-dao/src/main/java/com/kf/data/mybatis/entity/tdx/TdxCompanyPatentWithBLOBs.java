package com.kf.data.mybatis.entity.tdx;

public class TdxCompanyPatentWithBLOBs extends TdxCompanyPatent {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_patent.address
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_patent.summary
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	private String summary;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_patent.address
	 * @return  the value of tdx_company_patent.address
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_patent.address
	 * @param address  the value for tdx_company_patent.address
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_patent.summary
	 * @return  the value of tdx_company_patent.summary
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_patent.summary
	 * @param summary  the value for tdx_company_patent.summary
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
}