package kr.ssog.service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.ssog.domain.test;
import kr.ssog.mapper.BoardMapper;

@Service 
public class BoardService {

	@Autowired
	BoardMapper mapper;
	
	public List<test> boardList(){
		List<test> list=mapper.boardList();
		return list;
	}
	// 게시글 업로드
		public void boardInsert(test board, MultipartFile file) throws Exception {

			// 파일 저장 경로
			String projectPath = "C:\\Users\\smhrd\\git\\SSOGSpringProject\\SsogSpringProject\\src\\main\\resources\\static\\files";

			// 파일이름 랜덤생성(파일이름 겹칠 경우 대비)
			UUID uuid = UUID.randomUUID();
			String fileName = uuid + "_" + file.getOriginalFilename(); // 파일 랜덤 이름 + 원본이름

			// 파일 저장
			File saveFile = new File(projectPath, fileName);

			file.transferTo(saveFile);

			board.setFilename(fileName);
			board.setFilepath("/files/" + fileName);

			mapper.boardInsert(board);
		}
	public test boardContent(int idx) {
		test vo=mapper.boardContent(idx);
		mapper.boardCount(idx); //조회수 증가
		return vo;
	}
	
	public void boardDelete(int idx) {
		mapper.boardDelete(idx);
	}; 
	
	public void boardUpdate(test vo) {
		mapper.boardUpdate(vo);
	}
	
	public void boardCount(int idx) {
		mapper.boardCount(idx);
	}
}
