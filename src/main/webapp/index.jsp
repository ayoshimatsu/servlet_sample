<%@
page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mutter</title>
</head>
<body>
    <h1>Welcome to mutter page</h1>
    <form action="/servlet_sample/developLogin" method="post">
        User name:<input type="text" name="name"><br>
        Password:<input type="password" name="pass"><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>