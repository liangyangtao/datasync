package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxEventsIssuePlan;
import com.kf.data.mybatis.entity.tdx.TdxEventsIssuePlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxEventsIssuePlanMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	int countByExample(TdxEventsIssuePlanExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	int deleteByExample(TdxEventsIssuePlanExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	int insert(TdxEventsIssuePlan record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	int insertSelective(TdxEventsIssuePlan record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	List<TdxEventsIssuePlan> selectByExample(TdxEventsIssuePlanExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	TdxEventsIssuePlan selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxEventsIssuePlan record,
			@Param("example") TdxEventsIssuePlanExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	int updateByExample(@Param("record") TdxEventsIssuePlan record,
			@Param("example") TdxEventsIssuePlanExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxEventsIssuePlan record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_events_issue_plan
	 * @mbggenerated  Tue Mar 27 09:59:06 CST 2018
	 */
	int updateByPrimaryKey(TdxEventsIssuePlan record);
}