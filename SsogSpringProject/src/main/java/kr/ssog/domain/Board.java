package kr.ssog.domain;

import lombok.Data;

@Data
public class Board {
	
	private int num;
	private String boardCate;
	private String title;
	private String writer;
	private String fileName;
	private String content;
	private String w_day;
	private int count;
	
	
}
