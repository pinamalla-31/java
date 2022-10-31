<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
String u=request.getParameter("un");
String p=request.getParameter("pwd");
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	Statement statement=con.createStatement();
	ResultSet set=statement.executeQuery("select * from `student`.employee");
	int flag=0;
	while(set.next())
	{
		if(u.equals(set.getString(2)) && p.equals(set.getString(3)))
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		response.sendRedirect("welcome.jsp");
		
	}
	else{
		response.sendRedirect("login.html");
	}
}
catch(Exception e)
{
	System.out.println(e);
}
%>
</body>
</html>