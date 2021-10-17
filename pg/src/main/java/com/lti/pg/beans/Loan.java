package com.lti.pg.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQuery(name="Loan.findAll", query="SELECT l FROM Loan l")
public class Loan implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "Loan_Id_Seq", sequenceName = "Loan_Id_Seq", allocationSize = 10)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Loan_Id_Seq")
	@Column(name="LOAN_ID")
	private long loanId;

	@Column(name="APPLICATION_STATUS", length=30)
	private String applicationStatus;

	@Column(name="EMI")
	private float emi;

	@Column(name="INTEREST_RATE")
	private float interestRate;

	@Column(name="LOAN_AMOUNT")
	private float loanAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="LOAN_END_DATE")
	private Date loanEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LOAN_START_DATE")
	private Date loanStartDate;

	@Column(name="LOAN_STATUS", length=30)
	private String loanStatus;

	@Column(name="PROCESSING_FEE")
	private float processingFee;
	
	@Column(name="TENURE")
	private float tenure;

	@Column(name="LOAN_TYPE", length=30)
	private String loantype;
	
	@Column(name="USER_ID")
	private long user_id;
	
	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="VEHICLE_ID", referencedColumnName = "VEHICLE_ID")
	private Vehicle vehicle;

	@ManyToOne
	@JoinColumn(name="ACC_NUMBER")
	private Account account;
	
	
   
//new
	public Loan() {
	}

	public long getLoanId() {
		return this.loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public String getApplicationStatus() {
		return this.applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public float getEmi() {
		return this.emi;
	}

	public void setEmi(float emi) {
		this.emi = emi;
	}

	public float getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public float getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Date getLoanEndDate() {
		return this.loanEndDate;
	}

	public void setLoanEndDate(Date loanEndDate) {
		this.loanEndDate = loanEndDate;
	}

	public Date getLoanStartDate() {
		return this.loanStartDate;
	}

	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public String getLoanStatus() {
		return this.loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public float getProcessingFee() {
		return this.processingFee;
	}

	public void setProcessingFee(float processingFee) {
		this.processingFee = processingFee;
	}

	public float getTenure() {
		return this.tenure;
	}

	public void setTenure(float tenure) {
		this.tenure = tenure;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public String getLoantype() {
		return loantype;
	}

	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", applicationStatus=" + applicationStatus + ", emi=" + emi
				+ ", interestRate=" + interestRate + ", loanAmount=" + loanAmount + ", loanEndDate=" + loanEndDate
				+ ", loanStartDate=" + loanStartDate + ", loanStatus=" + loanStatus + ", processingFee=" + processingFee
				+ ", tenure=" + tenure + ", loantype=" + loantype + ", vehicle=" + vehicle + ", account=" + account
				+ "]";
	}

}
