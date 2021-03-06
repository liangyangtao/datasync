package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyPatent;
import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentExample;
import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyPatentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int countByExample(TdxCompanyPatentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int deleteByExample(TdxCompanyPatentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int insert(TdxCompanyPatentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int insertSelective(TdxCompanyPatentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	List<TdxCompanyPatentWithBLOBs> selectByExampleWithBLOBs(TdxCompanyPatentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	List<TdxCompanyPatent> selectByExample(TdxCompanyPatentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	TdxCompanyPatentWithBLOBs selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyPatentWithBLOBs record,
			@Param("example") TdxCompanyPatentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int updateByExampleWithBLOBs(@Param("record") TdxCompanyPatentWithBLOBs record,
			@Param("example") TdxCompanyPatentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyPatent record, @Param("example") TdxCompanyPatentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyPatentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(TdxCompanyPatentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_patent
	 * @mbggenerated  Wed Mar 21 15:55:27 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyPatent record);
}