package me.xueyao.dao;

import java.util.List;

import me.xueyao.domain.PCD;

public interface PCDDao {
	
	/**
	 * 获得三级联动数据
	 * @param pid
	 * @return
	 */
	List<PCD> getData(int pid);

}
