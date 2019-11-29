package com.ethan.springboottest.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: ethan.liu
 * @Date: 2019/11/28 10:16
 */
//@WebServlet(name = "userServlet",urlPatterns = "/test/customs")
@WebServlet(name = "user",urlPatterns = "/test")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("--->doGet");
        resp.getWriter().print("hi");
        resp.getWriter().flush();
        resp.getWriter().close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doGet(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("--->destroy");
    }
}
