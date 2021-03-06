package me.xueyao.factory;

import me.xueyao.dao.DepartmentDao;
import me.xueyao.dao.impl.DepartmentDaoImpl;

public class DepartmentDaoFactory {

    /**
     * 静态工厂方法获取对象
     * @return
     */
    public static DepartmentDao create() {
        return new DepartmentDaoImpl();
    }
    
    /**
     * 实例工厂方法获取对象
     * @return
     */
    public DepartmentDao create1() {
        System.out.println("实例工厂方法获取对象");
        return new DepartmentDaoImpl();
    }
}
