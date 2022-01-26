package kr.ssog.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.ssog.domain.Cart;
import kr.ssog.service.CartService;
import kr.ssog.service.FoodService;

@Controller
public class CartController {

	@Autowired
	FoodService foodService;
	@Autowired
	CartService cartsv;
	
	@GetMapping("/setCart")
	public String setCart(String fdName, HttpSession session, Model model) {
		List<String> ingre = foodService.getMainIngre(fdName);
		//List<Cart> cart = cartsv.getCartList(fdName);
//		session.setAttribute("cart", cart);
//		for(int i = 0; i < cart.size(); i++) {
//			
//			System.out.println(cart.get(i).getName());
//		}
//		
//		model.addAttribute("cart", cart);
		
		session.setAttribute("ingre", ingre);
		System.out.println(ingre.get(0));
		model.addAttribute("ingre",ingre);
		
		return "cart";
	}
}
