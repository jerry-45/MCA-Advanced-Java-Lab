<%--
Document : index
Created on : Mar 18, 2021, 8:49:16 AM
Author : BHANUDAS SATAM
--%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
ResultSet rs1=null,rs2=null;
Statement st;
PreparedStatement ps;
String rn=null,nam=null,sam=null,co=null;
try
{
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
st=conn.createStatement();
rs1=st.executeQuery("select rollno from student");
ps=conn.prepareStatement("select * from student where rollno=?");
ps.setInt(1, Integer.parseInt(rollno));
rs2=ps.executeQuery();
rs2.next();
rn=rs2.getString(1);
nam=rs2.getString(2);
sam=rs2.getString(3);
co=rs2.getString(4);
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
<h4 align="center">Selecting Record </h4>
<form action="display.jsp" name="myform">
<table border="1" align="center" cellpadding="10px">
<thead>
<tr class='tablehead'>
<th colspan="2">Display Record</th>
</tr>
</thead>
<tbody>
<tr>
<td>Choose Rollno</td>
<td><select name="optrollno" onchange="document.myform.submit()">
<%
rsmd=rs1.getMetaData();
int tcol=rsmd.getColumnCount();
out.println("<option>");
    out.println("Select Rollno");
    out.println("</option>");
    while(rs1.next())
    {
    out.println("<option>");
    out.println(rs1.getString(1));
    out.println("</option>");
    }
    %>
    </select></td>
    </tr>
    </tbody>
    </table>
    <br>
    <div id="output">
    <table border="1" align="center" cellpadding="10px">
    <thead>
    <tr>
    <th colspan="4" align="center" class="tablehead">Record </th>
    </tr>
    </thead>
    <tbody>
        <tr>
        <th>Roll No</th>
        <th>Name</th>
        <th>Semester</th>
        <th>Course</th>
        </tr>
        <tr>
        <td><%= rn%></td>
        <td><%= nam%></td>
        <td><%= sam%></td>
        <td><%= co%></td>
        </tr>
        </tbody>
        </table>
        </div>
        </form>
        <%@include file="footer.jsp" %>
</body>
</html>   