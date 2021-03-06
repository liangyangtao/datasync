package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyList;
import com.kf.data.mybatis.entity.tdx.TdxCompanyListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxCompanyListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    int countByExample(TdxCompanyListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    int deleteByExample(TdxCompanyListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    int insert(TdxCompanyList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    int insertSelective(TdxCompanyList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    List<TdxCompanyList> selectByExample(TdxCompanyListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    TdxCompanyList selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    int updateByExampleSelective(@Param("record") TdxCompanyList record, @Param("example") TdxCompanyListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    int updateByExample(@Param("record") TdxCompanyList record, @Param("example") TdxCompanyListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    int updateByPrimaryKeySelective(TdxCompanyList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_company_list
     *
     * @mbggenerated Thu Mar 22 18:11:38 CST 2018
     */
    int updateByPrimaryKey(TdxCompanyList record);
}