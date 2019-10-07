<%@page import="CRUD.Edit_Values"%>
<%@page import="common.User_Bean"%>
<%@page import="CRUD.Insert_Values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  String sl_no=request.getParameter("sl_no");
  String user_name=request.getParameter("user_name");
  String email=request.getParameter("email");
  String mobile=request.getParameter("mobile");
  
  
 User_Bean ub = new User_Bean();
 ub.setSl_no(sl_no);
 ub.setUser_name(user_name);
 ub.setEmail(email);
 ub.setMobile(mobile);
  
 Edit_Values ed=new Edit_Values();
 ed.editUser(ub);
 
%>
<script>
window.location.href="http://localhost:8085/JSP_MYSQL_CRUD/insert_values.jsp";
</script>
</body>
</html>