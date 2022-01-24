package kr.ssog.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ssog.domain.Food;
import kr.ssog.domain.FoodRecipe;
import kr.ssog.domain.t_member;
import kr.ssog.service.FoodService;
import kr.ssog.service.UserService;

@Controller
public class FoodController {
	
	@Autowired
	FoodService FoodService;
	UserService userService;
	
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
	public String r_recipe(String fdName, Model model, HttpSession session) {
		// 음식이름
		model.addAttribute("fdName",fdName);
		Object vo1 = session.getAttribute("users");
		if (vo1 != null) {userService.plusLogCount((t_member)vo1, fdName);}
		// 음식 이미지
		String fdImg = FoodService.getImgUrl(fdName);
		model.addAttribute("fdImg",fdImg);
		
		// 주재료
		List<String> mainIngre = FoodService.getMainIngre(fdName);
//		String mainIngre = "";
//		for(int i = 0; i < main.size(); i++) {
//			mainIngre += main.get(i) + " ";
//		}
		model.addAttribute("mainIngre",mainIngre);
		
		// System.out.println(main.toString());
		
		// 부재료
		List<String> subIngre = FoodService.getSubIngre(fdName);
//		String subIngre = "";
//		for(int i = 0; i < sub.size(); i++) {
//			subIngre += sub.get(i) + " ";
//		}
		model.addAttribute("subIngre",subIngre);
		
		// 레시피, 이미지
		List<FoodRecipe> recipe = FoodService.getRecipe(fdName);
		model.addAttribute("recipe",recipe);
		
		String recipeEtc = recipe.get(0).getRecipeETC();
		model.addAttribute("recipeEtc", recipeEtc);
		
		return "r_recipe";
	}
	
	@RequestMapping("/itAjaxTest")
	public String itAjaxTest() {
		return "itAjaxTest";
	}
	
}
