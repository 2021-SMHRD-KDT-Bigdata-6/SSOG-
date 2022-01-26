package kr.ssog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.ssog.domain.Cmt;
import kr.ssog.service.CmtService;

@Controller
public class CmtConroller {

	@Autowired
	CmtService service;
	
	@RequestMapping("/list") //댓글 리스트
    @ResponseBody
    private List<Cmt> cmtServiceList(int bno, Model model) throws Exception{
        
        return service.cmtListService(bno);
    }
    

	@RequestMapping("/cmtInsert")
	public String cmtInsert(@RequestParam("num") int num,RedirectAttributes re, Cmt cmt) throws Exception {
		service.cmtInsertService(cmt);
		// 댓글 insert 후 boardContents로 redirect
		// redirect할때 파라미터 넘기기
		re.addAttribute("num", num);
		return "redirect:/boardContents";
	}
    
    @RequestMapping("/update") //댓글 수정  
    @ResponseBody
    private int mCommentServiceUpdateProc(@RequestParam int cno, @RequestParam String contents) throws Exception{
        
        Cmt cmt = new Cmt();
        cmt.setCno(cno);
        cmt.setContents(contents);
        
        return service.cmtUpdateService(cmt);
    }
    
    @RequestMapping("/delete/{cno}") //댓글 삭제  
    @ResponseBody
    private int cmtServiceDelete(@PathVariable int cno) throws Exception{
        
        return service.cmtDeleteService(cno);

    }
}
