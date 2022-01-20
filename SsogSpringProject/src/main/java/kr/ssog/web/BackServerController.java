package kr.ssog.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ssog.service.CrawlingUpdateService;



@Controller
class BackServerController {
	@Autowired
	CrawlingUpdateService crawlingUpdate;
	
	
	@RequestMapping("/BackServerControl")
	public String BackServerControll() {
		return "BackServerControl";
	}
	
	@GetMapping("/FlaskControlCoupang1")
	public @ResponseBody String coupang1() {
		return "redirect:http://222.102.43.230:9000/CoupangCrawlingCoffeeETC?key=yes";
	}
	
	@GetMapping("/FlaskControlCoupang2")
	public @ResponseBody String coupang2() {
		return "redirect:http://222.102.43.230:9000/CoupangCrawlingCoffeeETC?key=yes";
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
