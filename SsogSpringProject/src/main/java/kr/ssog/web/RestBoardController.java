package kr.ssog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ssog.domain.Board;
import kr.ssog.service.BoardService;

@RestController // @ResponseBody -> JSON : ajax통신
public class RestBoardController {

	@Autowired
	BoardService service;
	
	@GetMapping("/boardAjaxList.do")
	public @ResponseBody List<Board> boardAjaxList() {
		List<Board> list = service.boardList();
		// list -> [{ },{ },{ }] (json) -> API(Gson api)
		//String json="[{ },{ },{ }]";
		return list; // @@ResponseBody : 객체를 -> JSON으로 변환(API)시켜서 응답을 해라
		// json.jsp? --> @ResponseBody를 붙여주면 json으로 리턴해줌
	}
	@PostMapping("/boardAjaxInsert.do")
	public @ResponseBody void boardAjaxInsert(Board vo) {
		service.boardInsert(vo);
	}
//	@PostMapping("/boardAjaxContentUpdate.do")
//	public @ResponseBody void boardAjaxContentUpdate(Board vo) { // idx, contents
//		// Service -> Mapper -> SQL
//		service.boardContentUpdate(vo);
//	}
	@GetMapping("/boardAjaxDelete.do")
	public void boardAjaxDelete(int idx) {
		service.boardDelete(idx);
	}
	
	@GetMapping("/boardAjaxContent.do")
	public Board boardAjaxContent(int idx) {
		Board vo = service.boardContent(idx);
		return vo;
	}
	
//	@GetMapping("/boardAjaxCount.do")
//	public Board boardAjaxCount(int idx) {
//		service.boardCount(idx); // 조회수를 누적
//		Board vo = service.boardGetCount(idx); // 누적된 조회수를 가지고 오는 부분
//		return vo; // count
//	}
}
