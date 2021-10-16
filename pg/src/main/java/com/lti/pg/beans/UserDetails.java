package com.lti.pg.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name =" USER_DETAILS")
public class UserDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ACC_NO")
	private int AccNo;
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accno_generator")
	@SequenceGenerator(name = "accno_generator", initialValue = 1000, allocationSize = 1, sequenceName = "accno_seq")
	
	@Column(name = "NAME")
	private String Name;

	@Column(name = "AGE")
	private int Age;

	@Column(name = "GENDER")
	private char Gender;

	@Column(name = "PHONE_NO")
	private int PhoneNo;

	@Column(name = "EMAIL")
	private String Email;

	@Column(name = "ADDRESS")
	private String Address;

	@Column(name = "STATE")
	private String State;

	@Column(name = "PINCODE")
	private int Pincode;

	@Column(name = "AADHAR_NO")
	private String AadharNo;

	@Column(name = "PAN_CARD")
	private String PanCard;

	@Column(name = "TYPE_OF_EMPLOYMENT")
	private String TypeOfEmployment;

	@Column(name = "SALARY")
	private double Salary;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ACC_NO", referencedColumnName = "ACC_NO") 
	private LoanApplication loanapplication;

	public UserDetails() {

	}

	public UserDetails(int accNo, String name, int age, char gender, int phoneNo, String email, String address,
			String state, int pincode, String aadharNo, String panCard, String typeOfEmployment, double salary) {
		super();
		this.AccNo = accNo;
		this.Name = name;
		this.Age = age;
		this.Gender = gender;
		this.PhoneNo = phoneNo;
		this.Email = email;
		this.Address = address;
		this.State = state;
		this.Pincode = pincode;
		this.AadharNo = aadharNo;
		this.PanCard = panCard;
		this.TypeOfEmployment = typeOfEmployment;
		this.Salary = salary;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		this.AccNo = accNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public char getGender() {
		return Gender;
	}

	public void setGender(char gender) {
		this.Gender = gender;
	}

	public int getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.PhoneNo = phoneNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		this.State = state;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		this.Pincode = pincode;
	}

	public String getAadharNo() {
		return AadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.AadharNo = aadharNo;
	}

	public String getPanCard() {
		return PanCard;
	}

	public void setPanCard(String panCard) {
		this.PanCard = panCard;
	}

	public String getTypeOfEmployment() {
		return TypeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.TypeOfEmployment = typeOfEmployment;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return "UserDetails [AccNo=" + AccNo + ", Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + ", PhoneNo="
				+ PhoneNo + ", Email=" + Email + ", Address=" + Address + ", State=" + State + ", Pincode=" + Pincode
				+ ", AadharNo=" + AadharNo + ", PanCard=" + PanCard + ", TypeOfEmployment=" + TypeOfEmployment
				+ ", Salary=" + Salary + ", getAccNo()=" + getAccNo() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getGender()=" + getGender() + ", getPhoneNo()=" + getPhoneNo() + ", getEmail()="
				+ getEmail() + ", getAddress()=" + getAddress() + ", getState()=" + getState() + ", getPincode()="
				+ getPincode() + ", getAadharNo()=" + getAadharNo() + ", getPanCard()=" + getPanCard()
				+ ", getTypeOfEmployment()=" + getTypeOfEmployment() + ", getSalary()=" + getSalary() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

/*
// Enter Table Creation Script


// */
