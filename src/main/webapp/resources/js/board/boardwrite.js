/**
 * 
 */
// 취소버튼
function cancelbtn(){
	
	window.history.back();
}

// 등록버튼 클릭
function addbtn(path, e){
	e.preventDefault();
	var subject = document.getElementById('bsubject').value;
	var content = document.getElementById('bcontent').value;
	
	if(subject =='') {
		alert('제목을 입력해주세요');
		document.getElementById('bsubject').focus();
		return ;
	}
	if(content == '') {
		alert('내용을 입력해주세요.');
		document.getElementById('bcontent').focus();
		return ;
	}
	
	document.getElementById('frmboardwrite').method='post';
	document.getElementById('frmboardwrite').action=path+'/board/boardwrite';
	document.getElementById('frmboardwrite').submit();
	
}