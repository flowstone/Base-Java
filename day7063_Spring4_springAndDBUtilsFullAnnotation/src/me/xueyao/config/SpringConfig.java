package me.xueyao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //指定该类是spring的配置类，用来替换bean.xml
@ComponentScan("me.xueyao")//指定扫描的包
@Import(JdbcConfig.class)  //引入其它配置类
public class SpringConfig {
    
    
    
    /*@Bean
    public PropertySourcesPlaceholderConfigurer createPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }*/
}
