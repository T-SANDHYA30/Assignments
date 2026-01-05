<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Quiz Portal</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: 'Poppins', Arial, sans-serif;
	background: #f4f6f9; /* light neutral background */
	color: #222;
	min-height: 100vh;
	display: flex;
	flex-direction: column;
}

/* Navbar */
.navbar {
	background: #1e3c72; /* deep blue */
	background: linear-gradient(90deg, #2a5298, #1e3c72);
	padding: 16px 50px;
	display: flex;
	justify-content: space-between;
	align-items: center;
	box-shadow: 0 3px 8px rgba(0, 0, 0, 0.15);
}

.logo {
	color: #fff;
	font-size: 28px;
	font-weight: 700;
	letter-spacing: 1px;
}

.nav-links a {
	color: #fff;
	text-decoration: none;
	margin-left: 25px;
	font-size: 16px;
	font-weight: 500;
	transition: color 0.3s ease;
}

.nav-links a:hover {
	color: #ffd700; /* gold accent */
}

/* Hero Section */
.hero {
	flex: 1;
	background: linear-gradient(to right, #00c6ff, #0072ff);
	/* vibrant blue gradient */
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	text-align: center;
	padding: 70px 20px;
	color: #fff;
}

.hero h1 {
	font-size: 52px;
	font-weight: 800;
	margin-bottom: 20px;
	animation: fadeInDown 1s ease;
}

.hero p {
	font-size: 18px;
	margin-bottom: 35px;
	max-width: 600px;
	line-height: 1.6;
}

@
keyframes fadeInDown {from { opacity:0;
	transform: translateY(-25px);
}

to {
	opacity: 1;
	transform: translateY(0);
}

}

/* Call-to-action button */
.btn-login-hero {
	background: #ffd700; /* gold */
	color: #1e3c72;
	padding: 14px 40px;
	border-radius: 6px;
	font-size: 18px;
	font-weight: 600;
	text-decoration: none;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.25);
	transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.btn-login-hero:hover {
	transform: translateY(-2px);
	box-shadow: 0 6px 18px rgba(0, 0, 0, 0.35);
}

/* Responsive */
@media ( max-width : 700px) {
	.navbar {
		flex-direction: column;
		align-items: flex-start;
		padding: 12px 25px;
	}
	.nav-links {
		margin-top: 10px;
	}
	.nav-links a {
		margin: 8px 0;
		font-size: 15px;
	}
	.hero h1 {
		font-size: 36px;
	}
	.hero p {
		font-size: 16px;
		max-width: 90%;
	}
}

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: 'Poppins', Arial, sans-serif;
	background: #f4f6f9; /* light neutral background */
	color: #222;
	min-height: 100vh;
	display: flex;
	flex-direction: column;
}

/* Navbar */

/* Navbar Container */
.navbar {
    background: linear-gradient(90deg, #1e3c72, #2a5298); /* Smooth gradient */
    padding: 14px 40px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
    position: sticky;
    top: 0;
    z-index: 1000;
}

/* Logo */
.logo {
    color: #fff;
    font-size: 26px;
    font-weight: 700;
    letter-spacing: 1.5px;
    text-transform: uppercase;
    transition: transform 0.3s ease;
}

.logo:hover {
    transform: scale(1.05);
}

/* Navigation Links */
.nav-links a {
    color: #fff;
    text-decoration: none;
    margin-left: 25px;
    font-size: 16px;
    font-weight: 500;
    position: relative;
    transition: color 0.3s ease;
}

.nav-links a::after {
    content: '';
    position: absolute;
    width: 0%;
    height: 2px;
    bottom: -4px;
    left: 0;
    background-color: #ffd700; /* gold accent */
    transition: width 0.3s ease;
}

.nav-links a:hover {
    color: #ffd700;
}

.nav-links a:hover::after {
    width: 100%;
}

/* Responsive Design */
@media (max-width: 768px) {
    .navbar {
        flex-direction: column;
        padding: 12px 20px;
    }

    .nav-links {
        margin-top: 10px;
    }

    .nav-links a {
        margin: 10px;
        display: inline-block;
    }
}

/* Hero Section */
.hero {
	flex: 1;
	background: linear-gradient(to right, #00c6ff, #0072ff);
	/* vibrant blue gradient */
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	text-align: center;
	padding: 70px 20px;
	color: #fff;
}

.hero h1 {
	font-size: 52px;
	font-weight: 800;
	margin-bottom: 20px;
	animation: fadeInDown 1s ease;
}

.hero p {
	font-size: 18px;
	margin-bottom: 35px;
	max-width: 600px;
	line-height: 1.6;
}

@
keyframes fadeInDown {from { opacity:0;
	transform: translateY(-25px);
}

to {
	opacity: 1;
	transform: translateY(0);
}

}

/* Call-to-action button */
.btn-login-hero {
	background: rgb(175,214,255); /* green */
	color: #1e3c72;
	padding: 14px 40px;
	border-radius: 6px;
	font-size: 18px;
	font-weight: 600;
	text-decoration: none;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.25);
	transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.btn-login-hero:hover {
	transform: translateY(-2px);
	box-shadow: 0 6px 18px rgba(0, 0, 0, 0.35);
}

/* Responsive */
@media ( max-width : 700px) {
	.navbar {
		flex-direction: column;
		align-items: flex-start;
		padding: 12px 25px;
	}
	.nav-links {
		margin-top: 10px;
	}
	.nav-links a {
		margin: 8px 0;
		font-size: 15px;
	}
	.hero h1 {
		font-size: 36px;
	}
	.hero p {
		font-size: 16px;
		max-width: 90%;
	}
}
</style>
</head>
<body>
	<nav class="navbar">
		<div class="logo">ONLINE QUIZ</div>
		<div class="nav-links">
			<a href="${pageContext.request.contextPath}/admin/login">Admin
				Login</a> <a href="${pageContext.request.contextPath}/user/login">Login/Signup</a>
		</div>
	</nav>

	<div class="hero">
		<h1>Welcome to Online Quiz Portal</h1>
		<p>Interactive quizzes that inspire you to learn and conquer challenges every day!</p>
		<a href="${pageContext.request.contextPath}/user/login"
			class="btn-login-hero">Start</a>
	</div>
</body>
</html>