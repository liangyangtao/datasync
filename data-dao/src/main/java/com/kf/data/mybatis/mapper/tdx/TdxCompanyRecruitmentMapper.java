package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyRecruitment;
import com.kf.data.mybatis.entity.tdx.TdxCompanyRecruitmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyRecruitmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int countByExample(TdxCompanyRecruitmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int deleteByExample(TdxCompanyRecruitmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int insert(TdxCompanyRecruitment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int insertSelective(TdxCompanyRecruitment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    List<TdxCompanyRecruitment> selectByExampleWithBLOBs(TdxCompanyRecruitmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    List<TdxCompanyRecruitment> selectByExample(TdxCompanyRecruitmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    TdxCompanyRecruitment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") TdxCompanyRecruitment record, @Param("example") TdxCompanyRecruitmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") TdxCompanyRecruitment record, @Param("example") TdxCompanyRecruitmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int updateByExample(@Param("record") TdxCompanyRecruitment record, @Param("example") TdxCompanyRecruitmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int updateByPrimaryKeySelective(TdxCompanyRecruitment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TdxCompanyRecruitment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_recruitment
     *
     * @mbggenerated Thu Mar 22 14:02:36 CST 2018
     */
    int updateByPrimaryKey(TdxCompanyRecruitment record);
}