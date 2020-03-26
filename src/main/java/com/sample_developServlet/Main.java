package com.sample_developServlet;

import com.sample_developModel.Mutter;
import com.sample_developModel.PostMutterLogic;
import com.sample_developModel.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        ServletContext application = this.getServletContext();
        List<Mutter> mutterList = (List<Mutter>)application.getAttribute("mutterList");

        if (mutterList == null) {
            mutterList = new ArrayList<>();
            application.setAttribute("mutterList", mutterList);
        }

        HttpSession session = aRequest.getSession();
        User loginUser = (User) session.getAttribute("loginUser");

        if (loginUser == null) {
            aResponse.sendRedirect("/servlet_sample/");
        } else {
            RequestDispatcher dispatcher = aRequest.getRequestDispatcher("/WEB-INF/jsp/develop/main.jsp");
            dispatcher.forward(aRequest, aResponse);
        }
    }

    @Override
    protected void doPost(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        aRequest.setCharacterEncoding("UTF-8");
        String text = aRequest.getParameter("text");

        if (text != null && text.length() != 0) {
            ServletContext application = this.getServletContext();
            List<Mutter> mutterList = (List<Mutter>)application.getAttribute("mutterList");

            HttpSession session = aRequest.getSession();
            User loginUser = (User)session.getAttribute("loginUser");

            Mutter mutter = new Mutter(loginUser.getName(), text);
            PostMutterLogic postMutterLogic = new PostMutterLogic();
            postMutterLogic.execute(mutter, mutterList);

            application.setAttribute("mutterList", mutterList);
        } else {
            aRequest.setAttribute("errorMsg", "text is not inputted.");
        }

        RequestDispatcher dispatcher = aRequest.getRequestDispatcher("/WEB-INF/jsp/develop/main.jsp");
        dispatcher.forward(aRequest, aResponse);
    }
}
