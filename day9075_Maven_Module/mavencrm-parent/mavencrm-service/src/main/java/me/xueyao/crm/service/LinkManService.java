package me.xueyao.crm.service;

import me.xueyao.crm.domain.LinkMan;
import me.xueyao.crm.page.Pagination;

public interface LinkManService {


	//组合条件分页查询
	public void findLinkManListPage(Pagination<LinkMan> pagination);

	//保存联系人
	public void saveLinkMan(LinkMan linkMan);

	//根据id查询
	public LinkMan findLinkManById(Long lkm_id);

	//更新联系人
	public void updateLinkMan(LinkMan linkMan);

	//删除联系人
	public void deleteLinkMan(LinkMan linkMan);

}
