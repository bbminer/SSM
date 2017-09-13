<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<h2>登录</h2>
	<form action="login.do" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="name" type="text"></input></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="pwd" type="password"></input></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录"></input></td>
			</tr>
		</table>
	</form>
</body>
</html>
