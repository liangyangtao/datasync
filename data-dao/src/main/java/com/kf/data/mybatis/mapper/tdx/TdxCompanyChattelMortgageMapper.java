package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyChattelMortgage;
import com.kf.data.mybatis.entity.tdx.TdxCompanyChattelMortgageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyChattelMortgageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    int countByExample(TdxCompanyChattelMortgageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    int deleteByExample(TdxCompanyChattelMortgageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    int insert(TdxCompanyChattelMortgage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    int insertSelective(TdxCompanyChattelMortgage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    List<TdxCompanyChattelMortgage> selectByExample(TdxCompanyChattelMortgageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    TdxCompanyChattelMortgage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    int updateByExampleSelective(@Param("record") TdxCompanyChattelMortgage record, @Param("example") TdxCompanyChattelMortgageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    int updateByExample(@Param("record") TdxCompanyChattelMortgage record, @Param("example") TdxCompanyChattelMortgageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    int updateByPrimaryKeySelective(TdxCompanyChattelMortgage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_chattel_mortgage
     *
     * @mbggenerated Fri Mar 16 17:39:19 CST 2018
     */
    int updateByPrimaryKey(TdxCompanyChattelMortgage record);
}