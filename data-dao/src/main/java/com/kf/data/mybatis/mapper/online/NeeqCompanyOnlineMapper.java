package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int countByExample(NeeqCompanyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int deleteByExample(NeeqCompanyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int insert(NeeqCompanyOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int insertSelective(NeeqCompanyOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    List<NeeqCompanyOnline> selectByExampleWithBLOBs(NeeqCompanyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    List<NeeqCompanyOnline> selectByExample(NeeqCompanyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    NeeqCompanyOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyOnline record, @Param("example") NeeqCompanyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") NeeqCompanyOnline record, @Param("example") NeeqCompanyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyOnline record, @Param("example") NeeqCompanyOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(NeeqCompanyOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company
     *
     * @mbggenerated Thu Mar 15 13:49:03 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyOnline record);
}