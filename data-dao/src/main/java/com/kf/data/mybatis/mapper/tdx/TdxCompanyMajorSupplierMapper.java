package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyMajorSupplier;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMajorSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyMajorSupplierMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	int countByExample(TdxCompanyMajorSupplierExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	int deleteByExample(TdxCompanyMajorSupplierExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	int insert(TdxCompanyMajorSupplier record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	int insertSelective(TdxCompanyMajorSupplier record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	List<TdxCompanyMajorSupplier> selectByExample(TdxCompanyMajorSupplierExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	TdxCompanyMajorSupplier selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxCompanyMajorSupplier record,
			@Param("example") TdxCompanyMajorSupplierExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	int updateByExample(@Param("record") TdxCompanyMajorSupplier record,
			@Param("example") TdxCompanyMajorSupplierExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxCompanyMajorSupplier record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_company_major_supplier
	 * @mbggenerated  Thu Mar 15 18:10:16 CST 2018
	 */
	int updateByPrimaryKey(TdxCompanyMajorSupplier record);
}