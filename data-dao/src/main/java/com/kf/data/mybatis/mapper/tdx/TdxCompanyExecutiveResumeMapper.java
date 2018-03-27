package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutiveResume;
import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutiveResumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyExecutiveResumeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int countByExample(TdxCompanyExecutiveResumeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int deleteByExample(TdxCompanyExecutiveResumeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int insert(TdxCompanyExecutiveResume record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int insertSelective(TdxCompanyExecutiveResume record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	List<TdxCompanyExecutiveResume> selectByExampleWithBLOBs(TdxCompanyExecutiveResumeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	List<TdxCompanyExecutiveResume> selectByExample(TdxCompanyExecutiveResumeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	TdxCompanyExecutiveResume selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyExecutiveResume record,
			@Param("example") TdxCompanyExecutiveResumeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int updateByExampleWithBLOBs(@Param("record") TdxCompanyExecutiveResume record,
			@Param("example") TdxCompanyExecutiveResumeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyExecutiveResume record,
			@Param("example") TdxCompanyExecutiveResumeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyExecutiveResume record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(TdxCompanyExecutiveResume record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_executive_resume
	 * @mbggenerated  Thu Mar 15 15:30:07 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyExecutiveResume record);
}