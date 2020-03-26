package com.sample_developServlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        HttpSession session = aRequest.getSession();
        session.invalidate();

        RequestDispatcher dispatcher = aRequest.getRequestDispatcher("/WEB-INF/jsp/develop/logout.jsp");
        dispatcher.forward(aRequest, aResponse);
    }
}
