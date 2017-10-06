package me.xueyao.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 用户实体类
 * @author XueYao
 *
 */
@Entity
@Table(name="sys_user")
public class SysUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long user_id;
	private String user_code;
	private String user_name;
	private String user_password;
	private String user_state;
	
	//多对多关系映射
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="user_role",joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<SysRole> roles = new HashSet<SysRole>();

	public Long getUser_id() {
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

	public Set<SysRole> getRoles() {
		return roles;
	}

	public void setRoles(Set<SysRole> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "SysUser [user_id=" + user_id + ", user_code=" + user_code
				+ ", user_name=" + user_name + ", user_password="
				+ user_password + ", user_state=" + user_state + ", roles="
				+ roles + "]";
	}
	
	
}
