<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/css/bootstrap.css">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function(){
		if("${msg}"=="添加成功"){
			location.href="/selectList";
		}if("${msg}"=="添加失败"){
			location.href="/add.jsp";
		}
	})

</script>
</head>
<body>
	<form action="add" method="post" enctype="multipart/form-data">
		<table class="table table-striped">
		<tr>
			<td>姓名</td>
			<td>
				<div class="form-group" >
				    <input type="text" class="form-control" name="name">
				 </div>
			</td>
		</tr>
		<tr>
			<td>性别</td>
			<td>
				<!-- <div class="form-group" >
				    <input type="radio" name="gender" value=0>男
				    &nbsp; &nbsp; &nbsp; &nbsp;
				    <input type="radio" name="gender" value=1>女
				 </div> -->
			</td>
		</tr>
		<tr>
			<td>年龄</td>
			<td>
				<div class="form-group" >
				    <input type="text" class="form-control" name="age">
				 </div>
			</td>
		</tr>
		<tr>
			<td>头像</td>
			<td>
				<div class="form-group" >
				    <input type="file" name="myFile">
				 </div>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<div class="form-group">
				    <input type="submit" value="添加">
				 </div>
			</td>
		</tr>
		
	</table>
	</form>
	
</body>
</html>