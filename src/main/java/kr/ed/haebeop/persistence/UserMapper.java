package kr.ed.haebeop.persistence;

import kr.ed.haebeop.domain.User;

import java.util.List;

public interface UserMapper {
    public List<User> userList() throws Exception;

    public User getUser(String id) throws Exception;

    public int userCount() throws Exception;

    public void userInsert(User user) throws Exception;

    public void userEdit(User user) throws Exception;

    public void userDelete(String id) throws Exception;

    public User signIn(String id) throws Exception;

    public boolean loginCheck(String id, String pw) throws Exception;

    public User login(String id) throws Exception;

    public String findByEmail(String email) throws Exception;

    public String findPassword(String id, String email) throws Exception;
}