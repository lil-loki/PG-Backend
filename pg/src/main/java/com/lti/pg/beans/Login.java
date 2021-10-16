package com.lti.pg.beans;

public class Login {

	private int Accno;
	private String Password;

	public Login() {
		super();
	}

	public Login(int accno, String password) {
		super();
		this.Accno = accno;
		this.Password = password;
	}

	public int getAccno() {
		return Accno;
	}

	public void setAccno(int accno) {
		this.Accno = accno;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	@Override
	public String toString() {
		return "Login [Accno=" + Accno + ", Password=" + Password + "]";
	}

}
