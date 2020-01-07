<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Physician Login Page</title>
</head>
<body>
 <body>
        <c:url var="action" value="/checkLogin1"></c:url>
            <form:form id="login1Form" commandName="login1" action="${action}" >
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="PhyNo">UserId: </form:label>
                        </td>
                        <td>
                            <form:input path="PhyNo" name="PhyNo" id="PhyNo" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                           <input type="submit" value="Login1"/>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="<c:url value="/newuser1"/>">New User!!</a>
                        </td>
                    </tr>
                </table>
                
            </form:form>
            
            <table align="center">
                <tr>
                    

                </tr>
            </table>
       
</body>
</html>