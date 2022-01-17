package kr.ssog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RecommandController {
	
	
	//실시간 업데이트
	
	@Autowired
	
	
	@GetMapping("/extraFactor")
	public String extraFactor() {
		//사용자 정보 보내주기 ->python -> 다시 ajax에서 받아오는구조
		// openstream? cross? 
		//받아오기
	
		//crawlingUpdate.createViewTop200();
		return "ㄱ";//결과값
	}
	
	
	//GetMapping("/logHistroy")
	
	
	//GetMapping("/purchaseHistroy")
	
	
	//GetMapping("/contents")

}
