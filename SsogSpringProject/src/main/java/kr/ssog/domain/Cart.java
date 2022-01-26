package kr.ssog.domain;

import lombok.Data;

@Data
public class Cart {
	
	private int seq;
	private String name;
	private int price;
	private String img;
	
	public Cart(int seq, String name, int price, String img) {
		super();
		this.seq = seq;
		this.name = name;
		this.price = price;
		this.img = img;
	}

	public Cart(String name) {
		this.name = name;
	}

	
	
}
