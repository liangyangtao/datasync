package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyTaxRatingOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyTaxRatingOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyTaxRatingOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    int countByExample(NeeqCompanyTaxRatingOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    int deleteByExample(NeeqCompanyTaxRatingOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    int insert(NeeqCompanyTaxRatingOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    int insertSelective(NeeqCompanyTaxRatingOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    List<NeeqCompanyTaxRatingOnline> selectByExample(NeeqCompanyTaxRatingOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    NeeqCompanyTaxRatingOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyTaxRatingOnline record, @Param("example") NeeqCompanyTaxRatingOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyTaxRatingOnline record, @Param("example") NeeqCompanyTaxRatingOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyTaxRatingOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_tax_rating
     *
     * @mbggenerated Thu Mar 22 11:47:39 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyTaxRatingOnline record);
}