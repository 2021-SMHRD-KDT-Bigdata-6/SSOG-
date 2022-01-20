package kr.ssog.web;
import kr.ssog.domain.Board;
import kr.ssog.domain.Ingredient;
import kr.ssog.service.IngredientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//public class RestChartController{
//	
//	@Autowired
//	IngredientService service;
//	@GetMapping("/priceInfo")
//	public List<Ingredient> IngredientCateList() {
//		List<Ingredient> list = service.boardList();
//		// list > [{ },{ },{ }] (json) > API(Gson api)
//		return list ; // @Responsebody : 객체를 json으로 변환시켜서 응답을 해라(전처리)
//	}
//}