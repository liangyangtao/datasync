package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyCopyrightOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyCopyrightOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyCopyrightOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    int countByExample(NeeqCompanyCopyrightOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    int deleteByExample(NeeqCompanyCopyrightOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    int insert(NeeqCompanyCopyrightOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    int insertSelective(NeeqCompanyCopyrightOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    List<NeeqCompanyCopyrightOnline> selectByExample(NeeqCompanyCopyrightOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    NeeqCompanyCopyrightOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyCopyrightOnline record, @Param("example") NeeqCompanyCopyrightOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyCopyrightOnline record, @Param("example") NeeqCompanyCopyrightOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyCopyrightOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_copyright
     *
     * @mbggenerated Wed Mar 21 14:31:39 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyCopyrightOnline record);
}