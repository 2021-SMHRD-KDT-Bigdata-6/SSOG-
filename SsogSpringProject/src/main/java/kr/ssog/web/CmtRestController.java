package kr.ssog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ssog.domain.Cmt;
import kr.ssog.service.CmtService;

@RestController
public class CmtRestController {

	@Autowired
	CmtService service;
	
	@RequestMapping("/getCmtList")
	public @ResponseBody List<Cmt> getCmtList(int bno) throws Exception {
		
		List<Cmt> cmtList = service.cmtListService(bno);
		System.out.println("게시글 번호는 : " + bno);
		System.out.println(cmtList.toString());
		return cmtList;
	}
	

    
}
