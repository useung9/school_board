package spring.tendinous.school.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.tendinous.school.dto.Board;
import spring.tendinous.school.dto.Page;
import spring.tendinous.school.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardRepository boardrepository;
	
	
	// 게시판 전체 리스트 보여주기
	@Override
	public List<Board> boardlist(Page page) {
		// 페이지 처리
		int curPage = page.getCurPage(); // 현재 페이지
		int perPage = page.getPerPage(); // 한페이지당 게시물 수
		int perBlock = page.getPerBlock();
		
		// 1. 게시물의 시작번호 
		//오라클은 + 1
		int startNum = (curPage -1) * perPage;
		
		//2)게시물의 끝번호
		int endNum = startNum + perPage - 1;
		
		//3)전체페이지수
		int totalCnt = boardrepository.selectTotalCnt(); //전체게시물수
		int totPage = totalCnt/perPage;
		if (totalCnt%perPage!=0) totPage++; //나머지가 있으면 +1
		
		// 4)페이지블럭의 시작페이지
				int startPage = curPage - ((curPage - 1) % perBlock);
				
				// 5)페이지블럭의 끝페이지
				int endPage = startPage + perBlock - 1;
				if (endPage > totPage)
					endPage = totPage; // endPage는 totPage보다 작거나 같아야 한다
				// Page 세팅
				page.setStartNum(startNum);
				page.setEndNum(endNum);
				page.setStartPage(startPage);
				page.setEndPage(endPage);
				page.setTotPage(totPage);
				System.out.println(page);
				
		
		return boardrepository.board_selectlist(page);
	}

	// 게시글 번호로 1건 조회
	@Override
	public Board selectOne(int bnum) {

		return boardrepository.selectOne(bnum);
	}
	
	// 작성자 최신글  1건 조회
		@Override
		public Board selectOne(String userid) {

			return boardrepository.selectOne(userid);
		}
	


	@Override
	public void update_boardcnt(int bnum) {
		boardrepository.update_boardcnt(bnum);
		
	}


	@Override
	public int selectTotalCnt() {
 
		return boardrepository.selectTotalCnt();
	}

	
	//게시 글 작성
	@Override
	public void boardwrite(Board board, HttpSession session) {
		board.setBid(session.getAttribute("id").toString());
		boardrepository.boardwrite(board);
		
	}
	// 인기 게시물 
	@Override
	public List<Board> poplist() {
		// TODO Auto-generated method stub
		return boardrepository.poplist();
	}





	
}
