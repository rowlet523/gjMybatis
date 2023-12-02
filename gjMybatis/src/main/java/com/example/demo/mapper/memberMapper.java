package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.member;

@Mapper
public interface memberMapper {
	@Insert("insert into member(name,username,password) "
			+ "value(#{name},#{username},#{password})")
	void add(member m);
	
	@Select("select * from member where username=#{username} and password=#{password}")
	member queryMember(String username,String password);
	
	@Select("select * from member where username=#{username}")
	member queryUsername(String username);

}