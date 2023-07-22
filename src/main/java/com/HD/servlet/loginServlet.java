package com.HD.servlet;

import com.HD.dao.user.loginDao;
import com.HD.model.Normal_User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8"); // 设置响应的字符编码为UTF-8
        req.setCharacterEncoding("UTF-8"); // 设置请求的字符编码为UTF-8

        // 获取页面的用户名和密码
        String username = req.getParameter("username");
        String pwd = req.getParameter("password");
        System.out.println(username);
        System.out.println(pwd);

        try {

            Normal_User normal_user = loginDao.login(username, pwd);
            if (normal_user == null) {
                // 用户不存在，回到登录页面并显示提示信息
                resp.getWriter().write("用户不存在");
                req.getRequestDispatcher("login.html").forward(req, resp);
                System.out.println("1111");
                System.out.println(normal_user);
            } else {

                    // 登录成功，将用户信息存到session中，并转发到test.html页面
                    HttpSession session = req.getSession();
                    session.setAttribute("normal_user", normal_user);
                    resp.getWriter().write("登录成功");
                    req.getRequestDispatcher("index.html").forward(req, resp);
                    System.out.println("22222");

            }
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
            // 处理异常情况，返回服务器内部错误信息
            resp.getWriter().write("服务器内部错误");
        }
    }

}
