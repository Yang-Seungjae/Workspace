package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.BoardVO;

/*
 * 오라클 DB t_board 테이블에 CRUD 하기위한 클래스
 */
public class BoardDAO {

	public BoardDAO() {
	}

	public void insertBoard(BoardVO board) {

		StringBuilder sql = new StringBuilder();
		sql.append("insert into t_board(no, title, writer ) "); // sysdate가 디폴트값이도록 테이블을 만들어서 date값을 넣을 필요가없음
		sql.append("values(seq_t_board_no.nextval, ?, ? )");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) 
		{
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<BoardVO> selectAllBoard() {

		List<BoardVO> boardList = new ArrayList<>();

		StringBuilder sql = new StringBuilder();
		sql.append(
				"select no, title, writer, to_char(reg_date, 'yyyy-mm-dd') as reg_date from t_board order by no desc");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("reg_date");

				BoardVO board = new BoardVO(no, title, writer, regDate);
//				System.out.println(board);

				boardList.add(board);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return boardList;
	}

	public BoardVO selectBoardByNo(int boardNo) {
		
		BoardVO board = null;
		StringBuilder sql = new StringBuilder();
		sql.append("select no, title, writer ");
		sql.append(" , to_char(reg_date, 'yyyy-mm-dd') as reg_date ");
		sql.append("from t_board ");
		sql.append("where no = ?");

		try (
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				
				)
		{
			pstmt.setInt(1, boardNo);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String regDate = rs.getString("reg_date");
				board = new BoardVO(no, title, writer, regDate);
			} 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return board;

	}

}
