package org.neuedu.hisjava.mapper;

import org.neuedu.hisjava.model.Medicalrecord;

public interface MedicalrecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicalrecord
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicalrecord
     *
     * @mbggenerated
     */
    int insert(Medicalrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicalrecord
     *
     * @mbggenerated
     */
    int insertSelective(Medicalrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicalrecord
     *
     * @mbggenerated
     */
    Medicalrecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicalrecord
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Medicalrecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicalrecord
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Medicalrecord record);
}