package me.xueyao.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class SysRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long role_id;
	private String role_name;
	private String role_memo;
	
	//多对多关系映射
	private Set<SysUser> users = new HashSet<SysUser>();

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getRole_memo() {
		return role_memo;
	}

	public void setRole_memo(String role_memo) {
		this.role_memo = role_memo;
	}

	public Set<SysUser> getUsers() {
		return users;
	}

	public void setUsers(Set<SysUser> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "SysRole [role_id=" + role_id + ", role_name=" + role_name
				+ ", role_memo=" + role_memo + ", users=" + users + "]";
	}
	
	

}
