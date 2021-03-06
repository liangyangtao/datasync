package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyAdmPenaltyOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyAdmPenaltyOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyAdmPenaltyOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    int countByExample(NeeqCompanyAdmPenaltyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    int deleteByExample(NeeqCompanyAdmPenaltyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    int insert(NeeqCompanyAdmPenaltyOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    int insertSelective(NeeqCompanyAdmPenaltyOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    List<NeeqCompanyAdmPenaltyOnline> selectByExample(NeeqCompanyAdmPenaltyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    NeeqCompanyAdmPenaltyOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyAdmPenaltyOnline record, @Param("example") NeeqCompanyAdmPenaltyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyAdmPenaltyOnline record, @Param("example") NeeqCompanyAdmPenaltyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyAdmPenaltyOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_adm_penalty
     *
     * @mbggenerated Fri Mar 16 15:57:02 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyAdmPenaltyOnline record);
}