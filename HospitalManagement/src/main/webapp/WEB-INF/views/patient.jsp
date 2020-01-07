<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient registration</title>
</head>
<body>
<h2>Patient registration form</h2>
<c:url var="action" value="enroll"></c:url>
<form:form method="post" action="${action}" commandName="patient" cssClass="patientForm">
	<table>
	
		<tr>
			<td>
				<form:label path="firstName" cssClass="patientLabel">
					<spring:message code="label.firstName"/>
				</form:label>
			</td>
			<td>
				<form:input path="firstName"/><form:errors path="firstName" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="lastName" cssClass="patientLabel">
					<spring:message code="label.lastName"/>
				</form:label>
			</td>
			<td>
				<form:input path="lastName"/><form:errors path="lastName" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="email" cssClass="patientLabel">
					<spring:message code="label.email"/>
				</form:label>
			</td>
			<td>
				<form:input path="email"/><form:errors path="email" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="contactNo" cssClass="patientLabel">
					<spring:message code="label.contactNo"/>
				</form:label>
			</td>
			<td>
				<form:input path="contactNo"/><form:errors path="contactNo" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="password" cssClass="patientLabel">
					Password
				</form:label>
			</td>
			<td>
				<form:input path="password"/><form:errors path="password" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
			
				
					<input type="submit" value="<spring:message code="label.enrollpatient"/>"/>
				
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>