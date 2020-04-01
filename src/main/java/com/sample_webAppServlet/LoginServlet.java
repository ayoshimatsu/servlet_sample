package com.sample_webAppServlet;

import com.sample_webAppModel.Login;
import com.sample_webAppModel.LoginLogic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        RequestDispatcher dispatcher = aRequest.getRequestDispatcher("/WEB-INF/jsp/webApp/login.jsp");
        dispatcher.forward(aRequest, aResponse);
    }

    @Override
    protected void doPost(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        aRequest.setCharacterEncoding("UTF-8");
        String userId = aRequest.getParameter("userId");
        String pass = aRequest.getParameter("pass");

        Login login = new Login(userId, pass);
        LoginLogic bo = new LoginLogic();
        boolean result = bo.execute(login);

        if (result) {
            HttpSession session = aRequest.getSession();
            session.setAttribute("userId", userId);
            RequestDispatcher dispatcher = aRequest.getRequestDispatcher("/WEB-INF/jsp/webApp/loginOK.jsp");
            dispatcher.forward(aRequest, aResponse);
        } else {
            aResponse.sendRedirect("/servlet_sample/webAppLogin");
        }
    }
}
