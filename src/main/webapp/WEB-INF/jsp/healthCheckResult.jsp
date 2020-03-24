<%@
page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" import="com.sample_requestScopeModel.Health"
%>

<%
Health health = (Health)request.getAttribute("health");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Health check result</title>
</head>
<body>
    <h1>Health check result</h1>
    <p>
        Height:<%= health.getHeight() %><br>
        Weight:<%= health.getWeight() %><br>
        BMI:<%= health.getBmi() %><br>
        BodyType:<%= health.getBodyType() %>
    </p>
    <a href="/servlet_sample/healthCheckSample">Back</a>
</body>
</html>