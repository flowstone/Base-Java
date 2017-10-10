package me.xueyao.domain;

public class OrderItems {
	private String oid;
	private int gid;
	private int buynum;

	/*
	 * 订单明细中不包含商品的信息，但是页面上需要显示： 在订单明细中添加商品的对象，
	 * 他们之间一一对应的关系，类似购物车对象
	 */
	private Good good;

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
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
		return "OrderItems [oid=" + oid + ", gid=" + gid + ", buynum=" + buynum + ", good=" + good
				+ "]";
	}
}
