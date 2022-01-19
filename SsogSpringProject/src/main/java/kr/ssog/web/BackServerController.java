package kr.ssog.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ssog.service.CrawlingUpdateService;



@Controller
class BackServerController {
	@Autowired
	CrawlingUpdateService crawlingUpdate;
	
	
	@GetMapping("/FlaskControlCoupang")
	public String coupang() {
		return "redirect:http://222.102.43.230:9000/CoupangCrawling?key=yes";
	}
	
	
	@GetMapping("/FlaskControlMarketKurly")
	public String marketKurly() {
		return "redirect:http://222.102.43.230:9000/MarketKurlyCrawling?key=yes";
	}
	
	
	@RequestMapping("/updateAll")
	public void updateAll() {
		crawlingUpdate.createViewTop200();
	}
	

	
}
