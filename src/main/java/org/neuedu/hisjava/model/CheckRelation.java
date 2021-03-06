package org.neuedu.hisjava.model;

import java.io.Serializable;

public class CheckRelation implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checkrelation.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checkrelation.CheckProjID
     *
     * @mbggenerated
     */
    private Integer checkprojid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checkrelation.CheckTempID
     *
     * @mbggenerated
     */
    private Integer checktempid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checkrelation.Position
     *
     * @mbggenerated
     */
    private String position;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table checkrelation
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checkrelation.ID
     *
     * @return the value of checkrelation.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checkrelation.ID
     *
     * @param id the value for checkrelation.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checkrelation.CheckProjID
     *
     * @return the value of checkrelation.CheckProjID
     *
     * @mbggenerated
     */
    public Integer getCheckprojid() {
        return checkprojid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checkrelation.CheckProjID
     *
     * @param checkprojid the value for checkrelation.CheckProjID
     *
     * @mbggenerated
     */
    public void setCheckprojid(Integer checkprojid) {
        this.checkprojid = checkprojid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checkrelation.CheckTempID
     *
     * @return the value of checkrelation.CheckTempID
     *
     * @mbggenerated
     */
    public Integer getChecktempid() {
        return checktempid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checkrelation.CheckTempID
     *
     * @param checktempid the value for checkrelation.CheckTempID
     *
     * @mbggenerated
     */
    public void setChecktempid(Integer checktempid) {
        this.checktempid = checktempid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checkrelation.Position
     *
     * @return the value of checkrelation.Position
     *
     * @mbggenerated
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checkrelation.Position
     *
     * @param position the value for checkrelation.Position
     *
     * @mbggenerated
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checkrelation
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", checkprojid=").append(checkprojid);
        sb.append(", checktempid=").append(checktempid);
        sb.append(", position=").append(position);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}