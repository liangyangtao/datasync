package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqEventsIssueEffectOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    int countByExample(NeeqEventsIssueEffectOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    int deleteByExample(NeeqEventsIssueEffectOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    int insert(NeeqEventsIssueEffectOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    int insertSelective(NeeqEventsIssueEffectOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    List<NeeqEventsIssueEffectOnline> selectByExample(NeeqEventsIssueEffectOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    NeeqEventsIssueEffectOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqEventsIssueEffectOnline record, @Param("example") NeeqEventsIssueEffectOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    int updateByExample(@Param("record") NeeqEventsIssueEffectOnline record, @Param("example") NeeqEventsIssueEffectOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqEventsIssueEffectOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_events_issue_effect
     *
     * @mbggenerated Thu Mar 15 16:44:11 CST 2018
     */
    int updateByPrimaryKey(NeeqEventsIssueEffectOnline record);
}