package kr.ssog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import kr.ssog.domain.test;

public interface BoardMapper {

		// 게시판리스트						
		public List<test> boardList(); // 추상메서드
		

		// 게시글작성
		public void boardInsert(test board); // SQL -> insert ~ 쿼리
		
		// 게시글 상세내용 보여주기
		public test boardContent(int idx); // SQL -> select ~ where ~
		
		// 게시글 삭제
		@Delete("delete from board where idx=#{idx}") // --> BoardMapper.xml을 거치지 않고 바로 실행
		public void boardDelete(int idx); // SQL -> delete ~ 
		
		// 게시글 수정
		public void boardUpdate(test board); // SQL --> Update ~
		
		// 게시글 조회수 +1
		@Update("update board set count=count+1 where idx=#{idx}")
		public void boardCount(int idx); // SQL --> update ~
		
	//추후 좋아요, 태그 기능, 댓글기능
}
