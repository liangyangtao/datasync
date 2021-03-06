package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyChangeOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyChangeOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyChangeOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    int countByExample(NeeqCompanyChangeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    int deleteByExample(NeeqCompanyChangeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    int insert(NeeqCompanyChangeOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    int insertSelective(NeeqCompanyChangeOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    List<NeeqCompanyChangeOnline> selectByExample(NeeqCompanyChangeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    NeeqCompanyChangeOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyChangeOnline record, @Param("example") NeeqCompanyChangeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyChangeOnline record, @Param("example") NeeqCompanyChangeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyChangeOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_change
     *
     * @mbggenerated Thu Mar 15 13:49:19 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyChangeOnline record);
}