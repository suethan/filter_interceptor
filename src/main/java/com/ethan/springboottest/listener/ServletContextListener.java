package com.ethan.springboottest.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

/**
 * @Author: ethan.liu
 * @Date: 2019/11/28 13:47
 */
@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("ServletContextListener====contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContextListener====contextDestroyed");
    }
}
