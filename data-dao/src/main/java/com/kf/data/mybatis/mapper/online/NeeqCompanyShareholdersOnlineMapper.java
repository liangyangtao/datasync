package com.kf.data.mybatis.mapper.online;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kf.data.mybatis.entity.online.NeeqCompanyShareholdersOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyShareholdersOnlineExample;

public interface NeeqCompanyShareholdersOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    int countByExample(NeeqCompanyShareholdersOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    int deleteByExample(NeeqCompanyShareholdersOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    int insert(NeeqCompanyShareholdersOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    int insertSelective(NeeqCompanyShareholdersOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    List<NeeqCompanyShareholdersOnline> selectByExample(NeeqCompanyShareholdersOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    NeeqCompanyShareholdersOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyShareholdersOnline record, @Param("example") NeeqCompanyShareholdersOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyShareholdersOnline record, @Param("example") NeeqCompanyShareholdersOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyShareholdersOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_shareholders
     *
     * @mbggenerated Wed Mar 14 10:00:43 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyShareholdersOnline record);
}