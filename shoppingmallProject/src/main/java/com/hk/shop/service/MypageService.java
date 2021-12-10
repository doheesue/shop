package com.hk.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.shop.dao.MemberDAO;
import com.hk.shop.dao.MypageDAO;
import com.hk.shop.vo.MemberVO;

@Service
public class MypageService {

	@Autowired
	MypageDAO mypageDAO;
	
	@Autowired
	MemberDAO memberDAO;

	public List<MemberVO> myInfoPage() {
		// TODO Auto-generated method stub
		return mypageDAO.showMyInfo();
	}
	
	
	
}