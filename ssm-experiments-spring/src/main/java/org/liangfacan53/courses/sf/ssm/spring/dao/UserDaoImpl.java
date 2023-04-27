package org.liangfacan53.courses.sf.ssm.spring.dao;

import org.liangfacan53.courses.sf.ssm.spring.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public int updateUserById(User user) {
        System.out.println("updateUserById() running...");
        return 1;
    }
}
