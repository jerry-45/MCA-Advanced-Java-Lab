<%--
Document : index
Created on : Mar 18, 2021, 8:10:33 AM
Author : BHANUDAS SATAM
Write a JSP program that demonstrates the use of JSP declaration,
scriptlet, directives, expression, header and footer.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Practical 6-6</title>
<style>
#content
{
margin-top:10px;
}
</style>
</head>
<body>
    <!--use of Include Directives as header -->
<%@include file="header.jsp" %>
<div id="content">
<!--JSP Declaration -->
<%! int number1=10,number2=20;%>
Value of number is= <%= number1%> <br>
<!-- use of JSP scriptlet -->
Today's Date is <% out.println(new java.util.Date()); %><br>
<!-- use of expression -->
Number1=<%=number1%><br>
Number2=<%=number2%><br>
Addition of two numbers are <%=number1+number2%><br>
</div>
<!--use of Include Directives as footer-->
<%@include file="footer.jsp" %>
</body>
</html>
