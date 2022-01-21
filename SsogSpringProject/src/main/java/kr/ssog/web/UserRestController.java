package kr.ssog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ssog.domain.t_member;
import kr.ssog.service.UserService;

@RestController
public class UserRestController {
	@Autowired
	UserService userService;
	
	@GetMapping("/logCountPlus")
	public @ResponseBody void logCountPlus(t_member vo, String food_name) {
		
		userService.plusLogCount(vo, food_name);
		System.out.println(vo.getMb_id() + food_name);
	}
	
	
}
