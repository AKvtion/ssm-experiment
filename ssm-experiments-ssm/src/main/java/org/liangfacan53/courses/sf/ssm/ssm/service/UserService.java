package org.liangfacan53.courses.sf.ssm.ssm.service;

import org.liangfacan53.courses.sf.ssm.ssm.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id) throws Exception;

}
