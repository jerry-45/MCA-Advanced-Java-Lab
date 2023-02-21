<%--
Document : index
Created on : Mar 23, 2021, 7:31:15 AM
Author : BHANUDAS SATAM
Write a program using JSP that displays a webpage consisting
Application form for change of Study Center which can be filled
by any student who wants to change his/her study center.
Make necessary assumptions
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Practical 6-5</title>
</head>
<body>
<h1 align="Center">Application form for Change of Study Center</h1>
<form action="Process.jsp">
<table border="1" align="center" cellpadding="20px">
<tbody>
<tr>
<td>Registration id</td>
<td><input type="text" name="txtRegid" value="" /></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="txtName" value="" /></td>
</tr>
<tr>
<td>Old Study center address</td>
<td><textarea name="txtOldaddress" rows="4" cols="20">
</textarea></td>
</tr>
<tr>
<td>New Study center address</td>
<td><textarea name="txtNewaddress" rows="4" cols="20">
</textarea></td>
</tr>
<tr>
<td><input type="submit" value="Change It" /></td>
<td><input type="reset" value="Reset" /></td>
</tr>
</tbody>
</table>
</form>
</body>
</html>