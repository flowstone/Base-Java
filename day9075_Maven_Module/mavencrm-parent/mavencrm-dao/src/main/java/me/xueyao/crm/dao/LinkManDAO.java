package me.xueyao.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import me.xueyao.crm.domain.LinkMan;

//联系人持久层
public interface LinkManDAO {

	//查询数量
	public long findCountByCriteria(DetachedCriteria criteria);

	//查询列表，当前
	public List<LinkMan> findByCriteria(DetachedCriteria criteria, int firstResult, int maxResults);

	//保存
	public void save(LinkMan linkMan);

	//根据id查询
	public LinkMan findById(Long lkm_id);

	//更新
	public void update(LinkMan linkMan);

	//删除
	public void delete(LinkMan linkMan);

}
