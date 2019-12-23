package org.neuedu.hisjava.mapper;

import org.neuedu.hisjava.model.Fmeditem;

import java.util.List;

public interface FmeditemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fmeditem
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fmeditem
     *
     * @mbggenerated
     */
    int insert(Fmeditem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fmeditem
     *
     * @mbggenerated
     */
    int insertSelective(Fmeditem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fmeditem
     *
     * @mbggenerated
     */
    Fmeditem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fmeditem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Fmeditem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fmeditem
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Fmeditem record);



    int delManyFmeditem(Integer[] ids);

    int delFmeditem(Integer id);

    List<Fmeditem> searchFmeditemBynameOrcode(String keywords);
}