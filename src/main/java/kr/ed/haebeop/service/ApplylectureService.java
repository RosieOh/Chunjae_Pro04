package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Applylecture;

import java.util.List;

public interface ApplylectureService {
    public List<Applylecture> getApplylectureList();
    public Applylecture getApplylectureByAlno(int alno);
    public void insertApplylecture(Applylecture applylecture);
    public void deleteApplylecture(String alcode);
    public void updateApplylecture(Applylecture applylecture);
    public void countUp(int alno);
}
