package kr.ssog.domain;



import lombok.Data;

@Data
public class Purchase {
	private int purchaseSeq;			//판매번호
	private String mID;					//구입한아이디			
	private String purchaseAddress;		//주소
	private String purchaseDate;		//구입날짜
	private String ingreName;			//재료이름
	private int price;					//가격
	private String priceSeller;			//판매처
	private String priceSite;			//사이트
	private String purchaseDelivery;	//배달 유무
	private String fdName;				//음식이름
}
