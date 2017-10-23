package me.xueyao.ssh.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import me.xueyao.ssh.domain.Customer;
import me.xueyao.ssh.service.CustomerService;

@Controller("customerAction")
@Scope("prototype")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Customer customer = new Customer();//一定要手动实例化
    
    @Autowired
    private CustomerService customerService;
    
    public String save() {
        System.out.println("action：客户保存啦...");
        customerService.saveCustomer(customer);
        return SUCCESS;
    }
    
    @Override
    public Customer getModel() {
        return customer;
    }

}
