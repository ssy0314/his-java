package org.neuedu.hisjava.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Drugs implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.DrugsCode
     *
     * @mbggenerated
     */
    private String drugscode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.DrugsName
     *
     * @mbggenerated
     */
    private String drugsname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.DrugsFormat
     *
     * @mbggenerated
     */
    private String drugsformat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.DrugsUnit
     *
     * @mbggenerated
     */
    private String drugsunit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.Manufacturer
     *
     * @mbggenerated
     */
    private String manufacturer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.DrugsDosageID
     *
     * @mbggenerated
     */
    private Integer drugsdosageid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.DrugsTypeID
     *
     * @mbggenerated
     */
    private Integer drugstypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.DrugsPrice
     *
     * @mbggenerated
     */
    private BigDecimal drugsprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.MnemonicCode
     *
     * @mbggenerated
     */
    private String mnemoniccode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.CreationDate
     *
     * @mbggenerated
     */
    private Date creationdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.LastUpdateDate
     *
     * @mbggenerated
     */
    private Date lastupdatedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drugs.DelMark
     *
     * @mbggenerated
     */
    private Integer delmark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table drugs
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.ID
     *
     * @return the value of drugs.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.ID
     *
     * @param id the value for drugs.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.DrugsCode
     *
     * @return the value of drugs.DrugsCode
     *
     * @mbggenerated
     */
    public String getDrugscode() {
        return drugscode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.DrugsCode
     *
     * @param drugscode the value for drugs.DrugsCode
     *
     * @mbggenerated
     */
    public void setDrugscode(String drugscode) {
        this.drugscode = drugscode == null ? null : drugscode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.DrugsName
     *
     * @return the value of drugs.DrugsName
     *
     * @mbggenerated
     */
    public String getDrugsname() {
        return drugsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.DrugsName
     *
     * @param drugsname the value for drugs.DrugsName
     *
     * @mbggenerated
     */
    public void setDrugsname(String drugsname) {
        this.drugsname = drugsname == null ? null : drugsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.DrugsFormat
     *
     * @return the value of drugs.DrugsFormat
     *
     * @mbggenerated
     */
    public String getDrugsformat() {
        return drugsformat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.DrugsFormat
     *
     * @param drugsformat the value for drugs.DrugsFormat
     *
     * @mbggenerated
     */
    public void setDrugsformat(String drugsformat) {
        this.drugsformat = drugsformat == null ? null : drugsformat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.DrugsUnit
     *
     * @return the value of drugs.DrugsUnit
     *
     * @mbggenerated
     */
    public String getDrugsunit() {
        return drugsunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.DrugsUnit
     *
     * @param drugsunit the value for drugs.DrugsUnit
     *
     * @mbggenerated
     */
    public void setDrugsunit(String drugsunit) {
        this.drugsunit = drugsunit == null ? null : drugsunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.Manufacturer
     *
     * @return the value of drugs.Manufacturer
     *
     * @mbggenerated
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.Manufacturer
     *
     * @param manufacturer the value for drugs.Manufacturer
     *
     * @mbggenerated
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.DrugsDosageID
     *
     * @return the value of drugs.DrugsDosageID
     *
     * @mbggenerated
     */
    public Integer getDrugsdosageid() {
        return drugsdosageid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.DrugsDosageID
     *
     * @param drugsdosageid the value for drugs.DrugsDosageID
     *
     * @mbggenerated
     */
    public void setDrugsdosageid(Integer drugsdosageid) {
        this.drugsdosageid = drugsdosageid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.DrugsTypeID
     *
     * @return the value of drugs.DrugsTypeID
     *
     * @mbggenerated
     */
    public Integer getDrugstypeid() {
        return drugstypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.DrugsTypeID
     *
     * @param drugstypeid the value for drugs.DrugsTypeID
     *
     * @mbggenerated
     */
    public void setDrugstypeid(Integer drugstypeid) {
        this.drugstypeid = drugstypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.DrugsPrice
     *
     * @return the value of drugs.DrugsPrice
     *
     * @mbggenerated
     */
    public BigDecimal getDrugsprice() {
        return drugsprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.DrugsPrice
     *
     * @param drugsprice the value for drugs.DrugsPrice
     *
     * @mbggenerated
     */
    public void setDrugsprice(BigDecimal drugsprice) {
        this.drugsprice = drugsprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.MnemonicCode
     *
     * @return the value of drugs.MnemonicCode
     *
     * @mbggenerated
     */
    public String getMnemoniccode() {
        return mnemoniccode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.MnemonicCode
     *
     * @param mnemoniccode the value for drugs.MnemonicCode
     *
     * @mbggenerated
     */
    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode == null ? null : mnemoniccode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.CreationDate
     *
     * @return the value of drugs.CreationDate
     *
     * @mbggenerated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.CreationDate
     *
     * @param creationdate the value for drugs.CreationDate
     *
     * @mbggenerated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.LastUpdateDate
     *
     * @return the value of drugs.LastUpdateDate
     *
     * @mbggenerated
     */
    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.LastUpdateDate
     *
     * @param lastupdatedate the value for drugs.LastUpdateDate
     *
     * @mbggenerated
     */
    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drugs.DelMark
     *
     * @return the value of drugs.DelMark
     *
     * @mbggenerated
     */
    public Integer getDelmark() {
        return delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drugs.DelMark
     *
     * @param delmark the value for drugs.DelMark
     *
     * @mbggenerated
     */
    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drugs
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
        sb.append(", drugscode=").append(drugscode);
        sb.append(", drugsname=").append(drugsname);
        sb.append(", drugsformat=").append(drugsformat);
        sb.append(", drugsunit=").append(drugsunit);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", drugsdosageid=").append(drugsdosageid);
        sb.append(", drugstypeid=").append(drugstypeid);
        sb.append(", drugsprice=").append(drugsprice);
        sb.append(", mnemoniccode=").append(mnemoniccode);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", lastupdatedate=").append(lastupdatedate);
        sb.append(", delmark=").append(delmark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}