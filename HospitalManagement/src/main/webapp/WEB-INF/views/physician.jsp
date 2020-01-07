<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Physician registration form</title>
</head>
<body>
<h2>Physician registration form</h2>
<c:url var="action" value="enroll1"></c:url>
<form:form method="post" action="${action}" commandName="physician" cssClass="physicianForm">
	<table>
	
		<tr>
			<td>
				<form:label path="firstName" cssClass="physicianLabel">
					<spring:message code="label.firstName"/>
				</form:label>
			</td>
			<td>
				<form:input path="firstName"/><form:errors path="firstName" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="lastName" cssClass="physicianLabel">
					<spring:message code="label.lastName"/>
				</form:label>
			</td>
			<td>
				<form:input path="lastName"/><form:errors path="lastName" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="dept" cssClass="physicianLabel">
					<spring:message code="label.dept"/>
				</form:label>
			</td>
			<td>
				<form:input path="dept"/><form:errors path="dept" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="educationalQualification" cssClass="physicianLabel">
					<spring:message code="label.educationalQualification"/>
				</form:label>
			</td>
			<td>
				<form:input path="educationalQualification"/><form:errors path="educationalQualification" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="state" cssClass="physicianLabel">
					<spring:message code="label.state"/>
				</form:label>
			</td>
			<td>
				<form:input path="state"/><form:errors path="state" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="insurancePlan" cssClass="physicianLabel">
					<spring:message code="label.insurancePlan"/>
				</form:label>
			</td>
			<td>
				<form:input path="insurancePlan"/><form:errors path="insurancePlan" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="password" cssClass="physicianLabel">
					Password
				</form:label>
			</td>
			<td>
				<form:input path="password"/><form:errors path="password" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
					<input type="submit" value="<spring:message code="label.enrollphysician"/>"/>
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>