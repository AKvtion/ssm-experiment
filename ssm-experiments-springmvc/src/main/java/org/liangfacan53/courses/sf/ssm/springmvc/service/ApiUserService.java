package org.liangfacan53.courses.sf.ssm.springmvc.service;

import org.liangfacan53.courses.sf.ssm.springmvc.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiUserService {

    private final List<User> users;

    public ApiUserService() {
        users = new ArrayList<>();
        users.add(new User("admin", "123456", "admin@example.com", "13812345678"));
        users.add(new User("user", "123456", "user@example.com", "13712345678"));
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser(int id) throws Exception {
        if (id < 0) {
            throw new Exception("id must be positive.");
        }
        if (id >= users.size()) {
            throw new Exception("user not found.");
        }
        return users.get(id);
    }

    public User login(String email, String password) throws Exception {

        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new Exception("login failed.");
    }
}

