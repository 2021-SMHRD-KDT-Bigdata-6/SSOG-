package kr.ssog.service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.ssog.domain.Board;
import kr.ssog.mapper.BoardMapper;

@Service 
public class BoardService {

	@Autowired
	BoardMapper mapper;
	
	public List<Board> boardList(String boardCate){
		List<Board> list=mapper.boardList(boardCate);
		return list;
	}
	// 게시글 업로드
	public void boardInsert(Board board, MultipartFile file) throws Exception {

		// 파일 저장 경로
		String projectPath = "C:\\Users\\smhrd\\git\\SSOGSpringProject\\SsogSpringProject\\src\\main\\webapp\\resources\\files";

		// 파일이름 랜덤생성(파일이름 겹칠 경우 대비)
		UUID uuid = UUID.randomUUID();
		String fileName = uuid + "_" + file.getOriginalFilename(); // 파일 랜덤 이름 + 원본이름

		// 파일 저장
		File saveFile = new File(projectPath, fileName);

		file.transferTo(saveFile);

		board.setFileName(fileName);
		board.setFilePath("resources/files/" + fileName);

		mapper.boardInsert(board);
	}
	public Board boardContent(int num) {
		Board board=mapper.boardContent(num);
		//mapper.boardCount(num); //조회수 증가
		return board;
	}
	
	public void boardDelete(int idx) {
		mapper.boardDelete(idx);
	}; 
	
	public void boardUpdate(Board vo) {
		mapper.boardUpdate(vo);
	}
	
	public void boardCount(int idx) {
		mapper.boardCount(idx);
	}
	
	public List<Board> infiniteScrollingH(int num){
		System.out.println(num);
		return mapper.infiniteScrollingH(num);
	}
}
