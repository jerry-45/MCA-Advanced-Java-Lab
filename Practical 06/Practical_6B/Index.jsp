<%--
Document : index
Created on : Mar 19, 2021, 12:54:11 PM
Author : BHANUDAS SATAM
Write a JSP page to display the Registration form
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form </title>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
$( function() {
$.datepicker.setDefaults({
onClose:function(date, inst){
$("#selectedDtaeVal").html(date);
}
});
$( "#datepicker" ).datepicker();});
</script>
</head>
<body>
    <form action="process.jsp">
    <table border="1" cellpadding="10px" align="center">
    <thead>
    <tr>
    <th colspan="2" style="background-color: yellow" padding="10px">Registration Form</th>
    </tr>
    </thead>
    <tbody>
    <tr>
    <td>Full Name</td>
    <td><input type="text" name="txtName" value="" /></td>
    </tr>
    <tr>
        <td>Email</td>
        <td><input type="text" name="txtEmail" value="" /></td>
        </tr>
        <tr>
        <td>Date of Birth</td>
        <td><input type="text" name="txtbdate" id="datepicker"></td>
        </tr>
        <tr>
        <td>Educational Qualification</td>
        <td><select name="opt-qualify">
        <option>HSC</option>
        <option>Diploma</option>
        <option>Graduate</option>
        <option>Post-Graduate</option>
        </select></td>
        </tr>
        <tr>
            <td>Languages Known</td>
            <td><input type="checkbox" name="lk" value="English"/>English
            <input type="checkbox" name="lk" value="Marathi" />Marathi
            <input type="checkbox" name="lk" value="Hindi" />Hindi
            </td>
            </tr>
            <tr>
            <td valign="top">Write about yourself</td>
            <td><textarea name="about" rows="8" cols="30" >
            </textarea></td>
            </tr>
            <tr>
            <td>Gender </td>
            <td><input type="radio" name="gen" value="Male" />Male
            <input type="radio" name="gen" value="Female" />Female
            <input type="radio" name="gen" value="Tgen" />Tgen</td>
            </tr>
            <tr>
            <td><input type="submit" value="Submit" /></td>
            <td><input type="reset" value="Reset" /></td>
            </tr>
            </tbody>
            </table>
        </form>
    </body>
    </html>        