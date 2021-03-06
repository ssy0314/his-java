package org.neuedu.hisjava.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Invoice implements Serializable {

    private Integer id;
    private String invoicenum;
    private BigDecimal money;
    private Integer state;
    private Date creationtime;
    private Integer userid;
    private Integer registid;
    private Integer feetype;
    private String back;
    private Integer dailystate;
    private Register register;
    private Integer sum;
    private static final long serialVersionUID = 1L;

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.ID
     *
     * @return the value of invoice.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.ID
     *
     * @param id the value for invoice.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.InvoiceNum
     *
     * @return the value of invoice.InvoiceNum
     *
     * @mbggenerated
     */
    public String getInvoicenum() {
        return invoicenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.InvoiceNum
     *
     * @param invoicenum the value for invoice.InvoiceNum
     *
     * @mbggenerated
     */
    public void setInvoicenum(String invoicenum) {
        this.invoicenum = invoicenum == null ? null : invoicenum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.Money
     *
     * @return the value of invoice.Money
     *
     * @mbggenerated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.Money
     *
     * @param money the value for invoice.Money
     *
     * @mbggenerated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.State
     *
     * @return the value of invoice.State
     *
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.State
     *
     * @param state the value for invoice.State
     *
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.CreationTime
     *
     * @return the value of invoice.CreationTime
     *
     * @mbggenerated
     */
    public Date getCreationtime() {
        return creationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.CreationTime
     *
     * @param creationtime the value for invoice.CreationTime
     *
     * @mbggenerated
     */
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.UserID
     *
     * @return the value of invoice.UserID
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.UserID
     *
     * @param userid the value for invoice.UserID
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.RegistID
     *
     * @return the value of invoice.RegistID
     *
     * @mbggenerated
     */
    public Integer getRegistid() {
        return registid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.RegistID
     *
     * @param registid the value for invoice.RegistID
     *
     * @mbggenerated
     */
    public void setRegistid(Integer registid) {
        this.registid = registid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.FeeType
     *
     * @return the value of invoice.FeeType
     *
     * @mbggenerated
     */
    public Integer getFeetype() {
        return feetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.FeeType
     *
     * @param feetype the value for invoice.FeeType
     *
     * @mbggenerated
     */
    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.Back
     *
     * @return the value of invoice.Back
     *
     * @mbggenerated
     */
    public String getBack() {
        return back;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.Back
     *
     * @param back the value for invoice.Back
     *
     * @mbggenerated
     */
    public void setBack(String back) {
        this.back = back == null ? null : back.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invoice.DailyState
     *
     * @return the value of invoice.DailyState
     *
     * @mbggenerated
     */
    public Integer getDailystate() {
        return dailystate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invoice.DailyState
     *
     * @param dailystate the value for invoice.DailyState
     *
     * @mbggenerated
     */
    public void setDailystate(Integer dailystate) {
        this.dailystate = dailystate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table invoice
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
        sb.append(", invoicenum=").append(invoicenum);
        sb.append(", money=").append(money);
        sb.append(", state=").append(state);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", userid=").append(userid);
        sb.append(", registid=").append(registid);
        sb.append(", feetype=").append(feetype);
        sb.append(", back=").append(back);
        sb.append(", dailystate=").append(dailystate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}