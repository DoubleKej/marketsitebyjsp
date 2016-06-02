<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="../css/loginform.css">
</head>
<body>
    <div class="header">
        <p>WELCOME</p>  
        <%
            String name = request.getParameter("name");
            out.print(name);
        %>
</div>
<!--<h1>OK!</h1>-->
</body>
</html>