package me.xueyao.oracle.test;

import java.sql.CallableStatement;
import java.sql.Connection;

import me.xueyao.oracle.utils.JDBCUtils;
import oracle.jdbc.OracleTypes;

public class OracleTest {
    public static void main(String[] args) throws Exception {
        //获取连接
        Connection con = JDBCUtils.getConnection();
        //获取CallableStatement
        String sql = "{call p_queryempsal_out(?,?)}"; //转义sql
        CallableStatement call = con.prepareCall(sql);
        
        //设置参数(点位符)
        //1.输入参数
        call.setInt(1, 7839); //索引位置
        //2.输出参数
        call.registerOutParameter(2, OracleTypes.DOUBLE);
        
        //执行存储
        call.execute();
        
        //获取输出参数的值 
        double sal = call.getDouble(2);
        System.out.println("薪资是："+sal);
        
        //释放资源
        JDBCUtils.release(con, call, null);
    }
}
