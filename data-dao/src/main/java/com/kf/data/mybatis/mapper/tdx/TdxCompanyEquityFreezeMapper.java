package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyEquityFreeze;
import com.kf.data.mybatis.entity.tdx.TdxCompanyEquityFreezeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyEquityFreezeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int countByExample(TdxCompanyEquityFreezeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int deleteByExample(TdxCompanyEquityFreezeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int insert(TdxCompanyEquityFreeze record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int insertSelective(TdxCompanyEquityFreeze record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	List<TdxCompanyEquityFreeze> selectByExampleWithBLOBs(TdxCompanyEquityFreezeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	List<TdxCompanyEquityFreeze> selectByExample(TdxCompanyEquityFreezeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	TdxCompanyEquityFreeze selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyEquityFreeze record,
			@Param("example") TdxCompanyEquityFreezeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int updateByExampleWithBLOBs(@Param("record") TdxCompanyEquityFreeze record,
			@Param("example") TdxCompanyEquityFreezeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyEquityFreeze record,
			@Param("example") TdxCompanyEquityFreezeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyEquityFreeze record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(TdxCompanyEquityFreeze record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_equity_freeze
	 * @mbggenerated  Wed Mar 21 14:14:23 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyEquityFreeze record);
}