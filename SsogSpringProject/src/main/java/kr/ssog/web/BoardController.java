package kr.ssog.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.multipart.MultipartFile;

import kr.ssog.domain.test;
=======
>>>>>>> branch 'master' of https://github.com/2021-SMHRD-KDT-Bigdata-6/SSOG-.git
import kr.ssog.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping("/b_happyCook")
	public String b_happyCook(){
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
<<<<<<< HEAD
	// 게시판 업로드(boardInsert)
	@PostMapping("/boardUpload")
	public String boardUpload(test board, MultipartFile file) throws Exception{
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
=======
	
	
>>>>>>> branch 'master' of https://github.com/2021-SMHRD-KDT-Bigdata-6/SSOG-.git
}
