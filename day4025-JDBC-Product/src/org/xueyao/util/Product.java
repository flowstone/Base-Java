package org.xueyao.util;

/**
 * @author XueYao
 * 2017-08-19
 */
public class Product {
    private int pid;
    private String pname;
    private double price;
    private String category_id;
    private int status;

    public Product() {
    }

    public Product(int pid, String pname, double price, String category_id, int status) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.category_id = category_id;
        this.status = status;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                ", category_id='" + category_id + '\'' +
                ", status=" + status +
                '}';
    }
}
