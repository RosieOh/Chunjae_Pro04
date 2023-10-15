package kr.ed.haebeop.service;

import kr.ed.haebeop.repository.MemberRepository;
import kr.ed.haebeop.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();

    @Override
    public List<Member> memberList() throws Exception {
        return memberRepository.memberList();
    }

    @Override
    public Member getMember(String id) throws Exception {
        return memberRepository.getMember(id);
    }

    @Override
    public int memberCount() throws Exception {
        return memberRepository.memberCount();
    }

    @Override
    public void memberInsert(Member member) throws Exception {
        memberRepository.memberInsert(member);
    }

    @Override
    public void memberEdit(Member member) throws Exception {
        memberRepository.memberEdit(member);
    }

    @Override
    public void memberDelete(String id) throws Exception {
        memberRepository.memberDelete(id);
    }

    //로그인을 컨트롤러에서 처리
    @Override
    public Member signIn(String id) throws Exception {
        return memberRepository.signIn(id);
    }

    //서비스에서 로그인 처리
    @Override
    public boolean loginCheck(String id, String pw) throws Exception {
        Member member = memberRepository.loginCheck(id);

        if (member != null) {
            boolean loginSuccess = pwEncoder.matches(pw, member.getPw());
            return loginSuccess;
        } else {
            // 회원 정보를 찾지 못한 경우 또는 비밀번호가 일치하지 않는 경우에는 false를 반환
            return false;
        }
    }

    //Ajax로 로그인 처리 -> 컨트롤러
    @Override
    public Member login(String id) throws Exception {
        return memberRepository.login(id);
    }

    @Override
    public String findByEmail(String email) throws Exception {
        return memberRepository.findIdByEmail(email);
    }

    @Override
    public String findPassword(String id, String email) throws Exception {
        return memberRepository.findPassword(id, email);
    }
}