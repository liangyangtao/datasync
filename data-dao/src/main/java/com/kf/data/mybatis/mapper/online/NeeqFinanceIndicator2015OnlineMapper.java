package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2015Online;
import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2015OnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqFinanceIndicator2015OnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    int countByExample(NeeqFinanceIndicator2015OnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    int deleteByExample(NeeqFinanceIndicator2015OnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    int insert(NeeqFinanceIndicator2015Online record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    int insertSelective(NeeqFinanceIndicator2015Online record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    List<NeeqFinanceIndicator2015Online> selectByExample(NeeqFinanceIndicator2015OnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    NeeqFinanceIndicator2015Online selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqFinanceIndicator2015Online record, @Param("example") NeeqFinanceIndicator2015OnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    int updateByExample(@Param("record") NeeqFinanceIndicator2015Online record, @Param("example") NeeqFinanceIndicator2015OnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqFinanceIndicator2015Online record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_finance_indicator_2015
     *
     * @mbggenerated Fri Mar 23 16:54:42 CST 2018
     */
    int updateByPrimaryKey(NeeqFinanceIndicator2015Online record);
}