package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqCompanyEquityFreezeOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyEquityFreezeOnlineExample;
import com.kf.data.mybatis.entity.online.NeeqCompanyEquityFreezeOnlineWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqCompanyEquityFreezeOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int countByExample(NeeqCompanyEquityFreezeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int deleteByExample(NeeqCompanyEquityFreezeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int insert(NeeqCompanyEquityFreezeOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int insertSelective(NeeqCompanyEquityFreezeOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    List<NeeqCompanyEquityFreezeOnlineWithBLOBs> selectByExampleWithBLOBs(NeeqCompanyEquityFreezeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    List<NeeqCompanyEquityFreezeOnline> selectByExample(NeeqCompanyEquityFreezeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    NeeqCompanyEquityFreezeOnlineWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqCompanyEquityFreezeOnlineWithBLOBs record, @Param("example") NeeqCompanyEquityFreezeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") NeeqCompanyEquityFreezeOnlineWithBLOBs record, @Param("example") NeeqCompanyEquityFreezeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int updateByExample(@Param("record") NeeqCompanyEquityFreezeOnline record, @Param("example") NeeqCompanyEquityFreezeOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqCompanyEquityFreezeOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(NeeqCompanyEquityFreezeOnlineWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_company_equity_freeze
     *
     * @mbggenerated Fri Mar 16 16:13:40 CST 2018
     */
    int updateByPrimaryKey(NeeqCompanyEquityFreezeOnline record);
}