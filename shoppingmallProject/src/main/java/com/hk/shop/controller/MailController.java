package com.hk.shop.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hk.shop.service.MailService;

@Controller
@EnableAsync
public class MailController {
	
	@Autowired
	private MailService mailService;
	
	@RequestMapping (value="/sendMail.do", method=RequestMethod.GET)
	public void sendSimpleMail (HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; cahrset=utf-8");
		
		PrintWriter out = response.getWriter();
		mailService.sendMail("ddh04023@naver.com", "테스트메일", "안녕하세요. 테스트 메일입니다.");
		mailService.sendPreConfigeredMail("테스트 메일입니다.");
		out.print("메일을 보냈습니다.");
	}

}
