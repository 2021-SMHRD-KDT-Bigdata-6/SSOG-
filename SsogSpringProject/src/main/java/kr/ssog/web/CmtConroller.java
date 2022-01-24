package kr.ssog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    
    @RequestMapping("/insert") //댓글 작성 
    @ResponseBody
    private int cmtServiceInsert(@RequestParam int bno, @RequestParam String contents) throws Exception{
        
        Cmt cmt = new Cmt();
        cmt.setBno(bno);
        cmt.setContents(contents);
        //로그인 기능을 구현했거나 따로 댓글 작성자를 입력받는 폼이 있다면 입력 받아온 값으로 사용하면 됩니다. 저는 따로 폼을 구현하지 않았기때문에 임시로 "test"라는 값을 입력해놨습니다.
        cmt.setWriter("test");  
        
        return service.cmtInsertService(cmt);
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
