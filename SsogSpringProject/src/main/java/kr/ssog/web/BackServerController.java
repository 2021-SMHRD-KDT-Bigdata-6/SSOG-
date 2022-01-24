package kr.ssog.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ssog.service.CrawlingUpdateService;



@Component
class BackServerController {
	@Autowired
	CrawlingUpdateService crawlingUpdate;
	
	
	@RequestMapping("/BackServerControl")
	public String BackServerControll() {
		return "BackServerControl";
	}
	
	@GetMapping("/FlaskControlCoupang1")
	public @ResponseBody String coupang1() {
		System.out.println("확인");
		return "redirect:http://172.30.1.59:9001/CoupangCrawlingSea?key=yes";
		

	}
	
	@GetMapping("/FlaskControlCoupang2")
	public @ResponseBody String coupang2() {
		System.out.println("확인2");
		return "redirect:http://172.30.1.59:9001/CoupangCrawlingVege?key=yes";
	}
	
	@GetMapping("/FlaskControlCoupang3")
	public @ResponseBody String coupang3() {
		System.out.println("확인3");
		return "redirect:http://222.102.43.230:9000/CoupangCrawlingStock?key=yes";
	}
	
	@GetMapping("/FlaskControlCoupang4")
	public @ResponseBody String coupang4() {
		System.out.println("확인4");
		return "redirect:http://222.102.43.230:9000/CoupangCrawlingRice?key=yes";
	}
	
	
	@GetMapping("/FlaskControlMarketKurly")
	public @ResponseBody String marketKurly() {
		return "redirect:http://222.102.43.230:9000/MarketKurlyCrawling?key=yes";
	}
	
	
	@RequestMapping("/updateAll")
	public @ResponseBody void updateAll() {
		crawlingUpdate.createViewTop200();
	}
	

	
}
