package me.xueyao.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String username;
    
    private String password;
    
    public String login() {
        if ("stone".equals(username) && "123456".equals(password)) {
            //登录成功后把用户存放到session里
            ActionContext.getContext().getSession().put("username", username);
            return SUCCESS;
        } else {
            return "fail";
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
}
