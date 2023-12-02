package com.example.demo.service;

import com.example.demo.vo.member;

public interface memberService {
	void addMember(member m);
	member Login(String username,String password);
	boolean UsernameRepeat(String username);

}