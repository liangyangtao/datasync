package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxLawFirmBase;
import com.kf.data.mybatis.entity.tdx.TdxLawFirmBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxLawFirmBaseMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	int countByExample(TdxLawFirmBaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	int deleteByExample(TdxLawFirmBaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	int insert(TdxLawFirmBase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	int insertSelective(TdxLawFirmBase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	List<TdxLawFirmBase> selectByExample(TdxLawFirmBaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	TdxLawFirmBase selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxLawFirmBase record,
			@Param("example") TdxLawFirmBaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	int updateByExample(@Param("record") TdxLawFirmBase record, @Param("example") TdxLawFirmBaseExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxLawFirmBase record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_law_firm_base
	 * @mbggenerated  Fri Mar 23 11:02:28 CST 2018
	 */
	int updateByPrimaryKey(TdxLawFirmBase record);
}