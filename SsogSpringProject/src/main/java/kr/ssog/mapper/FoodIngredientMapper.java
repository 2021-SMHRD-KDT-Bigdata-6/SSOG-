package kr.ssog.mapper;

import java.util.List;

import kr.ssog.domain.FoodIngredient;

public interface FoodIngredientMapper {
	public List<String> getMainIngre(String food_name);
	
	public List<String> getSubIngre(String food_name);

	public List<FoodIngredient> getMainIngreInfo(String food_name);
}


