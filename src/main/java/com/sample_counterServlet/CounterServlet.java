package com.sample_counterServlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CounterServlet extends HttpServlet {
    @Override
    public void init(ServletConfig aConfig) throws ServletException {
        super.init(aConfig);
        Integer count = 0;
        ServletContext application = aConfig.getServletContext();
        application.setAttribute("count", count);
        System.out.println("init() was executed.");
    }

    @Override
    protected void doGet(HttpServletRequest aRequest, HttpServletResponse aResponse) throws ServletException, IOException {
        ServletContext application = this.getServletContext();
        Integer count = (Integer)application.getAttribute("count");
        count++;
        application.setAttribute("count", count);

        aResponse.setContentType("text/html; charset=UTF-8");
        PrintWriter out = aResponse.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Display number of visits</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Number of visits:" + count + "</p>");
        out.println("<a href=\"/servlet_sample/counterServlet\">UPDATE</a>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() was executed.");
    }
}
