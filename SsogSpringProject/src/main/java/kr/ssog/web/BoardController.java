package kr.ssog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ssog.domain.Board;
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
	
}
