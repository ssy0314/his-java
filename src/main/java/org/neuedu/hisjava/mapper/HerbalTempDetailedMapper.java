package org.neuedu.hisjava.mapper;

import org.neuedu.hisjava.model.HerbalTempDetailed;

public interface HerbalTempDetailedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table herbaltempdetailed
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table herbaltempdetailed
     *
     * @mbggenerated
     */
    int insert(HerbalTempDetailed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table herbaltempdetailed
     *
     * @mbggenerated
     */
    int insertSelective(HerbalTempDetailed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table herbaltempdetailed
     *
     * @mbggenerated
     */
    HerbalTempDetailed selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table herbaltempdetailed
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(HerbalTempDetailed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table herbaltempdetailed
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(HerbalTempDetailed record);
}