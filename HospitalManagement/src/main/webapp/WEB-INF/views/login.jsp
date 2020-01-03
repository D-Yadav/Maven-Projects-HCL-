<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <body>
        <c:url var="action" value="/checkLogin"></c:url>
            <form:form id="loginForm" commandName="login" action="${action}" >
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="pno">UserId: </form:label>
                        </td>
                        <td>
                            <form:input path="pno" name="pno" id="pno" />
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
                           <input type="submit" value="Login"/>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="<c:url value="/newuser"/>">New User!!</a>
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