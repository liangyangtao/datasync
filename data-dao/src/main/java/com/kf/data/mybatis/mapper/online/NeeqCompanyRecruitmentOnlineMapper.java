package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyRecruitmentOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyRecruitmentOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyRecruitmentOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int countByExample(NeeqCompanyRecruitmentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int deleteByExample(NeeqCompanyRecruitmentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int insert(NeeqCompanyRecruitmentOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int insertSelective(NeeqCompanyRecruitmentOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    List<NeeqCompanyRecruitmentOnline> selectByExampleWithBLOBs(NeeqCompanyRecruitmentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    List<NeeqCompanyRecruitmentOnline> selectByExample(NeeqCompanyRecruitmentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    NeeqCompanyRecruitmentOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyRecruitmentOnline record, @Param("example") NeeqCompanyRecruitmentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") NeeqCompanyRecruitmentOnline record, @Param("example") NeeqCompanyRecruitmentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyRecruitmentOnline record, @Param("example") NeeqCompanyRecruitmentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyRecruitmentOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(NeeqCompanyRecruitmentOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_recruitment
     *
     * @mbggenerated Thu Mar 22 11:45:20 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyRecruitmentOnline record);
}