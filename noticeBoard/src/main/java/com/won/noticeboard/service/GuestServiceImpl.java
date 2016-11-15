package com.won.noticeboard.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.won.noticeboard.domain.BoardDTO;
import com.won.noticeboard.persistence.GuestDAO;

@Service
public class GuestServiceImpl implements GuestService {

	@Inject
	private GuestDAO guestDAO;
	
	@Override
	public int insertGuest(BoardDTO dto) {
		return guestDAO.insertGuest(dto);
	}

	@Override
	public List<BoardDTO> listGuest() {
		return guestDAO.listGuest();
	}

}
