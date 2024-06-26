<%@ page isELIgnored="false" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<head> 
<title><tiles:addAttribute name="title" ></tiles:addAttribute name = "title"/></title>
</head>
<table broder="0" width="100%" height="100%">
     <tr width="100%"height="20%">
       <td colspan="2"><tiles:insertAttribute name ="header"/> </td>
       </tr>
       <tr width="100%"height="70%">
       <td width="40%"><tiles:insertAttribute name ="menu"/> </td>
       <td width="60%"><tiles:insertAttribute name ="body"/> </td>
       </tr>
       <tr width="100%"height="20%">
       <td colspan="2"><tiles:insertAttribute name ="footer"/> </td>
       </tr>
</table>