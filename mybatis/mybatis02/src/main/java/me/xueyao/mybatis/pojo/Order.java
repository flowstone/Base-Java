package me.xueyao.mybatis.pojo;


import java.io.Serializable;

/**
 * 订单表
 * 
 */
public class Order implements Serializable{

    private static final long serialVersionUID = 282205137365425254L;
    private Integer id;

    private Long userId;

    private String orderNumber;

    private  User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderNumber='" + orderNumber + '\'' +
                ", user=" + user +
                '}';
    }
}
