package me.xueyao.service;

import java.util.List;

import me.xueyao.domain.PCD;

public interface PCDService {
	
	/**
	 * 获取三级联动数据的方法
	 * @param pid
	 * @return
	 */
	List<PCD> getData(int pid);

}
