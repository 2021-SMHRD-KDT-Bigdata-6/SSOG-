package kr.ssog.domain;

import java.util.List;

import lombok.Data;

@Data
public class ingre_price {
	private List<Ingredient> categori;
	private List<String> list;
	public ingre_price(List<Ingredient> categori, List<String> list) {
		super();
		this.categori = categori;
		this.list = list;
	}
	public ingre_price() {
		super();
	}
	
	
	
	
	
	
}






