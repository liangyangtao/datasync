package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqHistoryQuotationOnline;
import com.kf.data.mybatis.entity.online.NeeqHistoryQuotationOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqHistoryQuotationOnlineMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	int countByExample(NeeqHistoryQuotationOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	int deleteByExample(NeeqHistoryQuotationOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	int insert(NeeqHistoryQuotationOnline record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	int insertSelective(NeeqHistoryQuotationOnline record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	List<NeeqHistoryQuotationOnline> selectByExample(NeeqHistoryQuotationOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	NeeqHistoryQuotationOnline selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	int updateByExampleSelective(@Param("record") NeeqHistoryQuotationOnline record,
			@Param("example") NeeqHistoryQuotationOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	int updateByExample(@Param("record") NeeqHistoryQuotationOnline record,
			@Param("example") NeeqHistoryQuotationOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	int updateByPrimaryKeySelective(NeeqHistoryQuotationOnline record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table neeq_history_quotation
	 * @mbggenerated  Thu Mar 22 16:38:16 CST 2018
	 */
	int updateByPrimaryKey(NeeqHistoryQuotationOnline record);
}