package kr.ssog.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.ssog.domain.Board;
import kr.ssog.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	// happyCook 게시판 리스트
	@RequestMapping("/b_happyCook")
	public String happyCook(Model model){
		List<Board> happyList = service.boardList("HappyCook"); 
		model.addAttribute("happyList",happyList);
		System.out.println("게시글 갯수" + happyList.size());
		return "b_happyCook";
	}
	
	// 해피 게시글 내용
	@RequestMapping("/boardContents")
	public String boardContents(@RequestParam("num") int num, Model model){
		Board board = service.boardContent(num);
		model.addAttribute("board", board);
		System.out.println("게시판 번호" + num);
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
	
	
}
