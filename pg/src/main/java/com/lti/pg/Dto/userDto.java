package com.lti.pg.Dto;

public class userDto 
{
	public userDto(String userNameFirst, String userEmail, String userNameMiddle, String userNameLast, String userPass, String userAddress, int userAge, String userGender, String userType, String userZip) {
		super();
		this.userNameFirst = userNameFirst;
		this.userNameMiddle = userNameMiddle;
		this.userNameLast = userNameLast;
		this.userEmail = userEmail;
		this.userPass = userPass;
		this.userAddress = userAddress;
		this.userAge = userAge;
		this.userGender = userGender;
		this.userType = userType;
		this.userZip = userZip;
	}
	
	private String userNameFirst;
	private String userNameMiddle;
	private String userNameLast;
	private String userEmail;
	private String userPass;
	private String userAddress;
	private int userAge;
	private String userGender;
	private String userType;
	private String userZip;
	public String getUserNameFirst() {
		return userNameFirst;
	}
	public void setUserNameFirst(String userNameFirst) {
		this.userNameFirst = userNameFirst;
	}
	public String getUserNameMiddle() {
		return userNameMiddle;
	}
	public void setUserNameMiddle(String userNameMiddle) {
		this.userNameMiddle = userNameMiddle;
	}
	public String getUserNameLast() {
		return userNameLast;
	}
	public void setUserNameLast(String userNameLast) {
		this.userNameLast = userNameLast;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserZip() {
		return userZip;
	}
	public void setUserZip(String userZip) {
		this.userZip = userZip;
	}
	
}

