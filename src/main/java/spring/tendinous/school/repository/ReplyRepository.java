package spring.tendinous.school.repository;

import java.util.List;

import spring.tendinous.school.dto.Reply;

public interface ReplyRepository {

	int selectreply(int bnum);

	// 게시물 댓글
	List<Reply> replylist(int bnum);

	// 댓글 추가
	void replyadd(Reply reply);

}
