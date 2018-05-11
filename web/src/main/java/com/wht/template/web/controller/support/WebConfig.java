package com.wht.template.web.controller.support;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.wht.template.web.controller.filter.LogFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by libinsong on 2017/4/19.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Value("${filter.slow.reqmillis:3000}")
    private String slowReqMillis;


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.dateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
    }


    /**
     * {@link StatViewServlet}
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean reg = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        reg.addInitParameter("resetEnable", "false");
        reg.addInitParameter("loginUsername", "kraken");
        reg.addInitParameter("loginPassword", "krakenAdmin");
        return reg;
    }

    /**
     * {@link WebStatFilter}
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean druidWebStatFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "/druid/*,*.ico,/error");
        return filterRegistrationBean;
    }


    /**
     * {@link LogFilter}
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean logFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "/druid/*,*.ico,/error");
        filterRegistrationBean.addInitParameter("slowReqMillis", slowReqMillis);
        return filterRegistrationBean;
    }
}
