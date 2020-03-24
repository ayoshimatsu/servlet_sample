<%@ 
page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8" 
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register user</title>
</head>
<body>
    <form action="/servlet_sample/sampleFormat" method="post">
        Name:<br>
        <input type="text" name="name"><br>
        Gender:<br>
        Male<input type="radio" name="gender" value="0">
        Female<input type="radio" name="gender" value="1">
        <input type="submit" value="Register">
    </form>
</body>
</html>
