package kr.ssog.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import kr.ssog.domain.Board;
import kr.ssog.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping("/b_happyCook")
	public String b_happyCook(Model model){
		List<Board> happyList = service.boardList("HappyCook"); 
		model.addAttribute("happyList",happyList);
		return "b_happyCook";
	}
	@RequestMapping("/b_happyContents")
	public String b_happyContents(){
		return "b_happyContents";
	}
	@RequestMapping("/b_poisonCook")
	public String b_poisonCook(){
		return "b_poisonCook";
	}
	@RequestMapping("/b_poisonContents")
	public String b_poisonContents(){
		return "b_poisonContents";
	}
	@RequestMapping("/b_writeBoard")
	public String b_writeBoard(){
		return "b_writeBoard";
	}
	// 게시판 업로드(boardInsert)
	@PostMapping("/boardUpload")
	public String boardUpload(Board board, MultipartFile file) throws Exception{
		String categori = "";
		service.boardInsert(board, file);
		// 카테고리선택
		if(board.getBoardCate().equals("HappyCook")) {
			categori = "b_happyCook";
		}else if(board.getBoardCate().equals("PoisonCook")) {
			categori = "b_poisonCook";
		}
		return categori;
	}
}
