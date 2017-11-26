package com.zdh.api.config.uitls;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author zhangdahu
 *
 * @WebFilter将一个实现了javax.servlet.Filte接口的类定义为过滤器组件
 * 属性filterName声明过滤器的名称,可选
 * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 * 可以指定多种过滤模式@WebFilter(filterName="encodingFilter",urlPatterns={"/UserManagerServlet","/index.jsp"})
 */
@Slf4j
@WebFilter("/api/1.0/*")
public class CustomFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filterConfig = {}", filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("[request = {}], [response{}]", servletRequest, servletResponse);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
