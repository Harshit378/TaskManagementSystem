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
  	<table >
			<tr>
				<td style="background-color: white; font-size: 30px ; width : 200px">Select Project:</td>
				<td> <select id="selectbox1" style="background-color: white; font-size: 30px ; width: 300px;  onchange="showDetails(this.value)">
						<option>All projects**</option>
						<c:forEach var="list" items="${model}" varStatus="status">
							<option id="projectId" value="${list.projectId}" >${list.projectName}</option>
						</c:forEach>
				</select>
				</td>
			</tr>
		</table>
		<div id="txtHint">Customer info will be listed here...</div>
		
		
		<script>
		function showDetails(str) {
			<h1>hi1111111111111111111</h1>
			  var xhttp;    
			  if (str == "") {
			    document.getElementById("txtHint").innerHTML = "";
			    return;
			  }
			  xhttp = new XMLHttpRequest();
			  xhttp.onreadystatechange = function() {
			    if (this.readyState == 4 && this.status == 200) {
			      document.getElementById("txtHint").innerHTML = this.responseText;
			    }
			  };
			 xhttp.open("GET", "hi******", true);
			  xhttp.send()
			}
		
		</script>
		
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	

  
  
     
</body>
</html>