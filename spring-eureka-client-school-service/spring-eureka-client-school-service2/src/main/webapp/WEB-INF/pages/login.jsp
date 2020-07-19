<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	
	<style>
		body {
			margin: 50px 50px;
		}
	</style>
	
</head>

<body>
	<h2>Welcome to the Santa Cruz school district information portal!</h2><hr><br>
	
	<p style="color:red"> ${errorMessage} </p>
	<p style="color:blue"> ${successMessage} </p>
	
		<form method ="post" action="login">

		<br>
		<div class="form-group">
			<label for="exampleInputEmail1">Username</label> <input
					type="text" class="form-control" 
					name="username" placeholder="Username">
		</div>
		<br>
		
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" name="password"
					placeholder="Password">
		</div>
		<br/>
		
		<button type="submit" class="btn btn-outline-primary">Login</button>
	</form>
	
	
</body>
</html>