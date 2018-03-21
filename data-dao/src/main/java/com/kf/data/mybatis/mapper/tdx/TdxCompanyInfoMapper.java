package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyInfo;
import com.kf.data.mybatis.entity.tdx.TdxCompanyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	int countByExample(TdxCompanyInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	int deleteByExample(TdxCompanyInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	int insert(TdxCompanyInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	int insertSelective(TdxCompanyInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	List<TdxCompanyInfo> selectByExample(TdxCompanyInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	TdxCompanyInfo selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyInfo record,
			@Param("example") TdxCompanyInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyInfo record, @Param("example") TdxCompanyInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_info
	 * @mbggenerated  Tue Mar 20 18:34:33 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyInfo record);
}