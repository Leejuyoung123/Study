package com.board.domain;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
public class BoardVO {
//  데이터베이스와 연동된  VO 는 이 변수값과 데이터베이스에 등록된 변수값을 똑같이 해줘야 연동이됨
/*create table tbl_board(
		bno int not null auto_increment,
		title varchar(5) not null,
		content text not null,
		writer varchar(30) not null,
		regDate timestamp not null default now(),
		viewCnt int default 0,
		primary key(bno) );*
 다른사람이 이 value object를 보더라도 어느테이블을 사용한지 알수있기떄문
		*/
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCnt;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
	
	
}
// 모든 변수에 대한 getter와 setter가 생성 있어야 vo의 데이터를 사용할수있다 필수사항
	
	