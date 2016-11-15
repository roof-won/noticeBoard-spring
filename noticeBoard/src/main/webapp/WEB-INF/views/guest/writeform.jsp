<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
<h1>회원 등록</h1>
<form action="write" method="post" name="guest_write">
	<table style="width:500;border:1">
		<tr>
			<td>이름</td>
			<td><input name="name" id="name"/></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea name="content" id="content" rows="5" cols="40"></textarea></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value ="회원등록"/>
				<input type="reset" value ="취소"/>
			</td>
		</tr>
	</table>
</form>


</body>
</html>