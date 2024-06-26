<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<style media = "all">
      body{
          background-color:teal
         }
         span {
	        color:red
          }
        </style>
<h1 style="color:red; text-align:center">Edit Employee</h1>
<script language = "javaScript" src = "js/validations.js">
</script>
<noscript>
<h1 style="color:red;text-align:center">Please enable javaScript</h1>
</noscript>
<form:form modelAttribute="emp" onsubmit="return validation(this)">
<%-- <p style="text-color:red; text-align: center">
     <li>
        <form:errors  path = "*"/>
            </li>
   </p> --%>
    <table border="1" bgcolor="cyan" align="center">
        <tr>
            <td>Employee No:</td>
            <td><form:input path="empno" readonly="true"/></td>
        </tr>
        <tr>
            <td>Employee Name:</td>
            <td><form:input path="ename"/> <form:errors ccsStyle="color:red" path = "ename"/><span id = "enameErr"></span></td>
        </tr>
        <tr>
            <td>Employee Designation:</td>
            <td><form:input path="job"/><form:errors ccsStyle="color:red" path = "job"/> <span id = "jobErr"></span> </td>
        </tr>
        <tr>
            <td>Employee Salary:</td>
            <td><form:input path="sal"/><form:errors ccsStyle="color:red" path = "sal"/><span id = "salErr"></span> </td>
        </tr>
         <tr>
            <td>Select Country:</td>
            <td><form:select path="country">
            <form:options items = "${countriesInfo}"/>
            </form:select>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Edit Employee"/></td>
        </tr>
    </table>
    <form:hidden path="vflag"/>
</form:form>
