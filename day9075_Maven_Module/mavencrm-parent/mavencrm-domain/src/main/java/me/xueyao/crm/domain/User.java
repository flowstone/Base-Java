package me.xueyao.crm.domain;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

//用户实体类
public class User {
	private Long user_id;//oid
	private String user_code;//登录名,帐号
	private String user_name;//用户显示的真实姓名
	private String user_password;//密码
	private String user_state;//用户状态，默认1，可用
	
	public Long getUser_id() {
//		LocalSessionFactoryBean l=null;
//		l.setMappingLocations(mappingLocations);
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_state() {
		return user_state;
	}
	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}
	
	

}
