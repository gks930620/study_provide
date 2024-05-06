package com.study.free.service;

import java.util.List;

import com.study.exception.BizNotFoundException;
import com.study.exception.BizNotEffectedException;
import com.study.exception.BizNotFoundException;
import com.study.exception.BizPasswordNotMatchedException;
import com.study.free.vo.FreeBoardVO;

public interface IFreeBoardService {
	public List<FreeBoardVO> getBoardList();
	public FreeBoardVO getBoard(int boNo) throws BizNotFoundException;
	public void modifyBoard(FreeBoardVO freeBoard) 
			throws BizPasswordNotMatchedException ;
	public void removeBoard(FreeBoardVO freeBoard)
			throws BizPasswordNotMatchedException ;
	public void registBoard(FreeBoardVO freeBoard);

}
