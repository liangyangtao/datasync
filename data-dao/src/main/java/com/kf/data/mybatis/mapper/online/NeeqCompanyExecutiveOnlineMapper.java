package com.kf.data.mybatis.mapper.online;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveOnlineExample;

public interface NeeqCompanyExecutiveOnlineMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	int countByExample(NeeqCompanyExecutiveOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	int deleteByExample(NeeqCompanyExecutiveOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	int insert(NeeqCompanyExecutiveOnline record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	int insertSelective(NeeqCompanyExecutiveOnline record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	List<NeeqCompanyExecutiveOnline> selectByExample(NeeqCompanyExecutiveOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	NeeqCompanyExecutiveOnline selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	int updateByExampleSelective(@Param("record") NeeqCompanyExecutiveOnline record,
			@Param("example") NeeqCompanyExecutiveOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	int updateByExample(@Param("record") NeeqCompanyExecutiveOnline record,
			@Param("example") NeeqCompanyExecutiveOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	int updateByPrimaryKeySelective(NeeqCompanyExecutiveOnline record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_company_executive
	 * @mbggenerated  Thu Mar 15 15:09:03 CST 2018
	 */
	int updateByPrimaryKey(NeeqCompanyExecutiveOnline record);
}