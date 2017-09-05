package org.xueyao.produce.domain;

import java.util.Date;

public class Product {
	private String pid; //商品编号
	private String pname; //商品名称
	private Double market_price; //商品市场价格
	private Double shop_price; //商品商城价格
	private String pimage; //商品图片路径 
	private Date pDate; //商品上架日期
	private int is_hot; //商品是否为热门商品
	private String pdesc; //商品描述 
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getMarket_price() {
		return market_price;
	}
	public void setMarket_price(Double market_price) {
		this.market_price = market_price;
	}
	public Double getShop_price() {
		return shop_price;
	}
	public void setShop_price(Double shop_price) {
		this.shop_price = shop_price;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public Date getpDate() {
		return pDate;
	}
	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}
	public int getIs_hot() {
		return is_hot;
	}
	public void setIs_hot(int is_hot) {
		this.is_hot = is_hot;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String pid, String pname, Double market_price,
			Double shop_price, String pimage, Date pDate, int is_hot,
			String pdesc) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.market_price = market_price;
		this.shop_price = shop_price;
		this.pimage = pimage;
		this.pDate = pDate;
		this.is_hot = is_hot;
		this.pdesc = pdesc;
	}
	
	
}
