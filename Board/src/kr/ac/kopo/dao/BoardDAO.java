package kr.ac.kopo.dao;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.vo.BoardVO;

public class BoardDAO { // DAO Data Access Object 의 약자 

	private List<BoardVO> boardList;
	
	public BoardDAO() {
		boardList = new ArrayList<>();
		
	}
	
	public void insertBoard(BoardVO board) {
		boardList.add(board);
		
	}
}
