<%@ page contentType="text/html; charset=UTF-8" import="com.sample_simpleServlet.Employee" %>
<% Employee emp = new Employee("0001", "山本"); %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <% for (int i = 0; i < 10; i++) {
        if (i % 3 == 0) { %>
            <p style="color:red">
        <% } else { %>
            <p>
        <% } %>
        ID: <%= emp.getId() %> , Name: <%= emp.getName() %></p>
    <% } %>
</body>
</html>