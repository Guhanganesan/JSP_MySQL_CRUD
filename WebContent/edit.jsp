<%@page import="common.User_Bean"%>
<%@page import="CRUD.Edit_Values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Edit Values</h2>


<%
   String sl_no=(String) request.getParameter("sl_no");

   Edit_Values ed=new Edit_Values();
   
   User_Bean ub=ed.getValuesOfUser(sl_no);
   
%>

<form action="controller/edit_controller.jsp">
Sl No:<input type="number" name="sl_no" value="<%=sl_no %>"><br>
UserName:<input name="user_name" value="<%=ub.getUser_name() %>"> <br>
Email:<input name="email" value="<%=ub.getEmail() %>"> <br>
Mobile:<input name="mobile" value="<%=ub.getMobile() %>"> <br>
      <input type="submit" name="submit">
</form>

</body>
</html>