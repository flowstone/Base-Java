package me.xueyao.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
@ParentPackage("struts-default")
@Namespace("/")
@Results({@Result(name="fail",location="/fail.jsp")})
public class Test1Action extends ActionSupport {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Override
    @Action(value="test1",results={@Result(name="success",type="redirect",location="/test1.jsp")})
    public String execute() throws Exception {
        System.out.println("请求进入了execute方法...");
        return SUCCESS;
    }

}
