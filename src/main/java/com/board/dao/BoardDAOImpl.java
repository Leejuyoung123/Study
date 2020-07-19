package com.board.dao;

import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.board.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sql;

	private static String namespace = "com.board.mappers.board";
	// BoardDAOImpl에 있는 namespace와 매퍼의 namespace와 일치해야함

	// 게시물 목록
	@Override
	public List list() throws Exception {
		// boardVO를 리스트 형태로 만들면 게시물 목록을 받아올수있음
		return sql.selectList(namespace + ".list");
	}

	// 게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		sql.insert(namespace + ".write", vo);
		// boardMapper에 있는 쿼리를 이용하여 데이터베이스에 데이터를 넣을수 있도록함

	}

	// 게시물 조회
	@Override
	public BoardVO view(int bno) throws Exception {
		return sql.selectOne(namespace + ".view", bno);
	}

	// 게시물 수정
	@Override
	public void modify(BoardVO vo) throws Exception {
		sql.update(namespace + ".modify", vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int bno) throws Exception {
		sql.delete(namespace + ".delete", bno);
	}

	// 게시물 총 개수
	@Override
	public int count() throws Exception {
		return sql.selectOne(namespace + ".count");
	}

	// 게시물 목록 + 페이징
	/*
	 * 매개변수인 displayPost,postNum를 해시맵을 이용하여 하나로 그룹지어준 뒤 매퍼에 전송합니다. DAO와 매퍼에서는 데이터를
	 * 하나만 전송할 수 있기 때문에, 2개 이상의 데이터를 다룰 때는 VO(Value Object)를 사용하거나 해시맵을 이용합니다.
	 */
	@Override
	public List listPage(int displayPost, int postNum) throws Exception {
		HashMap data = new HashMap();

		data.put("displayPost", displayPost);
		data.put("postNum", postNum);

		return sql.selectList(namespace + ".listPage", data);
	}

	// 게시물 목록 + 페이징 + 검색
	@Override
	public List<BoardVO> listPageSearch(int displayPost, int postNum, String searchType, String keyword)
			throws Exception {

		HashMap<String, Object> data = new HashMap<String, Object>();

		data.put("displayPost", displayPost);
		data.put("postNum", postNum);

		data.put("searchType", searchType);
		data.put("keyword", keyword);

		return sql.selectList(namespace + ".listPageSearch", data);
	}
	// 게시물 총 갯수 + 검색 적용
	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
	 
	 HashMap data = new HashMap();
	 
	 data.put("searchType", searchType);
	 data.put("keyword", keyword);
	 
	 return sql.selectOne(namespace + ".searchCount", data); 
	}
}
