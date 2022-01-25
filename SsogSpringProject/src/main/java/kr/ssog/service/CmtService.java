package kr.ssog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.domain.Cmt;
import kr.ssog.mapper.CmtMapper;

@Service
public class CmtService {
	@Autowired
	CmtMapper mapper;
	
	public int cmtCount(int bno) throws Exception{
		return mapper.cmtCount(bno);
	}
	
	public List<Cmt> cmtListService(int bno) throws Exception{
        
        return mapper.cmtList(bno);
    }
    
    public int cmtInsertService(Cmt cmt) throws Exception{
        
        return mapper.cmtInsert(cmt);
    }
    
    public int cmtUpdateService(Cmt cmt) throws Exception{
        
        return mapper.cmtUpdate(cmt);
    }
    
    public int cmtDeleteService(int cno) throws Exception{
        
        return mapper.cmtDelete(cno);
    }
}
