package me.xueyao.domain;

import java.util.Date;
import java.util.List;

public class Order {
	private String id;
	private int uid;
	private double totalprice;
	//省市县，详细地址，邮政编码，姓名，电话，拼接在一起组成数据库要保存的地址
	private String address;
	private int status; // 1:未支付 2：已支付 3：已过期
	private Date createtime;

	/*
	 * 每个订单都对应自己的一些明细信息，他们是“配套的”
	 * 因此，在订单对象中声明一个订单明细的集合，用于在页面上显示
	 */
	private List<OrderItems> oiList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public List<OrderItems> getOiList() {
		return oiList;
	}

	public void setOiList(List<OrderItems> oiList) {
		this.oiList = oiList;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", uid=" + uid + ", totalprice=" + totalprice + ", address="
				+ address + ", status=" + status + ", createtime=" + createtime + ", oiList="
				+ oiList + "]";
	}

}
