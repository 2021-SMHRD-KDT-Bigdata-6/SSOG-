package kr.ssog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.domain.IngredientReview;
import kr.ssog.mapper.IngredientReviewMapper;

@Service
public class IngreReviewService {

	@Autowired
	IngredientReviewMapper ingreRevMapper;
	
	public void IngreRevInsert(IngredientReview IngredientReview) {
		ingreRevMapper.IngreRevInsert(IngredientReview);
	}
	
	public List<IngredientReview> IngreRevList(String crawlfoodname){
		
		return ingreRevMapper.IngreRevList(crawlfoodname);
	}
	
}
