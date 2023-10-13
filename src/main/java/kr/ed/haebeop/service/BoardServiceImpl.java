package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Board;
import kr.ed.haebeop.persistence.BoardMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    private SqlSession sqlSession;

    @Override
    public List<Board> boardList() throws Exception {
        return boardMapper.boardList();
    }

    @Override
    public Board boardDetail(int bno) throws Exception {
        return boardMapper.boardDetail(bno);
    }

    @Override
    public void boardInsert(Board domain) throws Exception {
        boardMapper.boardInsert(domain);
    }

    @Override
    public void boardDelete(int bno) throws Exception {
        boardMapper.boardDelete(bno);
    }

    @Override
    public void boardEdit(Board domain) throws Exception {
        boardMapper.boardEdit(domain);
    }
}
