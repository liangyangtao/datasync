package com.kf.data.mybatis.entity.tdx;

import java.util.Date;

public class TdxCompanyExecutiveResume {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_executive_resume.id
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_executive_resume.person_id
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	private Integer personId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_executive_resume.updated_at
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	private Date updatedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_executive_resume.person_post
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	private String personPost;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_executive_resume.id
	 * @return  the value of tdx_company_executive_resume.id
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_executive_resume.id
	 * @param id  the value for tdx_company_executive_resume.id
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_executive_resume.person_id
	 * @return  the value of tdx_company_executive_resume.person_id
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	public Integer getPersonId() {
		return personId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_executive_resume.person_id
	 * @param personId  the value for tdx_company_executive_resume.person_id
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_executive_resume.updated_at
	 * @return  the value of tdx_company_executive_resume.updated_at
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_executive_resume.updated_at
	 * @param updatedAt  the value for tdx_company_executive_resume.updated_at
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_executive_resume.person_post
	 * @return  the value of tdx_company_executive_resume.person_post
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	public String getPersonPost() {
		return personPost;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_executive_resume.person_post
	 * @param personPost  the value for tdx_company_executive_resume.person_post
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	public void setPersonPost(String personPost) {
		this.personPost = personPost;
	}
}