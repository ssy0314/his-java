package org.neuedu.hisjava.mapper;

import org.neuedu.hisjava.model.Drugs;

public interface DrugsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugs
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugs
     *
     * @mbggenerated
     */
    int insert(Drugs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugs
     *
     * @mbggenerated
     */
    int insertSelective(Drugs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugs
     *
     * @mbggenerated
     */
    Drugs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugs
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Drugs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugs
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Drugs record);
}