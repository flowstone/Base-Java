package me.xueyao.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcConfig {
    
    @Value("${jdbc.driverClass}")
    private String driverClass;
    
    @Value("${jdbc.uri}")
    private String jdbcUrl;
    
    @Value("${jdbc.username}")
    private String username;
    
    @Value("${jdbc.password}")
    private String password;
    
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
            dataSource.setDriverClass(driverClass);
            dataSource.setJdbcUrl(jdbcUrl);
            dataSource.setUser(username);
            dataSource.setPassword(password);
        } catch (PropertyVetoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return dataSource;
    }
}
