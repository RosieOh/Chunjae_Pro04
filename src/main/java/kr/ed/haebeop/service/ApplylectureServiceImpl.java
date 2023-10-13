package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Applylecture;
import kr.ed.haebeop.persistence.ApplylectureMapper;
import org.apache.ibatis.session.SqlSession;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplylectureServiceImpl implements ApplylectureService {

    @Autowired
    private ApplylectureMapper applylectureMapper;
    private SqlSession sqlSession;


    @Override
    public List<Applylecture> getApplylectureList() {
        return null;
    }

    @Override
    public Applylecture getApplylectureByAlno(int alno) {
        return null;
    }

    @Override
    public void insertApplylecture(Applylecture applylecture) {

    }

    @Override
    public void deleteApplylecture(String alcode) {

    }

    @Override
    public void updateApplylecture(Applylecture applylecture) {

    }

    @Override
    public void countUp(int alno) {

    }
}
