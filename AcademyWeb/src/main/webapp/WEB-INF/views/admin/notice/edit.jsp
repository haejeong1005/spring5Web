<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정 페이지</h1>
	<form method="post">
		<table border="1">
			<tr>
				<td>제목:</td>
				<td><input name="title" type="text" value="${notice.title}" /></td>
			</tr>
			<tr>
				<td>내용:</td>
				<td><textarea name="content" rows="8" cols="40">${notice.content}</textarea></td>
			</tr>
			<tr>
				<td>첨부파일:</td>
				<td><input name="file" type="file" /></td>
			</tr>
			<tr>
				<td>
					<input type="hidden" name="id" value="${notice.id}" />
					<input type="submit" value="저장" />
				</td>				
			</tr>
			
		</table>
	</form>		
</body>
</html>