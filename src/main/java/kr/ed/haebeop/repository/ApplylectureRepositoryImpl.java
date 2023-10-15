package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.Applylecture;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ApplylectureRepositoryImpl implements ApplylectureRepository {

    private final SqlSession sqlSession;

    @Autowired
    public ApplylectureRepositoryImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Applylecture> findAll() throws Exception {
        return sqlSession.selectList("applylecture.findAll");
    }

    @Override
    public Applylecture findByAlno(int alno) throws Exception {
        return sqlSession.selectOne("applylecture.findByAlno", alno);
    }

    @Override
    public void save(Applylecture applylecture) throws Exception {
        sqlSession.insert("applylecture.insertApplylecture", applylecture);
    }

    @Override
    public void deleteByAlcode(String alcode) throws Exception {
        sqlSession.delete("applylecture.deleteApplylecture", alcode);
    }

    @Override
    public void update(Applylecture applylecture) throws Exception {
        sqlSession.update("applylecture.updateApplylecture", applylecture);
    }

    @Override
    public void incrementCount(int alno) throws Exception {
        sqlSession.update("applylecture.countUp", alno);
    }
}
