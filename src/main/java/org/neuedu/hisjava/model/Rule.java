package org.neuedu.hisjava.model;

import java.io.Serializable;

public class Rule implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.RuleName
     *
     * @mbggenerated
     */
    private String rulename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.DeptID
     *
     * @mbggenerated
     */
    private Integer deptid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.UserID
     *
     * @mbggenerated
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.Week
     *
     * @mbggenerated
     */
    private String week;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule.DelMark
     *
     * @mbggenerated
     */
    private Integer delmark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rule
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.ID
     *
     * @return the value of rule.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.ID
     *
     * @param id the value for rule.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.RuleName
     *
     * @return the value of rule.RuleName
     *
     * @mbggenerated
     */
    public String getRulename() {
        return rulename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.RuleName
     *
     * @param rulename the value for rule.RuleName
     *
     * @mbggenerated
     */
    public void setRulename(String rulename) {
        this.rulename = rulename == null ? null : rulename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.DeptID
     *
     * @return the value of rule.DeptID
     *
     * @mbggenerated
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.DeptID
     *
     * @param deptid the value for rule.DeptID
     *
     * @mbggenerated
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.UserID
     *
     * @return the value of rule.UserID
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.UserID
     *
     * @param userid the value for rule.UserID
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.Week
     *
     * @return the value of rule.Week
     *
     * @mbggenerated
     */
    public String getWeek() {
        return week;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.Week
     *
     * @param week the value for rule.Week
     *
     * @mbggenerated
     */
    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule.DelMark
     *
     * @return the value of rule.DelMark
     *
     * @mbggenerated
     */
    public Integer getDelmark() {
        return delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule.DelMark
     *
     * @param delmark the value for rule.DelMark
     *
     * @mbggenerated
     */
    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule
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
        sb.append(", rulename=").append(rulename);
        sb.append(", deptid=").append(deptid);
        sb.append(", userid=").append(userid);
        sb.append(", week=").append(week);
        sb.append(", delmark=").append(delmark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}