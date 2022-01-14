package kr.ssog.domain;

import java.util.List;

import lombok.Data;

@Data
public class PriceUnit {
	private String priceDate;
	private List<Integer> price;
	
	
	public PriceUnit(String priceDate, List<Integer> price) {
		super();
		this.priceDate = priceDate;
		this.price = price;
	}
	



	public PriceUnit() {
		super();
	}
	
	
}
