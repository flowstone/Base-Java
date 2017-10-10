package me.xueyao.domain;

public class PCD {
	private int id;
	private int pid;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PCD [id=" + id + ", pid=" + pid + ", name=" + name + "]";
	}

}
