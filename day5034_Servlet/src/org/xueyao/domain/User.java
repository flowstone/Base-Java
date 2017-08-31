package org.xueyao.domain;

public class User {
	private int userid;
	private String username;
	private String userpass;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String username, String userpass) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpass = userpass;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	
	
}
