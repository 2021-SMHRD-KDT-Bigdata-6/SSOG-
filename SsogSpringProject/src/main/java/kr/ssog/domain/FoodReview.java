package kr.ssog.domain;


import lombok.Data;
@Data
public class FoodReview {
	private int fdReviewSeq;			//음식리뷰순번
	private String fdName;				//음식이름
	private int fdReviewScore;			//음식리뷰점수
	private String fdReviewContent;		//음식리뷰
	private String fdReviewDate;		//리뷰날짜

}
