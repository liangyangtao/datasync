package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyLawFirm;
import com.kf.data.mybatis.entity.tdx.TdxCompanyLawFirmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyLawFirmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    int countByExample(TdxCompanyLawFirmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    int deleteByExample(TdxCompanyLawFirmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    int insert(TdxCompanyLawFirm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    int insertSelective(TdxCompanyLawFirm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    List<TdxCompanyLawFirm> selectByExample(TdxCompanyLawFirmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    TdxCompanyLawFirm selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") TdxCompanyLawFirm record, @Param("example") TdxCompanyLawFirmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    int updateByExample(@Param("record") TdxCompanyLawFirm record, @Param("example") TdxCompanyLawFirmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    int updateByPrimaryKeySelective(TdxCompanyLawFirm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_law_firm
     *
     * @mbggenerated Thu Mar 22 17:43:03 CST 2018
     */
    int updateByPrimaryKey(TdxCompanyLawFirm record);
}