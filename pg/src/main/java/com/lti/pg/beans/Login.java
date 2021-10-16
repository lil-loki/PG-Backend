package com.lti.pg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGIN")
public class Login {

	@Id
	@Column(name="ACC_NO")
	private int Accno;
	
	@Column(name="PASSWORD")
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
