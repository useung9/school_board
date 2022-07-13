package spring.tendinous.school.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import spring.tendinous.school.dto.Board;
import spring.tendinous.school.dto.Page;

public interface BoardService {
	// 전체 조회
	List<Board> boardlist(Page page);
	// 게시물정보
	Board selectOne(int bnum);
	
	// 최근 조회 게시물정보 
	Board selectOne(String userid);
	// 조회수 증가
	void update_boardcnt(int bnum);
	// 
	int selectTotalCnt();
	// 글작성
	void boardwrite(Board board, HttpSession session);
	
	// 인기 게시물 5개 정도
	List<Board> poplist();
}
