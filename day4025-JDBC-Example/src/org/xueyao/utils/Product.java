package org.xueyao.utils;
/**
 * @author Yao Xue
 * @date Aug 19, 2017 10:27:41 AM
 */
public class Product {
    private int pid;
    private String pname;
    private double price;
    private String flag;
    private String category_id;
    public Product() {
        super();
    }
    public Product(int pid, String pname, double price, String flag, String category_id) {
        super();
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.flag = flag;
        this.category_id = category_id;
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
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getCategory_id() {
        return category_id;
    }
    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }
    @Override
    public String toString() {
        return "Products [pid=" + pid + ", pname=" + pname + ", price=" + price + ", flag=" + flag + ", category_id="
                + category_id + "]";
    }
    
    
}
