<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form  method="post">
		<table border="1">
			<tr>
				<td>제목:</td>
				<td><input name="title" type="text" /></td>
			</tr>
			<tr>
				<td>내용:</td>
				<td><textarea name="content" rows="8" cols="40"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="등록" /></td>				
			</tr>
			
		</table>
	</form>		
</body>
</html>