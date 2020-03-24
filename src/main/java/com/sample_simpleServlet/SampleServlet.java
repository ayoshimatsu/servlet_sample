package com.sample_simpleServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String[] luckyArray = {"Excellent", "Good", "Bad"};
        int index = (int) (Math.random() * 3);
        String luck = luckyArray[index];

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String today = dateFormat.format(calendar.getTime());

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Fortune telling </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>" + "On " + today + ", Your fortune is " + luck + "</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}