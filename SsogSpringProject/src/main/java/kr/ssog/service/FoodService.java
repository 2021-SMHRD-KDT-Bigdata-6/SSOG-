package kr.ssog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.domain.FoodRecipe;
import kr.ssog.mapper.FoodIngredientMapper;
import kr.ssog.mapper.FoodMapper;
import kr.ssog.mapper.FoodRecipeMapper;
import kr.ssog.mapper.NutritionMapper;

@Service 
public class FoodService {
	
	@Autowired
	FoodRecipeMapper foodRecipeMapper;
	@Autowired
	FoodMapper foodMapper;
	@Autowired
	FoodIngredientMapper foodIngredientMapper;
	@Autowired
	NutritionMapper nutritionMapper;
	
	
	
	//음식 가격품질 지수 업데이트
	public void updateFdIndex() {
		
	}
	
	//이미지 파일 URL가져오기
	public String getImgUrl(String food_name) {
		String url = foodMapper.getImgUrl(food_name);
		url = url.substring(url.indexOf("webapp")+7);
		return url;
	}
	
	
	//레시피 정보 가져오기
	public List<FoodRecipe> getRecipe(String food_name) {
		List<FoodRecipe> result=foodRecipeMapper.getRecipes(food_name);
		for (int i =0; i <result.size(); i++) {
			FoodRecipe recipe = result.get(i);
			String url = recipe.getRecipeImg();
			url =url.substring(url.indexOf("webapp")+7);
			recipe.setRecipeImg(url);
			result.set(i, recipe);
			}
		return result;
	}
	
	//주재료 출력하기
	public List<String> getMainIngre(String food_name) {
		return foodIngredientMapper.getMainIngre(food_name);
	}
	
	
	//부재로 가져오기
	public List<String> getSubIngre(String food_name) {
		return foodIngredientMapper.getSubIngre(food_name);
	}
	
	//Top200 array 가져오기
	public List<String> Top200() {
		return foodMapper.Top200();
	}
	
	//TOP100 가격
	public List<String> Top100Price() {
		return foodMapper.Top100Price();
	}
	//Top100품질
	public List<String> Top100Quality(){
		return foodMapper.Top100Quality();
	}
	
	//제철식품종류
	public List<String> season(){
		return foodMapper.season();
	}
	
	//음식카테고리 --> 속해있는 음식
	public List<String> getFoodCategori(String categori) {
		return foodMapper.getFoodCategori(categori);
	}
	
	//속해있는 음식 --> 카테고리
	public String showCategori(String food_name) {
		return foodMapper.showCategori(food_name);
	}
	
	
	
	// 해당음식 데이터(영양정보) 가져오기
	public void getFoodNutrition(String food_name) {
		List<String> mainIngredient=foodIngredientMapper.getMainIngre(food_name);
		int length = mainIngredient.size();
		for (int i =0; i<length; i++) {
			nutritionMapper.getInfoNutrition(mainIngredient.get(i));
		}
		nutritionMapper.getInfoNutrition(ingre_name)
	}
	
	
	
	
	

}
