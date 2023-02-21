<%--
Document : index
Created on : Mar 18, 2021, 8:49:16 AM
Author : BHANUDAS SATAM
--%>
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
#tablehead
{
background-color: yellow;
padding:10px;
}
</style>
</head>
<body>
    <%@include file="header.jsp" %>
<div id="content">
<h2 align="center">Adding Record </h2>
<table align="center">
<tr align="center" style="color:blue">
<td>${param.message}</td>
</tr>
</table>
<form action="addrecord.jsp">
<table border="1" align="center" cellpadding="10px">
<thead>
<tr id='tablehead'>
<th colspan="2">Student Master Form</th>
</tr>
</thead>
<tbody>
<tr>
<td>Name</td>
<td><input type="text" name="txtname" value="" /></td>
</tr>
<tr>
<td>Semester</td>
<td><select name="optsem">
<option>Sem I</option>
<option>Sem II</option>
<option>Sem III</option>
<option>Sem IV</option>
</select></td>
</tr>
<tr>
    <td>Course</td>
    <td><select name="optcourse">
    <option>MCA</option>
    <option>M.Sc[Comp.Sc]</option>
    <option>M.Sc[I.T.]</option>
    </select></td>
    </tr>
    <tr>
    <td><input type="submit" value="Add Record" /></td>
    <td><input type="reset" value="Reset" /></td>
    </tr>
    </tbody>
    </table>
    </form>
    <%@include file="footer.jsp" %>
    </body>
    </html>