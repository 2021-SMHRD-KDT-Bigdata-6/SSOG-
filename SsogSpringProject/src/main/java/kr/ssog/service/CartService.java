package kr.ssog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.domain.Cart;
import kr.ssog.mapper.FoodIngredientMapper;

@Service
public class CartService {
	
	@Autowired
	FoodIngredientMapper foodIngredientMapper;
	
	public List<String> getMainIngre(String food_name) {
		return foodIngredientMapper.getMainIngre(food_name);
	}
	
	public List<Cart> getCartList(String fdName){
		List<Cart> cartList = new ArrayList<>();
		List<String> mainIngre = foodIngredientMapper.getMainIngre(fdName);
		for(int i = 0; i < mainIngre.size(); i++) {
			
			cartList.add(new Cart(mainIngre.get(i)));
		}
		
		return cartList; 
	}
	
}
