package com.sample_requestScopeServlet;

import com.sample_requestScopeModel.Health;
import com.sample_requestScopeModel.HealthCheckLogic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HealthCheck extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        RequestDispatcher dispatcher = aRequest.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");
        dispatcher.forward(aRequest, aResponse);
    }

    @Override
    protected void doPost(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        String weight = aRequest.getParameter("weight");
        String height = aRequest.getParameter("height");

        Health health = new Health();
        health.setWeight(Double.parseDouble(weight));
        health.setHeight(Double.parseDouble(height));

        HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
        healthCheckLogic.execute(health);

        aRequest.setAttribute("health", health);

        RequestDispatcher dispatcher = aRequest.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");
        dispatcher.forward(aRequest, aResponse);
    }
}
