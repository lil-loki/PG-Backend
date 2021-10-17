package com.lti.pg.beans;

import java.io.Serializable;
import javax.persistence.*;



@Entity
@Table(name="USER_TABLE")
@NamedQuery(name="UserTable.findAll", query="SELECT u FROM UserTable u")
public class UserTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "User_Id_Seq", sequenceName = "User_Id_Seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_Id_Seq")
	@Column(name="USER_ID")
	private long userId;

	@Column(name="USER_ADDRESS", length=50)
	private String userAddress;

	@Column(name="USER_AGE")
	private int userAge;

	@Column(name="USER_EMAIL", length=30)
	private String userEmail;

	@Column(name="USER_GENDER", length=30)
	private String userGender;

	@Column(name="USER_NAME_FIRST", length=30)
	private String userNameFirst;

	@Column(name="USER_NAME_LAST", length=30)
	private String userNameLast;

	@Column(name="USER_NAME_MIDDLE", length=30)
	private String userNameMiddle;

	@Column(name="USER_PASS", length=30)
	private String userPass;

	@Column(name="USER_TYPE", length=30)
	private String userType;

	@Column(name="USER_ZIP", length=30)
	private String userZip;

	//bi-directional one-to-one association to Account
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="ACC_NUMBER", referencedColumnName = "ACC_NUMBER")
	private Account account;//repo.user

	public UserTable() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public int getUserAge() {
		return this.userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserGender() {
		return this.userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserNameFirst() {
		return this.userNameFirst;
	}

	public void setUserNameFirst(String userNameFirst) {
		this.userNameFirst = userNameFirst;
	}

	public String getUserNameLast() {
		return this.userNameLast;
	}

	public void setUserNameLast(String userNameLast) {
		this.userNameLast = userNameLast;
	}

	public String getUserNameMiddle() {
		return this.userNameMiddle;
	}

	public void setUserNameMiddle(String userNameMiddle) {
		this.userNameMiddle = userNameMiddle;
	}

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserZip() {
		return this.userZip;
	}

	public void setUserZip(String userZip) {
		this.userZip = userZip;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "UserTable [userId=" + userId + ", userAddress=" + userAddress + ", userAge=" + userAge + ", userEmail="
				+ userEmail + ", userGender=" + userGender + ", userNameFirst=" + userNameFirst + ", userNameLast="
				+ userNameLast + ", userNameMiddle=" + userNameMiddle + ", userPass=" + userPass + ", userType="
				+ userType + ", userZip=" + userZip + ", account=" + account + "]";
	}
}
