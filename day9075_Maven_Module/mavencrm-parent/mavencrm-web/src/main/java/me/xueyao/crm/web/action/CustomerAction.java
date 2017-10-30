package me.xueyao.crm.web.action;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.interceptor.annotations.InputConfig;

import me.xueyao.crm.domain.Customer;
import me.xueyao.crm.page.Pagination;
import me.xueyao.crm.service.CustomerService;
import me.xueyao.crm.utils.SystemContant;
import me.xueyao.crm.utils.UploadUtils;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

//客户的action
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

	//数据实体对象
	private Customer customer=new Customer();
	@Override
	public Customer getModel() {
		return customer;
	}
	
	//显示添加页面
	public String showadd(){
		
		return "addjsp";
	}
	
	//注入业务层
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	//文件上传
	//3个属性
	private File upload;//上传的文件对象引用，名字必须和input 中的name的名字一致。文件在临时文件夹下面。
	private String uploadContentType;//文件mime类型，规则：input name+ContentType
	private String uploadFileName;//文件的真实名字，规则：input name+FileName
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	//保存客户
	public String add() throws Exception{
		
		if(null!=upload){
			//第一部分：文件的处理
			//生成随机的文件名和文件夹
			String randonFileName = UploadUtils.generateRandonFileName(uploadFileName);
			String randomDir = UploadUtils.generateRandomDir(randonFileName);
			//目标文件路径--相对
			String filePath=randomDir+"/"+randonFileName;
			//目标文件的绝对路径
//			String destFilePath="D:/upload"+filePath;
			String destFilePath=SystemContant.FILE_UPLOAD_BASE_PATH+filePath;
			
			//文件复制
			//参数1：原文件
			//参数2：目标文件
			//FileUtils.copyFile(upload, new File("D:/upload/"+uploadFileName));
			FileUtils.copyFile(upload, new File(destFilePath));
			

			//第二部分：数据库的处理
			//获取参数数据--模型驱动
			
			//设置文件的字段属性值
			customer.setCust_filename(uploadFileName);//真实文件名
			customer.setCust_path(filePath);//相对路径
		}
		
		
		//调用业务层保存
		customerService.saveCustomer(customer);
		
		//跳转到列表页面
		//跳转到listaction
//		return NONE;
		return "listaction";
		
	}
	
	//属性驱动：接收分页参数
	private int page;//默认值是0
	private int pageSize;
	public void setPage(int page) {
		this.page = page;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	//分页列表查询
	public String listPage(){
		//今天目标：获取分页条件，调用业务层查询数据，将数据压入值栈，返回列表页面
		//第一步：获取分页条件参数数据，封装到分页bean中
		Pagination<Customer> pagination=new Pagination<>();
		if(this.page>0){
			//防止第一次查询的时候，没有页码值
			pagination.setPage(page);
		}
		if(this.pageSize>0){
			pagination.setPageSize(pageSize);
		}
		
		//获取所有参数
		Map<String, String[]> parameterMap = ServletActionContext.getRequest().getParameterMap();
		pagination.setParameterMap(parameterMap);
		
		//将请求条件（分页bean）传递给业务层查询
		//引用传值
		//传参之前，pagination箱子装了一半，经过业务层处理，在业务层将箱子装满，但箱子还是一个
		customerService.findCustomerListPage(pagination);
		
		//pagination压入值栈:map栈
		ActionContext.getContext().put("pagination", pagination);
		
		
//		System.out.println("==========:"+pagination.getResultList().get(0).getBaseDictLevel().getDict_item_name());
		//返回列表页面
		return "listjsp";
	}
	
	
	//删除客户
	public String delete(){
		//获取id（模型驱动）
		//第一部分：删除文件
		//查询客户
		Customer queryCustomer=customerService.findCustomerById(customer.getCust_id());
		//相对路径
		String filePath=queryCustomer.getCust_path();
		//绝对路径
		String destFilePath=SystemContant.FILE_UPLOAD_BASE_PATH+filePath;
		
		//删除文件
		new File(destFilePath).delete();
//		FileUtils.delete
		
		//第二部分：调用业务层删除
		//必须删除持久态。。。
		customerService.deleteCustomer(queryCustomer);
		
		//跳转到：刷新列表
		return "listaction";
	}
	
	
	//编写显示修改的页面
	public String showedit(){
		//1先获取id参数
		//2调用业务层查询对象
		Customer queryCustomer=customerService.findCustomerById(customer.getCust_id());
		//3压入值栈
		//推荐压入root栈顶
		ActionContext.getContext().getValueStack().push(queryCustomer);
		
		//压入root栈有名字
//		ActionContext.getContext().getValueStack().set("customer", queryCustomer);
		
		//4跳转到修改页面
		return "editjsp";
		
	}
	//修改数据
	@InputConfig(resultName="editinput")//更改遇到错误后，默认跳转的input视图的名字
	public String edit() throws Exception{
		//获取所有参数（自动）
		//第一步分：文件
		if(null!=upload){
			//临时保存旧的路径
			String oldFilePath=SystemContant.FILE_UPLOAD_BASE_PATH+customer.getCust_path();
			//1）先保存
			//第一部分：文件的处理
			//生成随机的文件名和文件夹
			String randonFileName = UploadUtils.generateRandonFileName(uploadFileName);
			String randomDir = UploadUtils.generateRandomDir(randonFileName);
			//目标文件路径--相对
			String filePath=randomDir+"/"+randonFileName;
			//目标文件的绝对路径
//			String destFilePath="D:/upload"+filePath;
			String destFilePath=SystemContant.FILE_UPLOAD_BASE_PATH+filePath;
			
			//文件复制
			//参数1：原文件
			//参数2：目标文件
			//FileUtils.copyFile(upload, new File("D:/upload/"+uploadFileName));
			FileUtils.copyFile(upload, new File(destFilePath));
			//第二部分：数据库的处理
			//获取参数数据--模型驱动
			
			//设置文件的字段属性值
			customer.setCust_filename(uploadFileName);//真实文件名
			customer.setCust_path(filePath);//相对路径
			//2）再删除旧
			new File(oldFilePath).delete();
		}
		//第二部分：数据库操作
		//调用业务层
		customerService.updateCustomer(customer);
		//刷新列表
		return "listaction";
	}
	
	
	//列出所有客户
	public String listajax() throws Exception{
		List<Customer> customerList = customerService.findCustomerList();
		//将customerlist转换为json
		JsonConfig jsonConfig=new JsonConfig();
		//排除哪个属性不转换
		jsonConfig.setExcludes(new String[]{"baseDictSource","baseDictIndustry","baseDictLevel","linkMans"});
		
		JSONArray jsonArray=JSONArray.fromObject(customerList,jsonConfig);
		//写入响应
		ServletActionContext.getResponse().setContentType("application/json;charset=utf-8");
		ServletActionContext.getResponse().getWriter().print(jsonArray.toString());
		return NONE;
	}

	
}
