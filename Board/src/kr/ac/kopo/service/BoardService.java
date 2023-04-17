package kr.ac.kopo.service;

import kr.ac.kopo.dao.BoardDAO;
import kr.ac.kopo.vo.BoardVO;

public class BoardService {
	
	private BoardDAO boardDao;
	
	public BoardService() {
		
		boardDao = new BoardDAO();
		
		
	}
	
	public void insertBoard(BoardVO board) {
		
	}

}
