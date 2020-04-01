<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Tanaka store</title>
    </head>
    <body>
        <p>Welcome <c:out value="${sessionScope.userId}" /></p>
        <a href="/servlet_sample/webAppWelcome">TOP</a>
    </body>
</html>