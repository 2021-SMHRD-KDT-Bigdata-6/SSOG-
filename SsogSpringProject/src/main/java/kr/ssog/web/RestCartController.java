package kr.ssog.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ssog.domain.Cart;
import kr.ssog.service.BoardService;

@RestController
public class RestCartController {
	@Autowired
	BoardService service;
	
	@GetMapping("/cartAjaxList")
	public @ResponseBody List<Cart> cartAjaxList(Model model) {
		List<Cart> cartList = new ArrayList<>();
		
		cartList.add(new Cart(1,"사과",1000,"resources/img/1.jpg"));
		cartList.add(new Cart(2,"배",2000,"resources/img/2.jpg"));
		cartList.add(new Cart(3,"딸기",3000,"resources/img/3.jpg"));
		
		model.addAttribute("cartList", cartList);
		
		return cartList;
	}
	
	@GetMapping("/madalAjax")
	public @ResponseBody List<Cart> madalAjax(){
		List<Cart> modalList = new ArrayList<Cart>();
		
		modalList.add(new Cart(4,"포도",1000,"resources/img/4.jpg"));
		modalList.add(new Cart(5,"메론",2000,"resources/img/5.jpg"));
		modalList.add(new Cart(6,"수박",3000,"resources/img/6.jpg"));
		modalList.add(new Cart(7,"귤",2000,"resources/img/7.jpg"));
		modalList.add(new Cart(8,"오렌지",1000,"resources/img/8.jpg"));
		
		return modalList;
	}
	
	@GetMapping("/pNameAjax")
	public @ResponseBody List<Cart> pNameAjax(){
		List<Cart> cartList = new ArrayList<Cart>();
		
		cartList.add(new Cart(1,"포도",1000,"resources/img/1.jpg"));
		cartList.add(new Cart(2,"배",2000,"resources/img/2.jpg"));
		cartList.add(new Cart(3,"딸기",3000,"resources/img/3.jpg"));
		
		return cartList;
	}
	
	
}
