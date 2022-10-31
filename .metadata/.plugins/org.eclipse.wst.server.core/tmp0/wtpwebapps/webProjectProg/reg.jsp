<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 String u =request.getParameter("name");
String p =request.getParameter("password");
String a =request.getParameter("add");
String z=request.getParameter("zip");

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	Statement statement = con.createStatement();
	String query="insert into employee(`name`,`password`,`add`,`zip`) values('"+u+"','"+p+"','"+a+"','"+z+"')";
	int i=0;
	i=statement.executeUpdate(query);
	if(i!=0)
	{
		response.sendRedirect("login.html");
	}
	else{
		response.sendRedirect("register.html");
	}
}
catch(Exception e)
{
	System.out.println(e);
}

%>
</body>
</html>