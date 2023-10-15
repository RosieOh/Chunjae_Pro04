package kr.ed.haebeop.controller;

import kr.ed.haebeop.domain.Board;
import kr.ed.haebeop.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/board/*")
public class boardController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private BoardService boardService;

    @GetMapping("list.do")		//board/list.do
    public String getBoardList(Model model) throws Exception {
        logger.info("게시판 페이지 진입");
        List<Board> boardList = boardService.boardList();
        model.addAttribute("boardList", boardList);
        return "/board/boardList";
    }

    @GetMapping("detail.do")	//board/detail.do?seq=1
    public String getBoardDetail(HttpServletRequest request, Model model) throws Exception {
        int seq = Integer.parseInt(request.getParameter("seq"));
        Board dto = boardService.boardDetail(seq);
        model.addAttribute("dto", dto);
        return "/board/boardDetail";
    }

    @GetMapping("insert.do")
    public String insertForm(HttpServletRequest request, Model model) throws Exception {
        return "/board/boardInsert";
    }

    @PostMapping("insert.do")
    public String boardInsert(HttpServletRequest request, Model model) throws Exception {
        Board dto = new Board();
        dto.setTitle(request.getParameter("title"));
        dto.setContent(request.getParameter("content"));
        boardService.boardInsert(dto);
        return "redirect:list.do";
    }

    @GetMapping("delete.do")
    public String boardDelete(HttpServletRequest request, Model model) throws Exception {
        int seq = Integer.parseInt(request.getParameter("seq"));
        boardService.boardDelete(seq);
        return "redirect:list.do";
    }

    @GetMapping("edit.do")
    public String editForm(HttpServletRequest request, Model model) throws Exception {
        int seq = Integer.parseInt(request.getParameter("seq"));
        Board dto = boardService.boardDetail(seq);
        model.addAttribute("dto", dto);
        return "/board/boardEdit";
    }

    @PostMapping("edit.do")
    public String boardEdit(HttpServletRequest request, Model model) throws Exception {
        int seq = Integer.parseInt(request.getParameter("seq"));
        Board dto = new Board();
        dto.setSeq(seq);
        dto.setTitle(request.getParameter("title"));
        dto.setContent(request.getParameter("content"));
        boardService.boardEdit(dto);
        return "redirect:list.do";
    }
}