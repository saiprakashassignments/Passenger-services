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

	<form class="form-horizontal" action="deleteInformation" method="post">

		<div class="container" style="width: 800px; margin: 0 auto;">
			<div class="col-lg-12" style="margin-top: 10px; margin-bottom: 10px;">
				<span class="labelClass" for="profile_id">Profile Id:</span> <input
					type="text" name="profile_id" />
			</div>
			<br> <br>
			<div class="col-lg-12">
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
			<div>
				<a id="red" href="<c:url value="redirection"/>">Landing</a>
			</div>
		</div>
	</form>
</body>
</html>