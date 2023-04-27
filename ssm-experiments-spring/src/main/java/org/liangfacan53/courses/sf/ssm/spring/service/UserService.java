package org.liangfacan53.courses.sf.ssm.spring.service;

import org.liangfacan53.courses.sf.ssm.spring.pojo.User;

public interface UserService {
    boolean updateUserById(User user, int id);
}
