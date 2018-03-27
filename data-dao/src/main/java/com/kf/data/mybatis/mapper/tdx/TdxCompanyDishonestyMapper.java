package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyDishonesty;
import com.kf.data.mybatis.entity.tdx.TdxCompanyDishonestyExample;
import com.kf.data.mybatis.entity.tdx.TdxCompanyDishonestyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyDishonestyMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int countByExample(TdxCompanyDishonestyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int deleteByExample(TdxCompanyDishonestyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int insert(TdxCompanyDishonestyWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int insertSelective(TdxCompanyDishonestyWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	List<TdxCompanyDishonestyWithBLOBs> selectByExampleWithBLOBs(TdxCompanyDishonestyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	List<TdxCompanyDishonesty> selectByExample(TdxCompanyDishonestyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	TdxCompanyDishonestyWithBLOBs selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyDishonestyWithBLOBs record,
			@Param("example") TdxCompanyDishonestyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int updateByExampleWithBLOBs(@Param("record") TdxCompanyDishonestyWithBLOBs record,
			@Param("example") TdxCompanyDishonestyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyDishonesty record,
			@Param("example") TdxCompanyDishonestyExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyDishonestyWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(TdxCompanyDishonestyWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_dishonesty
	 * @mbggenerated  Tue Mar 27 14:12:35 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyDishonesty record);
}