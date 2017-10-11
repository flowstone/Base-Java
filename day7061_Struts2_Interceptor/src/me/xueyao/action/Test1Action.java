package me.xueyao.action;

import com.opensymphony.xwork2.ActionSupport;

public class Test1Action extends ActionSupport {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Override
    public String execute() throws Exception {
        System.out.println("请求test2经过execute方法");
        return SUCCESS;
    }

}
