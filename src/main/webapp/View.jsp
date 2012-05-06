<%-- 
    Document   : View
    Created on : May 4, 2012, 10:29:29 AM
    Author     : Vijay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center><h1>Successfully Searched</h1></center>
        <jsp:useBean id="object" scope="session" class="student_Java.Student_Search" />
        <jsp:setProperty name="object" property="*"  />
    <center><table border="0" width="200">
            
           
                <tr>
                    <td>Student_Name</td>
                    <td><jsp:getProperty name="object" property="studentName" /></td>
                </tr>
                <tr>
                    <td>Grade</td>
                    <td><jsp:getProperty name="object" property="grade" /></td>
                </tr>
                <tr>
                    <td>Parent_Name</td>
                    <td><jsp:getProperty name="object" property="parentName" /></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><jsp:getProperty name="object" property="address" /></td>
                </tr>
            
        </table></center>     
        
        
               
        
    </body>
</html>
