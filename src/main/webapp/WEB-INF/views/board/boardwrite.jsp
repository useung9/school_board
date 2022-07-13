<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/includeFile.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />


<title>학교건의 목록</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="image/favicon.ico" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="${path}/resources/css/styles.css" rel="stylesheet" />
<script type="text/javascript"  src="${path}/resources/js/board/boardwrite.js"></script>

</head>
<body>
	<!-- 헤더 -->
	<%@ include file="../header.jsp"%>


	<!-- Page content-->
	<div class="container mt-5">
		<div class="row">
			<div class="col-lg-8">
				<!-- Post content-->
				<!-- Post header-->
				<header class="mb-4">
					<!-- Post title-->
					<h1 class="fw-bolder mb-1">학교 게시판</h1>
					<hr>
				</header>

				게시판 글 작성
				<form id="frmboardwrite" action="${path}/board/boardwrite" method="post" >
					<div class="input-group mb-3">
						<div class="input-group-prepend">
							<span class="input-group-text" id="inputGroup-sizing-default">제목</span>
						</div>
						<input type="text" class="form-control" aria-label="Default" id="bsubject"
							name="bsubject" aria-describedby="inputGroup-sizing-default">
					</div>
					<div class="form-group">
						<div class="form-group">
							<textarea class="form-control" id="bcontent"
								name="bcontent" placeholder="내용을 입력해주세요." rows="3"></textarea>
						</div>
					</div>
					<div class="wrap_btn">
						<a class="btn btn-light" onclick="cancelbtn()">취소</a>
						<button class="btn btn-dark" onclick="addbtn('${path}',event)">등록</button>
					</div>
					
				</form>








			</div>
		</div>
	</div>
	<!-- footer -->
	<%@ include file="../footer.jsp"%>


</body>
</html>
