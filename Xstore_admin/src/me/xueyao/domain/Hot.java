package me.xueyao.domain;

public class Hot {
	private String name;
	private int gid;
	private int hot;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getHot() {
		return hot;
	}
	public void setHot(int hot) {
		this.hot = hot;
	}
	@Override
	public String toString() {
		return "Hot [name=" + name + ", gid=" + gid + ", hot=" + hot + "]";
	}
	
	
}
