package spring.tendinous.school.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.tendinous.school.dto.Board;
import spring.tendinous.school.dto.Page;
import spring.tendinous.school.dto.User;
import spring.tendinous.school.service.BoardService;
import spring.tendinous.school.service.ReplyService;

@RequestMapping("board")
@Controller
public class BoardController {
	Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardservice;
	@Autowired
	private ReplyService replyservice;
	
	
	
	
	@GetMapping("/")
	public String boardhome(Model model, Page page, HttpSession session) {	
		System.out.println("Board 홈 세션값 가져오기 -" + session.getAttribute("user"));
		List<Board> blist =  boardservice.boardlist(page);
		model.addAttribute("blist", blist);
		model.addAttribute("totcnt", boardservice.selectTotalCnt());

		// 인기 게시물
		List<Board> poplist = boardservice.poplist();
		model.addAttribute("poplist", poplist);
		return "/board/boardhome";
		
	}
	
	// 게시글 상세 내용
	@GetMapping("detail")
	public String boarddetail(@RequestParam int bnum, Model model, HttpSession session) {
		System.out.println("Board 디테일 세션값 가져오기 -" + session.getAttribute("user"));
		// 게시물 조회수 증가.
		boardservice.update_boardcnt(bnum);
		
		// 게시물 조회
		model.addAttribute("board", boardservice.selectOne(bnum));

		
		// 총 댓글 수
		int totreply = replyservice.selectreply(bnum);
		model.addAttribute("totreply", totreply);
		
		return "/board/boarddetail";
		
	}

	// 글 작성 
	@GetMapping("boardwrite")
	public String writeboard(HttpSession session) {
		System.out.println("글작성get");
		System.out.println("Board 글작성get 세션값 가져오기 -" + session.getAttribute("user"));
		return "board/boardwrite";
	}
	
	
	// 글작성
	@PostMapping("boardwrite")
	public String writeboard(HttpSession session,  Board board) {
		
		System.out.println("Board 글작성 post 세션값 가져오기 -" + session.getAttribute("user"));
		
		// 글 작성내용 추가하기
		boardservice.boardwrite(board, session);
		
		// 글번호 알아오기 
		Board reboard = boardservice.selectOne(session.getAttribute("id").toString());
		
		System.out.println("글 번호용" + reboard);
		// 글 작성 완료시 디테일로 보게끔해준다.
		return "redirect:detail?bnum="+reboard.getBnum();
	}
	
	
	
	
}
