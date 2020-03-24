<%@
page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<%@ page import="com.sample_developModel.User" %>
<% User loginUser = (User)session.getAttribute("loginUser"); %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mutter</title>
</head>
<body>
    <h1>Login to mutter page</h1>
    <% if (loginUser != null) { %>
        <p>Succeeded in login</p>
        <p>Welcome<%= loginUser.getName() %></p>
        <a href="/servlet_sample/">Mutter page</a>
    <% } else { %>
        <p>Failed to login</p>
        <a href="/servlet_sample/">TOP</a>
    <% } %>
</body>
</html>