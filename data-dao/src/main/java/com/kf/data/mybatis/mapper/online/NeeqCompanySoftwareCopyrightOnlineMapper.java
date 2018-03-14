package com.kf.data.mybatis.mapper.online;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kf.data.mybatis.entity.online.NeeqCompanySoftwareCopyrightOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanySoftwareCopyrightOnlineExample;

public interface NeeqCompanySoftwareCopyrightOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    int countByExample(NeeqCompanySoftwareCopyrightOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    int deleteByExample(NeeqCompanySoftwareCopyrightOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    int insert(NeeqCompanySoftwareCopyrightOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    int insertSelective(NeeqCompanySoftwareCopyrightOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    List<NeeqCompanySoftwareCopyrightOnline> selectByExample(NeeqCompanySoftwareCopyrightOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    NeeqCompanySoftwareCopyrightOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanySoftwareCopyrightOnline record, @Param("example") NeeqCompanySoftwareCopyrightOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanySoftwareCopyrightOnline record, @Param("example") NeeqCompanySoftwareCopyrightOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanySoftwareCopyrightOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_software_copyright
     *
     * @mbggenerated Wed Mar 14 10:17:45 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanySoftwareCopyrightOnline record);
}