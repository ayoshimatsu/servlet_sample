package com.sample_applicationScopeServlet;

import com.sample_applicationScopeModel.SiteEV;
import com.sample_applicationScopeModel.SiteEVLogic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MinatoIndex extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        ServletContext application = this.getServletContext();
        SiteEV siteEV = (SiteEV)application.getAttribute("siteEV");

        if (siteEV == null) {
            siteEV = new SiteEV();
        }

        aRequest.setCharacterEncoding("UTF-8");
        String action = aRequest.getParameter("action");

        SiteEVLogic siteEVLogic = new SiteEVLogic();
        if (action != null && action.equals("like")) {
            siteEVLogic.like(siteEV);
        } else if (action != null && action.equals("dislike")) {
            siteEVLogic.dislike(siteEV);
        }

        application.setAttribute("siteEV", siteEV);

        RequestDispatcher dispatcher = aRequest.getRequestDispatcher("/WEB-INF/jsp/applicationScope/minatoIndex.jsp");
        dispatcher.forward(aRequest, aResponse);
    }
}
