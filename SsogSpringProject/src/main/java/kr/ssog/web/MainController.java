package kr.ssog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ssog.domain.Food;
import kr.ssog.service.FoodService;

@Controller

public class MainController {
@Autowired
FoodService service;
	@RequestMapping("/mainIt")
	public String it(Model model) {
		List<Food> top200 = service.Top200();
		model.addAttribute("foodList", top200);

	    List<String> imgs = service.getAllImgUrl(top200);
	    model.addAttribute("imgs", imgs);
		return "mainIt";
	}
	
}
