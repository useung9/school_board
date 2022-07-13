<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/includeFile.jsp"%>
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
<title>학교건의 목록</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="image/favicon.ico" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="${path}/resources/css/styles.css" rel="stylesheet" />
<script type="text/x-handlebars-template" id="template_source">
	{{#each .}}
		<div class="divReply" id='reply{{rnum}}'>
		{{#levelSpace relevel}} <!--헬퍼작성:levelSpace(헬퍼의 이름) -->
			{{/levelSpace}}
			<div >
				<span style="display:none;">{{rnum}}</span>
				<span style="display:none;" id="restep{{rnum}}">{{restep}}</span> 
				<span style="display:none;" id="relevel{{rnum}}">{{relevel}}</span> <br>

				이메일 : <span> {{rid}}</span> <br>
				내용 : <pre id='rcontent{{rnum}}'>{{rcontent}}</pre> <br>
				<button class="reReplyAdd"  value="{{rnum}}">댓글</button>
				<button class="reReplyModi" value="{{rnum}}">수정</button>
				<button class="reReplyRemove" value="{{rnum}}">삭제</button>
			</div>
		</div>
		<hr>
	{{/each}}
</script>
</head>
<body>

	<%-- <!-- Responsive navbar-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container">
			<a class="navbar-brand" href="#!">동네학교 소통망</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link" href="${path}/">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="${path}/board/">List</a></li>
					<li class="nav-item"><a class="nav-link" href="#!">Contact</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Blog</a></li>
				</ul>
			</div>
		</div>
	</nav>
 --%>
	<!-- 헤더 -->
	<%@ include file="../header.jsp"%>

	<!-- Page content-->
	<div class="container mt-5">
		<div class="boardcontent">
			<div class="col-lg-8">
				<!-- Post content-->
				<article>
					<!-- Post header-->
					<header class="mb-4">
						<!-- Post title-->
						<h1 class="fw-bolder mb-1">학교 게시판</h1>
						<hr>
						<!-- Post meta content-->
					</header>
					<!-- Preview image figure-->
					<div class="view_head">
						<h4 class="tit_view">${board.bsubject}</h4>
						<dl class="writer_info">
							<dt class="tit_info">작성자</dt>
							<dd class="cont_info">
								<a href="#" class="link_writer"> <span class="txt_writer">
										${board.bid} </span>
								</a>
							</dd>
						</dl>

						<dl class="date_info">
							<dt class="tit_info">작성일</dt>
							<dd class="cont_info">${board.regidate}</dd>
							<dt class="tit_info">조회수</dt>
							<dd class="cont_info">${board.breadcnt}</dd>
							<dt class="tit_info">신고</dt>
							<dd>
								<a href="#"> 신고</a>
							</dd>
						</dl>
					</div>
				</article>

			</div>
			<hr>
			<div class="boardbody">게시글 내용${board.bcontent}  ${sessionScope.id} </div>
		</div>
<br>
		<!-- 댓글 -->
		<div class="replybody">

			<div class="cmt_head">
				<strong class="tit_cmt">댓글 
					<em class="emph_g2">
						<span class="screen_out">의견 쓰기</span>${totreply}</em>
				</strong>
		
						
						
						<br>
						<div class="replybody">
							<div class="u_cbox_box_name">
								<span class="u_cbox_write_name">${sessionScope.user}</span>
							</div>
							 <c:if test="${sessionScope.user ne null}">
							 <!-- 아이디값  -->
							 	<input type="hidden" id="rid" name="rid" value="${sessionScope.user}">
								<textarea id="comment" name="rcontent" class="tf_cmt"
									title="답글입력" cols="70" rows="3" placeholder="주제와 무관한 댓글이나 스포일러, 악플은 경고조치 없이 삭제되며 징계 대상이 될 수 있습니다."></textarea>
							 <div class="u_cbox_upload">
							 	<div class="u_cbox_addition">
								 	<button type="button" class="u_cbox_btn_upload">
								 		<div ><span class="u_cbox_txt_upload">등록</span></div>
								 	</button>
							 	</div>
						 	</div>
									 							 </c:if>
							 
							 <!-- 세션의 값이 널이라면 -->
							 <c:if test="${sessionScope.user eq null}">
							 	<textarea id="login" name="commentContent" class="tf_cmt"	title="답글입력" cols="70" rows="2"  readonly>
							 	댓글을 작성하려면 로그인 해주세요.
							 	</textarea>
							 </c:if>
							 
							
									 	
								 	 <!-- 세션의 값이 널이라면 -->
							 			<c:if test="${sessionScope.user eq null}">
										 
									 	</c:if>
									 	
								</div>
						 	</div>
						 	
						 	
						 	<!-- 댓글 리스트 창 -->
						 	<div id="replylist"></div>
						</div>
					
					
			</div>

		
		
	<br>


	<!-- footer -->
	<%@ include file="../footer.jsp"%>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	

</body>
<script type="text/javascript" src="${path}/resources/js/board/boarddetail.js"></script>
</html>