package me.xueyao.action;

import com.opensymphony.xwork2.ActionSupport;

public class AjaxAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    
    private String result; //在对象栈里，因为json结果集要取这个值 
    
    public String ajax() {
        //调用业务，调用dao
        result = "这是ajax的结果";
        return SUCCESS;
    }

    public String getResult() {
        return result;
    }
    
    
}
