package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Day365;

import java.util.List;

public interface Day365Service {
    public List<Day365> getAllDays();
    public Day365 getDayByName(String name);
    public void insertDay(Day365 day);
    public void updateDay(Day365 day);
    public void deleteDay(String name);

}
