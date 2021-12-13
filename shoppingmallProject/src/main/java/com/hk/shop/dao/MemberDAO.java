package com.hk.shop.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hk.shop.vo.MemberVO;

@Repository
public class MemberDAO {
	//DAO
	@Autowired
	SqlSession sqlSession;

	public MemberVO isExisted(MemberVO memberVO) {
		// TODO Auto-generated method stub
		System.out.println("memberDAO="+memberVO.toString());
		memberVO = sqlSession.selectOne("mapper.member.isExisted", memberVO);
		return memberVO;
	}


	public int addMember(MemberVO memberVO) {
		// TODO Auto-generated method stub
		int ret = sqlSession.insert("mapper.member.addMember", memberVO);
		return ret;
	}


	public MemberVO viewId(String name) {
		// TODO Auto-generated method stub
		MemberVO memberVO = sqlSession.selectOne("mapper.member.viewId", name);
		return memberVO;
	}


	
	
	
	
}
