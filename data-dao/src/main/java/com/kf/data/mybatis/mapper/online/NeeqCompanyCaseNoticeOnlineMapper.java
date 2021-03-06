package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyCaseNoticeOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyCaseNoticeOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyCaseNoticeOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int countByExample(NeeqCompanyCaseNoticeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int deleteByExample(NeeqCompanyCaseNoticeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int insert(NeeqCompanyCaseNoticeOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int insertSelective(NeeqCompanyCaseNoticeOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    List<NeeqCompanyCaseNoticeOnline> selectByExampleWithBLOBs(NeeqCompanyCaseNoticeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    List<NeeqCompanyCaseNoticeOnline> selectByExample(NeeqCompanyCaseNoticeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    NeeqCompanyCaseNoticeOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyCaseNoticeOnline record, @Param("example") NeeqCompanyCaseNoticeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") NeeqCompanyCaseNoticeOnline record, @Param("example") NeeqCompanyCaseNoticeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyCaseNoticeOnline record, @Param("example") NeeqCompanyCaseNoticeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyCaseNoticeOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(NeeqCompanyCaseNoticeOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_case_notice
     *
     * @mbggenerated Fri Mar 16 15:48:26 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyCaseNoticeOnline record);
}