package me.xueyao.ssh.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import me.xueyao.ssh.domain.Customer;
import me.xueyao.ssh.service.CustomerService;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Customer customer = new Customer();//一定要手动实例化
    
    
    private CustomerService customerService;
    
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    public String save() {
        System.out.println("action：客户保存啦...");
        //ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
        //CustomerService customerService =  (CustomerService) ac.getBean("customerService");
        customerService.saveCustomer(customer);
        
        return SUCCESS;
    }
    
    @Override
    public Customer getModel() {
        return customer;
    }

}
