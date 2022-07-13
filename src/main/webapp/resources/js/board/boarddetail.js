
	/*
	 * 1. 게시물번호에 대한 전체 댓글 불러오기.
	 * 
	 */
const urlParams = new URL(location.href).searchParams;
	const bnum = urlParams.get('bnum');
	const rbnum = urlParams.get('bnum');
	const path = sessionStorage.path;





// 페이지 열릴때.
	// 로딩이 완료된후
	window.addEventListener('load',()=>{

	// 핸들바에서 사용 : 헬퍼만들기
	Handlebars.registerHelper('levelSpace', function(relevel){
		let result = '';
		for(var i=0; i<relevel; i++)
			result += '<div class ="divSpace"></div>';
		return result;
	});
	
	
	
	$('.login').click(function(){ 
		alert('로그인 팝업');
	});

	// 부모 댓글 추가.
	$('.u_cbox_txt_upload').click(function(){
		const rcontent = $('#comment').val();  // 댓글 내용
		const restep = 1;
		const relevel = 1;
		const rid = $('#rid').val();
		// 공백 여부 확인
		if($('#comment').val() == ''){
			alert('다시 입력해주세요.');
			return ;
		}
			
		// 전송할 데이터 객체 처리
		const data = {
				rcontent,
				rbnum,
				restep,
				relevel,
				rid,
		};
		// 내용 등록
		if(confirm('등록하시겠습니까?')){
			$.ajax({
				url:path+'/reply/replyadd',
				type:'post',
				contentType : 'application/json', // 보내는 타입
				data : JSON.stringify(data), // 보내는 데이터 sjosn 처리
				dataType : 'text',
				success : (text) => {
					// $('#comment').val = '';
					document.getElementById('comment').value = '';
					replyList();
				},
				error : console.error
				
			})
			// 댓글 목록 최신화
		}
	
	});



	// 댓글 목록 불러오기
	const replyList =() =>{
		$.ajax({
			url:path+'/reply/replylist?bnum='+bnum,
			type : 'get',
			contentType : 'application/json', // 보내는 데이터의 타입
			// data: JSON.stringify(data), // 보내는 데이터 json의 문자열
			
			dataType : 'json', // 받을 데이터의 타입
			success : (text)=>{

				// document.getElementById('replylist').innerHTML = text;
				// console.log(text);
				/* 탬플리소스가져오기 */
				const source = document.getElementById('template_source').innerHTML;
				console.log('소스 - '+source);
				// 소스컴파일
				const template = Handlebars.compile(source);
				console.log('컴파일 소스 '+template);
				// 컴파일된 데이터를 div넣기
				console.log('데이터 넣기');
				document.getElementById('replylist').innerHTML= template(text);
				// $('.replylist').append(template(text));

			},
			error : console.error
			
		});
		
	}
	// 목록 출력
	replyList();
	
	//부모를 선택하고 자식엘리먼트에 이벤트 달기
	document.getElementById('replylist').addEventListener('click',(e)=>{
		//댓글리스트의 댓글버튼을 클릭했을때(추가)
			if (e.target.classList.contains('reReplyAdd')){
				alert('댓글 추가'+e.target.value);
			}
			// 수정
			else if (e.target.classList.contains('reReplyModi')){
				alert(e.target.value);
				
			}
			// 삭제
			if (e.target.classList.contains('reReplyRemove')){
				// 해당 rnum
				if(! confirm('삭제 하시겠습니까?')) return ;
				var value = e.target.value;
			fetch(path+`/`,{
				
			})
			}
			
		});
	
	
});







$( document ).ready(function(){
	$('.reReplyAddShow').click(function(){
		alert('수정 클릭');
	});
});