<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>The page was not found | Castle</title>
<link
	href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600'
	rel='stylesheet' type='text/css'>
<style type="text/css">
body {
	text-align: center;
	font-family: 'Source Sans Pro', 'Helvetica', 'Arial', sans-serif;
	color: #222;
	background: #fff;
}

img {
	margin: 30px 0 30px;
}

a {
	color: #705AB2;
	text-decoration: none;
}

h1 {
	color: #000;
	font-size: 48px;
	margin: 0;
}

p {
	color: #000;
	font-size: 18px;
	margin: 6px 0 0 0;
}
</style>
</head>

<body>
	<div class="main-login main-center">
		<%
			if (response.getStatus() == 404) {
		%>
		<font color="red">Error: <%=exception.getMessage()%></font><br>
		<%@ include file="AssignTask.jsp"%>
		<%
			} else {
		%>

		<img src="https://dh2wg6yal4wru.cloudfront.net/notfound.png" />
		<h1>Oops!! Something went wrong!</h1>
		<p>Please report the below to support team -</p>


		<p>
			Error code:
			<%=response.getStatus()%>
		</p>
		<p>
			Error message:<%=exception.getMessage()%></p>
		<br> Please go to <a href="AssignTask">Home Page</a>
		<%
			}
		%>
	</div>
</body>
</html>