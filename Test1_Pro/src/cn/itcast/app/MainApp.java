package cn.itcast.app;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.domain.Employee;
import cn.itcast.tools.JDBCUtils;

/**
 * 
a) 使用连接池创建QueryRunner对象；
b) 定义SQL语句：查询所有的员工信息 (不包含没有部门的员工)，并将每个员工信息封装到一个Employee对象中。
c) 遍历所有员工信息，查询每个员工的部门信息，并将对象的部门信息封装到Employee内部的Dept对象中；
d) 遍历所有员工信息，打印每个员工的：员工姓名、性别、年龄、所属部门名称。
 * @author Yao Xue
 * @date Aug 19, 2017 8:27:40 PM
 */
public class MainApp {
    public static void main(String[] args) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select e.*,d.deptname from dept d, employee e where d.id=e.deptid";
        List<Employee> query = queryRunner.query(sql, new BeanListHandler<Employee>(Employee.class));
        
        for (Employee e: query) {
            System.out.println(e);
        }
    }
}
