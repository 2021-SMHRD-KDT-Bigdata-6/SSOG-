package kr.ssog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ssog.domain.Food;
import kr.ssog.domain.FoodAndImage;
import kr.ssog.service.FoodService;

@RestController
public class RestFoodController {
	@Autowired
	FoodService FoodService;
	
//	@RequestMapping("/itAjaxTest")
//	public String itAjaxTest() {
//		return "itAjaxTest";
//	}
	
	@GetMapping("/top200List.do")
	public @ResponseBody List<FoodAndImage> top200List(Model model){
		
		List<Food> top200 = FoodService.Top200();
		List<FoodAndImage> imgs = FoodService.getAllImgUrlOb(top200);
		
		System.out.println(top200.size());
		System.out.println(imgs.get(1));
		
		return imgs;
		
		
	}
	
	@GetMapping("/topImgList")
	public @ResponseBody List<String> topImgList(){
		List<Food> top200 = FoodService.Top200();
		List<String> imgs = FoodService.getAllImgUrl(top200);
		
		return imgs;
	}
	
}
