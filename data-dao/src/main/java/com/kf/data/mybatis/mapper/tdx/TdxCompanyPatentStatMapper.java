package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentStat;
import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyPatentStatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    int countByExample(TdxCompanyPatentStatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    int deleteByExample(TdxCompanyPatentStatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    int insert(TdxCompanyPatentStat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    int insertSelective(TdxCompanyPatentStat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    List<TdxCompanyPatentStat> selectByExample(TdxCompanyPatentStatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    TdxCompanyPatentStat selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") TdxCompanyPatentStat record, @Param("example") TdxCompanyPatentStatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    int updateByExample(@Param("record") TdxCompanyPatentStat record, @Param("example") TdxCompanyPatentStatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    int updateByPrimaryKeySelective(TdxCompanyPatentStat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 17:59:56 CST 2018
     */
    int updateByPrimaryKey(TdxCompanyPatentStat record);
}