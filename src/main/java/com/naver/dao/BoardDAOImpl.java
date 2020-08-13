package com.naver.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public void write(com.naver.vo.BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVO);		
	}

}