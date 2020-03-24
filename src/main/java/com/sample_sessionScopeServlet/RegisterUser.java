package com.sample_sessionScopeServlet;

import com.sample_sessionScopeModel.RegisterUserLogic;
import com.sample_sessionScopeModel.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RegisterUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        String forwardPath = null;
        String action = aRequest.getParameter("action");

        if (action == null) {
            forwardPath = "/WEB-INF/jsp/sessionScope/registerForm.jsp";
        } else if (action.equals("done")) {
            HttpSession session = aRequest.getSession();
            User registerUser = (User)session.getAttribute("registerUser");
            RegisterUserLogic logic = new RegisterUserLogic();
            logic.execute(registerUser);

            session.removeAttribute("registerUser");
            forwardPath = "/WEB-INF/jsp/sessionScope/registerDone.jsp";
        }

        RequestDispatcher dispatcher = aRequest.getRequestDispatcher(forwardPath);
        dispatcher.forward(aRequest, aResponse);
    }

    @Override
    protected void doPost(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        aRequest.setCharacterEncoding("UTF-8");
        String id = aRequest.getParameter("id");
        String name = aRequest.getParameter("name");
        String pass = aRequest.getParameter("pass");

        User registerUser = new User(id, name, pass);

        HttpSession session = aRequest.getSession();
        session.setAttribute("registerUser", registerUser);

        RequestDispatcher dispatcher = aRequest.getRequestDispatcher("/WEB-INF/jsp/sessionScope/registerConfirm.jsp");
        dispatcher.forward(aRequest, aResponse);
    }
}
