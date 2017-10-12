package me.xueyao.factory;

import me.xueyao.dao.DepartmentDao;
import me.xueyao.dao.impl.DepartmentDaoImpl;

public class Factory {

    /**
     * 静态工厂方法获取对象
     * @return
     */
    public static DepartmentDao create() {
        return new DepartmentDaoImpl();
    }
}
