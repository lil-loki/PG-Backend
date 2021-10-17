package com.lti.pg.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACC_NUMBER", length=30)
	private String accNumber;

	@Column(name="ACC_BANK_NAME", length=30)
	private String accBankName;

	@Column(name="ACC_IFSC", length=30)
	private String accIfsc;

	@Column(name="ACC_TYPE", length=30)
	private String accType;

	@Column(name="EXISITING_EMI")
	private float exisitingEmi;

	@Column(name="MONTHLY_SAVINGS")
	private float monthlySavings;

	@Column(name="Salary")
	private float salary;

	@Column(name="USER_EMPLOYMENT_TYPE", length=30)
	private String userEmploymentType;

	//bi-directional many-to-one association to Loan
	@OneToMany(mappedBy = "account")
	private List<Loan> loan;

	//bi-directional many-to-one association to UserTable
	@OneToOne(mappedBy = "account",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private UserTable user;

	public Account() {
	}

	public String getAccNumber() {
		return this.accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccBankName() {
		return this.accBankName;
	}

	public void setAccBankName(String accBankName) {
		this.accBankName = accBankName;
	}

	public String getAccIfsc() {
		return this.accIfsc;
	}

	public void setAccIfsc(String accIfsc) {
		this.accIfsc = accIfsc;
	}

	public String getAccType() {
		return this.accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public float getExisitingEmi() {
		return this.exisitingEmi;
	}

	public void setExisitingEmi(float exisitingEmi) {
		this.exisitingEmi = exisitingEmi;
	}

	public float getMonthlySavings() {
		return this.monthlySavings;
	}

	public void setMonthlySavings(float monthlySavings) {
		this.monthlySavings = monthlySavings;
	}

	public float getSalary() {
		return this.salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getUserEmploymentType() {
		return this.userEmploymentType;
	}

	public void setUserEmploymentType(String userEmploymentType) {
		this.userEmploymentType = userEmploymentType;
	}

	public UserTable getUser() {
		return user;
	}

	public void setUser(UserTable user) {
		this.user = user;
		System.out.println(user.toString());
	}

	public List<Loan> getLoan() {
		return loan;
	}

	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", accBankName=" + accBankName + ", accIfsc=" + accIfsc
				+ ", accType=" + accType + ", exisitingEmi=" + exisitingEmi + ", monthlySavings=" + monthlySavings
				+ ", salary=" + salary + ", userEmploymentType=" + userEmploymentType + ", loan=" + loan + ", user="
				+ user + "]";
	}

}