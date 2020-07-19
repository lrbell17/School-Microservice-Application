<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Welcome</title>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	
	<style>
	
		body {
			margin: 50px 50px;
		}
	</style>
</head>

<body>

	<p align="right"><a type="button" href="/logout">Logout</a></p>

	<h2>Welcome to the Santa Cruz school district information portal!</h2><hr><br>
	<p style="color:blue"> ${successMessage} </p>
	
	<!-- Type of Information -->
	<form method="post" action="welcome">
		<fieldset class="form-group">
	    <div class="row">
	      <legend class="col-form-label col-sm-2 pt-0">Information Type</legend>
	      <div class="col-sm-10">
	        <div class="form-check">
	          <input class="form-check-input" type="radio" name="infoType" id="infoType1" value="student" checked>
	          <label class="form-check-label" for="infoType1">
	            Student Information
	          </label>
	        </div>
	        <div class="form-check">
	          <input class="form-check-input" type="radio" name="infoType" id="infoType2" value="transportation">
	          <label class="form-check-label" for="infoType2">
	            Transportation Information
	          </label>
	        </div>
	        <div class="form-check disabled">
	          <input class="form-check-input" type="radio" name="infoType" id="infoType3" value="financial">
	          <label class="form-check-label" for="gridRadios3">
	            Financial Information
	          </label>
	        </div>
	      </div>
	    </div>
	  </fieldset>
	  <br><hr><br>
	  
	  <!-- School -->
		<fieldset class="form-group">
	    <div class="row">
	      <legend class="col-form-label col-sm-2 pt-0">School Name</legend>
	      <div class="col-sm-10">
	        <div class="form-check">
	          <input class="form-check-input" type="radio" name="schoolName" id="schoolName1" value="schs" checked>
	          <label class="form-check-label" for="schoolName1">
	            Santa Cruz High School
	          </label>
	        </div>
	        <div class="form-check">
	          <input class="form-check-input" type="radio" name="schoolName" id="schoolName2" value="hhs">
	          <label class="form-check-label" for="schoolName2">
	            Harbor High School
	          </label>
	        </div>
	      </div>
	    </div>
	  </fieldset>
		
		<br><hr><br>
		
		<!-- submit -->
		<div class="form-group row">
			<div class="col-sm-10">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</div>
	</form>

	
	
</body>
</html>