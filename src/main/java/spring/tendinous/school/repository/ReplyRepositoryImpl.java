package spring.tendinous.school.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.tendinous.school.dto.Reply;

@Repository
public class ReplyRepositoryImpl implements ReplyRepository{

	@Autowired
	private SqlSession sqlsession;
	
	String path = "spring.tendinous.school.ReplyMapper.";
	@Override
	public int selectreply(int bnum) {
		// TODO Auto-generated method stub
		return sqlsession.selectOne(path+"selectreply", bnum);
	}
	
	// 게시물에 대한 전체 댓글
	@Override
	public List<Reply> replylist(int bnum) {
		// TODO Auto-generated method stub
		return sqlsession.selectList(path+"replylist", bnum);
	}
	// 게시물 댓글 추가
	@Override
	public void replyadd(Reply reply) {
		sqlsession.insert(path+"replyadd", reply);
		
	}

	
}
