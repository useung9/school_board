<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<%@ include file="../include/includeFile.jsp"%>
<script type="text/javascript" charset="utf-8">
	sessionStorage.setItem("path", "${path}");
</script>
<script type="text/javascript" src="${path}/resources/js/listpage.js"></script>
<title>학교건의 목록</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="image/favicon.ico" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="${path}/resources/css/styles.css" rel="stylesheet" />
</head>
<body>
	<!-- 헤더 -->
	<%@ include file="../header.jsp"%>


	<!-- Page content-->
	<div class="container mt-5">
		<div class="row">
			<div class="col-lg-8">
				<!-- Post content-->
				<article>
					<!-- Post header-->
					<header class="mb-4">
						<!-- Post title-->
						<h1 class="fw-bolder mb-1">학교 게시판</h1>
						<hr>

					</header>



					<div>
						<ul id="ul1">
							<li id="li1"><a href="${path}/board/">전체</a></li>
							<li id="li1" class="li2"><a href="">베스트</a></li>
							<li id="li1" class="li3"><a href="">베스트2</a></li>

							<li id="li1">
								<p>총 ${totcnt}개의 글이 있습니다.
								<p>
							</li>

						</ul>
					</div>


					<br>
				</article>
				<br>


				<c:choose>
					<c:when test="${not empty blist}">
						<table class="boardtb">
							<thead align="center">
								<tr>
									<th>구분</th>
									<th>제목</th>
									<th>작성자</th>
									<th>작성일</th>
									<th>조회수</th>
								<tr>
							</thead>
							<tbody align="center">
								<c:forEach var="list" items="${blist}">
									<tr>
										<td>구분</td>
										<td><a href="${path}/board/detail?bnum=${list.bnum}">${list.bsubject}</a></td>
										<td>${list.bid}</td>
										<td>${list.modifydate}</td>
										<td>${list.breadcnt}</td>
									<tr>
								</c:forEach>
							</tbody>
						</table>



						<div id="pagenum" style="text-align: center;">

							<!-- 이전 -->
							<c:if test="${page.startPage != 1 }">
								<a href="${path}/board/?curPage=${page.startPage-1}">이전</a>
							</c:if>

							<!-- 리스트 -->
							<c:forEach var="i" begin="${page.startPage}"
								end="${page.totPage}">
								<a href="${path}/board/?curPage=${i}">${i}</a>
							</c:forEach>

							<!-- 다음 -->
							<c:if test="${page.endPage < page.totPage}">
								<a href="${path}/board/?curPage=${page.endPage+1}">다음</a>
							</c:if>

						</div>
						<hr>




						<div>
							<form action="${path}/board/" id="frmlist">
								<div>
									<select name="findkey" id="findkey">
										<option value="id"
											<c:out value="${param.findkey == 'id' ? 'selected':''}"/>>작성자</option>
										<option value="subcon"
											<c:out value="${param.findkey == 'subcon' ? 'selected':''}"/>>제목
											+ 내용</option>
									</select> <input type="text" name="findvalue" id="findvalue"
										value="${param.findvalue}">
									<button id="searchButton">조회</button>


									<select class="value" name="listvalue" id="listvalue">
										<option value="10"
											<c:out value="${param.listvalue == '10' ? 'selected':''}"/>>10개씩보기</option>
										<option value="15"
											<c:out value="${param.listvalue == '15' ? 'selected':''}"/>>15개씩보기</option>
										<option value="30"
											<c:out value="${param.listvalue == '30' ? 'selected':''}"/>>30개씩보기</option>
										<option value="50"
											<c:out value="${param.listvalue == '50' ? 'selected':''}"/>>50개씩보기</option>
									</select> <a class="btn_board" href="${path}/board/boardwrite">글쓰기</a>
								</div>

							</form>

						</div>

					</c:when>
					<c:otherwise>
						<h2>조회된 내용이 없습니다.</h2>
					</c:otherwise>
				</c:choose>
			</div>
			<!-- Side widgets-->
			<div class="col-lg-4">
				<div class="card mb-4">
					<div class="card-header">인기 게시물</div>
					<div class="card-body">
						<div class="card-body">
							<div class="">
								<table style="width: 100%">
									<tr>
										<th>제목</th>
										<th>조회수</th>
									<tr>
										<c:forEach var="list" items="${poplist}">
										<tr>
											<td><a href="${path}/board/detail?bnum=${list.bnum}">${list.bsubject}</a></td>
											<td>${list.breadcnt}</td>
										</tr>
										</c:forEach>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>


		</div>
	</div>
	<!-- footer -->
	<%@ include file="../footer.jsp"%>

	<!-- Core theme JS-->
	<script src="${path}/resources/js/scripts.js"></script>

</body>
</html>
