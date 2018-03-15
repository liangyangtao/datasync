package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyShareholders;
import com.kf.data.mybatis.entity.tdx.TdxCompanyShareholdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyShareholdersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	int countByExample(TdxCompanyShareholdersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	int deleteByExample(TdxCompanyShareholdersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	int insert(TdxCompanyShareholders record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	int insertSelective(TdxCompanyShareholders record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	List<TdxCompanyShareholders> selectByExample(TdxCompanyShareholdersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	TdxCompanyShareholders selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyShareholders record,
			@Param("example") TdxCompanyShareholdersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyShareholders record,
			@Param("example") TdxCompanyShareholdersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyShareholders record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_shareholders
	 * @mbggenerated  Thu Mar 15 15:37:22 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyShareholders record);
}