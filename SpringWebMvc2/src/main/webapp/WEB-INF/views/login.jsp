<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>login application</h1>
	<form method="post" id="loginform" onsubmit="return login()">
		<label>UserName:</label> <input type="text" name="uname" id="uname">
		<br> <label>PassWord:</label> <input type="password" name="pwd"
			id="pwd"> <br> <label>Role</label> <select id="role">
			<option value="admin">Admin</option>
			<option value="user">User</option>
			<option value="manager">Manager</option>
		</select> <br> <input type="submit" value="submit">
	</form>
	<script type="text/javascript">
		function login() {
			let f = document.getElementById("loginform");
			let role = document.getElementById("role").value
			f.action = "home/" + role
			return true;
		}
	</script>
</body>
</html>