package com.ethan.springboottest.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;

/**
 * @Author: ethan.liu
 * @Date: 2019/11/28 13:47
 */
@WebListener
public class ServletRequestListener implements javax.servlet.ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("ServletRequestListener====requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

        System.out.println("ServletRequestListener====requestInitialized");
    }
}
