package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.Applylecture;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplylectureMapper {
    List<Applylecture> getApplylectureList();
    Applylecture getApplylectureByAlno(int alno);
    void insertApplylecture(Applylecture applylecture);
    void deleteApplylecture(String alcode);
    void updateApplylecture(Applylecture applylecture);
    void countUp(int alno);
}
