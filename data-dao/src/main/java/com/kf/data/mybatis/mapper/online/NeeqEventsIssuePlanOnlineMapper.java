package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqEventsIssuePlanOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsIssuePlanOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqEventsIssuePlanOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int countByExample(NeeqEventsIssuePlanOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int deleteByExample(NeeqEventsIssuePlanOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int insert(NeeqEventsIssuePlanOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int insertSelective(NeeqEventsIssuePlanOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    List<NeeqEventsIssuePlanOnline> selectByExampleWithBLOBs(NeeqEventsIssuePlanOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    List<NeeqEventsIssuePlanOnline> selectByExample(NeeqEventsIssuePlanOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    NeeqEventsIssuePlanOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqEventsIssuePlanOnline record, @Param("example") NeeqEventsIssuePlanOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") NeeqEventsIssuePlanOnline record, @Param("example") NeeqEventsIssuePlanOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int updateByExample(@Param("record") NeeqEventsIssuePlanOnline record, @Param("example") NeeqEventsIssuePlanOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqEventsIssuePlanOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(NeeqEventsIssuePlanOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_plan
     *
     * @mbggenerated Thu Mar 15 10:55:50 CST 2018
     */
    int updateByPrimaryKey(NeeqEventsIssuePlanOnline record);
}