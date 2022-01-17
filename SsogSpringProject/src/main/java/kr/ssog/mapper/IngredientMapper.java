package kr.ssog.mapper;

import java.util.List;



public interface IngredientMapper {
	public List<String> ingreTopPrice100();
	
	public List<String> ingreTopQuality100();
	
	public List<String> ingreSeason();
	
	public List<String> ingreTop100();
	
	public List<String> CategoriPriceTop(String categori);
	
	public List<String> CategoriQualityTop(String categori);
	
	public List<String> CategoriSeason(String categori);
}


