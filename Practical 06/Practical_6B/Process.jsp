<%--
Document : process
Created on : Mar 19, 2021, 2:16:48 PM
Author : BHANUDAS SATAM
--%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Practical6-2</title>
</head>
<body>
    <h1>You are successfully Registered </h1>
<h4>Your details are as follows </h4>
<% String name,email,dob,equalify,lang,yourself,gen;
name=request.getParameter("txtName");
email=request.getParameter("txtEmail");
dob=request.getParameter("txtbdate");
equalify=request.getParameter("opt-qualify");
lang=request.getParameter("English");
yourself=request.getParameter("about");
gen=request.getParameter("gen");
String [] lknown=request.getParameterValues("lk");
List list=Arrays.asList(lknown);
request.setAttribute("lknown",list);
List<String> lk = (List<String>)request.getAttribute("lknown");
out.println("<table border='1' cellpadding='15px'>");
out.print("<tr>");
out.print("<td>");
out.print("Name");
out.print("</td>");
out.print("<td>");
out.print(name);
out.print("</td>");
out.print("</tr>");
out.print("<tr>");
out.print("<td>");
out.print("Email");
out.print("</td>");
out.print("<td>");
out.print(email);
out.print("</td>");
out.print("</tr>");
out.print("<tr>");
out.print("<td>");
out.print("Date of Birth");
out.print("</td>");
out.print("<td>");
out.print(dob);
out.print("</td>");
out.print("</tr>");
out.println("<tr>");
out.println("<td>");
out.println("Educational Qualifiation");
out.println("</td>");
out.println("<td>");
out.println(equalify);
out.println("</td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>");
out.println("Gender");
out.println("</td>");
out.println("<td>");
out.println(gen);
out.println("</td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>");
out.println("Languages known");
out.println("</td>");
out.println("<td>");
for(String item:lk)
{
out.println(item);
}
out.println("</td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>");
out.println("About yourself");
out.println("</td>");
out.println("<td>");
out.println(yourself);
out.println("</td>");
out.println("</tr>");
out.println("</table>");
%>
</body>
</html>