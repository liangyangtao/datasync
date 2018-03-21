package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqNoticeCertificateOnline;
import com.kf.data.mybatis.entity.online.NeeqNoticeCertificateOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqNoticeCertificateOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    int countByExample(NeeqNoticeCertificateOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    int deleteByExample(NeeqNoticeCertificateOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    int insert(NeeqNoticeCertificateOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    int insertSelective(NeeqNoticeCertificateOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    List<NeeqNoticeCertificateOnline> selectByExample(NeeqNoticeCertificateOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    NeeqNoticeCertificateOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqNoticeCertificateOnline record, @Param("example") NeeqNoticeCertificateOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    int updateByExample(@Param("record") NeeqNoticeCertificateOnline record, @Param("example") NeeqNoticeCertificateOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqNoticeCertificateOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_notice_certificate
     *
     * @mbggenerated Wed Mar 21 14:40:46 CST 2018
     */
    int updateByPrimaryKey(NeeqNoticeCertificateOnline record);
}