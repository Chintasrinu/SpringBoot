<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
 rel="stylesheet" 
 integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
 crossorigin="anonymous">
<h1 style="color:red; text-align: center"> Employee Report</h1>
<div class = "container">
<c:choose>
<c:when test = "${!empty empsData}">
<table border = "2"  class = "table">
<tr class = "table-Success ">
<th>Empno</th>
<th>EmpName</th>
<th>Job</th>
<th>Salary</th>
<th>Operation</th>
</tr>
<c:forEach var ="emp" items = "${empsData}">
<tr>
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>
<td><a href="edit?no=${emp.empno}"><img src="images/edit.jpg" width="50" height="50"/></a>
        &nbsp;&nbsp;&nbsp;<a onclick="return confirm('DO you want to delete')" href="delete?no=${emp.empno}"><img src="images/delete.jpg" width="50" height="50"></a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="text-align:center">Record not Found</h1>
</c:otherwise>
</c:choose>
</div>
<c:if test = "${!empty resultMsg}">
<h3 style = "color:green; text-align:center">${resultMsg}</h3>
</c:if>
<br><br>
<hr>
<h1 style="text-align: center"><a href ="./"><img src ="images/home.jpg" width="50" height ="50">Go to home page</a></h1>
<hr>
<h1 style="text-align: center"><a href="add"><img src ="images/add.jpg" width="50" height ="50">Add Employee</a></h1>