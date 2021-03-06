package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyTrademarkOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyTrademarkOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyTrademarkOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int countByExample(NeeqCompanyTrademarkOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int deleteByExample(NeeqCompanyTrademarkOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int insert(NeeqCompanyTrademarkOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int insertSelective(NeeqCompanyTrademarkOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    List<NeeqCompanyTrademarkOnline> selectByExampleWithBLOBs(NeeqCompanyTrademarkOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    List<NeeqCompanyTrademarkOnline> selectByExample(NeeqCompanyTrademarkOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    NeeqCompanyTrademarkOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyTrademarkOnline record, @Param("example") NeeqCompanyTrademarkOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") NeeqCompanyTrademarkOnline record, @Param("example") NeeqCompanyTrademarkOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyTrademarkOnline record, @Param("example") NeeqCompanyTrademarkOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyTrademarkOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(NeeqCompanyTrademarkOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_trademark
     *
     * @mbggenerated Wed Mar 21 14:29:14 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyTrademarkOnline record);
}