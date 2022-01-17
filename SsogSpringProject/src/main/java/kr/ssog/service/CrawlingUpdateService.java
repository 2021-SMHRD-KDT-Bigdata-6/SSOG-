package kr.ssog.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.mapper.FoodMapper;

@Service
public class CrawlingUpdateService {
	
	@Autowired
	FoodMapper foodmapper;
	
	public void createViewTop200(){
		foodmapper.deleteViewTop200();
		foodmapper.createViewTop200();
		
	}

}
