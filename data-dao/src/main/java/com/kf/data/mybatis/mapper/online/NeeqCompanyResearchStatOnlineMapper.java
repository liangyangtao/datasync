package com.kf.data.mybatis.mapper.online;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kf.data.mybatis.entity.online.NeeqCompanyResearchStatOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyResearchStatOnlineExample;

public interface NeeqCompanyResearchStatOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    int countByExample(NeeqCompanyResearchStatOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    int deleteByExample(NeeqCompanyResearchStatOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    int insert(NeeqCompanyResearchStatOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    int insertSelective(NeeqCompanyResearchStatOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    List<NeeqCompanyResearchStatOnline> selectByExample(NeeqCompanyResearchStatOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    NeeqCompanyResearchStatOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyResearchStatOnline record, @Param("example") NeeqCompanyResearchStatOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyResearchStatOnline record, @Param("example") NeeqCompanyResearchStatOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyResearchStatOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_research_stat
     *
     * @mbggenerated Wed Mar 14 10:15:26 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyResearchStatOnline record);
}