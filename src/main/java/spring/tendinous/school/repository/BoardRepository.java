package spring.tendinous.school.repository;

import java.util.List;

import spring.tendinous.school.dto.Board;
import spring.tendinous.school.dto.Page;

public interface BoardRepository {

	
	List<Board> board_selectlist(Page page);
	
	int selectTotalCnt();

	
	//  게시글 번호로  조회 1건
	Board selectOne(int bnum);
	
	//  작성자 최근 조회 1건
	Board selectOne(String userid);
	
	// 글 조회수 증가
	void update_boardcnt(int bnum);
	// 글 작성
	void boardwrite(Board board);
	// 인기 게시물
	List<Board> poplist();
}
