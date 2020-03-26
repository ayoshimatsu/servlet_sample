<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.sample_developModel.User, com.sample_developModel.Mutter" %>
<%@ page import="java.util.List" %>

<% 
User loginUser = (User)session.getAttribute("loginUser");
List<Mutter> mutterList = (List<Mutter>)application.getAttribute("mutterList");
String errorMsg = (String)request.getAttribute("errorMsg");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Mutter</title>
    </head>
    <body>
        <h1>Mutter Main</h1>
        <p>
            <%= loginUser.getName() %> is currently logged in.<br>
            <a href="/servlet_sample/developLogout">Logout</a>
        </p>
        <p><a href="/servlet_sample/developMain">UPDATE</a></p>
        <form action="/servlet_sample/developMain" method="post">
            <input type="text" name="text">
            <input type="submit" value="mutter">
        </form>
        <% if (errorMsg != null) { %>
            <p><%= errorMsg %></p>
        <% } %>
        <% for (Mutter mutter : mutterList) {%>
            <p><%= mutter.getUserName() %>:<%= mutter.getText() %></p>
        <% } %>
    </body>
</html>