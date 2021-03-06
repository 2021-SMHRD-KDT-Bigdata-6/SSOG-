package kr.ssog.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.ssog.domain.Board;
import kr.ssog.domain.Food;
import kr.ssog.domain.t_member;
import kr.ssog.service.BoardService;
import kr.ssog.service.FoodService;
import kr.ssog.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService UserService;
	@Autowired
	BoardService BoardService; 
	@Autowired
	FoodService FoodService;
	
	@RequestMapping("/")
	public String root() {
		return "redirect:index";
	}
	@RequestMapping("/index")
	public String index(Model model) {
		List<Board> happyList = BoardService.boardList("HappyCook"); 
		model.addAttribute("happyList",happyList);
		System.out.println("게시글 갯수" + happyList.size());
		
		List<Board> poisonList = BoardService.boardList("PoisonCook");
		model.addAttribute("poisonList", poisonList);
		System.out.println("포이즌게시글 갯수" + poisonList.size());
		
			List<Food> top200 = FoodService.Top200();
			model.addAttribute("foodList", top200);
			
		    List<String> imgs = FoodService.getAllImgUrl(top200);
		    model.addAttribute("imgs", imgs);
	
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
		System.out.println("회원가입");
		return "join";
	}
//	@RequestMapping("/r_it")
//	public String r_it() {
//		return "r_it";
//	}

	@RequestMapping("/r_theme")
	public String r_theme() {
		return "r_theme";
	}
	
	@PostMapping("/login.do")
	public String login(t_member vo, HttpSession session, HttpServletRequest req, RedirectAttributes rdttr) { // userId, userPwd
		t_member users = UserService.login(vo);
		if(users != null) { // 인증성공
			// 객체바인딩(세션바인딩)
			session.setAttribute("users", users);
			System.out.println("로그인 성공");
		}else{
			System.out.println("로그인 실패");
			// 로그인 실패시 login.html에서 판별
			rdttr.addFlashAttribute("msg", false);
			return "redirect:login";
		}
		
		// 로그인 성공 시 이전 창으로 redirect(boardContents만 적용됨)
		Object referer = session.getAttribute("referer");
		//System.out.println("로그인 입니다." + referer);
		if(referer != null) {
			return "redirect:" + referer;
		}else {
			return "redirect:/";
		}
	}
	@GetMapping("/logout.do")
	public String logout(HttpSession session)	{ // HttpSession sessioin=request.getSession() 
		session.invalidate(); // 세션무효화
		return "redirect:/";
	}
	@PostMapping("/join")
	public String join(t_member vo) {
		UserService.join(vo);
		System.out.println("회원가입완료");
		UserService.createLogTable(vo);
		return "redirect:/";
	}
	// 아이디중복체크
	@ResponseBody
	@PostMapping("/idCheck")
	public int idCheck(t_member vo){
		int result = UserService.idCheck(vo);
		return result;
	}
	@PostMapping("/memberUpdate.do")
	public String memberUpdate(t_member vo) {
		UserService.memberUpdate(vo);
		return "redirect:memberUpdate.do";
	}
	
}
