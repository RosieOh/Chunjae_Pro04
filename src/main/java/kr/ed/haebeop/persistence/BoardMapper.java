package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<Board> boardList();
    public Board boardDetail(int bno);
    public void boardInsert(Board board);
    public void boardEdit(Board board);
    public void boardDelete(int bno);
    public void countUp (int bno);
}
