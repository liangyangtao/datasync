package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyMainStaff;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMainStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyMainStaffMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int countByExample(TdxCompanyMainStaffExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int deleteByExample(TdxCompanyMainStaffExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int insert(TdxCompanyMainStaff record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int insertSelective(TdxCompanyMainStaff record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	List<TdxCompanyMainStaff> selectByExampleWithBLOBs(TdxCompanyMainStaffExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	List<TdxCompanyMainStaff> selectByExample(TdxCompanyMainStaffExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	TdxCompanyMainStaff selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyMainStaff record,
			@Param("example") TdxCompanyMainStaffExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int updateByExampleWithBLOBs(@Param("record") TdxCompanyMainStaff record,
			@Param("example") TdxCompanyMainStaffExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyMainStaff record,
			@Param("example") TdxCompanyMainStaffExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyMainStaff record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(TdxCompanyMainStaff record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_staff
	 * @mbggenerated  Thu Mar 22 14:36:45 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyMainStaff record);
}