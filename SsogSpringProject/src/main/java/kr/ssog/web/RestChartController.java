package kr.ssog.web;
import kr.ssog.domain.Ingredient;
import kr.ssog.service.IngredientService;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestChartController{
	@Autowired
	IngredientService service;
	
	// 카테고리 클릭시 
	@GetMapping("/priceInfoAjaxTEST")
	public @ResponseBody List<String> IngreCateList(HttpServletRequest request){
		String ingre = request.getParameter("ingre");
		System.out.println(ingre);
		List<Ingredient> categori = service.CategoriPriceTop(ingre);
		List<String> list = service.getAllTodayPrice(categori);
		return list;
	}
	
	// 개별 검색
	
}