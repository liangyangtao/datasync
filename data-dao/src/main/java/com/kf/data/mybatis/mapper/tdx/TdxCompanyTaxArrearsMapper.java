package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyTaxArrears;
import com.kf.data.mybatis.entity.tdx.TdxCompanyTaxArrearsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyTaxArrearsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    int countByExample(TdxCompanyTaxArrearsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    int deleteByExample(TdxCompanyTaxArrearsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    int insert(TdxCompanyTaxArrears record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    int insertSelective(TdxCompanyTaxArrears record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    List<TdxCompanyTaxArrears> selectByExample(TdxCompanyTaxArrearsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    TdxCompanyTaxArrears selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    int updateByExampleSelective(@Param("record") TdxCompanyTaxArrears record, @Param("example") TdxCompanyTaxArrearsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    int updateByExample(@Param("record") TdxCompanyTaxArrears record, @Param("example") TdxCompanyTaxArrearsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    int updateByPrimaryKeySelective(TdxCompanyTaxArrears record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_tax_arrears
     *
     * @mbggenerated Thu Mar 22 11:27:20 CST 2018
     */
    int updateByPrimaryKey(TdxCompanyTaxArrears record);
}