<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Finance Information</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	
	<style>
	
		body {
			margin: 50px 50px;
		}
	</style>
</head>

<body>

	<p align="right"><a type="button" href="/logout">Logout</a></p>
	
	<h3> Financial information for <c:out value="${schoolName}"/> </h3>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Field</th>
				<th scope="col">Description</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">1</th>
				<td> Tuition </td>
				<td> $<c:out value="${finData.tuition}"/> per semester </td>
			</tr>
			<tr>
				<th scope="row">2</th>
				<td>School Lunches</td>
				<td> $<c:out value="${finData.schoolLunches}"/> per semester</td>

			</tr>
			<tr>
				<th scope="row">3</th>
				<td> Scholarships Available </td>
				<td> <c:out value="${finData.scholarships}"/> </td>
			</tr>
		</tbody>
	</table>
	<hr>
	<br>
	<a type="button" href="/welcome">Home Page</a>
	
</body>
</html>