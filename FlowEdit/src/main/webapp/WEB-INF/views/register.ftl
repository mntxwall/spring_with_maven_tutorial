<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Register</title>
</head>
<body>
    <form action="/register/check" method="post">
      用户名：<input type="text" name="name">
      密码：<input type="password" name="password">
      重复密码:<input type="password" name="repassword">
      <input type="submit" value="提交">
    </form>
</body>
</html>