package kr.ssog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ssog.domain.Food;
import kr.ssog.domain.FoodRecipe;
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
	
	@RequestMapping("/r_recipe")
	public String r_recipe(String fdName, Model model) {
		model.addAttribute("fdName",fdName);
		
		String fdImg = FoodService.getImgUrl(fdName);
		model.addAttribute("fdImg",fdImg);
		
		List<String> main = FoodService.getMainIngre(fdName);
		String mainIngre = "";
		for(int i = 0; i < main.size(); i++) {
			mainIngre += main.get(i) + " ";
		}
		model.addAttribute("mainIngre",mainIngre);
		
		System.out.println(main.toString());
		
		List<String> sub = FoodService.getSubIngre(fdName);
		String subIngre = "";
		for(int i = 0; i < sub.size(); i++) {
			subIngre += sub.get(i) + " ";
		}
		model.addAttribute("subIngre",subIngre);
		
		List<FoodRecipe> recipe = FoodService.getRecipe(fdName);
		model.addAttribute("recipe",recipe);
		
		return "r_recipe";
	}
	
	@RequestMapping("/itAjaxTest")
	public String itAjaxTest() {
		return "itAjaxTest";
	}
	
}
