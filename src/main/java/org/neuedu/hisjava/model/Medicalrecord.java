package org.neuedu.hisjava.model;

import java.io.Serializable;

public class Medicalrecord implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.CaseNumber
     *
     * @mbggenerated
     */
    private String casenumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.RegistID
     *
     * @mbggenerated
     */
    private Integer registid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.Readme
     *
     * @mbggenerated
     */
    private String readme;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.Present
     *
     * @mbggenerated
     */
    private String present;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.PresentTreat
     *
     * @mbggenerated
     */
    private String presenttreat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.History
     *
     * @mbggenerated
     */
    private String history;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.Allergy
     *
     * @mbggenerated
     */
    private String allergy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.Physique
     *
     * @mbggenerated
     */
    private String physique;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.Proposal
     *
     * @mbggenerated
     */
    private String proposal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.Careful
     *
     * @mbggenerated
     */
    private String careful;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.CheckResult
     *
     * @mbggenerated
     */
    private String checkresult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.Diagnosis
     *
     * @mbggenerated
     */
    private String diagnosis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.Handling
     *
     * @mbggenerated
     */
    private String handling;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column medicalrecord.CaseState
     *
     * @mbggenerated
     */
    private Integer casestate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table medicalrecord
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.ID
     *
     * @return the value of medicalrecord.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.ID
     *
     * @param id the value for medicalrecord.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.CaseNumber
     *
     * @return the value of medicalrecord.CaseNumber
     *
     * @mbggenerated
     */
    public String getCasenumber() {
        return casenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.CaseNumber
     *
     * @param casenumber the value for medicalrecord.CaseNumber
     *
     * @mbggenerated
     */
    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber == null ? null : casenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.RegistID
     *
     * @return the value of medicalrecord.RegistID
     *
     * @mbggenerated
     */
    public Integer getRegistid() {
        return registid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.RegistID
     *
     * @param registid the value for medicalrecord.RegistID
     *
     * @mbggenerated
     */
    public void setRegistid(Integer registid) {
        this.registid = registid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.Readme
     *
     * @return the value of medicalrecord.Readme
     *
     * @mbggenerated
     */
    public String getReadme() {
        return readme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.Readme
     *
     * @param readme the value for medicalrecord.Readme
     *
     * @mbggenerated
     */
    public void setReadme(String readme) {
        this.readme = readme == null ? null : readme.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.Present
     *
     * @return the value of medicalrecord.Present
     *
     * @mbggenerated
     */
    public String getPresent() {
        return present;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.Present
     *
     * @param present the value for medicalrecord.Present
     *
     * @mbggenerated
     */
    public void setPresent(String present) {
        this.present = present == null ? null : present.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.PresentTreat
     *
     * @return the value of medicalrecord.PresentTreat
     *
     * @mbggenerated
     */
    public String getPresenttreat() {
        return presenttreat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.PresentTreat
     *
     * @param presenttreat the value for medicalrecord.PresentTreat
     *
     * @mbggenerated
     */
    public void setPresenttreat(String presenttreat) {
        this.presenttreat = presenttreat == null ? null : presenttreat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.History
     *
     * @return the value of medicalrecord.History
     *
     * @mbggenerated
     */
    public String getHistory() {
        return history;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.History
     *
     * @param history the value for medicalrecord.History
     *
     * @mbggenerated
     */
    public void setHistory(String history) {
        this.history = history == null ? null : history.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.Allergy
     *
     * @return the value of medicalrecord.Allergy
     *
     * @mbggenerated
     */
    public String getAllergy() {
        return allergy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.Allergy
     *
     * @param allergy the value for medicalrecord.Allergy
     *
     * @mbggenerated
     */
    public void setAllergy(String allergy) {
        this.allergy = allergy == null ? null : allergy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.Physique
     *
     * @return the value of medicalrecord.Physique
     *
     * @mbggenerated
     */
    public String getPhysique() {
        return physique;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.Physique
     *
     * @param physique the value for medicalrecord.Physique
     *
     * @mbggenerated
     */
    public void setPhysique(String physique) {
        this.physique = physique == null ? null : physique.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.Proposal
     *
     * @return the value of medicalrecord.Proposal
     *
     * @mbggenerated
     */
    public String getProposal() {
        return proposal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.Proposal
     *
     * @param proposal the value for medicalrecord.Proposal
     *
     * @mbggenerated
     */
    public void setProposal(String proposal) {
        this.proposal = proposal == null ? null : proposal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.Careful
     *
     * @return the value of medicalrecord.Careful
     *
     * @mbggenerated
     */
    public String getCareful() {
        return careful;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.Careful
     *
     * @param careful the value for medicalrecord.Careful
     *
     * @mbggenerated
     */
    public void setCareful(String careful) {
        this.careful = careful == null ? null : careful.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.CheckResult
     *
     * @return the value of medicalrecord.CheckResult
     *
     * @mbggenerated
     */
    public String getCheckresult() {
        return checkresult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.CheckResult
     *
     * @param checkresult the value for medicalrecord.CheckResult
     *
     * @mbggenerated
     */
    public void setCheckresult(String checkresult) {
        this.checkresult = checkresult == null ? null : checkresult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.Diagnosis
     *
     * @return the value of medicalrecord.Diagnosis
     *
     * @mbggenerated
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.Diagnosis
     *
     * @param diagnosis the value for medicalrecord.Diagnosis
     *
     * @mbggenerated
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis == null ? null : diagnosis.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.Handling
     *
     * @return the value of medicalrecord.Handling
     *
     * @mbggenerated
     */
    public String getHandling() {
        return handling;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.Handling
     *
     * @param handling the value for medicalrecord.Handling
     *
     * @mbggenerated
     */
    public void setHandling(String handling) {
        this.handling = handling == null ? null : handling.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column medicalrecord.CaseState
     *
     * @return the value of medicalrecord.CaseState
     *
     * @mbggenerated
     */
    public Integer getCasestate() {
        return casestate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column medicalrecord.CaseState
     *
     * @param casestate the value for medicalrecord.CaseState
     *
     * @mbggenerated
     */
    public void setCasestate(Integer casestate) {
        this.casestate = casestate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table medicalrecord
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
        sb.append(", registid=").append(registid);
        sb.append(", readme=").append(readme);
        sb.append(", present=").append(present);
        sb.append(", presenttreat=").append(presenttreat);
        sb.append(", history=").append(history);
        sb.append(", allergy=").append(allergy);
        sb.append(", physique=").append(physique);
        sb.append(", proposal=").append(proposal);
        sb.append(", careful=").append(careful);
        sb.append(", checkresult=").append(checkresult);
        sb.append(", diagnosis=").append(diagnosis);
        sb.append(", handling=").append(handling);
        sb.append(", casestate=").append(casestate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}