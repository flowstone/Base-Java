package me.xueyao.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import me.xueyao.ssh.domain.Customer;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Customer customer = new Customer();//一定要手动实例化
    
    public String save() {
        System.out.println("action：客户保存啦...");
        return SUCCESS;
    }
    
    @Override
    public Customer getModel() {
        return customer;
    }

}
