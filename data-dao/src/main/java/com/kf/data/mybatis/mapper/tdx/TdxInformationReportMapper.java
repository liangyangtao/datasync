package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxInformationReport;
import com.kf.data.mybatis.entity.tdx.TdxInformationReportExample;
import com.kf.data.mybatis.entity.tdx.TdxInformationReportWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxInformationReportMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	int countByExample(TdxInformationReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	int deleteByExample(TdxInformationReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	int insert(TdxInformationReport record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	int insertSelective(TdxInformationReport record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	List<TdxInformationReport> selectByExample(TdxInformationReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	TdxInformationReport selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	int updateByExampleSelective(@Param("record") TdxInformationReport record,
			@Param("example") TdxInformationReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	int updateByExample(@Param("record") TdxInformationReport record,
			@Param("example") TdxInformationReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	int updateByPrimaryKeySelective(TdxInformationReport record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tdx_information_report
	 * @mbggenerated  Tue Mar 27 15:45:37 CST 2018
	 */
	int updateByPrimaryKey(TdxInformationReport record);
}