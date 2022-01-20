package kr.ssog.mapper;

import java.util.List;

import kr.ssog.domain.Ingredient;



public interface IngredientMapper {
	public List<String> ingreTopPrice100();
	
	public List<String> ingreTopQuality100();
	
	public List<String> ingreSeason();
	
	public List<String> ingreTop100();
	
	public List<Ingredient> CategoriPriceTop(String categori);
	
	public List<Ingredient> CategoriQualityTop(String categori);
	
	public List<Ingredient> CategoriSeason(String categori);
}


