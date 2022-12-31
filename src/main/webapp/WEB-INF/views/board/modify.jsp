<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>수정화면</h1>
	<form action="/exercise/board/modify" method="post">
		<table class="table table-striped">
			<tr>
				<td>id</td>
				<td>제목</td>
				<td>내용</td>
			</tr>
			<tr>
				<td>${resultData.id}
					<input type="text" name="id" value="${resultData.id}" readonly="readonly">
				</td>
				<td>${resultData.title}
					<input type="text" name="title" value="${resultData.title}"/>
				</td>
				<td>${resultData.contents}
					<input type="text" name="contents" value="${resultData.contents}"/>
				</td>
			</tr>
		</table>
		<button type="submit">수정</button>
	</form>
	
</body>
</html>