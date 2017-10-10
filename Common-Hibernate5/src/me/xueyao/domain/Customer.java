package me.xueyao.domain;

import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID = -740054790158604253L;

	private Long cust_id;  //客户编号 
	private String cust_name; //客户名称
	private String cust_source; //客户信息来源
	private String cust_industry; //客户所属行业
	private String cust_level; //客户级别
	private String cust_address; //客户联系地址
	private String cust_phone; //客户联系电话
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Long cust_id, String cust_name) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
	}
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_source() {
		return cust_source;
	}
	public void setCust_source(String cust_source) {
		this.cust_source = cust_source;
	}
	public String getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(String cust_industry) {
		this.cust_industry = cust_industry;
	}
	public String getCust_level() {
		return cust_level;
	}
	public void setCust_level(String cust_level) {
		this.cust_level = cust_level;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name
				+ ", cust_source=" + cust_source + ", cust_industry="
				+ cust_industry + ", cust_level=" + cust_level
				+ ", cust_address=" + cust_address + ", cust_phone="
				+ cust_phone + "]";
	}

	
}
