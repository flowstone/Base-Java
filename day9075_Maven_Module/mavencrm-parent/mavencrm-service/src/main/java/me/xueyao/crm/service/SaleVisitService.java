package me.xueyao.crm.service;

import me.xueyao.crm.domain.SaleVisit;
import me.xueyao.crm.page.Pagination;

public interface SaleVisitService {

	//分页列表查询
	public void findSaleVisitListPage(Pagination<SaleVisit> pagination);

	//添加
	public void saveSaleVisit(SaleVisit saleVisit);

}
