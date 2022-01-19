package kr.ssog.domain;


import lombok.Data;
@Data
public class IngredientReview {
	private int reviewSeq;			//리뷰순번
	private int purchaseSeq;		//구매순번
	private String reviewContent;	//리뷰내용
	private String reviewDate;		//리뷰날짜
	private String reviewAnswer1;	//설문조사 맛
	private String reviewAnswer2;	//설문조사 신선도
	private int reviewScore;		//리뷰점수
	private String reviewTitle; 	//리뷰제목

}
