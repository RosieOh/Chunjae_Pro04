package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.Applylecture;

import java.util.List;

public interface ApplylectureRepository {
    public List<Applylecture> findAll() throws Exception;
    public Applylecture findByAlno(int alno) throws Exception;
    public void save(Applylecture applylecture) throws Exception;
    public void deleteByAlcode(String alcode) throws Exception;
    public void update(Applylecture applylecture) throws Exception;
    public void incrementCount(int alno) throws Exception;
}
