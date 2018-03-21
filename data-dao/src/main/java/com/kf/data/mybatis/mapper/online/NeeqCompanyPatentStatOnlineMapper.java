package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyPatentStatOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyPatentStatOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyPatentStatOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    int countByExample(NeeqCompanyPatentStatOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    int deleteByExample(NeeqCompanyPatentStatOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    int insert(NeeqCompanyPatentStatOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    int insertSelective(NeeqCompanyPatentStatOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    List<NeeqCompanyPatentStatOnline> selectByExample(NeeqCompanyPatentStatOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    NeeqCompanyPatentStatOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyPatentStatOnline record, @Param("example") NeeqCompanyPatentStatOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyPatentStatOnline record, @Param("example") NeeqCompanyPatentStatOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyPatentStatOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent_stat
     *
     * @mbggenerated Wed Mar 21 18:06:21 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyPatentStatOnline record);
}