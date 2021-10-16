package com.lti.pg.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LOAN_APPROVAL")
public class LoanApproval {

    @Id
    @GeneratedValue
    @Column(name = "STATUS_ID")
    private int StatusID;

    @Column(name = "LOAN_ID")
    private int LoanID;

    @Column(name = "ELIGIBILITY")
    private String Eligibility;

    @Column(name = "AADHAR_APPROVAL")
    private String AadharApproval;

    @Column(name = "PAN_APPROVAL")
    private String PANApproval;

    @Column(name = "PHOTO_APPROVAL")
    private String PhotoApproval;

    @Column(name = "SALARY_APPROVAL")
    private String SalaryApproval;

    @Column(name = "STATUS")
    private String Status;

    @Column(name = "REASON")
    private String Reason;
    
    

    public LoanApproval() {

    }
 
    private LoanApplication lApplication;
    @OneToOne(targetEntity=LoanApplication.class,cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="LoanID")
    public LoanApplication getlApplication() {
    	 return lApplication;
    }
    
    public void setlApplication(LoanApplication lApplication) {
    	this.lApplication= lApplication;
    }
    
    public LoanApproval(int StatusID, int LoanID, String Eligibility, String AadharApproval, String PANApproval,
            String PhotoApproval, String SalaryApproval, String Status, String Reason) {
        this.StatusID = StatusID;
        this.LoanID = LoanID;
        this.Eligibility = Eligibility;
        this.AadharApproval = AadharApproval;
        this.PANApproval = PANApproval;
        this.PhotoApproval = PhotoApproval;
        this.SalaryApproval = SalaryApproval;
        this.Status = Status;
        this.Reason = Reason;
    }

    @Override
    public String toString() {
        return "LoanApproval [StatusID=" + StatusID + ", LoanID=" + LoanID + ", Eligibility=" + Eligibility
                + ", AadharApproval=" + AadharApproval + ", PANApproval=" + PANApproval + ",PhotoApproval=" + PhotoApproval
                + ", SalaryApproval=" + SalaryApproval + ", Status=" + Status + ", Reason=" + Reason + "]";
    }

    /**
     * @return int return the StatusID
     */
    public int getStatusID() {
        return StatusID;
    }

    /**
     * @param StatusID the StatusID to set
     */
    public void setStatusID(int StatusID) {
        this.StatusID = StatusID;
    }

    /**
     * @return int return the LoanID
     */
    public int getLoanID() {
        return LoanID;
    }

    /**
     * @param LoanID the LoanID to set
     */
    public void setLoanID(int LoanID) {
        this.LoanID = LoanID;
    }

    /**
     * @return String return the Eligibility
     */
    public String getEligibility() {
        return Eligibility;
    }

    /**
     * @param Eligibility the Eligibility to set
     */
    public void setEligibility(String Eligibility) {
        this.Eligibility = Eligibility;
    }

    /**
     * @return String return the AadharApproval
     */
    public String getAadharApproval() {
        return AadharApproval;
    }

    /**
     * @param AadharApproval the AadharApproval to set
     */
    public void setAadharApproval(String AadharApproval) {
        this.AadharApproval = AadharApproval;
    }

    /**
     * @return String return the PANApproval
     */
    public String getPANApproval() {
        return PANApproval;
    }

    /**
     * @param PANApproval the PANApproval to set
     */
    public void setPANApproval(String PANApproval) {
        this.PANApproval = PANApproval;
    }

    /**
     * @return String return the PhotoApproval
     */
    public String getPhotoApproval() {
        return PhotoApproval;
    }

    /**
     * @param PhotoApproval the PhotoApproval to set
     */
    public void setPhotoApproval(String PhotoApproval) {
        this.PhotoApproval = PhotoApproval;
    }

    /**
     * @return String return the SalaryApproval
     */
    public String getSalaryApproval() {
        return SalaryApproval;
    }

    /**
     * @param SalaryApproval the SalaryApproval to set
     */
    public void setSalaryApproval(String SalaryApproval) {
        this.SalaryApproval = SalaryApproval;
    }

    /**
     * @return String return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return String return the Reason
     */
    public String getReason() {
        return Reason;
    }

    /**
     * @param Reason the Reason to set
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

}



/*
Enter Table Creation Script


*/