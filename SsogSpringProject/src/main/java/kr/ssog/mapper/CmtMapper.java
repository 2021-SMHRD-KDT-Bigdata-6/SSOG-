package kr.ssog.mapper;
import java.util.List;

import kr.ssog.domain.Cmt;
 public interface CmtMapper {

// 댓글 개수 
 public int cmtCount(int bno) throws Exception;

// 댓글 목록 
 public List<Cmt> cmtList(int bno) throws Exception;

// 댓글 작성 
 public int cmtInsert(Cmt cmt) throws Exception;

// 댓글 수정 
 public int cmtUpdate(Cmt cmt) throws Exception;

// 댓글 삭제 
 public int cmtDelete(int cno) throws Exception;
 
}

	 