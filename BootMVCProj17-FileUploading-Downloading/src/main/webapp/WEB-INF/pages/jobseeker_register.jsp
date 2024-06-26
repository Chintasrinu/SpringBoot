<%@ page language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<frm:form modelAttribute="js" enctype="multipart/form-data">
    <table border="2" bgcolor="cyan" align="center">
        <tr>
            <td>Name:</td>
            <td><frm:input path="jsName"/></td>
        </tr>
        
        <br><br>
        
        <tr>
            <td>Address:</td>
            <td><frm:input path="jsAddrs"/></td>
        </tr>
          
        <br><br>
        
        <tr>
            <td>Select Resume:</td>
            <td><frm:input path="resume" type="file"/></td> <!-- Use type="file" for file input -->
        </tr>
          
        <br><br>
        
        <tr>
            <td>Select Photo:</td>
            <td><frm:input path="photo" type="file"/></td> <!-- Use type="file" for file input -->
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="register"></td>
        </tr>
    </table>
</frm:form>
