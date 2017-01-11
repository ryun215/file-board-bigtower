package com.team4.bigtower.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int memberAdd(Member member) {
		
		return memberDao.memberInsert(member);
	}

}
