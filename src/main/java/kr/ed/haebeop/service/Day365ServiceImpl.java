package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Day365;
import kr.ed.haebeop.persistence.Day365Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Day365ServiceImpl implements Day365Service{

    @Autowired
    private Day365Mapper day365Mapper;
    private SqlSession sqlSession;


    @Override
    public List<Day365> getAllDays() {
        return null;
    }

    @Override
    public Day365 getDayByName(String name) {
        return null;
    }

    @Override
    public void insertDay(Day365 day) {

    }

    @Override
    public void updateDay(Day365 day) {

    }

    @Override
    public void deleteDay(String name) {

    }
}
