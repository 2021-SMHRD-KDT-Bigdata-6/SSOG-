package kr.ssog.domain;



import lombok.Data;

@Data
public class Purchase {
	private int purchaseSeq;			//판매번호
	private String mID;					//구입한아이디			
	private String purchaseAddress;		//주소
	private String purchaseDate;		//구입날짜
	private String priceSeq;			//식재료 순번(정보 들어있음)
	private int purchaseCount;			//구입 량
	private String purchaseDelivery;	//배달 유무
	private String fdName;				//음식이름
}
