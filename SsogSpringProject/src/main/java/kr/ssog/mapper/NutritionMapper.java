package kr.ssog.mapper;

import java.util.List;

import kr.ssog.domain.Nutrition;

public interface NutritionMapper {
	public List<Nutrition> getInfoNutrition(String ingre_name);

}
