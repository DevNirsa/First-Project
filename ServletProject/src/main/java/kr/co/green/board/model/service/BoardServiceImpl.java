package kr.co.green.board.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import kr.co.green.board.model.dao.FreeDAO;
import kr.co.green.board.model.dto.BoardDTO;
import kr.co.green.common.DatabaseConnection;
import kr.co.green.common.PageInfo;

public class BoardServiceImpl implements BoardService {
	private Connection con;
	private DatabaseConnection dc;
	private FreeDAO freeDAO;
	
	public BoardServiceImpl() {
		freeDAO = new FreeDAO();
		dc = new DatabaseConnection();
		con = dc.connDB();
	}
	
	// 게시글 목록 조회
	public ArrayList<BoardDTO> boardList(PageInfo pi) {
		return freeDAO.boardList(con, pi);
	}
	
	
	// 전체 게시글 수
	public int boardListCount() {
		return freeDAO.boardListCount(con);
	}
	
	// 글 등록
	public int boardEnroll(String title, String content, String name) {
		return freeDAO.boardEnroll(con, title, content, name);
	}
	
	// 조회수 +1
	@Override
	public int boardView(int idx) {
		return freeDAO.boardView(con, idx);
	}
	
	// 상세보기
	@Override
	public void boardSelect(BoardDTO board) {
		freeDAO.boardSelect(con, board);
	}

	public int boardUpdate(int idx, String title, String content) {
		return freeDAO.boardUpdate(con, idx, title, content);
	}

	public int boardDelete(int idx) {
		return freeDAO.boardDelete(con, idx);
	}
	
	
}











