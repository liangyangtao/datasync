package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyMainBusiness;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMainBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyMainBusinessMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int countByExample(TdxCompanyMainBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int deleteByExample(TdxCompanyMainBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int insert(TdxCompanyMainBusiness record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int insertSelective(TdxCompanyMainBusiness record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	List<TdxCompanyMainBusiness> selectByExampleWithBLOBs(TdxCompanyMainBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	List<TdxCompanyMainBusiness> selectByExample(TdxCompanyMainBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	TdxCompanyMainBusiness selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyMainBusiness record,
			@Param("example") TdxCompanyMainBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int updateByExampleWithBLOBs(@Param("record") TdxCompanyMainBusiness record,
			@Param("example") TdxCompanyMainBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyMainBusiness record,
			@Param("example") TdxCompanyMainBusinessExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyMainBusiness record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(TdxCompanyMainBusiness record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_main_business
	 * @mbggenerated  Thu Mar 15 18:33:55 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyMainBusiness record);
}