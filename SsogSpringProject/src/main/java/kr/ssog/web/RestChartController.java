package kr.ssog.web;
import kr.ssog.domain.Food;
import kr.ssog.domain.FoodAndImage;
import kr.ssog.domain.Ingredient;
import kr.ssog.domain.ingre_price;
import kr.ssog.service.FoodService;
import kr.ssog.service.IngredientService;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestChartController{
	@Autowired
	IngredientService service;
	@Autowired
	FoodService foodservice;
	
	// 카테고리 클릭시 
	@GetMapping("/categori")
	public @ResponseBody ingre_price IngreCateList(HttpServletRequest request){
		String ingre = request.getParameter("ingre");
		System.out.println(ingre);
		List<Ingredient> categori = service.CategoriPriceTop(ingre);
		List<String> list = service.getAllTodayPrice(categori);
		
		ingre_price price = new ingre_price(categori, list);
		
		
		
		return price;
	}
	
	@GetMapping("/testTop200List.do")
	public @ResponseBody List<FoodAndImage> top200List(Model model){	
		List<Food> food200 = foodservice.Top200();
		List<FoodAndImage> top200 = foodservice.getAllImgUrlOb(food200);
		System.out.println("================"+top200);
		return top200;
	}
	
	@GetMapping("/expendTable")
	public @ResponseBody String getImgUrl(){
		String url = service.getImgUrl("ingre_name");
		return url;
	}
	
	
	
}