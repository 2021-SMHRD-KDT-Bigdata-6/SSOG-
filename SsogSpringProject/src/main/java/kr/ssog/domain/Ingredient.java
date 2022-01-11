package kr.ssog.domain;

import lombok.Data;

@Data
public class Ingredient {
	private int ingreSeq;				//재료순번
	private String ingreName;			//재료이름
	private double ingrePriceInd;		//가격지수
	private double ingreQualityInd;		//품질지수
	private double ingreSeasonInd;		//제철지수
	private double ingreIndex;			//총지수
	private String ingreImg;			//이미지위치
	private String mID;					//등록아이디
	private String ingreDate;			//등록날짜
	private String ingreCategori;		//재료 분류
	private String ingreFeature1;		//재료 특징
	private String ingreFeature2;		//재료 특징
	

}
