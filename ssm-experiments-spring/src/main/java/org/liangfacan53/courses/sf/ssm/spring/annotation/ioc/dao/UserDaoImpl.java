package org.liangfacan53.courses.sf.ssm.spring.annotation.ioc.dao;

import org.liangfacan53.courses.sf.ssm.spring.dao.UserDao;
import org.liangfacan53.courses.sf.ssm.spring.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public int updateUserById(User user) {
        System.out.println("updateUserByIdAnnotation() running...");
        return 1;
    }
}

