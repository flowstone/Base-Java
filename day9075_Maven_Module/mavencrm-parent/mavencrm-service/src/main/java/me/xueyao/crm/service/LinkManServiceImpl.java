package me.xueyao.crm.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import me.xueyao.crm.dao.BaseDAO;
import me.xueyao.crm.dao.LinkManDAO;
import me.xueyao.crm.domain.Customer;
import me.xueyao.crm.domain.LinkMan;
import me.xueyao.crm.page.Pagination;

public class LinkManServiceImpl implements LinkManService{
	
	//注入dao
//	private LinkManDAO linkManDAO;
//	public void setLinkManDAO(LinkManDAO linkManDAO) {
//		this.linkManDAO = linkManDAO;
//	}
	
	//注入通用dao
	private BaseDAO<LinkMan, Long> linkManDAO;
	public void setLinkManDAO(BaseDAO<LinkMan, Long> linkManDAO) {
		this.linkManDAO = linkManDAO;
	}

	@Override
	public void findLinkManListPage(Pagination<LinkMan> pagination) {
		//要构建离线条件对象-备用
		DetachedCriteria criteria=DetachedCriteria.forClass(LinkMan.class);
		//1.拼接业务条件
		//获取所有参数
		Map<String, String[]> parameterMap = pagination.getParameterMap();
		
		//联系人姓名：
		String lkm_name=parameterMap.get("lkm_name")==null?null:parameterMap.get("lkm_name")[0];
		if(StringUtils.isNotBlank(lkm_name)){
			criteria.add(Restrictions.like("lkm_name", lkm_name, MatchMode.ANYWHERE));
		}
		//联系人性别：
		String lkm_gender=parameterMap.get("lkm_gender")==null?null:parameterMap.get("lkm_gender")[0];
		if(StringUtils.isNotBlank(lkm_gender)){
			criteria.add(Restrictions.eq("lkm_gender", lkm_gender));
		}
		//2.数据查询
		//2.1 总记录数
		long totalCount=linkManDAO.findCountByCriteria(criteria);
		pagination.setTotalCount(totalCount);
		
		//2.2当前页的数据列表
		List<LinkMan> resultList=linkManDAO.findByCriteria(criteria, pagination.getFirstResult(), pagination.getMaxResults());
		pagination.setResultList(resultList);
	}


	@Override
	public void saveLinkMan(LinkMan linkMan) {
		linkManDAO.save(linkMan);
		
	}


	@Override
	public LinkMan findLinkManById(Long lkm_id) {
		return linkManDAO.findById(LinkMan.class, lkm_id);
	}


	@Override
	public void updateLinkMan(LinkMan linkMan) {
		linkManDAO.update(linkMan);
		
	}


	@Override
	public void deleteLinkMan(LinkMan linkMan) {
		linkManDAO.delete(linkMan);
		
	}

}
