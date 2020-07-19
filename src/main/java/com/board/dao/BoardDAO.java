package com.board.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;
/* 인터페이스인 BoardDAO에 메서드를 추가하면, 구현체인 BoardDAOImpl에 에러가 발생합니다. 
 *  왜냐하면, 구현체인 BoardDAOImpl에는 인터페이스인 BoardDAO와 동일한 메서드가 존재해야하기 때문입니다.
 *  구현 되지않은 메서드를 추가 해주기위함
 */

public interface BoardDAO {

	public List<BoardVO> list() throws Exception; // 보드 vo 리스트를 받아와서 리스트에 던져줌

	public void write(BoardVO vo) throws Exception; // insert id 값인 write를 선언해 (BoardVO에있는 get,set값을 받기위해 BOardVO클래스인
													// vo에 write값을 넣어줌. 매개변수

	public BoardVO view(int bno) throws Exception; // 게시물 조회

	public void modify(BoardVO vo) throws Exception; // 게시물수정

	public void delete(int bno) throws Exception; // 게시물삭제
	// 게시물 총 갯수

	public int count() throws Exception;

	// 게시물 목록 + 페이징
	public List listPage(int displayPost, int postNum) throws Exception;

	// 게시물 목록 + 페이징 + 검색
	public List<BoardVO> listPageSearch(int displayPost, int postNum, String searchType, String keyword)
			throws Exception;
	// 게시물 총 갯수 + 검색 적용
	public int searchCount(String searchType, String keyword) throws Exception;
}
