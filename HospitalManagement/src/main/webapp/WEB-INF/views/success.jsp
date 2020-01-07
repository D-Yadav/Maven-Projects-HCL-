<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Physician</title>
</head>
<body>
<h2>Select Physician</h2>
<c:url var="action" value="/search"></c:url>
<form:form id="searchForm" commandName="search" action="${action}" >
<select name="State">

<option value="1">--State--</option>
<option value="2">Telangana</option>
<option value="3">NCR</option>
<option value="4">Odisha</option>
<option value="5">Tamil Nadu</option>
<option value="6">Maharastra</option>
<option value="7">Harvana</option>
<option value="8">kerala</option>
<option value="9">punjab</option>
<option value="10">Andhra Pradesh</option>
</select>
<select name="Dept">
<option value="1">-Department-</option>
<option value="2">Dermetalogist</option>
<option value="3">Cardiologist</option>
<option value="4">Embryologist</option>
<option value="5">Gyaenocologist</option>
<option value="6">Nephrologist</option>
<option value="7">Infants Doctor</option>
<option value="8">Ortho</option>
<option value="9">General Physician</option>
<option value="10">Neurologist</option>
</select>
<select name="InsurancePlan ">
<option value="1">--Insurance Plan--</option>
<option value="2">UnAvail</option>
<option value="3">Avail</option>
</select>
<input type="submit" value="Search">
</form:form>
</body>
</html>