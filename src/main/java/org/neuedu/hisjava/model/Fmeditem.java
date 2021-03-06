package org.neuedu.hisjava.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Fmeditem implements Serializable {

    private Integer id;

    private String itemcode;

    private String itemname;

    private String format;

    private BigDecimal price;

    private Integer expclassid;

    private Integer deptid;

    private String mnemoniccode;

    private Date creationdate;

    private Date lastupdatedate;

    private Integer recordtype;

    private Integer delmark;

    private Department department;

    private Expenseclass expenseclass;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Expenseclass getExpenseclass() {
        return expenseclass;
    }

    public void setExpenseclass(Expenseclass expenseclass) {
        this.expenseclass = expenseclass;
    }

    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.ID
     *
     * @return the value of fmeditem.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.ID
     *
     * @param id the value for fmeditem.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.ItemCode
     *
     * @return the value of fmeditem.ItemCode
     *
     * @mbggenerated
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.ItemCode
     *
     * @param itemcode the value for fmeditem.ItemCode
     *
     * @mbggenerated
     */
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.ItemName
     *
     * @return the value of fmeditem.ItemName
     *
     * @mbggenerated
     */
    public String getItemname() {
        return itemname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.ItemName
     *
     * @param itemname the value for fmeditem.ItemName
     *
     * @mbggenerated
     */
    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.Format
     *
     * @return the value of fmeditem.Format
     *
     * @mbggenerated
     */
    public String getFormat() {
        return format;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.Format
     *
     * @param format the value for fmeditem.Format
     *
     * @mbggenerated
     */
    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.Price
     *
     * @return the value of fmeditem.Price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.Price
     *
     * @param price the value for fmeditem.Price
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.ExpClassID
     *
     * @return the value of fmeditem.ExpClassID
     *
     * @mbggenerated
     */
    public Integer getExpclassid() {
        return expclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.ExpClassID
     *
     * @param expclassid the value for fmeditem.ExpClassID
     *
     * @mbggenerated
     */
    public void setExpclassid(Integer expclassid) {
        this.expclassid = expclassid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.DeptID
     *
     * @return the value of fmeditem.DeptID
     *
     * @mbggenerated
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.DeptID
     *
     * @param deptid the value for fmeditem.DeptID
     *
     * @mbggenerated
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.MnemonicCode
     *
     * @return the value of fmeditem.MnemonicCode
     *
     * @mbggenerated
     */
    public String getMnemoniccode() {
        return mnemoniccode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.MnemonicCode
     *
     * @param mnemoniccode the value for fmeditem.MnemonicCode
     *
     * @mbggenerated
     */
    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode == null ? null : mnemoniccode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.CreationDate
     *
     * @return the value of fmeditem.CreationDate
     *
     * @mbggenerated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.CreationDate
     *
     * @param creationdate the value for fmeditem.CreationDate
     *
     * @mbggenerated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.LastUpdateDate
     *
     * @return the value of fmeditem.LastUpdateDate
     *
     * @mbggenerated
     */
    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.LastUpdateDate
     *
     * @param lastupdatedate the value for fmeditem.LastUpdateDate
     *
     * @mbggenerated
     */
    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.RecordType
     *
     * @return the value of fmeditem.RecordType
     *
     * @mbggenerated
     */
    public Integer getRecordtype() {
        return recordtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.RecordType
     *
     * @param recordtype the value for fmeditem.RecordType
     *
     * @mbggenerated
     */
    public void setRecordtype(Integer recordtype) {
        this.recordtype = recordtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fmeditem.DelMark
     *
     * @return the value of fmeditem.DelMark
     *
     * @mbggenerated
     */
    public Integer getDelmark() {
        return delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fmeditem.DelMark
     *
     * @param delmark the value for fmeditem.DelMark
     *
     * @mbggenerated
     */
    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fmeditem
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
        sb.append(", itemcode=").append(itemcode);
        sb.append(", itemname=").append(itemname);
        sb.append(", format=").append(format);
        sb.append(", price=").append(price);
        sb.append(", expclassid=").append(expclassid);
        sb.append(", deptid=").append(deptid);
        sb.append(", mnemoniccode=").append(mnemoniccode);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", lastupdatedate=").append(lastupdatedate);
        sb.append(", recordtype=").append(recordtype);
        sb.append(", delmark=").append(delmark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}