package com.team4.bigtower.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team4.bigtower.member.service.Member;
import com.team4.bigtower.member.service.MemberService;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/memberAdd", method = RequestMethod.GET)
	public String memberAdd() {
		logger.info("memberAdd() GET");
		return "/member/memberAdd";
	}
	@RequestMapping(value = "/memberAdd", method = RequestMethod.POST)
	public String memberAdd(Member member) {
		logger.info("memberAdd() POST");
		int result = memberService.memberAdd(member);
		if(result !=0){
			logger.info("회원가입성공!");
			return "redirect:/memberLogin";
		}
		return "/member/memberAdd";
	}
	
	@RequestMapping(value = "/memberLogin", method = RequestMethod.GET)
	public String memberLogin() {
		logger.info("memberLogin() GET");
		
		return "/member/memberLogin";
	}
}
