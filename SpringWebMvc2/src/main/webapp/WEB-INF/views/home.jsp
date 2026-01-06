<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>welcome home!</h1>
<h1>Hello ${username}</h1>
<form onsubmit="return info()" id="userform" method="get">
<input type="submit" value="UserInfo">
</form>
<script type="text/javascript">
		function login() {
			let f = document.getElementById("userform");
			f.action = "userInfo/${username}";
			return true;
		}
	</script>
</body>
</html>