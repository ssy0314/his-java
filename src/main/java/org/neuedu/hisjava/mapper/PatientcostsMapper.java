package org.neuedu.hisjava.mapper;

import org.neuedu.hisjava.model.CountAndSum;
import org.neuedu.hisjava.model.Patientcosts;
import org.neuedu.hisjava.model.Register;

import java.util.List;

public interface PatientcostsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientcosts
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientcosts
     *
     * @mbggenerated
     */
    int insert(Patientcosts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientcosts
     *
     * @mbggenerated
     */
    int insertSelective(Patientcosts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientcosts
     *
     * @mbggenerated
     */
    Patientcosts selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientcosts
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Patientcosts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientcosts
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Patientcosts record);

    List<Patientcosts> getPatientCosts(Register register);

    CountAndSum getCount(Register register);
}