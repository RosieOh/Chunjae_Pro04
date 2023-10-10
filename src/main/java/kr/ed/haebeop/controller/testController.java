package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.Test;
import kr.ed.haebeop.persistence.TestMapper;
import kr.ed.haebeop.persistence.TestMapper2;
import kr.ed.haebeop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test/")
public class testController {
    @Autowired
    private TestService testService;

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestMapper2 testMapper2;

    @GetMapping("getTestList")
    public String getTestList(Model model) throws Exception {
        List<Test> getTestList = testService.getTestList();
        model.addAttribute("getTestList", getTestList);
        return "/test/getTestList";
    }

    @GetMapping("getTestList2")
    public String getTestList2(Model model) throws Exception {
        List<Test> getTestList2 = testMapper.getTestList2();
        model.addAttribute("getTestList", getTestList2);
        return "/test/getTestList";
    }

    @GetMapping("getTestList3")
    public String getTestList3(Model model) throws Exception {
        List<Test> getTestList3 = testMapper2.getTestList3();
        model.addAttribute("getTestList", getTestList3);
        return "/test/getTestList";
    }
}
