package com.kf.data.mybatis.mapper.online;

import com.kf.data.mybatis.entity.online.NeeqTagsOnline;
import com.kf.data.mybatis.entity.online.NeeqTagsOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeeqTagsOnlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    int countByExample(NeeqTagsOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    int deleteByExample(NeeqTagsOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    int insert(NeeqTagsOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    int insertSelective(NeeqTagsOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    List<NeeqTagsOnline> selectByExample(NeeqTagsOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    NeeqTagsOnline selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    int updateByExampleSelective(@Param("record") NeeqTagsOnline record, @Param("example") NeeqTagsOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    int updateByExample(@Param("record") NeeqTagsOnline record, @Param("example") NeeqTagsOnlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    int updateByPrimaryKeySelective(NeeqTagsOnline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neeq_tags
     *
     * @mbggenerated Tue Mar 20 18:50:09 CST 2018
     */
    int updateByPrimaryKey(NeeqTagsOnline record);
}