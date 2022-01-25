package kr.ssog.service;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.domain.HistoryIndex;
import kr.ssog.domain.Ingredient;
import kr.ssog.domain.Nutrition;
import kr.ssog.domain.Price;
import kr.ssog.domain.PriceUnit;
import kr.ssog.mapper.HistoryIndexMapper;
import kr.ssog.mapper.IngredientMapper;
import kr.ssog.mapper.NutritionMapper;
import kr.ssog.mapper.PriceMapper;

@Service
public class IngredientService {
	@Autowired
	PriceMapper priceMapper;
	@Autowired
	IngredientMapper ingredientMapper;
	@Autowired
	HistoryIndexMapper historyIndexMapper;
	@Autowired
	NutritionMapper nutritionMapper;
	
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
	
	
	////// 카테고리별로
	//식재료 별 순위출력- 가격
	public List<Ingredient> CategoriPriceTop(String categori){
		return ingredientMapper.CategoriPriceTop(categori);
		
	}
	
	//식재료별 순위 출력 - 품질
	public List<Ingredient> CategoriQualityTop(String categori){
		return ingredientMapper.CategoriQualityTop(categori);
	}
	
	//식재료별 순위 출력 - 종합
	public List<Ingredient> CategoriSeason(String categori){
		return ingredientMapper.CategoriSeason(categori);
		
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
	
	
	
	//모든 지수 가져오기
//	public List<HistoryIndex> getIndHistory(String ingre_Name){
//		return historyIndexMapper.getIndHistory(ingre_Name); 
//	}
//	
	//금일 가격 분포 가져오기
	public List<Price> getTodayPrice(String ingre_Name) {
		Date date = new Date();
		SimpleDateFormat formatChanger = new SimpleDateFormat("yy/MM/dd");
		String day = formatChanger.format(date);
		
		return priceMapper.getPrice(ingre_Name, day);
	}
	
	public List<String> getAllTodayPrice(List<Ingredient> categori){
		List<String> priceRange = new ArrayList<String>();
		for (int i  = 0;  i<categori.size(); i++) {
			List<Price> pricess =getTodayPrice(categori.get(i).getIngreName());
			double min = 0;
			double max = 0;
			for (int j =0; j<pricess.size(); j++) {
				double quan =Integer.parseInt(pricess.get(j).getPriceQuantity())/(double)100;
				double price_100 = pricess.get(j).getPrice()/quan;
				if (min > price_100) {min = price_100;}
				if (max < price_100) {max = price_100;}
			}
			
			String price = min + " ~ " +max;
			priceRange.add(price);
		}
		
		return priceRange;
	}
	

	//모든 시간대 가격 분포 가져오기 ex) 20210113 1000~2000	
	
	public void getHistoryPrice(String ingre_Name){
		List<PriceUnit> result = new ArrayList<PriceUnit>();
		List<String> dates = priceMapper.getPriceDate(ingre_Name);
		int length = dates.size();
		for (int i =0; i<length; i++) {
			//String date = dates.get(i);
			//List<Integer> prices =  priceMapper.getPrice(ingre_Name, date);
			//result.add(new PriceUnit(date, prices));
		}
		

		
	}
	
	

	
	// 해당 재료 영양정보 출력하기
	public List<Double> getIngreNutrition(String ingre_name){
		List<Nutrition>nutritions = nutritionMapper.getInfoNutrition(ingre_name);
		List<String> nutritionNames = new ArrayList<String>();
		List<Double> totalNutritionQuan = new ArrayList<Double>();
		int scale =100; // 100g을 기준으로 정보 출력!
		for (int j = 0; j < nutritions.size(); j++) {
			Nutrition nutrition =nutritions.get(j);
			nutritionNames.add(nutrition.getNutritionName());
			totalNutritionQuan.add( nutrition.getNutritionQuantity()*(100/nutrition.getNutritionStandard()) );
		}
		System.out.println(nutritionNames);
		System.err.println(totalNutritionQuan);
		return totalNutritionQuan;
	}

	
}
