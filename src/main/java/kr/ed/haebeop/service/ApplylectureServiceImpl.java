package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Applylecture;
import kr.ed.haebeop.persistence.ApplylectureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplylectureServiceImpl implements ApplylectureService {

    private final ApplylectureMapper applylectureMapper;

    @Autowired
    public ApplylectureServiceImpl(ApplylectureMapper applylectureMapper) {
        this.applylectureMapper = applylectureMapper;
    }

    @Override
    public List<Applylecture> getApplylectureList() {
        return applylectureMapper.getApplylectureList();
    }

    @Override
    public Applylecture getApplylectureByAlno(int alno) {
        return applylectureMapper.getApplylectureByAlno(alno);
    }

    @Override
    public void insertApplylecture(Applylecture applylecture) {
        applylectureMapper.insertApplylecture(applylecture);
    }

    @Override
    public void deleteApplylecture(String alcode) {
        applylectureMapper.deleteApplylecture(alcode);
    }

    @Override
    public void updateApplylecture(Applylecture applylecture) {
        applylectureMapper.updateApplylecture(applylecture);
    }

    @Override
    public void countUp(int alno) {
        applylectureMapper.countUp(alno);
    }
}
