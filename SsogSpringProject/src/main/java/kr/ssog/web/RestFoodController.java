package kr.ssog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ssog.domain.Food;
import kr.ssog.service.FoodService;

@RestController
public class RestFoodController {
	@Autowired
	FoodService service;
	
//	@RequestMapping("/itAjaxTest")
//	public String itAjaxTest() {
//		return "itAjaxTest";
//	}
	
	@GetMapping("/top200List.do")
	public @ResponseBody List<Food> top200List(){
		List<Food> top200 = service.Top200();
		
		System.out.println(top200.size());
		
		return top200;
		
	}
}