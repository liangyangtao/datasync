package com.kf.data.mybatis.mapper.tdx;

import com.kf.data.mybatis.entity.tdx.TdxNews;
import com.kf.data.mybatis.entity.tdx.TdxNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TdxNewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int countByExample(TdxNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int deleteByExample(TdxNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int insert(TdxNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int insertSelective(TdxNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    List<TdxNews> selectByExampleWithBLOBs(TdxNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    List<TdxNews> selectByExample(TdxNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    TdxNews selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") TdxNews record, @Param("example") TdxNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") TdxNews record, @Param("example") TdxNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int updateByExample(@Param("record") TdxNews record, @Param("example") TdxNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int updateByPrimaryKeySelective(TdxNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TdxNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tdx_news
     *
     * @mbggenerated Fri Mar 23 14:57:54 CST 2018
     */
    int updateByPrimaryKey(TdxNews record);
}