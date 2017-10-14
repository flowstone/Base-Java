package me.xueyao.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcConfig {
    /**
     * Bean注解:把方法的返回值 交给Spring容器来管理
     * @param ds
     * @return
     */
    @Bean(name="queryRunner")
    public QueryRunner createQueryRunner(@Qualifier("dataSource")DataSource ds) {
        return new QueryRunner(ds);
    }
    
    @Bean(name="dataSource")
    public DataSource createDatSource() {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/t_201709_test");
            dataSource.setUser("root");
            dataSource.setPassword("xueyao123456");
        } catch (PropertyVetoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return dataSource;
    }
}
