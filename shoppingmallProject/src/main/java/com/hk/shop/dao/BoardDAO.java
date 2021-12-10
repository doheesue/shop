package com.hk.shop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.shop.vo.FAQVO;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession session;

	public List<FAQVO> allList() {
		// TODO Auto-generated method stub
		List<FAQVO> FAQList = session.selectList("mapper.board.selectFAQAllList");
		return FAQList;
	}
	
	public List<FAQVO> ViewOne(int FAQNum) {
		// TODO Auto-generated method stub
		List<FAQVO> FAQList = session.selectList("mapper.board.selectFAQOneList", FAQNum);
		return FAQList;
	}
	
}
