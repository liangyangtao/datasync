package com.kf.data.mybatis.entity.tdx;

import java.util.Date;

public class TdxCompanyTag {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_tag.id
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_tag.company_id
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	private String companyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_tag.tag_name
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	private String tagName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_tag.up_time
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	private Date upTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_tag.id
	 * @return  the value of tdx_company_tag.id
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_tag.id
	 * @param id  the value for tdx_company_tag.id
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_tag.company_id
	 * @return  the value of tdx_company_tag.company_id
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	public String getCompanyId() {
		return companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_tag.company_id
	 * @param companyId  the value for tdx_company_tag.company_id
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_tag.tag_name
	 * @return  the value of tdx_company_tag.tag_name
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	public String getTagName() {
		return tagName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_tag.tag_name
	 * @param tagName  the value for tdx_company_tag.tag_name
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_tag.up_time
	 * @return  the value of tdx_company_tag.up_time
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	public Date getUpTime() {
		return upTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_tag.up_time
	 * @param upTime  the value for tdx_company_tag.up_time
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	public void setUpTime(Date upTime) {
		this.upTime = upTime;
	}
}