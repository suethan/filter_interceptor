package com.ethan.springboottest.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Author: ethan.liu
 * @Date: 2019/11/28 13:47
 */
@WebListener
public class ServletSesstionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("ServletSesstionListener===sessionCreated");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("ServletSesstionListener===sessionDestroyed");
    }
}
