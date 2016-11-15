package com.won.noticeboard.persistence;

import java.util.List;

import com.won.noticeboard.domain.BoardDTO;

public interface GuestDAO { 
	public int insertGuest(BoardDTO dto);
	public List<BoardDTO> listGuest();
}
