package kr.ssog.domain;

import lombok.Data;

@Data

public class Cmt {
	private int cno;
    private int bno;
    private String contents;
    private String writer;
    private String comment_time;
}
