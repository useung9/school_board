package spring.tendinous.school.service;

import java.util.List;

import spring.tendinous.school.dto.Reply;

public interface ReplyService {

	int selectreply(int bnum);
	
	List<Reply> replylist(int bnum);

	void replyadd(Reply reply);
}
