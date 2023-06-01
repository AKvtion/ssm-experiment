package org.liangfacan53.courses.sf.ssm.ssm.service;

import org.liangfacan53.courses.sf.ssm.ssm.dao.UserMapper;
import org.liangfacan53.courses.sf.ssm.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public User getUserById(int id) throws Exception {
        User user = userMapper.findUserById(id);
        if (user == null) {
            throw new Exception("User not found");
        }
        return user;
    }

}
