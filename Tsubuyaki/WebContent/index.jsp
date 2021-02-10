<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tsubuyaki</title>
</head>
<body>
<h1>Tsubuyaki へようこそ</h1>
<form action="/Tsubuyaki/Login" method = "post">
ユーザー名：<input type = "text" name = "name">
パスワード : <input type = "password" name = "pass">
<br>
<input type = "submit" value="ログイン">
</form>
</body>
</html>