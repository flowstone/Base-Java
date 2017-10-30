package me.xueyao.crm.domain;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	// `cust_id` bigint(32) '客户编号(主键)',
	private Long cust_id;//oid
	// `cust_name` varchar(32) '客户名称(公司名称)',
	private String cust_name;

	// `cust_phone` varchar(64) '固定电话',
	private String cust_phone;
	// `cust_mobile` varchar(16) '移动电话',
	private String cust_mobile;
	
	private String cust_filename;//文件真实名字
	private String cust_path;//文件路径：相对，不建议存绝对
	
	//对象关联属性
	//三个属性全部：多对一的关系
	// `cust_source` varchar(32) '客户信息来源',
//	private String cust_source;
	private BaseDict baseDictSource;
	// `cust_industry` varchar(32) '客户所属行业',
//	private String cust_industry;
	private BaseDict baseDictIndustry;
	// `cust_level` varchar(32) '客户级别',
//	private String cust_level;
	private BaseDict baseDictLevel;
	
	//添加联系人的关联属性
	//一对多
	private Set<LinkMan> linkMans=new HashSet<>();
	
	
	public Set<LinkMan> getLinkMans() {
		return linkMans;
	}
	public void setLinkMans(Set<LinkMan> linkMans) {
		this.linkMans = linkMans;
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
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	public BaseDict getBaseDictSource() {
		return baseDictSource;
	}
	public void setBaseDictSource(BaseDict baseDictSource) {
		this.baseDictSource = baseDictSource;
	}
	public BaseDict getBaseDictIndustry() {
		return baseDictIndustry;
	}
	public void setBaseDictIndustry(BaseDict baseDictIndustry) {
		this.baseDictIndustry = baseDictIndustry;
	}
	public BaseDict getBaseDictLevel() {
		return baseDictLevel;
	}
	public void setBaseDictLevel(BaseDict baseDictLevel) {
		this.baseDictLevel = baseDictLevel;
	}
	public String getCust_filename() {
		return cust_filename;
	}
	public void setCust_filename(String cust_filename) {
		this.cust_filename = cust_filename;
	}
	public String getCust_path() {
		return cust_path;
	}
	public void setCust_path(String cust_path) {
		this.cust_path = cust_path;
	}
	



}
