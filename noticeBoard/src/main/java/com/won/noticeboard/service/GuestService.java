package com.won.noticeboard.service;

import java.util.List;
import com.won.noticeboard.domain.BoardDTO;

public interface GuestService {
	public int insertGuest(BoardDTO dto);
	public List<BoardDTO> listGuest();
}
