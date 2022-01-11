package kr.ssog.domain;

import lombok.Data;

@Data
public class Price {
	private int priceSeq;			//가격순번
	private String ingreName;		//재료이름
	private int price;				//가격
	private String priceQuantity;	//재료용량
	private String priceQuality;	//재료부가정보
	private String priceDate;		//등록날짜
	private String priceSeller;		//판매자
	private String priceSite;		//사이트
	private String priceImg;		//이미지 저장위치
	private String priceURL;		//출처URL

}
