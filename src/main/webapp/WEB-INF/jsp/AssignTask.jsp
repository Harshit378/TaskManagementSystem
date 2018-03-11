<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="language"
	value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}"
	scope="session" />
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="assigntask" />

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="${language}">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Assign Tasks</title>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="row main">
			<div class="main-login main-center">
				<h5>
					<fmt:message key="assigntask.label.pageheading" />
				</h5>
				<form class="" method="post" action="Home">
					<div class="form-group">
						<label for="name" class="cols-sm-2 control-label"><fmt:message
								key="assigntask.label.projectname" />*</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user fa"
									aria-hidden="true"></i></span> <select class="form-control" id="sel1"
									name=selectbox1 required>
									<option value="" selected><fmt:message
											key="assigntask.option.default" /></option>
									<option value="sita">SITA</option>
									<option value="ngaf">NGAF</option>
									<option value="ha">HA</option>
									<option value="wnb">WNB</option>
								</select>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="email" class="cols-sm-2 control-label"><fmt:message
								key="assigntask.label.taskdescription" />*</label>
						<div class="cols-sm-10">
							<div class="input-group">
							<fmt:message
								key="assigntask.placeholder.projectdescription" var="placeholderText"/>
								<span class="input-group-addon"><i
									class="fa fa-envelope fa" aria-hidden="true"></i></span> <input
									type="text" class="form-control" name="description" required
									placeholder="${placeholderText}" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label"><fmt:message
								key="assigntask.label.startdate" /></label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-users fa"
									aria-hidden="true"></i></span> <input type="date" name="startDate" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="password" class="cols-sm-2 control-label"><fmt:message
								key="assigntask.label.enddate" /></label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i
									class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
									type="date" name="endDate" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="confirm" class="cols-sm-2 control-label"><fmt:message
								key="assigntask.label.projectmembers" /></label>
						<div class="cols-sm-10">
							<div class="input-group">																					
								<span class="input-group-addon"><i
									class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <select
									multiple class="form-control" name="result">
									<option> <fmt:message key="assighntask.option.employeeslist"/> </option>
									<option value="Karishma">Karishma</option>
									<option value="Surbhi">Surbhi</option>
									<option value="Priya">Priya</option>
									<option value="Savita">Savita</option>
								</select>
							</div>
						</div>
					</div>

					<div class="form-group ">
						<fmt:message key="assigntask.button.addatask"
							var="submitButtonValue" />
						<fmt:message key="assigntask.button.cancel" var="canceButtonValue" />
						<input type="submit" class="btn btn-primary"
							value="${submitButtonValue}" style='margin-right: 100px'>
						<input type="button" class="btn btn-danger"
							value="${canceButtonValue}" style='margin-right: 16px' />
					</div>

				</form>
			</div>
			<form>
				<div class="form-group" style="width: 125px; float: right;">
					<div class="input-group">
						<span class="input-group-addon"><i class="fa fa-user fa"
							aria-hidden="true"></i></span> <select class="form-control"
							id="language" name="language" onchange="submit()">
							<option value="en" ${language == 'en' ? 'selected' : ''}>English</option>
							<option value="es" ${language == 'es' ? 'selected' : ''}>Español</option>
						</select>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>