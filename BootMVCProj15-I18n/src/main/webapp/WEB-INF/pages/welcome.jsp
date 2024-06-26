<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1 style="color: blue;text-align:center"><sp:message code="home.title"/></h1>

<br><br>
     <a href="register"><h2 style="color:red;text-align:center"><sp:message code="home.link"/></h2></a>
      <br>

          <h1>Current active Locale is:: ${pageContext.response.locale}</h1>
           <fmt:setLocale value = "${pageContext.response.locale}"/>
                   
            <jsp:useBean id="dt" class="java.util.Date"/>
            <fmt:formatDate var ="fdt"  value="${dt}"  type="date" dateStyle="MEDIUM"/>
            <b>formatted date:: ${fdt}</b><br>
            
             <fmt:formatDate var ="ftime"  value="${dt}"  type="time" dateStyle="FULL"/>
            <b>formatted time:: ${ftime}</b><br>
            
             <fmt:formatNumber var ="fnumber"  value="100000"  type="number"/>
            <b>formatted number:: ${fnumber}</b><br>
            
             <fmt:formatNumber var ="fcurrency"  value="100000"  type="currency" />
            <b>formatted currency:: ${fcurrency}</b><br>
            
             <fmt:formatNumber var ="fpercentage"  value="0.211"  type="percent" />
             <b >formatted Percentage:: ${fpercentage}</b><br></h9> 
            
            
             
<br><br>

<p align="center">
<a href ="?lang=fr_FR">French</a> &nbsp;&nbsp;&nbsp;
<a href ="?lang=de_DE">German</a> &nbsp;&nbsp;&nbsp;
<a href ="?lang=hi_IN">Hindi</a> &nbsp;&nbsp;&nbsp;
<a href ="?lang=en_US">English</a>&nbsp;&nbsp;&nbsp;
<a href ="?lang=tl_AP">Telugu</a> 
</p>

