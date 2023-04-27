package org.liangfacan53.courses.sf.ssm.spring.annotation.ioc.service;

import org.liangfacan53.courses.sf.ssm.spring.dao.UserDao;
import org.liangfacan53.courses.sf.ssm.spring.pojo.User;
import org.liangfacan53.courses.sf.ssm.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public boolean updateUserById(User user, int id) {
        user.setId(id);
        return userDao.updateUserById(user) == 1;
    }
}
