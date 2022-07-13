package spring.tendinous.school.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.tendinous.school.dto.Board;
import spring.tendinous.school.dto.Page;

@Repository
public class BoardRepositoryImpl implements BoardRepository{

	@Autowired
	private SqlSession sqlsession;
	String path = "spring.tendinous.school.BoardMapper.";
	
	// 전체 리스트
	@Override
	public List<Board> board_selectlist(Page page) {

		return sqlsession.selectList("spring.tendinous.school.BoardMapper.selectList", page);
	}

	// 전체 개시물 수
	@Override
	public int selectTotalCnt() {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("spring.tendinous.school.BoardMapper.selectTotalCnt");
	}

	
	// 게시물 번호로  1개 
	@Override
	public Board selectOne(int bnum) {
		// TODO Auto-generated method stub
		return sqlsession.selectOne(path+"selectOne", bnum);
	}
	
	
	// 작성자 아이디 최신 1건
	@Override
	public Board selectOne(String userid) {

		return sqlsession.selectOne(path+"selectOneid", userid);
	}

	// 조회수 증가.
	@Override
	public void update_boardcnt(int bnum) {
		sqlsession.selectOne(path+"update_boardcnt",bnum);		
	}

	// 게시 글 작성
	@Override
	public void boardwrite(Board board) {
		sqlsession.insert(path+"boardwrite", board);
	}
	
	//인기 게시물 
	@Override
	public List<Board> poplist() {
		return sqlsession.selectList(path+"poplist");
	}

	
	

}
