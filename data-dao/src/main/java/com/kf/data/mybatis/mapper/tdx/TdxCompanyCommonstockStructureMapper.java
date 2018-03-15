package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyCommonstockStructure;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCommonstockStructureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyCommonstockStructureMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	int countByExample(TdxCompanyCommonstockStructureExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	int deleteByExample(TdxCompanyCommonstockStructureExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	int insert(TdxCompanyCommonstockStructure record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	int insertSelective(TdxCompanyCommonstockStructure record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	List<TdxCompanyCommonstockStructure> selectByExample(TdxCompanyCommonstockStructureExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	TdxCompanyCommonstockStructure selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyCommonstockStructure record,
			@Param("example") TdxCompanyCommonstockStructureExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyCommonstockStructure record,
			@Param("example") TdxCompanyCommonstockStructureExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyCommonstockStructure record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_commonstock_structure
	 * @mbggenerated  Thu Mar 15 15:59:34 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyCommonstockStructure record);
}