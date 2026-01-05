
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Admin Login - Quiz Portal</title>
    <style>
        /* Reset */
        * {
            margin: 0; padding: 0; box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        body, html {
            height: 100%;
            background: linear-gradient(135deg, #dbeafe 0%, #bfdbfe 100%);
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .login-container {
            background: rgba(255, 255, 255, 0.85);
            backdrop-filter: blur(12px);
            color: #1e3a8a;
            border-radius: 20px;
            box-shadow: 0 12px 40px rgba(30, 58, 138, 0.2);
            max-width: 900px;
            width: 90%;
            display: flex;
            overflow: hidden;
            min-height: 400px;
        }

        .login-image {
            flex: 1;
            background: linear-gradient(135deg, #93c5fd 0%, #60a5fa 100%);
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 40px;
            font-size: 120px; /* Emoji or icon size */
        }

        .login-form {
            flex: 1;
            padding: 60px 50px;
            display: flex;
            flex-direction: column;
            justify-content: center;
        }

        h2 {
            font-size: 32px;
            margin-bottom: 40px;
            font-weight: 700;
            color: #1e3a8a;
        }

        .form-group {
            margin-bottom: 28px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: 600;
            color: #3b82f6;
            font-size: 15px;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 14px 18px;
            border: 2px solid #93c5fd;
            border-radius: 12px;
            font-size: 16px;
            background: #f0f9ff;
            transition: border-color 0.3s ease, box-shadow 0.3s ease;
        }

        input:focus {
            border-color: #3b82f6;
            outline: none;
            box-shadow: 0 0 8px rgba(59, 130, 246, 0.4);
        }

        .btn-login {
            width: 100%;
            padding: 16px;
            background: linear-gradient(135deg, #3b82f6 0%, #1e40af 100%);
            border: none;
            border-radius: 12px;
            font-size: 18px;
            font-weight: 700;
            color: #fff;
            cursor: pointer;
            box-shadow: 0 6px 15px rgba(30, 58, 138, 0.3);
            transition: background 0.3s ease, transform 0.2s ease;
        }

        .btn-login:hover {
            background: linear-gradient(135deg, #1e40af 0%, #1e3a8a 100%);
            transform: translateY(-3px);
        }

        .error {
            background: #fee2e2;
            color: #b91c1c;
            padding: 14px 20px;
            border-radius: 12px;
            margin-bottom: 30px;
            font-weight: 600;
            box-shadow: 0 2px 8px rgba(185, 28, 28, 0.2);
        }

        @media (max-width: 720px) {
            .login-container {
                flex-direction: column;
                border-radius: 24px;
            }
            .login-image, .login-form {
                width: 100%;
                padding: 40px 30px;
            }
        }
    </style>
</head>
<body>
    <div class="login-container">
        <div class="login-image">
            👋
        </div>
        <div class="login-form">
            <h2>Welcome Back!</h2>
            <% if (request.getAttribute("error") != null) { %>
                <div class="error"><%= request.getAttribute("error") %></div>
            <% } %>
            <form action="" method="post" autocomplete="off">
                <div class="form-group">
                    <label for="username">Enter Admin Name</label>
                    <input type="text" id="username" name="username" required autofocus />
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required />
                </div>
                <button type="submit" class="btn-login">Login</button>
            </form>
        </div>
    </div>
</body>
</html>
