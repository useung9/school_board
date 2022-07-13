package spring.tendinous.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.tendinous.school.dto.Reply;
import spring.tendinous.school.repository.ReplyRepository;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyRepository replyrepo;

	// 게시판 총 댓글수
	@Override
	public int selectreply(int bnum) {

		return replyrepo.selectreply(bnum);
	}

	// 게시판 번호 총 댓글
	@Override
	public List<Reply> replylist(int bnum) {

		return replyrepo.replylist(bnum);
	}

	
	// 댓글 추가
	@Override
	public void replyadd(Reply reply) {
		replyrepo.replyadd(reply);
		
	}

	
}
