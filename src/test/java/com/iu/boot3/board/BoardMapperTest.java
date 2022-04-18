package com.iu.boot3.board;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iu.boot3.util.Pager;
@SpringBootTest
class BoardMapperTest {
	
	@Autowired
	private BoardMapper boardMapper;
	
	//@Test
	void setFileAdd() throws Exception {
		BoardFilesVO boardFilesVO = new BoardFilesVO();
		boardFilesVO.setFileName("fileName test");
		boardFilesVO.setOriName("oriName");
		boardFilesVO.setNum(3L);
		int result = boardMapper.setFileAdd(boardFilesVO);
		assertEquals(1, result);
	}
	
	@Test
	void setFileDelete() throws Exception {
		BoardFilesVO boardFilesVO = new BoardFilesVO();
		boardFilesVO.setFileNum(6L);
		int result = boardMapper.setFileDelete(boardFilesVO);
		assertEquals(1, result);
	}
	
	//@Test
	void setFileDetail() throws Exception {
		BoardFilesVO boardFilesVO = new BoardFilesVO();
		boardFilesVO.setFileNum(4L);
		boardFilesVO = boardMapper.getFileDetail(boardFilesVO);
		System.out.println(boardFilesVO.toString());
		assertNotNull(boardFilesVO); 
	}
	
	//@Test
	void setFileList() throws Exception {
		List<BoardFilesVO> ar = boardMapper.getFileList();
		assertNotEquals(0, ar.size());
	}
	
	//getDetail
	//@Test
	void test() throws Exception {
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(3L);
		boardVO = boardMapper.getDetail(boardVO);
		
		System.out.println(boardVO.toString());
		assertNotNull(boardVO);
	}
	
	//getList
	//@Test
	void getList()throws Exception{
		Pager pager = new Pager();
		pager.makeRow();
		List<BoardVO> ar = boardMapper.getList(pager);
		
		System.out.println(ar);
		assertEquals(10, ar.size());
	}
	
	//setAdd
	//@Test
	void setAdd()throws Exception{
		
		for(int i=0;i<100; i++) {
			if(i%10 ==0) {
				Thread.sleep(1000);
			}
		
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("title test"+i);
		boardVO.setWriter("wrtier test"+i);
		boardVO.setContents("contents test"+i);

		int result = boardMapper.setAdd(boardVO);
		}
		System.out.println("finish");
		//assertEquals(1, result);
	}

	
	//setUpdate
	//@Test
	void setUpdate()throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("update");
		boardVO.setContents("update");
		boardVO.setNum(3L);
		int result = boardMapper.setUpdate(boardVO);
		assertEquals(1, result);
	}
	
	//setDelete
	//@Test
	void setDelete()throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(4L);
		int result = boardMapper.setDelete(boardVO);
		assertEquals(1, result);
	}

}
