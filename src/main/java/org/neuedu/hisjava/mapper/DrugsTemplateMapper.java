package org.neuedu.hisjava.mapper;

import org.neuedu.hisjava.model.DrugsTemplate;

public interface DrugsTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugstemplate
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugstemplate
     *
     * @mbggenerated
     */
    int insert(DrugsTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugstemplate
     *
     * @mbggenerated
     */
    int insertSelective(DrugsTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugstemplate
     *
     * @mbggenerated
     */
    DrugsTemplate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugstemplate
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DrugsTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugstemplate
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DrugsTemplate record);
}