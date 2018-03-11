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
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js"></script>
	
<!-- Project Name:${list }
Project Description:
Employee Name1:
Employee Name2:
StartDate:
EndDate: -->
 
  <%-- <table>
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
 
  	</table>	 --%>
  	<form action="ViewTask" method="POST">
  	<table >
			<tr>
				<td style="background-color: white; font-size: 30px ; width : 200px">Select Project:</td>
				<td> <select id="selectbox1" name="PRO" style="background-color: white; font-size: 30px ; width: 300px; ">
						<option>All projects**</option>
						<c:forEach var="list" items="${model}" varStatus="status">
							<option id="projectId" value="${list.projectId}" >${list.projectName}</option>
						</c:forEach>
				</select>
				</td>
			</tr>
		</table>
					<input type="submit" value="View Task Details">
		
		</form>
		
     	   <c:forEach var="task" items="${model2}">
         <h3>Task Description:</h3>  <td><i>${task.taskdescripion}</i></td>
          <h3>Start Date : </h3><td><i> {task.startDate}</i></td>
     	<h3>End Date :</h3><td><i> {task.endDate}</i></td>
     	<h3>Employee Details</h3>
     	<c:forEach var="employee" items="${model1 }">
     	<h3>Employee Name :</h3><td><i> ${employee.name}</i></td>
     	
     	</c:forEach>
            </c:forEach>
        
       <!--  <table width="400px" align="center" border="2" cellpadding="5" cellspacing="10" bgcolor="skyblue">
        <tr><th>MID</th><th>Employee Name</th></tr>
         <tr><th>{{x.employee.mid}}</th><th>{{x.employee.employee_name}}</th></tr>
        </table>	 -->	
		
		
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	

  
  
     
</body>
</html>