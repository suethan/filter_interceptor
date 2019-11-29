package com.ethan.springboottest.filter;
import com.ethan.springboottest.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author: ethan.liu
 * @Date: 2019/11/28 15:07
 */
@WebFilter("/user/*")
public class MyFilter implements Filter {

    @Autowired
    UserServices userServices;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = ((HttpServletRequest) servletRequest);
        if (request.getRequestURI().contains("info")){
            System.out.println("MyFilter---doFilter");
            filterChain.doFilter(servletRequest,servletResponse);
            return;
        }

        servletResponse.getWriter().print("hello");
        servletResponse.getWriter().flush();
        servletResponse.getWriter().close();
    }

    @Override
    public void destroy() {

    }
}
