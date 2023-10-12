package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.Day365;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Day365Mapper {
    List<Day365> getAllDays();
    Day365 getDayByName(String name);
    void insertDay(Day365 day);
    void updateDay(Day365 day);
    void deleteDay(String name);
}
