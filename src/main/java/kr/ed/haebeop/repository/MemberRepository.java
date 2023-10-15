package kr.ed.haebeop.repository;

import kr.ed.haebeop.domain.Member;

import java.util.List;

public interface MemberRepository {
    public List<Member> memberList() throws Exception;
    public Member getMember(String id) throws Exception;
    public int memberCount() throws Exception;
    public void memberInsert(Member member) throws Exception;
    public void memberEdit(Member member) throws Exception;
    public void memberDelete(String id) throws Exception;
    public Member signIn(String id) throws Exception;
    public Member loginCheck(String id) throws Exception;
    public Member login(String id) throws Exception;
    public String findIdByEmail(String email) throws Exception;
    public String findPassword(String id, String email) throws Exception;
}
