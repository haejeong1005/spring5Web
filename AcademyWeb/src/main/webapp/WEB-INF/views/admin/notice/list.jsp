<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<main>
		<section>
			<h1>목록 페이지</h1>
			<table>
				<tr>
					<td>번호</td>
					<td>제목</td>
				</tr>
				<c:forEach var="n" items="${list}">
				<tr>
					<td>${n.id}</td>
					<td><a href="${n.id}">${n.title}</a></td>
				</tr>
				</c:forEach>
			</table>
		</section>
		
	</main>