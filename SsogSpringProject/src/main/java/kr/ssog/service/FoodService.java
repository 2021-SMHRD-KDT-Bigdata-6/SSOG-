package kr.ssog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.domain.Food;
import kr.ssog.domain.FoodAndImage;
import kr.ssog.domain.FoodIngredient;
import kr.ssog.domain.FoodRecipe;
import kr.ssog.domain.Nutrition;
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
		url = "resources/"+url;
		return url;
	}
	
	//이미지 파일 URL뭉치 가져오기
	public List<String> getAllImgUrl(List<Food> foodNames){
		int count = 30;
		if (foodNames.size() < count) {
			count = foodNames.size();
		}
		
		List<String> imgs = new ArrayList<String>();
		for (int i =0; i<count; i++) {
			imgs.add(getImgUrl(foodNames.get(i).getFdName()));
		}
		
		
		return imgs;
	}
	
	
	
	//이미지 파일 URL뭉치 가져오기
	public List<FoodAndImage> getAllImgUrlOb(List<Food> foodNames){
		int count = 30;
		if (foodNames.size() < count) {
			count = foodNames.size();
		}
		
		List<FoodAndImage> imgs = new ArrayList<FoodAndImage>();
		for (int i =0; i<count; i++) {
			Food data =foodNames.get(i);
			imgs.add(new FoodAndImage(data,getImgUrl(data.getFdName())));
			//foodNames.get(i).setFdImg(fdImg);
		}
		
		
		return imgs;
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
	public List<Food> Top200() {
		return foodMapper.Top200();
	}
	
	//TOP100 가격
	public List<Food> Top100Price() {
		return foodMapper.Top100Price();
	}
	//Top100품질
	public List<Food> Top100Quality(){
		return foodMapper.Top100Quality();
	}
	
	//제철식품종류
	public List<Food> season(){
		return foodMapper.season();
	}
	
	//음식카테고리 --> 속해있는 음식
	public List<Food> getFoodCategori(String categori) {
		return foodMapper.getFoodCategori(categori);
	}
	
	//속해있는 음식 --> 카테고리
	public String showCategori(String food_name) {
		return foodMapper.showCategori(food_name);
	}
	
	
	
	// 해당음식 데이터(영양정보) 가져오기
	public List<Double> getFoodNutrition(String food_name) {
		List<FoodIngredient> mainIngredients=foodIngredientMapper.getMainIngreInfo(food_name);
		int length = mainIngredients.size();
		// 재료나열
		// 영양나열
		
		
		// 결과 도출할 공간 만들기
		List <Nutrition> nutritions = nutritionMapper.getInfoNutrition("쑥갓");
		List<String> nutritionNames = new ArrayList<String>();
		List<Double> totalNutritionQuan = new ArrayList<Double>();
		for (int j = 0; j < nutritions.size(); j++) {
			Nutrition nutrition =nutritions.get(j);
			nutritionNames.add(nutrition.getNutritionName());
			totalNutritionQuan.add(0.0);
		}
		System.out.println(nutritionNames);
	
		for (int i =0; i<length; i++) {
			FoodIngredient ingredient = mainIngredients.get(i);
			nutritions = nutritionMapper.getInfoNutrition(ingredient.getIngreName());
	
			//탄수화물(g). 지질(g). 단백질(g). 당류(g). 지방(g)
			//비타민D,비타민E,비타민K,비타민B12 (나노그램)
			//비타민B2,비타민B5,비타민B6,비타민C,비타민1
			//칼륨, 식이섬유,아연,마그네슘,철,나트륨,칼슘,인,에너지
			
			String quantity =ingredient.getIngreQuantity();
			
			// g , ml 전처리하기
			int index = quantity.indexOf('g');
			if(index !=-1) {
				int j = 0;
				while(true) {
					if(47<(byte)quantity.charAt(index-j) && (byte)quantity.charAt(index-j)<58) j++;
					else break;
				}
				
				quantity= quantity.substring(index-j, index);
				
			}else {
				index = quantity.indexOf("ml");
				if(index != -1) {
					int j = 0;
					while(true) {
						if(47<(byte)quantity.charAt(index-j) && (byte)quantity.charAt(index-j)<58) j++;
						else break;
					}
					quantity= quantity.substring(index-j, index);
					
				}else {
					quantity= "0";
				}	
			}
			double preproQuantity =Double.parseDouble(quantity);
			
			

			
			
			
			//재료 -->다양한 영양정보 --> 추출하기
			for (int j = 0; j < nutritions.size(); j++) {
				Nutrition nutrition =nutritions.get(j);
				totalNutritionQuan.set(j, totalNutritionQuan.get(j) + nutrition.getNutritionQuantity()*(preproQuantity/nutrition.getNutritionStandard()));			
			}///--> 이름이랑 영양정보 담기!
			
			
			System.out.println(nutritionNames);
			System.err.println(totalNutritionQuan);
			
		}
		return totalNutritionQuan;
	}
	
	
	// 영양정보 그래프 처럼가져오기!
	public void getNutritionGraph(){
		
		
		//탄수화물(g). 지질(g). 단백질(g). 당류(g). 지방(g)
		//비타민D,비타민E,비타민K,비타민B12 (나노그램)
		//비타민B2,비타민B5,비타민B6,비타민C,비타민1
		//칼륨, 식이섬유,아연,마그네슘,철,나트륨,칼슘,인,에너지
		
	}
	
	
	

	

}
