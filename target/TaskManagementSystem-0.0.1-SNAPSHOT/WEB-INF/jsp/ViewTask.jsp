<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Task</title>
</head>
<body>

<!-- Project Name:${list }
Project Description:
Employee Name1:
Employee Name2:
StartDate:
EndDate: -->
 
  <table>
  <h1>ProjectDetails</h1>
<c:forEach var="project1" items="${model}">
        <tr>
            <td><p><b>ProjectName</b>:${project1.projectName}</p></td>
           <td></td>
            <td><p><b>Project Description</b>:${project1.projectDescription}</p></td>
           </tr> 
             <c:forEach var="emp" items="${project1.emp}">
           <td><i>${emp.name}</i></td>
            </c:forEach>
       
</c:forEach>
 
  	</table>	

  
  
     
</body>
</html>