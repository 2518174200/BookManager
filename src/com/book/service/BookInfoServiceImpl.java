package com.book.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.book.commons.MybatisUtils;
import com.book.dao.book.BookMapper;
import com.book.pojo.BookInfo;


public class BookInfoServiceImpl implements BookInfoService {
	private SqlSession sqlSession;
	private BookMapper mapper;
	@Override
	public int getcount(String bookName) {
		sqlSession = MybatisUtils.createSqlSession();
		int count = sqlSession.getMapper(BookMapper.class).getcount(bookName);
		MybatisUtils.closeSqlSession(sqlSession);
		return count;
	}

	@Override
	public List<BookInfo> getBookList(String bookName, int from, int pageSize) {
		sqlSession = MybatisUtils.createSqlSession();
		List<BookInfo> list = sqlSession.getMapper(BookMapper.class).getBookList(bookName, from, pageSize);
		MybatisUtils.closeSqlSession(sqlSession);
		return list;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MybatisUtils.createSqlSession();
		// 获得mapper对象
		int result = sqlSession.getMapper(BookMapper.class).delete(id);
		// TODO Auto-generated method stub
		if(result>0)
		{
			sqlSession.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean add1(BookInfo m) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MybatisUtils.createSqlSession();
		// 获得mapper对象
		mapper = sqlSession.getMapper(BookMapper.class);
		int result=mapper.save(m);
		if(result>0)
		{
			sqlSession.commit();
			return true;
		}
		MybatisUtils.closeSqlSession(sqlSession);
		return false;
	}

	@Override
	public boolean update(BookInfo m) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MybatisUtils.createSqlSession();
		// 获得mapper对象
		mapper = sqlSession.getMapper(BookMapper.class);
		int result=mapper.update(m);
		if(result>0)
		{
			sqlSession.commit();
			return true;
		}
		MybatisUtils.closeSqlSession(sqlSession);
		return false;
	}

	@Override
	public BookInfo Findid(int id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MybatisUtils.createSqlSession();
		// 获得mapper对象
		mapper = sqlSession.getMapper(BookMapper.class);
		BookInfo list = mapper.Findid(id);
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}

}
