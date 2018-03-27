package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyTag;
import com.kf.data.mybatis.entity.tdx.TdxCompanyTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyTagMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	int countByExample(TdxCompanyTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	int deleteByExample(TdxCompanyTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	int insert(TdxCompanyTag record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	int insertSelective(TdxCompanyTag record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	List<TdxCompanyTag> selectByExample(TdxCompanyTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	TdxCompanyTag selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyTag record, @Param("example") TdxCompanyTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyTag record, @Param("example") TdxCompanyTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyTag record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_tag
	 * @mbggenerated  Tue Mar 20 17:40:18 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyTag record);
}