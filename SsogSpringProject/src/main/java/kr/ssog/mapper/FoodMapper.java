package kr.ssog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface FoodMapper {
	
	
	public String getImgUrl(String food_name);
	
	public void createViewTop200(); 
	
	public void deleteViewTop200();
	
	public List<String> Top200();
	
	public List<String> Top100Price();
	
	public List<String> Top100Quality();
	
	public List<String> season();
	
	@Select("select fdName from food where fdCategori = #{categori}")
	public List<String> getFoodCategori(String categori);
	
	@Select("select fdCategori from food where fdName = #{food_name}")
	public String showCategori(String food_name);

}
