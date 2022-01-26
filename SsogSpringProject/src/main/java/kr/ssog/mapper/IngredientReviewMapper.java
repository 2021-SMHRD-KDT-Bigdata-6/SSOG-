package kr.ssog.mapper;

import java.util.List;

import kr.ssog.domain.IngredientReview;

public interface IngredientReviewMapper {
	
	public void IngreRevInsert(IngredientReview IngredientReview);
	
	public List<IngredientReview> IngreRevList(String crawlfoodname);
	
}
