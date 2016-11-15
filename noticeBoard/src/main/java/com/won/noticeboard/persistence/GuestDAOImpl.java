package com.won.noticeboard.persistence;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.won.noticeboard.domain.BoardDTO;

@Repository
public class GuestDAOImpl implements GuestDAO {

	@Inject	
	private SqlSession sqlSession;
	private static final String namespace = "com.won.noticeboard.mapper.GuestMapper";
	
	@Override
	public int insertGuest(BoardDTO dto) {
		return sqlSession.insert(namespace + ".insertGuest", dto);
	}

	@Override
	public List<BoardDTO> listGuest() {
		return sqlSession.selectList(namespace + ".listGuest");
	}

}
