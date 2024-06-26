<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel = "stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>


<div class = "container">


<c:choose>
<c:when test = "${!empty empsData.getContent()}">
     <table border = "1"  class = "table">
     <tr class = "table-danger" >
              <th>Empno</th>
              <th>EmpName</th>
              <th>Job</th>
              <th>Salary</th>
              <th>Country</th>
              <th>Operation</th>
              </tr>
<c:forEach var ="emp" items = "${empsData.getContent()}">
    <tr class = "table-success">
         <td>${emp.empno}</td>
         <td>${emp.ename}</td>
         <td>${emp.job}</td>
         <td>${emp.sal}</td>
         <td>${emp.country }</td>
<td><a href="edit?no=${emp.empno}"><img src="images/edit.jpg" width="50" height="50"/></a>
        &nbsp;&nbsp;&nbsp;<a onclick="return confirm('DO you want to delete')" href="delete?no=${emp.empno}"><img src="images/delete.jpg" width="50" height="50"></a></td>
    </tr>
  </c:forEach>
   </table>


<p style="text-align: center">
<c:if test ="${empsData.hasPrevious()}">
      <a href = "report?page=${empsData.getPageable().getPageNumber()-1}">previous</a> &nbsp;&nbsp;
</c:if>
<c:if test="${!empsData.isFirst()}">
     <a href = "report?page=0">first</a>  &nbsp;&nbsp;
</c:if>


    <c:forEach var="i" begin ="1" end = "${empsData.getTotalPages()}" step = "1">
               [<a href ="report?page=${i-1}">${i}</a>]  &nbsp;&nbsp;
</c:forEach>

<c:if test="${!empsData.isLast()}">
     <a href = "report?page=${empsData.getTotalPages()-1}">Last</a> &nbsp;&nbsp;
</c:if>

<c:if test="${empsData.hasNext()}">
     <a href = "report?page=${empsData.getPageable().getPageNumber()+1}">next</a>
</c:if>
</p>

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