<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 상세</title>
<script
  src="https://code.jquery.com/jquery-3.6.3.js"
  integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
  crossorigin="anonymous">
</script>
<script type="text/javascript">
$(document).ready(function(){
	
	// post 전송
	$("#postButton").click(function(){
		var varTitle = $("#title").val();
		var varContent = $("#content").val();
		var varWriter = $("#writer").val();
		
		var jsonData = {
			title : varTitle
			,content : varContent
			,writer : varWriter
		};
		console.log(jsonData);
		
		$.ajax({
			type: "post",
			url: "/exercise/test/detail/post",
			data: JSON.stringify(jsonData),
			contentType: "application/json; charset=UTF-8",
			success: function(result){
				if(result == "SUCCESS"){
					alert("전송에 성공하였습니다.");
				}
			}
			
		});
	});
		
	
	
	// put 전송
	$("#putButton").click(function(){
		var varTitle = $("#title").val();
		var varContent = $("#content").val();
		var varWriter = $("#writer").val();
		
		var jsonData = {
			title : varTitle
			,content : varContent
			,writer : varWriter
		};
		console.log(jsonData);
		
		$.ajax({
			type: "post",
			url: "/exercise/test/detail/post",
			data: JSON.stringify(jsonData),
			contentType: "application/json; charset=UTF-8",
			success: function(result){
				if(result == "SUCCESS"){
					alert("전송에 성공하였습니다.");
				}
			}
			
		});
		
	}); 
		
	
	// xml전송
	$("#xmlButton").click(function(){
		var varTitle = $("#title").val();
		var varContent = $("#content").val();
		var varWriter = $("#writer").val();
		
		var makeData = "";
		makeData+= "<TestBoard>";
		makeData+= "<title>좋은 하루입니다.</title>";
		makeData+= "<content>산책하기 좋은 날씨이죠.</content>";
		makeData+= "<writer>김좋은</writer>";
		makeData+= "</TestBoard>";
		
		$.ajax({
			type:"post",
			url: "/exercise/test/detail/xml",
			data: makeData,
			contentType: "application/xml; charset=UTF-8",
			success: function(result){
				if(result == "SUCCESS"){
					alert("전송에 성공하였습니다.");
				}
			}
			,error : function(error) {
				alert("전송에 실패하였습니다.");
			}
		})
		
	}); 
		
});

</script>
</head>
<body>
	<h1>여러가지 데이터 포맷을 전송하겠습니다.</h1>
		제목 : <input type="text" id="title" name="title" value=""><br>
		내용 : <input type="text" id="content" name="content" value=""><br>
		작성자 : <input type="text" id="writer" name="writer" value=""><br>
	<br>
	<button  id="postButton">Post전송</button>
	<button  id="putButton">Put포스트</button>
	<button  id="xmlButton">Xml전송</button>
</body>
</html>