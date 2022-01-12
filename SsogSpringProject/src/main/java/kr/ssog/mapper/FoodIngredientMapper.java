package kr.ssog.mapper;

import java.util.List;

public interface FoodIngredientMapper {
	public List<String> getMainIngre(String food_name);
	
	public List<String> getSubIngre(String food_name);

}
