package me.xueyao.crm.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import me.xueyao.crm.dao.BaseDAO;
import me.xueyao.crm.domain.LinkMan;
import me.xueyao.crm.domain.SaleVisit;
import me.xueyao.crm.page.Pagination;

public class SaleVisitServiceImpl implements SaleVisitService{
	//注入dao
	private BaseDAO<SaleVisit, String> saleVisitDAO;
	public void setSaleVisitDAO(BaseDAO<SaleVisit, String> saleVisitDAO) {
		this.saleVisitDAO = saleVisitDAO;
	}



	@Override
	public void findSaleVisitListPage(Pagination<SaleVisit> pagination) {
		//要构建离线条件对象-备用
		DetachedCriteria criteria=DetachedCriteria.forClass(SaleVisit.class);
		//1.拼接业务条件
		//获取所有参数
		Map<String, String[]> parameterMap = pagination.getParameterMap();
		//日期转换器
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		
		//拜访开始时间
		String visit_start_time=parameterMap.get("visit_start_time")==null?null:parameterMap.get("visit_start_time")[0];
		if(StringUtils.isNotBlank(visit_start_time)){
			try {
				criteria.add(Restrictions.ge("visit_time", df.parse(visit_start_time)));
			} catch (ParseException e) {
				e.printStackTrace();
				throw new RuntimeException("日期转换错误。。。。。");
			}
			
		}
		
		//拜访的结束时间
		String visit_end_time=parameterMap.get("visit_end_time")==null?null:parameterMap.get("visit_end_time")[0];
		if(StringUtils.isNotBlank(visit_end_time)){
			try {
				criteria.add(Restrictions.le("visit_time", df.parse(visit_end_time)));
			} catch (ParseException e) {
				e.printStackTrace();
				throw new RuntimeException("日期转换错误。。。。。");
			}
			
		}
		
		//联系人姓名：
//		String lkm_name=parameterMap.get("lkm_name")==null?null:parameterMap.get("lkm_name")[0];
//		if(StringUtils.isNotBlank(lkm_name)){
//			criteria.add(Restrictions.like("lkm_name", lkm_name, MatchMode.ANYWHERE));
//		}
//		//联系人性别：
//		String lkm_gender=parameterMap.get("lkm_gender")==null?null:parameterMap.get("lkm_gender")[0];
//		if(StringUtils.isNotBlank(lkm_gender)){
//			criteria.add(Restrictions.eq("lkm_gender", lkm_gender));
//		}
		//2.数据查询
		//2.1 总记录数
		long totalCount=saleVisitDAO.findCountByCriteria(criteria);
		pagination.setTotalCount(totalCount);
		
		//2.2当前页的数据列表
		List<SaleVisit> resultList=saleVisitDAO.findByCriteria(criteria, pagination.getFirstResult(), pagination.getMaxResults());
		pagination.setResultList(resultList);
		
	}



	@Override
	public void saveSaleVisit(SaleVisit saleVisit) {
		saleVisitDAO.save(saleVisit);
		
	}

}
