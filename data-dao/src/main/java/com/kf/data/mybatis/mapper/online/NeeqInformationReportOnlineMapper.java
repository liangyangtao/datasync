package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqInformationReportOnline;
import com.kf.data.mybatis.entity.online.NeeqInformationReportOnlineExample;
import com.kf.data.mybatis.entity.online.NeeqInformationReportOnlineWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqInformationReportOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int countByExample(NeeqInformationReportOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int deleteByExample(NeeqInformationReportOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int insert(NeeqInformationReportOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int insertSelective(NeeqInformationReportOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    List<NeeqInformationReportOnlineWithBLOBs> selectByExampleWithBLOBs(NeeqInformationReportOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    List<NeeqInformationReportOnline> selectByExample(NeeqInformationReportOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    NeeqInformationReportOnlineWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqInformationReportOnlineWithBLOBs record, @Param("example") NeeqInformationReportOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") NeeqInformationReportOnlineWithBLOBs record, @Param("example") NeeqInformationReportOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int updateByExample(@Param("record") NeeqInformationReportOnline record, @Param("example") NeeqInformationReportOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqInformationReportOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(NeeqInformationReportOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_information_report
     *
     * @mbggenerated Thu Mar 22 16:38:54 CST 2018
     */
    int updateByPrimaryKey(NeeqInformationReportOnline record);
}