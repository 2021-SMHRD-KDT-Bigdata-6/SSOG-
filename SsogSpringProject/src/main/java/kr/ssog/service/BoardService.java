package kr.ssog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.domain.Board;
import kr.ssog.mapper.BoardMapper;

@Service 
public class BoardService {

	@Autowired
	BoardMapper mapper;
	
	public List<Board> boardList(){
		List<Board> list=mapper.boardList();
		return list;
	}
	public void boardInsert(Board vo) {
		mapper.boardInsert(vo);
	}
	public Board boardContent(int idx) {
		Board vo=mapper.boardContent(idx);
		mapper.boardCount(idx); //조회수 증가
		return vo;
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
}
