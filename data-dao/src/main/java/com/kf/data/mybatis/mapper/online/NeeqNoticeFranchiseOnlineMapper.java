package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqNoticeFranchiseOnline;
import com.kf.data.mybatis.entity.online.NeeqNoticeFranchiseOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqNoticeFranchiseOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int countByExample(NeeqNoticeFranchiseOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int deleteByExample(NeeqNoticeFranchiseOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int insert(NeeqNoticeFranchiseOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int insertSelective(NeeqNoticeFranchiseOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    List<NeeqNoticeFranchiseOnline> selectByExampleWithBLOBs(NeeqNoticeFranchiseOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    List<NeeqNoticeFranchiseOnline> selectByExample(NeeqNoticeFranchiseOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    NeeqNoticeFranchiseOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqNoticeFranchiseOnline record, @Param("example") NeeqNoticeFranchiseOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") NeeqNoticeFranchiseOnline record, @Param("example") NeeqNoticeFranchiseOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int updateByExample(@Param("record") NeeqNoticeFranchiseOnline record, @Param("example") NeeqNoticeFranchiseOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqNoticeFranchiseOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(NeeqNoticeFranchiseOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_franchise
     *
     * @mbggenerated Wed Mar 21 14:44:33 CST 2018
     */
    int updateByPrimaryKey(NeeqNoticeFranchiseOnline record);
}