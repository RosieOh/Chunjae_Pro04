package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.Free;
import kr.ed.haebeop.domain.FreeComment;
import kr.ed.haebeop.domain.Record;
import kr.ed.haebeop.util.Page;

import java.util.List;

public interface FreeRepository {
    public List<Free> freeList(Page page) throws Exception;
    public Free freeDetail(int fno) throws Exception;
    public void freeInsert(Free dto) throws Exception;
    public void freeDelete(int fno) throws Exception;
    public void freeEdit(Free dto) throws Exception;
    public int totalCount(Page page) throws Exception;
    public List<Free> freeBestRecList() throws Exception;
    public List<Free> freeBestCmtList() throws Exception;
    public List<FreeComment> freeCommentList(int fno) throws Exception;
    public void commentInsert(FreeComment dto) throws Exception;
    public void commentDelete(int cno) throws Exception;
    public List<Free> commentCount() throws Exception;
    public Record findReco(int fno, String id) throws Exception;
    public Record memberFindReco(Record reco) throws Exception;
    public int insertReco(Record reco) throws Exception;
    public void deleteReco(Record reco) throws Exception;
    public void increaseRec(Record reco) throws Exception;
    public void decreaseRec(Record reco) throws Exception;


}