<%--
Document : addrecord
Created on : Mar 18, 2021, 8:57:40 AM
Author : BHANUDAS SATAM
--%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Record process</title>
</head>
<body>
    <%
String sname=request.getParameter("txtname");
String sem=request.getParameter("optsem");
String course=request.getParameter("optcourse");
Connection conn;
PreparedStatement ps;
String url="jdbc:mysql://localhost:3306/studentdb";
String user="root";
String password="";
//step 1
try
{
Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection(url, user, password);
String sql="insert into student(sname,semester,course)value(?,?,?)";
ps=conn.prepareStatement(sql);
ps.setString(1, sname);
ps.setString(2, sem);
ps.setString(3, course);
ps.executeUpdate();
conn.close();
}catch(ClassNotFoundException e)
{
    e.printStackTrace();
}catch(Exception e)
{
e.printStackTrace();
}
%>
<jsp:forward page="add.jsp">
<jsp:param name="message" value="record inserted successfully" />
</jsp:forward>
</body>
</html>
