package com.mooc.house.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class LogFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(LogFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //在启动器启动时执行
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        //方法拦截时执行
        logger.info("Request -- coming");
        //将request,response转发到下一个filter
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        //容器销毁时执行
    }
}
