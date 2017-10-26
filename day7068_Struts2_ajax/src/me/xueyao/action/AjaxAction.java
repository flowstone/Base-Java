package me.xueyao.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
@ParentPackage("json-default")
@Namespace("/")
public class AjaxAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    
    private String result; //在对象栈里，因为json结果集要取这个值 
    @Action(value="ajaxAction",results={@Result(name="success",type="json",params={"root","result"})})
    public String ajax() {
        //调用业务，调用dao
        result = "这是ajax的结果";
        return SUCCESS;
    }

    public String getResult() {
        return result;
    }
    
    
}
