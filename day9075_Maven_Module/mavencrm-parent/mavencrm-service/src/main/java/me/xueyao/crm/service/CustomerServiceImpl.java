package me.xueyao.crm.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import me.xueyao.crm.dao.CustomerDAO;
import me.xueyao.crm.domain.Customer;
import me.xueyao.crm.page.Pagination;

public class CustomerServiceImpl implements CustomerService{
	//注入dao
	private CustomerDAO customerDAO;
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}


	@Override
	public void saveCustomer(Customer customer) {
		customerDAO.save(customer);
	}


	@Override
	public void findCustomerListPage(Pagination<Customer> pagination) {
		//目标：分页列表查询。。。。
		//不管用什么技术，分页列表查询都要查询两次
		//离线条件查询方案
		DetachedCriteria criteria=DetachedCriteria.forClass(Customer.class);
		//获取所有参数
		Map<String, String[]> parameterMap = pagination.getParameterMap();
		//=============拼接条件
		//获取参数的值
		//客户姓名：
		String cust_name=parameterMap.get("cust_name")==null?null:parameterMap.get("cust_name")[0];
		//尽量使用apache的工具类：common
		//lang jar：字符串的处理，强大
		//isBlank：null,"","    "-->true
		if(StringUtils.isNotBlank(cust_name)){
			//模糊匹配
			criteria.add(Restrictions.like("cust_name", cust_name, MatchMode.ANYWHERE));
		}
		
		//客户手机号码
		String cust_mobile=parameterMap.get("cust_mobile")==null?null:parameterMap.get("cust_mobile")[0];
		if(StringUtils.isNotBlank(cust_mobile)){
			//精确匹配
			criteria.add(Restrictions.eq("cust_mobile", cust_mobile));
		}
		
		//1—）总记录数:
		//今天查询的是所有
		long totalCount=customerDAO.findCountByCriteria(criteria);
		pagination.setTotalCount(totalCount);
		//2—）当页的列表
//		int firstResult=(pagination.getPage()-1)*pagination.getPageSize();//起始的索引
//		int maxResults=pagination.getPageSize();//每页最大记录数
//		List<Customer> resultList=customerDAO.findByCriteria(criteria, firstResult, maxResults);
		List<Customer> resultList=customerDAO.findByCriteria(criteria, pagination.getFirstResult(), pagination.getMaxResults());
		pagination.setResultList(resultList);
	}


	@Override
	public void deleteCustomer(Customer customer) {
		customerDAO.delete(customer);
		
	}


	@Override
	public Customer findCustomerById(Long cust_id) {
		return customerDAO.findById(cust_id);
	}


	@Override
	public void updateCustomer(Customer customer) {
		customerDAO.update(customer);
		
	}


	@Override
	public List<Customer> findCustomerList() {
		return customerDAO.findAll();
	}


	/*@Override
	public void deleteCustomer(Long cust_id) {
		// TODO Auto-generated method stub
		
	}*/

}
