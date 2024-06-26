<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
<h1 style="color:red; text-align:center">Edit Employee</h1>
<form:form modelAttribute="emp">
    <table border="1" bgcolor="cyan" align="center">
        <tr>
            <td>Employee No:</td>
            <td><form:input path="empno" readonly="true"/></td>
        </tr>
        <tr>
            <td>Employee Name:</td>
            <td><form:input path="ename"/></td>
        </tr>
        <tr>
            <td>Employee Designation:</td>
            <td><form:input path="job"/></td>
        </tr>
        <tr>
            <td>Employee Salary:</td>
            <td><form:input path="sal"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Edit Employee"/></td>
        </tr>
    </table>
</form:form>
