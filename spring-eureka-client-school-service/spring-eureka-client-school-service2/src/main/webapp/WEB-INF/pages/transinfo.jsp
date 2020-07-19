<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Transportation Information</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	
	<style>
	
		body {
			margin: 50px 50px;
		}
	</style>
</head>

<body>

	<p align="right"><a type="button" href="/logout">Logout</a></p>

	<h3> Transportation information for <c:out value="${schoolName}"/> </h3>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Transportation Type</th>
				<th scope="col">Cost (per semester)</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${transArr}" var="trans">
					<tr>
						<th scope="row"> ${trans.transId}</th>
						<td> ${trans.transType}</td>
						<td> ${trans.transCost}</td>

					</tr>
				</c:forEach>
		</tbody>
	</table>
	<hr>
	<br>
	<a type="button" href="/welcome">Home Page</a>
</body>
</html>