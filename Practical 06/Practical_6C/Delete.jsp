<%--
Document : index
Created on : Mar 18, 2021, 8:49:16 AM
Author : BHANUDAS SATAM
--%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index page</title>
<style>
#content
{
margin-top:10px;
}
.tablehead
{
background-color: yellow;
padding:10px;
}
</style>
</head>
<body>
<%
String rollno=request.getParameter("optrollno");
Connection conn;
ResultSetMetaData rsmd;
ResultSet rs=null;
Statement st;
try
{
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
st=conn.createStatement();
rs=st.executeQuery("select rollno from student");
}catch(NumberFormatException e)
{
e.printStackTrace();
}
catch(SQLException e)
{
e.printStackTrace();
}
%>
<%@include file="header.jsp" %>
<div id="content">
<h4 align="center">Deleting Record </h4>
<form action="deleterecord.jsp" name="myform">
<table border="1" align="center" cellpadding="10px">
<thead>
<tr class='tablehead'>
<th colspan="2">Delete Record</th>
</tr>
</thead>
<tbody>
<tr>
<td>Choose Rollno</td>
<td><select name="optrollno" onchange="document.myform.submit();">
<%
rsmd=rs.getMetaData();
int tcol=rsmd.getColumnCount();
out.println("<option>");
out.println("Select Rollno");
out.println("</option>");
while(rs.next())
{
out.println("<option>");
out.println(rs.getString(1));
out.println("</option>");
}
%>
</select></td>
</tr>
</tbody>
</table>
<table align="center">
<tr>
<td colspan="2">${param.message}</td>
</tr>
</table>
<%@include file="footer.jsp" %>
</body>
</html>