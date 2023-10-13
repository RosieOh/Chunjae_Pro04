package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.User;
import kr.ed.haebeop.persistence.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private BoardMapper boardMapper;


    @Override
    public List<User> userList() throws Exception {
        return null;
    }

    @Override
    public User getUser(String id) throws Exception {
        return null;
    }

    @Override
    public int userCount() throws Exception {
        return 0;
    }

    @Override
    public void userInsert(User user) throws Exception {

    }

    @Override
    public void userEdit(User user) throws Exception {

    }

    @Override
    public void userDelete(String id) throws Exception {

    }

    @Override
    public User signIn(String id) throws Exception {
        return null;
    }

    @Override
    public boolean loginCheck(String id, String pw) throws Exception {
        return false;
    }

    @Override
    public User login(String id) throws Exception {
        return null;
    }

    @Override
    public String findByEmail(String email) throws Exception {
        return null;
    }

    @Override
    public String findPassword(String id, String email) throws Exception {
        return null;
    }
}
