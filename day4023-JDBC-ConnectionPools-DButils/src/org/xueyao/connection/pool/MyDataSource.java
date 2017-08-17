package org.xueyao.connection.pool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

/**
 * @author Yao Xue
 * @date Aug 16, 2017 1:04:53 PM
 */
public class MyDataSource implements DataSource{
    //创建一个数据库连接池
    private LinkedList<Connection> pools = new LinkedList<Connection>();
    
    //定义数据库连接需要的参数
    private static String driverClass = "";
    private static String url = "";
    private static String username = "";
    private static String password = "";
    //解析properties文件中的配置参数
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/org/xueyao/connection/pool/jdbc.properties"));
            //直接通过key获取value值
            driverClass = properties.getProperty("driverClass");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            //注册驱动
            Class.forName(driverClass);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    
    public MyDataSource() {
        //初始化数据库连接池   向集合中放入多个connection对象
        System.out.println("初始化数据库连接池");
        for (int i = 1; i <= 5; i++) {
            try {
                Connection con = DriverManager.getConnection(url, username, password);
                pools.add(con);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        System.out.println("初始化成功,池子里面有"+pools.size()+"个连接");
    }
    /**
     * 动态代理,在不改变原有类的基础上,改写类的一些方法.这是一种格式
     */
    
    @Override
    public Connection getConnection() throws SQLException {
        // 从池子中获取连接
        System.out.println("从池子中获取连接");
        final Connection con = pools.removeLast();
        /**
         * 第一个参数: 被代理对象的类加载器
         * 第二个参数: 被代理对象 的实现的接口
         * 第三个参数: 代理类需要做的工作
         */
        Connection proxyCon = (Connection)Proxy.newProxyInstance(con.getClass().getClassLoader(), con.getClass().getInterfaces(), new InvocationHandler() {
            
            /**
             * 第一个参数: 代理对象本身
             * 第二个参数: 被代理类的方法
             * 第三个参数: arg1方法执行所需要的参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("close".equals(method.getName())) {
                    System.out.println("改写close方法");
                    //只改写close方法
                    //将con放到连接池中
                    pools.add(con);
                    System.out.println("此时池子中还有"+pools.size()+"个连接");
                    return null;
                } else {
                    //保持原有方法的功能 
                    return method.invoke(con,args);
                }
            }
        });
        return proxyCon;
    }
    
    @Override
    public PrintWriter getLogWriter() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }
}
