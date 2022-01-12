package kr.ssog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.ssog.domain.Price;
import kr.ssog.mapper.IngredientMapper;
import kr.ssog.mapper.PriceMapper;

public class IngredientService {
	@Autowired
	PriceMapper priceMapper;
	IngredientMapper ingredientMapper;
	
	
	//식재료 이미지 가녀오기 : 판매처에서 랜덤으로 가져오기
	public String getImgUrl(String ingre_name) {
		return priceMapper.getImgUrl(ingre_name);
	}
	// 식재료 top100 위 출력
	public List<String> ingreTop100(){
		return ingredientMapper.ingreTop100();
	}
	
	//가격지수 Top 100위 식재료 정보추출
	public List<String> ingreTopPrice100(){
		return ingredientMapper.ingreTopPrice100();
	}
	//품질지수 Top 100위 식재료 정보추출
	public List<String> ingreTopQuality100(){
		return ingredientMapper.ingreTopQuality100();
	}
	//제철식재료 정보추출
	public List<String> ingreSeason(){
		return ingredientMapper.ingreSeason();
	}
	
	//판매처 상위 10개 가격정보
	public List<Price> sellerPriceTop10(String ingre_name){
		return priceMapper.sellerPriceTop10(ingre_name);
	}
	
	//판매처 상위 7개  미등록 3 개 품질정보
	public List<Price> sellerQualityTop10(String ingre_name){
		List<Price> temp = priceMapper.sellerQualityNullRandom5(ingre_name).subList(1, 4);
		List<Price> result = priceMapper.sellerQualityTop10(ingre_name).subList(1, 8);
		result.addAll(5,temp);
		return result;
	}
	
	//판매처 상위 가격 및 품질정보
	
	//가격 변화 가져오기

	//현재가격 가져오기
	
	
	// 해당음식 데이터(영양정보) 가져오기
	
	// 해당음식 db저장하기
	
	
	
	//재료 업데이트 --> 서버로 뺴야겠네
	public void insertAll() {}
	
}
