<%@page import="CRUD.Delete_Values"%>
<%@page import="common.User_Bean"%>
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
  
  Delete_Values dl=new Delete_Values();
  dl.deleteValue(sl_no);
 
%>
<script>
window.location.href="http://localhost:8085/JSP_MYSQL_CRUD/insert_values.jsp";
</script>
</body>
</html>