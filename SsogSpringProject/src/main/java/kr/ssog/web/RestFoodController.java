package kr.ssog.web;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	Random ran = new Random();
	
	@GetMapping("/top200List.do")
	public @ResponseBody List<FoodAndImage> top200List(Model model){
		
		List<Food> top200 = FoodService.Top200();
		List<FoodAndImage> imgs = FoodService.getAllImgUrlOb(top200);
		
//		List<FoodAndImage> randomFood;
//		for(int i = 0; i < imgs.size(); i++ ) {
//			int num = ran.nextInt(imgs.size());
//			randomFood.addAll(imgs.get(num));
//		}
		
		return imgs;
	}

	@GetMapping("/defaultList")
	public @ResponseBody List<FoodAndImage> defaultList() {
		// 밥/죽에 해당하는 음식이름 가져오기
		List<Food> categoriFdName = FoodService.getFoodCategori("밥");
//		System.out.println(categoriFdName.size());
//		categoriFdName.addAll(FoodService.getFoodCategori("죽"));
//		System.out.println(categoriFdName.size());
		List<FoodAndImage> categoriFood = FoodService.getAllImgUrlOb(categoriFdName);
		
//		List<FoodAndImage> randomFood;
//		for(int i = 0; i < categoriFood.size(); i++ ) {
//			int num = ran.nextInt(categoriFood.size());
//			randomFood.addAll(categoriFood.get(i));
//		}
		
		return categoriFood;
	}
	@GetMapping("/showCategoriList")
	public @ResponseBody List<FoodAndImage> showCategoriList(String categori) {
		
		List<Food> categoriFdName = FoodService.getFoodCategori(categori);
		List<FoodAndImage> categoriFood = FoodService.getAllImgUrlOb(categoriFdName);
		return categoriFood;
	}
	
	@GetMapping("/showNutri")
	public @ResponseBody List<Double> showNutri(String fdName){
		List<Double> nutriList = FoodService.getNutritionGraph(fdName);
		return nutriList;
	}
	
}
