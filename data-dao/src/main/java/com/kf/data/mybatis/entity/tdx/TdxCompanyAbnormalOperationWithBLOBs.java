package com.kf.data.mybatis.entity.tdx;

public class TdxCompanyAbnormalOperationWithBLOBs extends TdxCompanyAbnormalOperation {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_abnormal_operation.reason_list
	 * @mbggenerated  Fri Mar 16 17:07:25 CST 2018
	 */
	private String reasonList;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tdx_company_abnormal_operation.reason_remove
	 * @mbggenerated  Fri Mar 16 17:07:25 CST 2018
	 */
	private String reasonRemove;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_abnormal_operation.reason_list
	 * @return  the value of tdx_company_abnormal_operation.reason_list
	 * @mbggenerated  Fri Mar 16 17:07:25 CST 2018
	 */
	public String getReasonList() {
		return reasonList;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_abnormal_operation.reason_list
	 * @param reasonList  the value for tdx_company_abnormal_operation.reason_list
	 * @mbggenerated  Fri Mar 16 17:07:25 CST 2018
	 */
	public void setReasonList(String reasonList) {
		this.reasonList = reasonList;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tdx_company_abnormal_operation.reason_remove
	 * @return  the value of tdx_company_abnormal_operation.reason_remove
	 * @mbggenerated  Fri Mar 16 17:07:25 CST 2018
	 */
	public String getReasonRemove() {
		return reasonRemove;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tdx_company_abnormal_operation.reason_remove
	 * @param reasonRemove  the value for tdx_company_abnormal_operation.reason_remove
	 * @mbggenerated  Fri Mar 16 17:07:25 CST 2018
	 */
	public void setReasonRemove(String reasonRemove) {
		this.reasonRemove = reasonRemove;
	}
}