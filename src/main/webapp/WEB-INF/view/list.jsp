<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resource/css/bootstrap.css">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	function add(){
		location.href="/toAdd";
	}

</script>
</head>
<body>
	<button type="button" class="btn btn-primary" onclick="add()">添加</button>
	<table border="1" class="table table-striped">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
			<td>头像</td>
		</tr>
		<c:forEach items="${list }" var="p">
			<tr>
			<td>${p.id}</td>
			<td>${p.name}</td>
			<td>${p.gender.displayName}</td>
			<td>${p.age}</td>
			<td>
				<img alt="" style="width: 50px;height: 50px" src="/pic/image/20200112/${p.url}">
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>