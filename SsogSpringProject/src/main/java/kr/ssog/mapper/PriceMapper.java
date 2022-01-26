package kr.ssog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import kr.ssog.domain.Price;

public interface PriceMapper {
	
	@Select("select priceImg from Price where ingreName = #{ingre_name} sample(10)")
	public String getImgUrl(String ingre_name);
	
	public List<Price> sellerPriceTop10(String ingre_name);
	
	public List<Price> sellerQualityTop10(String ingre_name);
	
	public List<Price> sellerQualityNullRandom5(String ingre_name);
	
	public List<Price> getPrice(@Param("ingre_name")String ingre_name, @Param("date")String date);
	
	public List<Integer> getInteger(@Param("ingre_name")String ingre_name, @Param("date")String date);
	
	public List<String> getPriceDate(@Param("ingre_name")String ingre_name);
	


	

	

}
