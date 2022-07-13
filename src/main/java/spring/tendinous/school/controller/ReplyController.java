package spring.tendinous.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.tendinous.school.dto.Reply;
import spring.tendinous.school.service.ReplyService;


@Controller
@RequestMapping("reply")
public class ReplyController {

	@Autowired
	private ReplyService replyservice;
	
	
	// 게시물에 대한 전체  댓글 리스트
	@ResponseBody
	@RequestMapping("replylist")
	public List<Reply> selectlist(@RequestParam int bnum) {
		System.out.println("파라미터값 : "+ bnum);
		List<Reply> replylist =  replyservice.replylist(bnum);
		
	
		System.out.println(replylist);
		return replylist;
	}
	
	// 부모 댓글 등록
	@ResponseBody
	@RequestMapping("replyadd")
	public String replyadd(@RequestBody Reply reply){
		System.out.println("댓글 추가");
		System.out.println("추가내용 "+  reply);
		
		replyservice.replyadd(reply);
		return "댓글 추가 완료";
	}
	
	@ResponseBody
	@DeleteMapping("{rnum}")
	public void del(@RequestBody int bnum) {
		
	}
}
