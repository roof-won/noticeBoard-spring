package com.won.noticeboard.domain;

import java.util.Date;

public class BoardDTO {
	private int num;
	private String name;
	private String content;
	private Date regDate;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "GuestDAO [num=" + num + ", name=" + name + ", content=" + content + ", regDate=" + regDate + "]";
	}
}
