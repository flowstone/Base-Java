package me.xueyao.crm.service;

import java.util.List;

import me.xueyao.crm.domain.BaseDict;

//数据字典业务层接口
public interface BaseDictService {

	//根据类型编码查询数据字典列表
	public List<BaseDict> findBaseDictByTypeCode(String dict_type_code);

}
