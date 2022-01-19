package kr.ssog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import kr.ssog.service.BoardService;

@RestController
public class RestCartController {
	@Autowired
	BoardService service;
	
	
}
