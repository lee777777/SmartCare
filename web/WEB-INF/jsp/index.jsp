<%-- 
    Document   : login
    Created on : Mar 29, 2021, 6:27:42 PM
    Author     : THINKPAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%-- 
        <form:form action="./TestServlet" method="POST" >
            
                <table>
            <tr>
                <td>User Name:</td>
                <td><form:input path="userName"/></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:input type="password" path="password"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Login"></td>
            </tr>
        </table>
            </form:form>--%>
       <form action="./TestServlet" method="POST" >
           <input type="submit" value="Test DB"/>
       </form>
    </body>
</html>
