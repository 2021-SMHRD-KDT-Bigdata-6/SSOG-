package kr.ssog.domain;

import lombok.Data;

@Data
public class FoodIngredient {
	private int fdIngreSeq;			//음식재료순번
	private String fdName;			//음식이름
	private String ingreName;		//재료이름
	private String ingreQuantity;	//재료양
	private String mainSub;			//주재료/부재료

	
}
