package kr.ed.haebeop.service;

import kr.ed.haebeop.repository.FreeRepository;
import kr.ed.haebeop.domain.Free;
import kr.ed.haebeop.domain.FreeComment;
import kr.ed.haebeop.domain.Record;
import kr.ed.haebeop.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreeServiceImpl implements FreeService {

    @Autowired
    private FreeRepository freeRepository;

    @Override
    public List<Free> freeList(Page page) throws Exception {
        return freeRepository.freeList(page);
    }

    @Override
    public Free freeDetail(int fno) throws Exception {
        return freeRepository.freeDetail(fno);
    }

    @Override
    public void freeInsert(Free dto) throws Exception {
        freeRepository.freeInsert(dto);
    }

    @Override
    public void freeDelete(int fno) throws Exception {
        freeRepository.freeDelete(fno);
    }

    @Override
    public void freeEdit(Free dto) throws Exception {
        freeRepository.freeEdit(dto);
    }

    @Override
    public int totalCount(Page page) throws Exception {
        return freeRepository.totalCount(page);
    }

    @Override
    public List<Free> freeBestRecList() throws Exception {
        return freeRepository.freeBestRecList();
    }

    @Override
    public List<Free> freeBestCmtList() throws Exception {
        return freeRepository.freeBestCmtList();
    }

    @Override
    public List<FreeComment> freeCommentList(int bno) throws Exception {
        return freeRepository.freeCommentList(bno);
    }

    @Override
    public void commentInsert(FreeComment dto) throws Exception {
        freeRepository.commentInsert(dto);
    }

    @Override
    public void commentDelete(int cno) throws Exception {
        freeRepository.commentDelete(cno);
    }

    @Override
    public List<Free> commentCount() throws Exception {
        return freeRepository.commentCount();
    }

    @Override
    public Record findReco(int fno, String id) throws Exception {
        return freeRepository.findReco(fno, id);
    }

    @Override
    public int insertReco(Record reco) throws Exception {
        int result = 0;
        // 추천이 이미 있는지 확인하는 코드
        Record find = freeRepository.memberFindReco(reco);

        // find가 null이면 추천이 없는 상태이므로 정보 저장
        // find가 null이 아니면 추천이 있는 상태이므로 정보 삭제
        System.out.println("find:" + find);

        if (find == null) {
            result = freeRepository.insertReco(reco);
            freeRepository.increaseRec(reco);
        } /*else {
            freeDAO.deleteReco(reco);
            freeDAO.decreaseRec(reco);
        }*/
        return result;
    }
}