package org.neuedu.hisjava.mapper;

import org.neuedu.hisjava.model.DrugsDetailed;

public interface DrugsDetailedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugsdetailed
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugsdetailed
     *
     * @mbggenerated
     */
    int insert(DrugsDetailed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugsdetailed
     *
     * @mbggenerated
     */
    int insertSelective(DrugsDetailed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugsdetailed
     *
     * @mbggenerated
     */
    DrugsDetailed selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugsdetailed
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DrugsDetailed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugsdetailed
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DrugsDetailed record);
}