package org.neuedu.hisjava.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Registwork implements Serializable {

    private Integer id;
    private Integer registerid;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "Asia/Shanghai")
    private Date starttime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private Date endtime;
    private String realname;
    private static final long serialVersionUID = 1L;

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registwork.ID
     *
     * @return the value of registwork.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registwork.ID
     *
     * @param id the value for registwork.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registwork.RegisterID
     *
     * @return the value of registwork.RegisterID
     *
     * @mbggenerated
     */
    public Integer getRegisterid() {
        return registerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registwork.RegisterID
     *
     * @param registerid the value for registwork.RegisterID
     *
     * @mbggenerated
     */
    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registwork.StartTime
     *
     * @return the value of registwork.StartTime
     *
     * @mbggenerated
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registwork.StartTime
     *
     * @param starttime the value for registwork.StartTime
     *
     * @mbggenerated
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column registwork.EndTime
     *
     * @return the value of registwork.EndTime
     *
     * @mbggenerated
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column registwork.EndTime
     *
     * @param endtime the value for registwork.EndTime
     *
     * @mbggenerated
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registwork
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
        sb.append(", registerid=").append(registerid);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}