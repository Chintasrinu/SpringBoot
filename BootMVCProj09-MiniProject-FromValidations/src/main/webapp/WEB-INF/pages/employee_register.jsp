<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<noscript>
<h1 style="color:red;text-align:center">Please enable javaScript</h1>
</noscript>
<style media = "all">
body{
background-color:teal
}
span {
	color:red
}
</style>

<h1 style="color:red; text-align:center">Register Employee</h1>
<script language = "javaScript" src = "js/validations.js">
</script>

<form:form  modelAttribute="emp"  onsubmit="return validation(this)">
<%-- <p style="text-color:red; text-align: center">
     <li>
        <form:errors path = "*"/>
            </li>
   </p> --%>

    <table border="1" bgcolor="cyan" align="center">
        <tr>
            <td>Employee Name:</td>
            <td><form:input path="ename"/><form:errors ccsStyle="color:red" path = "ename"/> <span id = "enameErr"></span>   </td>
        </tr>
        <tr>
            <td>Employee Designation:</td>
            <td><form:input path="job"/><form:errors ccsStyle="color:red" path = "job"/>  <span id = "jobErr"></span>   </td>
        </tr>
        <tr>
            <td>Employee Salary:</td>
            <td><form:input path="sal"/>  <form:errors ccsStyle="color:red" path = "sal"/><span id = "salErr"></span>   </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Register Employee"/></td>
        </tr>
    </table>
    <form:hidden path="vflag"/>
</form:form>
