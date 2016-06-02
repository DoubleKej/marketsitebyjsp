<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
<link rel="icon" href="../img/Deadpool-logo1.jpg" type="image/gif" sizes="16x16">
<link rel="stylesheet" href="../css/loginform.css">
</head>
<body>
<div class="header">
<p>LOGIN SITE</p>
</div>
    <div class="login">
<form action="../LoginFormServlet" method="post">
    <h1>Login</h1>
    <input type="text" id="username" name="Username">
    <input type="password" id="password" name="Password">
    <button>LOGIN</button>
</form>
    </div>
<!--    <form action="../LoginFormServlet" method="post">
        <input type="text" name="Username" id="username" />
    <input type="password" name="Password" id="password" />
    <input type="submit" value="Login">
    </form>-->
</body>
</html>