package com.mooc.house.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FilterBeanConfig {

    /*
    * 1.构造filter
    * 2.配置拦截urlPattern
    * 3.利用FilterRegistrationBean进行包装
    * */
    @Bean
    //这个是一个包装器类，将原始的filter包装成一个Bean
    public FilterRegistrationBean logFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogFilter());
        List<String> urlList = new ArrayList<>();
        urlList.add("*");
        filterRegistrationBean.setUrlPatterns(urlList);
        return filterRegistrationBean;
    }
}
