package kr.ssog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import kr.ssog.domain.Board;

public interface BoardMapper {

		// 게시판리스트						
		public List<Board> boardList(String boardCate); // 추상메서드
		

		// 게시글작성
		public void boardInsert(Board board); // SQL -> insert ~ 쿼리
		
		// 게시글 상세내용 보여주기
		public Board boardContent(int num); // SQL -> select ~ where ~
		
		// 게시글 삭제
		@Delete("delete from board where idx=#{idx}") // --> BoardMapper.xml을 거치지 않고 바로 실행
		public void boardDelete(int idx); // SQL -> delete ~ 
		
		// 게시글 수정
		public void boardUpdate(Board board); // SQL --> Update ~
		
		// 게시글 조회수 +1
		@Update("update board set count=count+1 where idx=#{idx}")
		public void boardCount(int idx); // SQL --> update ~
		
		// HappyCook 무한 스크롤링
		public List<Board> infiniteScrollingH(int num);
		
		// PoisonCook 무한 스크롤링
		public List<Board> infiniteScrollingP(int num);
		
	//추후 좋아요, 태그 기능, 댓글기능
}
