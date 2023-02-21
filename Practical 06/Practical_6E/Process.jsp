<%--
Document : Process
Created on : Mar 23, 2021, 7:36:34 AM
Author : BHANUDAS SATAM
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<h1 align="center">Address is Successfully change</h1>
<%
String regid=request.getParameter("txtRegid");
String name=request.getParameter("txtName");
String oldadd=request.getParameter("txtOldaddress");
String newadd=request.getParameter("txtNewaddress");
out.println("<table border='1' align='center' cellpadding='20px' ");
out.println("<tr>");
out.println("<td>");
out.println("Registration Id");
out.println("</td>");
out.println("<td>");
out.println(regid);
out.println("</td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>");
out.println("Name");
out.println("</td>");
out.println("<td>");
out.println(name);
out.println("</td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>");
out.println("Old address");
out.println("</td>");
out.println("<td>");
out.println(oldadd);
out.println("</td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>");
out.println("New address");
out.println("</td>");
out.println("<td>");
out.println(newadd);
out.println("</td>");
out.println("</tr>");
out.println("</table>");
%>
</body>
</html>