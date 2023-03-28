<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="edusignup" method="post">

		<div class="mb-3">
			<label for="firstname" class="form-label">First Name</label> <input
				type="text" class="form-control" id="firstname"
				placeholder="Enter FirstName" name="firstName">
		</div>

		<div class="mb-3">
			<label for="lastname" class="form-label">Last Name</label> <input
				type="text" class="form-control" class="form-control" id="lastname"
				name="lastName" placeholder="Enter LastName">
		</div>

		<div class="mb-3">
			<label for="Email" class="form-label">Email</label> <input
				type="email" name="email" class="form-control"
				placeholder="Enter Email">
		</div>

		<div class="mb-3">
			<label for="Password" class="form-label">Password</label> <input
				type="password" name="password" class="form-control"
				placeholder="Enter Password">
		</div>
		
		<div class="form-floating">
			<textarea name="bio" class="form-control" placeholder="Leave a comment here"
				id="floatingTextarea2" style="height: 100px"></textarea>
			<label for="floatingTextarea2">Bio</label>
		</div>
		
		<div class="container text-center">

			<button type="submit" class="btn btn-primary">Submit</button>


		</div>

	</form>


</body>
</html>