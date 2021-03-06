package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyCopyright;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCopyrightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyCopyrightMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	int countByExample(TdxCompanyCopyrightExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	int deleteByExample(TdxCompanyCopyrightExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	int insert(TdxCompanyCopyright record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	int insertSelective(TdxCompanyCopyright record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	List<TdxCompanyCopyright> selectByExample(TdxCompanyCopyrightExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	TdxCompanyCopyright selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyCopyright record,
			@Param("example") TdxCompanyCopyrightExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyCopyright record,
			@Param("example") TdxCompanyCopyrightExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyCopyright record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_copyright
	 * @mbggenerated  Tue Mar 27 15:40:40 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyCopyright record);
}