<%--
Document : deleterecord
Created on : Mar 18, 2021, 9:19:27 AM
Author : BHANUDAS SATAM
--%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
    <%
String rollno=request.getParameter("optrollno");
Connection conn;
PreparedStatement ps;
try
{
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
ps=conn.prepareStatement("delete from student where rollno = ?");
ps.setInt(1, Integer.parseInt(rollno));
ps.executeUpdate();
conn.commit();
conn.close();
}catch(NumberFormatException e)
{
e.printStackTrace();
}
catch(SQLException e)
{
    e.printStackTrace();
    }
    %>
    <jsp:forward page="delete.jsp">
    <jsp:param name="message" value="Records Deleted successfully"/>
    </jsp:forward>
    </body>
    </html>
    