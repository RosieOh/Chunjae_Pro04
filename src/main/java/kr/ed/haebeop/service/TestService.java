package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Test;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TestService {
    public List<Test> getTestList() throws Exception;
}
