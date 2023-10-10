package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.Test;

import java.util.List;

public interface TestRepository {
    public List<Test> getTestList() throws Exception;
}
