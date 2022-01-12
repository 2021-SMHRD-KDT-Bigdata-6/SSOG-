package kr.ssog.mapper;


import java.util.List;

import kr.ssog.domain.FoodRecipe;

public interface FoodRecipeMapper {
	
	//레시피 가져오기
	public List<FoodRecipe> getRecipes(String food_name);
	

}
