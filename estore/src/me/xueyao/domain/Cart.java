package me.xueyao.domain;

public class Cart {
	private int uid;
	private int gid;
	private int buynum;

	// 在购物对象中添加一个商品对象，用于在页面上显示商品信息
	private Good good;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public int getBuynum() {
		return buynum;
	}

	public void setBuynum(int buynum) {
		this.buynum = buynum;
	}

	public Good getGood() {
		return good;
	}

	public void setGood(Good good) {
		this.good = good;
	}

	@Override
	public String toString() {
		return "Cart [uid=" + uid + ", gid=" + gid + ", buynum=" + buynum + ", good=" + good + "]";
	}
}
