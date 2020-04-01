<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Mutter</title>
    </head>
    <body>
        <h1>Mutter Main</h1>
        <p>
            <c:out value="${loginUser.name}" />is currently logged in.<br>
            <a href="/servlet_sample/developLogout">Logout</a>
        </p>
        <p><a href="/servlet_sample/developMain">UPDATE</a></p>
        <form action="/servlet_sample/developMain" method="post">
            <input type="text" name="text">
            <input type="submit" value="mutter">
        </form>
        <c:if test="${not empty errorMsg}">
            <p>${errorMsg}</p>
        </c:if>
        <c:forEach var="mutter" items="${mutterList}">
            <p>
                <c:out value="${mutter.userName}" />:
                <c:out value="${mutter.text}" />
            </p>
        </c:forEach>
    </body>
</html>