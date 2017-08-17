package org.xueyao.jdbc.task;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Yao Xue
 * @date Aug 16, 2017 11:41:19 AM
 */
public class Task06 {
    public static void main(String[] args) {
        createTable();
    }

    private static void createTable() {
        String createDeptSql = "CREATE TABLE IF NOT EXISTS dept("
        +"deptno INT AUTO_INCREMENT COMMENT '部门编号',"
        +"deptname VARCHAR(30) NOT NULL UNIQUE DEFAULT '' COMMENT '部门名称',"
        +"PRIMARY KEY (deptno)"
        +") CHARACTER SET utf8 COMMENT '部门表';";
        
        String createEmpSql = "CREATE TABLE IF NOT EXISTS employee("
        +"id INT AUTO_INCREMENT COMMENT '员工编号',"
        +"name VARCHAR(30) NOT NULL UNIQUE DEFAULT '' COMMENT '员工姓名',"
        +"gender CHAR NOT NULL DEFAULT '' COMMENT '员工性别',"
        +"position VARCHAR(20) NOT NULL DEFAULT '' COMMENT '员工职位',"
        +"salary DECIMAL NOT NULL DEFAULT 0 COMMENT '员工工资',"
        +"addTime DATE NOT NULL DEFAULT '1999-09-09' COMMENT '入职日期',"
        +"deptno INT,"
        +"PRIMARY KEY (id),"
        +"FOREIGN KEY (deptno) REFERENCES dept(deptno)"
        +")CHARACTER SET utf8 COMMENT '员工表'";
        
        Connection con = null;
        Statement statement = null;
        con = JdbcUtil.getConnection();
        try {
            statement = con.createStatement();
            //批处理,可以同时执行多条sql语句 
            statement.addBatch(createDeptSql);
            statement.addBatch(createEmpSql);
            
            int[] row = statement.executeBatch();
            System.out.println(row);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JdbcUtil.close(con,statement);
        }
        
    }
}
