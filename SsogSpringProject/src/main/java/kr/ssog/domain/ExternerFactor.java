package kr.ssog.domain;
import lombok.Data;

@Data
public class ExternerFactor {
	private int exterSeq;			//외부요인순번
	private String exterDate;		//날ㄹ짜
	private String exterHour;		//시간
	private String exterDay;		//요일
	private String exterLocation;	//지역
	private String exterCity;		//도시이름
	private double exterTemperature;//기온
	private int exterWind;			//풍향
	private double exterWindSpeed;	//풍속
	private int exterSky;			//하늘상태(흐림정도)
	private int exterRain;			//강수형태
	private double exterRainHour;	//시간당강수량
	private int exterHumidity;		//습도
	private String fdCategori;		//먹는음식분류(정답)
}
