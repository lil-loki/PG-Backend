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
	private char ExistingEMI;
	
	@Column(name="EMI_AMOUNT")
	private double EMIAmount;
	
	@Column(name="TENURE_LEFT")
	private double TenureLeft;
	
	@Column(name="CAR_MAKE")
	private String CarMake;
	
	@Column(name="CAR_MODEL")
	private String CarModel;
	
	@Column(name="PRICE")
	private double Price;
	
	@Column(name="LOAN_AMOUNT")
	private double LoanAmount;
	
	@Column(name="LOAN_TENURE")
	private double LoanTenure;
	
	@Column(name="RATE_OF_INTEREST")
	private double RateOfInterest;
	
	@Column(name="AADHAR_PROOF")
	private double AadharProof;
	
	@Column(name="PAN_PROOF")
	private double PANProof;
	
	@Column(name="PHOTO_PROOF")
	private double PhotoProof;
	
	@Column(name="SALARY_PROOF")
	private double SalaryProof;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="AccNo")
	private UserDetails userdetails;
	
	
	public LoanApplication() {
		super();
	}
	
	public LoanApplication(int loanID, int accNo, char existingEMI, double eMIAmount, double tenureLeft, String carMake,
			String carModel, double price, double loanAmount, double loanTenure, double rateOfInterest,
			double aadharProof, double pANProof, double photoProof, double salaryProof) {
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

	public char getExistingEMI() {
		return ExistingEMI;
	}

	public void setExistingEMI(char existingEMI) {
		ExistingEMI = existingEMI;
	}

	public double getEMIAmount() {
		return EMIAmount;
	}

	public void setEMIAmount(double eMIAmount) {
		EMIAmount = eMIAmount;
	}

	public double getTenureLeft() {
		return TenureLeft;
	}

	public void setTenureLeft(double tenureLeft) {
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

	public void setPrice(double price) {
		Price = price;
	}

	public double getLoanAmount() {
		return LoanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}

	public double getLoanTenure() {
		return LoanTenure;
	}

	public void setLoanTenure(double loanTenure) {
		LoanTenure = loanTenure;
	}

	public double getRateOfInterest() {
		return RateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		RateOfInterest = rateOfInterest;
	}

	public double getAadharProof() {
		return AadharProof;
	}

	public void setAadharProof(double aadharProof) {
		AadharProof = aadharProof;
	}

	public double getPANProof() {
		return PANProof;
	}

	public void setPANProof(double pANProof) {
		PANProof = pANProof;
	}

	public double getPhotoProof() {
		return PhotoProof;
	}

	public void setPhotoProof(double photoProof) {
		PhotoProof = photoProof;
	}

	public double getSalaryProof() {
		return SalaryProof;
	}

	public void setSalaryProof(double salaryProof) {
		SalaryProof = salaryProof;
	}

	public LoanApplication(int loanID, int accNo, char existingEMI, double eMIAmount, double tenureLeft, String carMake,
			String carModel, double price, double loanAmount, double loanTenure, double rateOfInterest,
			double aadharProof, double pANProof, double photoProof, double salaryProof, UserDetails userdetails) {
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
