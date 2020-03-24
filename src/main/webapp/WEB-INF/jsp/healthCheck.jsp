<%@
page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Health check</title>
</head>
<body>
    <h1>Health check</h1>
    <form action="/servlet_sample/healthCheckSample" method="post">
        Height:<input type="text" name="height">(cm)<br>
        Weight:<input type="text" name="weight">(kg)<br>
        <input type="submit" value="Check">
    </form>
</body>
</html>