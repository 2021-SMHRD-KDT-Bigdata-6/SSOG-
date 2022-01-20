package kr.ssog.web;
import kr.ssog.service.IngredientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller
//public class ChartController{
//	
//	@Autowired
//	IngredientService service;
// // 차트 리스트
//	@RequestMapping("/priceInfo")
//	public List<String> ingreTop100() {
//		return ingredientMapper.ingreTop100();}	
//}