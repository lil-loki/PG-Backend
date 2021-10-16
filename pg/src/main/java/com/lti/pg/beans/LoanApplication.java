package com.lti.pg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="LOAN_APPLICATION")
public class LoanApplication {	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LoanIDSeq")
	@SequenceGenerator(name="LoanIDSeq",sequenceName="LoanIDSeq",allocationSize=1)
	@Column(name="LOAN_ID")
	private int LoanID;
	
	@Column(name="ACC_NO")
	private int AccNo;
	
	@Column(name="EXISTING_EMI")
	private String ExistingEMI;
	
	@Column(name="EMI_AMOUNT")
	private int EMIAmount;
	
	@Column(name="TENURE_LEFT")
	private int TenureLeft;
	
	@Column(name="CAR_MAKE")
	private String CarMake;
	
	@Column(name="CAR_MODEL")
	private String CarModel;
	
	@Column(name="PRICE")
	private int Price;
	
	@Column(name="LOAN_AMOUNT")
	private int LoanAmount;
	
	@Column(name="LOAN_TENURE")
	private int LoanTenure;
	
	@Column(name="RATE_OF_INTEREST")
	private int RateOfInterest;
	
	@Column(name="AADHAR_PROOF")
	private String AadharProof;
	
	@Column(name="PAN_PROOF")
	private String PANProof;
	
	@Column(name="PHOTO_PROOF")
	private String PhotoProof;
	
	@Column(name="SALARY_PROOF")
	private String SalaryProof;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="AccNo")
	private UserDetails userdetails;
	
	
	public LoanApplication() {
		super();
	}
	
	public LoanApplication(int loanID, int accNo, String existingEMI, int eMIAmount, int tenureLeft, String carMake,
			String carModel, int price, int loanAmount, int loanTenure, int rateOfInterest,
			String aadharProof, String pANProof, String photoProof, String salaryProof) {
		super();
		LoanID = loanID;
		AccNo = accNo;
		ExistingEMI = existingEMI;
		EMIAmount = eMIAmount;
		TenureLeft = tenureLeft;
		CarMake = carMake;
		CarModel = carModel;
		Price = price;
		LoanAmount = loanAmount;
		LoanTenure = loanTenure;
		RateOfInterest = rateOfInterest;
		AadharProof = aadharProof;
		PANProof = pANProof;
		PhotoProof = photoProof;
		SalaryProof = salaryProof;
	}

	public int getLoanID() {
		return LoanID;
	}

	public void setLoanID(int loanID) {
		LoanID = loanID;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}

	public String getExistingEMI() {
		return ExistingEMI;
	}

	public void setExistingEMI(String existingEMI) {
		ExistingEMI = existingEMI;
	}

	public int getEMIAmount() {
		return EMIAmount;
	}

	public void setEMIAmount(int eMIAmount) {
		EMIAmount = eMIAmount;
	}

	public int getTenureLeft() {
		return TenureLeft;
	}

	public void setTenureLeft(int tenureLeft) {
		TenureLeft = tenureLeft;
	}

	public String getCarMake() {
		return CarMake;
	}

	public void setCarMake(String carMake) {
		CarMake = carMake;
	}

	public String getCarModel() {
		return CarModel;
	}

	public void setCarModel(String carModel) {
		CarModel = carModel;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getLoanAmount() {
		return LoanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		LoanAmount = loanAmount;
	}

	public int getLoanTenure() {
		return LoanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		LoanTenure = loanTenure;
	}

	public double getRateOfInterest() {
		return RateOfInterest;
	}

	public void setRateOfInterest(int rateOfInterest) {
		RateOfInterest = rateOfInterest;
	}

	public String getAadharProof() {
		return AadharProof;
	}

	public void setAadharProof(String aadharProof) {
		AadharProof = aadharProof;
	}

	public String getPANProof() {
		return PANProof;
	}

	public void setPANProof(String pANProof) {
		PANProof = pANProof;
	}

	public String getPhotoProof() {
		return PhotoProof;
	}

	public void setPhotoProof(String photoProof) {
		PhotoProof = photoProof;
	}

	public String getSalaryProof() {
		return SalaryProof;
	}

	public void setSalaryProof(String salaryProof) {
		SalaryProof = salaryProof;
	}

	public LoanApplication(int loanID, int accNo, String existingEMI, int eMIAmount, int tenureLeft, String carMake,
			String carModel, int price, int loanAmount, int loanTenure, int rateOfInterest,
			String aadharProof, String pANProof, String photoProof, String salaryProof, UserDetails userdetails) {
		super();
		LoanID = loanID;
		AccNo = accNo;
		ExistingEMI = existingEMI;
		EMIAmount = eMIAmount;
		TenureLeft = tenureLeft;
		CarMake = carMake;
		CarModel = carModel;
		Price = price;
		LoanAmount = loanAmount;
		LoanTenure = loanTenure;
		RateOfInterest = rateOfInterest;
		AadharProof = aadharProof;
		PANProof = pANProof;
		PhotoProof = photoProof;
		SalaryProof = salaryProof;
		this.userdetails = userdetails;
	}

	@Override
	public String toString() {
		return "LoanApplication [LoanID=" + LoanID + ", AccNo=" + AccNo + ", ExistingEMI=" + ExistingEMI
				+ ", EMIAmount=" + EMIAmount + ", TenureLeft=" + TenureLeft + ", CarMake=" + CarMake + ", CarModel="
				+ CarModel + ", Price=" + Price + ", LoanAmount=" + LoanAmount + ", LoanTenure=" + LoanTenure
				+ ", RateOfInterest=" + RateOfInterest + ", AadharProof=" + AadharProof + ", PANProof=" + PANProof
				+ ", PhotoProof=" + PhotoProof + ", SalaryProof=" + SalaryProof + ", userdetails=" + userdetails + "]";
	}
	
	
	

}