<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <aside>
    	<h1>별개 내용</h1>
    	
    </aside>
	<main>
		<section>
		<form  method="post" enctype="multipart/form-data">
			<table border="1">
				<tr>
					<td>제목:</td>
					<td><input name="t" type="text" /></td>
				</tr>
				<tr>
					<td>내용:</td>
					<td><textarea name="c" rows="8" cols="40"></textarea></td>
				</tr>
				<tr>
					<td>첨부파일:</td>
					<td><input name="file" type="file" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="등록" /></td>				
				</tr>
				
			</table>
		</form>		
		</section>
	</main>