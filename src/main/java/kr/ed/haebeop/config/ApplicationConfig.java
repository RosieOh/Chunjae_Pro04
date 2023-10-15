package kr.ed.haebeop.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.ed.haebeop.repository.BoardRepository;
import kr.ed.haebeop.repository.BoardRepositoryImpl;
import kr.ed.haebeop.repository.FreeRepository;
import kr.ed.haebeop.repository.FreeRepositoryImpl;
import kr.ed.haebeop.repository.MemberRepository;
import kr.ed.haebeop.repository.MemberRepositoryImpl;
import kr.ed.haebeop.service.BoardService;
import kr.ed.haebeop.service.BoardServiceImpl;
import kr.ed.haebeop.service.Day365Service;
import kr.ed.haebeop.service.Day365ServiceImpl;
import kr.ed.haebeop.service.FreeService;
import kr.ed.haebeop.service.FreeServiceImpl;
import kr.ed.haebeop.service.MemberService;
import kr.ed.haebeop.service.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.ed.haebeop")
public class ApplicationConfig {

    @Bean
    public BoardRepository boardRepository() {
        return new BoardRepositoryImpl();
    }

    @Bean
    public FreeRepository freeRepository() {
        return new FreeRepositoryImpl();
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepositoryImpl();
    }

    @Bean
    public BoardService boardService() {
        return new BoardServiceImpl();
    }

    @Bean
    public Day365Service day365Service() {
        return new Day365ServiceImpl();
    }

    @Bean
    public FreeService freeService() {
        return new FreeServiceImpl();
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl();
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
