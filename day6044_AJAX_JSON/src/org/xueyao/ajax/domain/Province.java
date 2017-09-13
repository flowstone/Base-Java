package org.xueyao.ajax.domain;

public class Province {
	private int codeid;
	private int parentid;
	private String cityName;
	public int getCodeid() {
		return codeid;
	}
	public void setCodeid(int codeid) {
		this.codeid = codeid;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Province [codeid=" + codeid + ", parentid=" + parentid
				+ ", cityName=" + cityName + "]";
	}
	
	
}
