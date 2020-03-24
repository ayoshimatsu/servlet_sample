<%@
page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<%@ page import="com.sample_applicationScopeModel.SiteEV" %>
<% SiteEV siteEV = (SiteEV)application.getAttribute("siteEV"); %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Minato Page</title>
</head>
<body>
    <h1>Welcome to Minato page</h1>
    <p>
        <a href="/servlet_sample/applicationSample?action=like">Like</a>
        <%= siteEV.getLike() %>
        <a href="/servlet_sample/applicationSample?action=dislike">Dislike</a>
        <%= siteEV.getDislike() %>
    </p>
    <h2>Evaluation of Minato</h2>
</body>
</html>