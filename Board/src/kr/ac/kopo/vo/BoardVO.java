package kr.ac.kopo.vo;

public class BoardVO { // VO DTO == 기본 저장 단위를 표시하기 위한 약자

	private int no; // 게시글마다 고유의 게시물번호
	private String title;
	private String writer;
	private String regDate;
	
	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BoardVO(int no, String title, String writer, String regDate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.regDate = regDate;
	}


	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", regDate=" + regDate + "]";
	}




	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}


	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}


	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}


	/**
	 * @return the regDate
	 */
	public String getRegDate() {
		return regDate;
	}


	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
	
}
