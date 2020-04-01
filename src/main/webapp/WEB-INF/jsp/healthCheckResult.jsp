<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>

<!-- import="com.sample_requestScopeModel.Health" -->

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Health check result</title>
</head>
<body>
    <h1>Health check result</h1>
    <p>
        Height:${health.height}<br>
        Weight:${health.weight}<br>
        BMI:${health.bmi}<br>
        BodyType:${health.bodyType}
    </p>
    <a href="/servlet_sample/healthCheckSample">Back</a>
</body>
</html>