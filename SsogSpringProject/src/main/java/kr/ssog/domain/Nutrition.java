package kr.ssog.domain;


import lombok.Data;

@Data
public class Nutrition {
	private int nutritionSeq;			//영양번호
	private String nutritionName;		//영양이름
	private String ingreName;			//재료이름
	private double nutritionQuantity;	//영양소양
	private double nutritionStandard;	//재료표준양

}
