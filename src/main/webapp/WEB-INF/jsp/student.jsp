<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>列表</th>
		</tr>
		<c:forEach items="${allUser}" var="user">
			<tr>
				<th>${user.id}</th>
				<th>${user.name}</th>
				<th>${user.pwd}</th>
			</tr>
		</c:forEach>
	</table>



	<form action="saveStudent.do" method="post">
		学号<input name="id" type="text" /><br> 姓名<input name="name"
			type="text" /><br> 年龄<input name="age" type="text" /> <br>
		性别<input name="gender" type="text" /><br> <input type="submit"
			value="提交" />
	</form>
</body>
</html>