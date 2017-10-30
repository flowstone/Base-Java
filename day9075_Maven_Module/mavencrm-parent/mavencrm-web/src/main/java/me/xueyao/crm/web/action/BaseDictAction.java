package me.xueyao.crm.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import me.xueyao.crm.domain.BaseDict;
import me.xueyao.crm.service.BaseDictService;
import net.sf.json.JSONArray;

//数据字典的action
public class BaseDictAction extends ActionSupport implements ModelDriven<BaseDict>{
	//数据模型对象
	private BaseDict baseDict=new BaseDict();
	@Override
	public BaseDict getModel() {
		return baseDict;
	}
	
	//注入service
	private BaseDictService baseDictService;
	public void setBaseDictService(BaseDictService baseDictService) {
		this.baseDictService = baseDictService;
	}


	//根据类型编码查询数据字典数据
	public String listByTypeCode() throws Exception{
		//目标：根据类型编码查询数据字典数据,调用业务层；然后将结果转换为json，返回给客户端
		//参数的封装-；略
		//调用业务层查询
		List<BaseDict> baseDictList= baseDictService.findBaseDictByTypeCode(baseDict.getDict_type_code());
		//将java对象转换为json对象
		//引入工具类：Json-lib.
		JSONArray jsonArray=JSONArray.fromObject(baseDictList);
		
		System.out.println("------"+jsonArray);
		
		//将结果json字符串写如响应
		ServletActionContext.getResponse().setContentType("application/json; charset=UTF-8");//默认值返回是html格式，iso8859-1
		ServletActionContext.getResponse().getWriter().print(jsonArray.toString());
		//无需页面
		return NONE;
	}
	
	

}
