<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Patient registration form</h2>
<c:url var="action" value="/patient/enroll.html"></c:url>
<form:form method="post" action="${action}" commandName="register" cssClass="patientForm">
	<table>
		<c:if test="${!empty patient}">
			<tr>
				<td>
					<form:label path="pno" cssClass="patientLabel">
						<spring:message code="label.pno"/>
					</form:label>
				</td>
				<td>
					<form:input path="pno" readonly="true" size="8" disabled="true"/>
					<form:hidden path="pno"/>
				</td>
			</tr>
		</c:if>
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
					<spring:message code="label.salary"/>
				</form:label>
			</td>
			<td>
				<form:input path="contactNo"/><form:errors path="contactNo" cssClass="error"></form:errors>
			</td>
		</tr>
		<tr>
			<td>
			
				<c:if test="${empty patient.firstName}">
					<input type="submit" value="<spring:message code="label.enrollpatient"/>"/>
				</c:if>
			</td>
		</tr>
	</table>
</form:form>
</body>
</html>