package com.sample_developServlet;

import com.sample_developModel.LoginLogic;
import com.sample_developModel.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        aRequest.setCharacterEncoding("UTF-8");
        String name = aRequest.getParameter("name");
        String pass = aRequest.getParameter("pass");

        User user = new User(name, pass);
        LoginLogic loginLogic = new LoginLogic();
        boolean isLogin = loginLogic.execute(user);

        if (isLogin) {
            HttpSession session = aRequest.getSession();
            session.setAttribute("loginUser", user);
        }
        RequestDispatcher dispatcher = aRequest.getRequestDispatcher("/WEB-INF/jsp/develop/loginResult.jsp");
        dispatcher.forward(aRequest, aResponse);
    }
}
