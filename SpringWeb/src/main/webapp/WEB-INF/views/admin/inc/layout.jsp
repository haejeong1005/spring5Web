<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<!-- header 영역 -->
	<tiles:insertAttribute name="header" />
	
	<!-- aside 영역 -->	
	<tiles:insertAttribute name="aside" />
	
	<!-- main 영역 -->
	<tiles:insertAttribute name="main" />
	
	<!-- footer 영역 -->
	<tiles:insertAttribute name="footer" />
</body>
</html>