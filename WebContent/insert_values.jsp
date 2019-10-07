<%@page import="java.util.Iterator"%>
<%@page import="common.User_Bean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.Read_Values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Insert Values</h2>

<form action="controller/insert_controller.jsp">
Sl No:<input type="number" name="sl_no"><br>
UserName:<input name="user_name"> <br>
Email:<input name="email"> <br>
Mobile:<input name="mobile"> <br>
      <input type="submit" name="submit">
</form>

<hr>
<%
   Read_Values rd =new Read_Values();
   List<User_Bean> list=rd.getValues();

   Iterator<User_Bean> it_list=list.iterator();
%>
<table border='1'>

<%
   while(it_list.hasNext())
   {
	   User_Bean ub= new User_Bean();
	   ub=it_list.next();
	   
%>
<tr>
	 <td> <%=ub.getSl_no() %></td>
	 <td> <%=ub.getUser_name() %></td>
	 <td> <%=ub.getEmail() %></td>
	 <td> <%=ub.getMobile() %></td>
	 <td><a href="edit.jsp?sl_no=<%=ub.getSl_no() %>">Edit</a></td>
	 <td><a href="controller/delete_controller.jsp?sl_no=<%=ub.getSl_no() %>">Delete</a></td>
</tr>
<%
   }
%>

</body>
</html>