package kr.ssog.domain;

import lombok.Data;

@Data
public class HistoryIndex { //과거 지수 정보 누적 기록
	private int indexSeq;
	private String ingreName;
	private String ingreDate;
	private double ingrePriceInd;
	private double ingreQualityInd;
	private double ingreSeasonInd;
	private double ingreIndex;

}
