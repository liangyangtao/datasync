package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyIncomeStructureAnalysisOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyIncomeStructureAnalysisOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyIncomeStructureAnalysisOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    int countByExample(NeeqCompanyIncomeStructureAnalysisOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    int deleteByExample(NeeqCompanyIncomeStructureAnalysisOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    int insert(NeeqCompanyIncomeStructureAnalysisOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    int insertSelective(NeeqCompanyIncomeStructureAnalysisOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    List<NeeqCompanyIncomeStructureAnalysisOnline> selectByExample(NeeqCompanyIncomeStructureAnalysisOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    NeeqCompanyIncomeStructureAnalysisOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyIncomeStructureAnalysisOnline record, @Param("example") NeeqCompanyIncomeStructureAnalysisOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyIncomeStructureAnalysisOnline record, @Param("example") NeeqCompanyIncomeStructureAnalysisOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyIncomeStructureAnalysisOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_income_structure_analysis
     *
     * @mbggenerated Tue Mar 27 10:08:53 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyIncomeStructureAnalysisOnline record);
}