package org.liangfacan53.courses.sf.ssm.spring.schema.ioc.dao;

import org.liangfacan53.courses.sf.ssm.spring.dao.UserDao;
import org.liangfacan53.courses.sf.ssm.spring.pojo.User;

public class UserDaoImpl implements UserDao {
    @Override
    public int updateUserById(User user) {
        System.out.println("updateUserById() running...");
        return 1;

    }
}
