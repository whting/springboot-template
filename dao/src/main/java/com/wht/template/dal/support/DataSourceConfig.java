package com.wht.template.dal.support;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 参考：http://blog.didispace.com/springbootmultidatasource/
 *
 * Created by libinsong on 2017/4/18.
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "dataSource", initMethod = "init",destroyMethod="close")
    @ConfigurationProperties(prefix="spring.datasource.druid.primary")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

}
