<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search physician</title>
</head>
<body>
<c:url var="action" value="/show"></c:url>
<form:form id="showForm" commandName="show" action="${action}" >
<h2>Search Success</h2>
<%
String phydetails=request.getParameter("State");
String phydetails1=request.getParameter("Dept");
String phydetails2=request.getParameter("InsurancePlan");
%>

<h4>Physician firstname: ${fName}</h4>
<h4>Physician lastname: ${lName}</h4>
<h4>Physician dept: ${dept}</h4>
<h4>Physician educationalQualification: ${educationalQualification}</h4>
<h4>Physician state: ${state}</h4>
<h4>Physician insurancePlan: ${insurancePlan}</h4>
</form:form>
</body>
</html>