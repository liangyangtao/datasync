package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyPatentOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyPatentOnlineExample;
import com.kf.data.mybatis.entity.online.NeeqCompanyPatentOnlineWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyPatentOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int countByExample(NeeqCompanyPatentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int deleteByExample(NeeqCompanyPatentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int insert(NeeqCompanyPatentOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int insertSelective(NeeqCompanyPatentOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    List<NeeqCompanyPatentOnlineWithBLOBs> selectByExampleWithBLOBs(NeeqCompanyPatentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    List<NeeqCompanyPatentOnline> selectByExample(NeeqCompanyPatentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    NeeqCompanyPatentOnlineWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyPatentOnlineWithBLOBs record, @Param("example") NeeqCompanyPatentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") NeeqCompanyPatentOnlineWithBLOBs record, @Param("example") NeeqCompanyPatentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyPatentOnline record, @Param("example") NeeqCompanyPatentOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyPatentOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(NeeqCompanyPatentOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_patent
     *
     * @mbggenerated Wed Mar 21 14:25:49 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyPatentOnline record);
}