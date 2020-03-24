package com.sample_simpleServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormSampleServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");

        String errorMessage = "";
        if (name == null || name.length() == 0) {
            errorMessage += "Name is empty<br>";
        }
        if (gender == null || gender.length() == 0) {
            errorMessage += "Gender is empty<br";
        } else {
            if (gender.equals("0")) {gender = "Male";}
            else if (gender.equals("1")) {gender = "Female";}
        }

        String message = name + " : " + gender + " was registered.";
        if (errorMessage.length() != 0) {
            message = errorMessage;
        }

        //HTML
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Result of register</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>" + message + "</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
