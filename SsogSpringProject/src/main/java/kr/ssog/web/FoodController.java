package kr.ssog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ssog.domain.Food;
import kr.ssog.service.FoodService;

@Controller
public class FoodController {
	
	@Autowired
	FoodService FoodService;
	
	@RequestMapping("/r_it")
	public String it(Model model) {
		List<Food> top200 = FoodService.Top200();
		model.addAttribute("foodList", top200);
	    //30개이미지
	    List<String> imgs = FoodService.getAllImgUrl(top200);
	    model.addAttribute("imgs", imgs);
		return "r_it";
	}
	
	@RequestMapping("/itAjaxTest")
	public String itAjaxTest() {
		return "itAjaxTest";
	}
	
}
