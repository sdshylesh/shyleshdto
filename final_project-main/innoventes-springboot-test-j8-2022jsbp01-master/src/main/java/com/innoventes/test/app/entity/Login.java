package com.innoventes.test.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Controller;

@Entity
public class Login {
	@Id
	private Integer userid;
	private String password;
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private String sessionid;
	
	public Login() {
		super();
		System.out.println("  i am /////////////////////////////");
	}

	public Login(Integer userid, String password, String sessionid) {
		super();
		this.userid = userid;
		this.password = password;
		this.sessionid = sessionid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSessionid() {
		return sessionid;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	

}
