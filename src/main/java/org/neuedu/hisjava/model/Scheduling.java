package org.neuedu.hisjava.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Scheduling implements Serializable {

    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date scheddate;
    private Integer deptid;
    private Integer userid;
    private String noon;
    private String deptname;
    private String realname;
    private String registname;
    private Integer ruleid;
    private Integer registquota;
    private Integer delmark;

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRegistname() {
        return registname;
    }

    public void setRegistname(String registname) {
        this.registname = registname;
    }

    public Integer getRegistquota() {
        return registquota;
    }

    public void setRegistquota(Integer registquota) {
        this.registquota = registquota;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getScheddate() {
        return scheddate;
    }

    public void setScheddate(Date scheddate) {
        this.scheddate = scheddate;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon == null ? null : noon.trim();
    }

    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }


    @Override
    public String toString() {
        return "Scheduling{" +
                "id=" + id +
                ", scheddate=" + scheddate +
                ", deptid=" + deptid +
                ", userid=" + userid +
                ", noon='" + noon + '\'' +
                ", deptname='" + deptname + '\'' +
                ", realname='" + realname + '\'' +
                ", registname='" + registname + '\'' +
                ", ruleid=" + ruleid +
                ", registquota=" + registquota +
                ", delmark=" + delmark +
                '}';
    }
}