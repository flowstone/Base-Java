package me.xueyao.domain;

public class User {
	private String username;
	private String password;
	private int age;
	
	public User() {
		System.out.println("调用User默认的构造方法");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		System.out.println("调用setUsername方法");
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("调用setPassWord方法");
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", age=" + age + "]";
	}
	
	
}
