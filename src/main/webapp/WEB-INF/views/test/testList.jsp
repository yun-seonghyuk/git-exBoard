<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 목록</title>
</head>
<body>
	<form action="list" method="get">
		<input type="submit" value="list(GET)">	
	</form>
	
	<form action="detail" method="get">
		<input type="submit" value="detail(GET)">	
	</form>
	
	<form action="insert" method="post">
		<input type="submit" value="insert(POST)">	
	</form>
	
	<form action="update" method="post">
		<input type="submit" value="update(POST)">	
	</form>
	
	<form action="delete" method="post">
		<input type="submit" value="delete(POST)">	
	</form>
</body>
</html>