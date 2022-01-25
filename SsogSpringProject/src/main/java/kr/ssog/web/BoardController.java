package kr.ssog.web;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import kr.ssog.domain.Board;
import kr.ssog.service.BoardService;
import kr.ssog.service.CmtService;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	@Autowired
	CmtService cmtService;
	
	// happyCook 게시판 리스트
	@RequestMapping("/b_happyCook")
	public String happyCook(Model model){
		List<Board> happyList = service.boardList("HappyCook"); 
		model.addAttribute("happyList",happyList);
		System.out.println("게시글 갯수" + happyList.size());
		return "b_happyCook";
	}
	
	// 게시글 내용
	@RequestMapping("/boardContents")
	public String boardContents(@RequestParam("num") int num, Model model, HttpSession session,HttpServletRequest req) throws Exception{
		Board board = service.boardContent(num);
		model.addAttribute("board", board);
		
		// 댓글 수
		int cmtCount = cmtService.cmtCount(num);
		model.addAttribute("cmtCount", cmtCount);
		
		// 현재 창 URL가져오기(http://localhost:8081/web/boardContents)
		StringBuffer url = req.getRequestURL();
		//String url = req.getHeader("Referer"); --> 이전창 주소 가져오는 코드("Referer")
		String referer2 = url + "?num=" + num;
		
		System.out.println(referer2);
		//req.getSession().setAttribute("referer", referer2);
		session.setAttribute("referer",referer2);
		
		return "boardContents";
	}
	
	// poisonCook 게시판 리스트
	@RequestMapping("/b_poisonCook")
	public String poisonCook(Model model){
		List<Board> poisonList = service.boardList("PoisonCook");
		model.addAttribute("poisonList", poisonList);
		System.out.println("게시글 갯수" + poisonList.size());
		return "b_poisonCook";
	}
	
	// 포이즌 게시글 내용
	@RequestMapping("/b_poisonContents")
	public String b_poisonContents(){
		return "b_poisonContents";
	}
	
	// 게시글 작성 페이지 
	@RequestMapping("/b_writeBoard")
	public String b_writeBoard(){
		return "b_writeBoard";
	}
	
	// 게시글 및 첨부파일 업로드(boardInsert)
	@PostMapping("/boardUpload")
	public String boardUpload(Board board, MultipartFile file) throws Exception{
		String categori = "";
		service.boardInsert(board, file);
		// 카테고리선택
		if(board.getBoardCate().equals("HappyCook")) {
			categori = "redirect:b_happyCook";
		}else if(board.getBoardCate().equals("PoisonCook")) {
			categori = "redirect:b_poisonCook";
		}
		return categori;
	}
	
	// 무한 스크롤링
	@RequestMapping("/load_happyCook")
	@ResponseBody
	public List<Board> getLogs(Model model, @RequestParam("num") int num) {
		//int count = 6;
		//String num = "34";
		System.out.println("test"+num);
		//model.addAttribute("count", count);
		//model.addAttribute("num",num);
		List<Board> result = service.infiniteScrollingH(num);
		return result; 
	}
	
	/*public ResponseEntity getLogs() {
		List<Board> logs = logs.

		return ResponseEntity.ok()
	        	.body(logs);
	}*/
	
}
