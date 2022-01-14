package kr.ssog.mapper;

import java.util.List;



import kr.ssog.domain.HistoryIndex;

public interface HistoryIndexMapper {
	

	public List<HistoryIndex> getIndHistory(String ingre_Name);

}
