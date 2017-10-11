package me.xueyao.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import me.xueyao.domain.Customer;
import me.xueyao.service.CustomerService;
import me.xueyao.service.impl.CustomerServiceImpl;

@ParentPackage("struts-default")
@Namespace("/customer")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private CustomerService customerService = new CustomerServiceImpl();

    private Customer customer = new Customer();

    private List<Customer> customers; // 在对象栈中，一定要提供get方法

    /**
     * 查询客户列表
     * @return
     */
    @Action(value = "customer_findAll", results = { @Result(name = "success", location = "/jsp/customer/list.jsp") })
    public String findAll() {
        // 方式二：自动存放
        customers = customerService.findAllCustomer();
        // HttpServletRequest request = ServletActionContext.getRequest();
        // request.setAttribute("customers", customers);
        // 方式一：手动存放
        // 先获取值栈对象
        // ValueStack valueStack = ActionContext.getContext().getValueStack();
        // 查询到集合数据存放到值栈里(对象栈)
        // valueStack.set("customers", customers);
        return SUCCESS;
    }

    @Action(value = "customer_save", results = {
            @Result(name = "success", type = "redirectAction", location = "customer_findAll") })
    public String save() {
        customerService.save(customer);
        return SUCCESS;
    }

    @Override
    public Customer getModel() {
        return customer;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

}
