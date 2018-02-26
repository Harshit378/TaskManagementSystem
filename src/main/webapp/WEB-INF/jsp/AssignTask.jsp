<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Assign Tasks</title>
</head>
<body>
   <form action="ViewTask" method="post" >  
	<table>
			<tr>
				<td>Select Project: <select name=selectbox1>
				
						<option value="SITA">SITA</option>
						<option value="NGAF">NGAF</option>
						<option value="HA">HA</option>
						<option value="WNB">WNB</option>
				</select>
						
				</select>
				</td>
			</tr>
			<tr>
				<td>Description*: <input type="text" placeholder = "description" name="description"  /></td>
			</tr>
			<tr>
				<td>Enter start Date: <input  type="date" name="startDate" /></td>
			</tr>
			<tr>
				<td>Enter end Date: <input  type="date" name="endDate"  /></td>
			</tr>
			<tr>
				<td>Employees: <select name="result" multiple>
						<option>employee's of specific project</option>
						<option value="Karishma">Karishma</option>
						<option value="Surbhi">Surbhi</option>
						<option value="Priya">Priya</option>
						<option value="Savita">Savita</option>
				</select>
				</td>
			</tr>
		</table>
		<br><input type="submit"  value="Add a Task" > <input
			type="button"  value="Cancel"  />
			</form>
  
</body>
</html>