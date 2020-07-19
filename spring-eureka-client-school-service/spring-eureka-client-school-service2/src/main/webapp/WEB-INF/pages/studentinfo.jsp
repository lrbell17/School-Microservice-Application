<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Student Information</title>
		
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	
	<style>
	
		body {
			margin: 50px 50px;
		}
	</style>
	
</head>

<body>

	<p align="right"><a type="button" href="/logout">Logout</a></p>
	
	<h3> Student Information for <c:out value="${schoolName}"/>: </h3>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Student Name</th>
				<th scope="col">Class</th>
				<th scope="col">Graduation Year</th>
				<th scope="col">GPA</th>
				
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${stuArr}" var="stu">
					<tr>
						<th scope="row"> ${stu.studentId}</th>
						<td> ${stu.name}</td>
						<td> ${stu.className}</td>
						<td> ${stu.gradYear}</td>
						<td> ${stu.gpa}</td>
					</tr>
				</c:forEach>
		</tbody>
	</table>
	<hr>
	<br>
	<a type="button" href="/welcome">Home Page</a>
</body>
</html>