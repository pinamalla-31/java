<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String un=request.getParameter("u");
System.out.println(un);
String p=request.getParameter("pwd");
System.out.println(p);
String a=request.getParameter("add");
System.out.println(a);
String z=request.getParameter("zip");
System.out.println(z);
try{
	Class.forName("com.mysql.cj.jdbcDriver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	Statement statement=con.createStatement();
	String query="Insert into employee('name','password','add','zip') values('"+un+"','"+p+"','"+a+"','"+z+"')";
	statement.executeUpdate(query);
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