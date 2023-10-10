package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Test;
import kr.ed.haebeop.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestRepository testRepository;


    @Override
    public List<Test> testList() throws Exception {
        return testRepository.testList();
    }

    @Override
    public Test getTest(int num) throws Exception {
        return testRepository.getTest(num);
    }

    @Override
    public void testInsert(Test test) throws Exception {
        testRepository.testInsert(test);
    }
}
