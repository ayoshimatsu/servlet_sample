<%@
page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register User</title>
</head>
<body>
    <form action="/servlet_sample/registerUserSample" method="post">
        Login ID:<input type="text" name="id"><br>
        Password:<input type="password" name="pass"><br>
        Name:<input type="text" name="name"><br>
        <input type="submit" value="confirm">
    </form>
</body>
</html>

