package kr.ssog.domain;

import lombok.Data;

@Data
public class FoodRecipe {
	private int recipeSeq;			//페시피번호
	private String fdName;			//음식이름
	private int recipeOrder;		//레시피순서
	private String recipeContent;	//레시피설명
	private String recipeImg;		//레시피이미지 위치
	private String recipeETC;		//레시피 부연설명
	

}
