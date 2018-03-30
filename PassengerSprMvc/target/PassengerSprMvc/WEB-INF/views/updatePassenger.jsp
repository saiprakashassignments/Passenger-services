<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.imcs.SprMvc.model.passenger_profile"%>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
.labelClass {
	float: left;
	width: 113px;
	margin-bottom: 10px;
}
</style>

</head>
<body>

	<form:form class="form-horizontal" action="updateInformation"
		method="post" modelAttribute="passenger">

		<div class="container" style="width: 800px; margin: 0 auto;">

			<h1>Passenger Profile Information</h1>
			<div class="col-lg-12">
				<span class="labelClass"> Profile Id:</span>
				<form:input type="text" path="profile_id" />
			</div>
			<br>

			<div class="col-lg-12">
				<span class="labelClass"> Password:</span>
				<form:input type="text" path="password" />
			</div>

			<br>

			<div class="col-lg-12">
				<span class="labelClass"> First name:</span>
				<form:input type="text" path="first_name" />
			</div>
			<br>
			<div class="col-lg-12">
				<span class="labelClass"> Last Name:</span>
				<form:input type="text" path="last_name" />
				<br>
			</div>
			<br>


			<div class="col-lg-12">
				<span class=""labelClass"> Address:</span>
				<form:input type="text" path="address" />
			</div>

			<br>
			
			<br>
			<div class="col-lg-12">
				<span class="labelClass"> Tel_no:</span>
				<form:input type="text" path="tel_no" />
				<br>
			</div>
			<br>
			
			<br>
			<div class="col-lg-12">
				<span class="labelClass"> Email id:</span>
				<form:input type="text" path="email_id" />
				<br>
			</div>
			<br>
			
		<br>
		<div class="col-lg-12">
			<br>
			<button type="submit" class="btn btn-default">Submit</button>

		</div>
		</div>
	</form:form>

</body>
</html>