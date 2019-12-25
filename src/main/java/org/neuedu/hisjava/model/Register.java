package org.neuedu.hisjava.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class Register implements Serializable {
    private String starttime;
    private String endtime;
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    private Integer id;

    private String casenumber;
    private String realname;
    private Integer gender;
    private String idnumber;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "Asia/Shanghai")
    private Date birthdate;
    private Integer age;
    private String agetype;
    private String homeaddress;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "Asia/Shanghai")
    private Date visitdate;
    private String noon;
    private Integer deptid;
    private Integer userid;
    private Integer registleid;
    private Integer settleid;
    private Boolean isbook;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date registtime;
    private Integer registerid;
    private Integer visitstate;
    private Invoice invoice;

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    private static final long serialVersionUID = 1L;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCasenumber() {
        return casenumber;
    }
    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber == null ? null : casenumber.trim();
    }
    public String getRealname() {
        return realname;
    }
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.Gender
     *
     * @return the value of register.Gender
     *
     * @mbggenerated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.Gender
     *
     * @param gender the value for register.Gender
     *
     * @mbggenerated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.IDnumber
     *
     * @return the value of register.IDnumber
     *
     * @mbggenerated
     */
    public String getIdnumber() {
        return idnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.IDnumber
     *
     * @param idnumber the value for register.IDnumber
     *
     * @mbggenerated
     */
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.BirthDate
     *
     * @return the value of register.BirthDate
     *
     * @mbggenerated
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.BirthDate
     *
     * @param birthdate the value for register.BirthDate
     *
     * @mbggenerated
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.Age
     *
     * @return the value of register.Age
     *
     * @mbggenerated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.Age
     *
     * @param age the value for register.Age
     *
     * @mbggenerated
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.AgeType
     *
     * @return the value of register.AgeType
     *
     * @mbggenerated
     */
    public String getAgetype() {
        return agetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.AgeType
     *
     * @param agetype the value for register.AgeType
     *
     * @mbggenerated
     */
    public void setAgetype(String agetype) {
        this.agetype = agetype == null ? null : agetype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.HomeAddress
     *
     * @return the value of register.HomeAddress
     *
     * @mbggenerated
     */
    public String getHomeaddress() {
        return homeaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.HomeAddress
     *
     * @param homeaddress the value for register.HomeAddress
     *
     * @mbggenerated
     */
    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.VisitDate
     *
     * @return the value of register.VisitDate
     *
     * @mbggenerated
     */
    public Date getVisitdate() {
        return visitdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.VisitDate
     *
     * @param visitdate the value for register.VisitDate
     *
     * @mbggenerated
     */
    public void setVisitdate(Date visitdate) {
        this.visitdate = visitdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.Noon
     *
     * @return the value of register.Noon
     *
     * @mbggenerated
     */
    public String getNoon() {
        return noon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.Noon
     *
     * @param noon the value for register.Noon
     *
     * @mbggenerated
     */
    public void setNoon(String noon) {
        this.noon = noon == null ? null : noon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.DeptID
     *
     * @return the value of register.DeptID
     *
     * @mbggenerated
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.DeptID
     *
     * @param deptid the value for register.DeptID
     *
     * @mbggenerated
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.UserID
     *
     * @return the value of register.UserID
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.UserID
     *
     * @param userid the value for register.UserID
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.RegistLeID
     *
     * @return the value of register.RegistLeID
     *
     * @mbggenerated
     */
    public Integer getRegistleid() {
        return registleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.RegistLeID
     *
     * @param registleid the value for register.RegistLeID
     *
     * @mbggenerated
     */
    public void setRegistleid(Integer registleid) {
        this.registleid = registleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.SettleID
     *
     * @return the value of register.SettleID
     *
     * @mbggenerated
     */
    public Integer getSettleid() {
        return settleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.SettleID
     *
     * @param settleid the value for register.SettleID
     *
     * @mbggenerated
     */
    public void setSettleid(Integer settleid) {
        this.settleid = settleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.IsBook
     *
     * @return the value of register.IsBook
     *
     * @mbggenerated
     */
    public Boolean getIsbook() {
        return isbook;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.IsBook
     *
     * @param isbook the value for register.IsBook
     *
     * @mbggenerated
     */
    public void setIsbook(Boolean isbook) {
        this.isbook = isbook;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.RegistTime
     *
     * @return the value of register.RegistTime
     *
     * @mbggenerated
     */
    public Date getRegisttime() {
        return registtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.RegistTime
     *
     * @param registtime the value for register.RegistTime
     *
     * @mbggenerated
     */
    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.RegisterID
     *
     * @return the value of register.RegisterID
     *
     * @mbggenerated
     */
    public Integer getRegisterid() {
        return registerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.RegisterID
     *
     * @param registerid the value for register.RegisterID
     *
     * @mbggenerated
     */
    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column register.VisitState
     *
     * @return the value of register.VisitState
     *
     * @mbggenerated
     */
    public Integer getVisitstate() {
        return visitstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column register.VisitState
     *
     * @param visitstate the value for register.VisitState
     *
     * @mbggenerated
     */
    public void setVisitstate(Integer visitstate) {
        this.visitstate = visitstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
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
        sb.append(", casenumber=").append(casenumber);
        sb.append(", realname=").append(realname);
        sb.append(", gender=").append(gender);
        sb.append(", idnumber=").append(idnumber);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", age=").append(age);
        sb.append(", agetype=").append(agetype);
        sb.append(", homeaddress=").append(homeaddress);
        sb.append(", visitdate=").append(visitdate);
        sb.append(", noon=").append(noon);
        sb.append(", deptid=").append(deptid);
        sb.append(", userid=").append(userid);
        sb.append(", registleid=").append(registleid);
        sb.append(", settleid=").append(settleid);
        sb.append(", isbook=").append(isbook);
        sb.append(", registtime=").append(registtime);
        sb.append(", registerid=").append(registerid);
        sb.append(", visitstate=").append(visitstate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}