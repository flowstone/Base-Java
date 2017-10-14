package me.xueyao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration //指定该类是spring的配置类，用来替换bean.xml
@ComponentScan("me.xueyao")//指定扫描的包
@Import(JdbcConfig.class)  //引入其它配置类
@PropertySource("classpath:me/xueyao/config/jdbc.properties")
public class SpringConfig {
    
    @Bean //配置占位符解析器$
    public PropertySourcesPlaceholderConfigurer createPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
