package kr.ssog.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ssog.domain.t_member;
import kr.ssog.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public String main() { 
		return "index";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	@RequestMapping("/cart")
	public String cart() {
		return "cart";
	}
	@RequestMapping("/checkout")
	public String checkout() {
		return "checkout";
	}
	@RequestMapping("/priceInfo")
	public String priceInfo() {
		return "priceInfo";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/joinGo")
	public String joinGo() {
		return "join";
	}
	@RequestMapping("/r_it")
	public String r_it() {
		return "r_it";
	}
	@RequestMapping("/r_recipe")
	public String r_recipe() {
		return "r_recipe";
	}
	@RequestMapping("/r_theme")
	public String r_theme() {
		return "r_theme";
	}
	
	@PostMapping("/login.do")
	public String login(t_member vo, HttpSession session) { // userId, userPwd
		t_member users = service.login(vo);
		if(users != null) { // 인증성공
			// 객체바인딩(세션바인딩)
			session.setAttribute("users", users);
		}
		return "redirect:/";
	}
	@GetMapping("/logout.do")
	public String logout(HttpSession session)	{ // HttpSession sessioin=request.getSession() 
		session.invalidate(); // 세션무효화
		return "redirect:/";
	}
	@PostMapping("/join")
	public String join(t_member vo) {
		return "redirect:/";
	}
	@PostMapping("/memberUpdate.do")
	public String memberUpdate(t_member vo) {
		service.memberUpdate(vo);
		return "redirect:memberUpdate.do";
	}
}
