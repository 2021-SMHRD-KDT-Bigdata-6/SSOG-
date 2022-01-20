package kr.ssog.domain;

import java.util.List;

import lombok.Data;
@Data
public class FoodAndImage {
	private int fdSeq;    			//음식순번
	private String fdName; 			//음식이름
	private String fdCategori; 		//음식분류
	private double fdPriceInd; 		//음식 가격지수
	private double fdQualityInd; 	//음식 품질지수
	private double fdSeasonInd; 	//음식 제철지수
	private double fdIndex; 		//총지수
	private String fdImg;			//이미지 url위치
	private String fdURL;			//음식 출처
	private String fdFeature1;		//음식 특징1
	private String fdFeature2;		//음식 특징2
	private String mID;				//등록아이디
	private String fdDate;			//등록날짜
	private String imgs;
	public FoodAndImage(Food fdData, String imgs) {
		super();
		this.imgs = imgs;
		this.fdName = fdData.getFdName();
		this.fdCategori = fdData.getFdCategori();
		this.fdPriceInd = fdData.getFdPriceInd();
		this.fdQualityInd = fdData.getFdQualityInd();
		this.fdSeasonInd = fdData.getFdSeasonInd();
		this.fdIndex = fdData.getFdIndex();
		this.fdImg = fdData.getFdImg();
		this.fdURL = fdData.getFdURL();
		this.fdFeature1 = fdData.getFdFeature1();
		this.fdFeature2 = fdData.getFdFeature2();
		this.mID = fdData.getMID();
		this.fdDate = fdData.getFdDate();
		this.imgs = imgs;
	}
	public FoodAndImage() {
		super();

	}
	
}




